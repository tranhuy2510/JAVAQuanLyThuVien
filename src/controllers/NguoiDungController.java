package controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import models.NguoiDungModel;

public class NguoiDungController {
    Connection conn;
    public NguoiDungController() throws SQLException{
        conn = new DBConnect().connectSQL();
    }

    // Phương thức mã hóa mật khẩu với SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();  // Trả về mật khẩu đã mã hóa dưới dạng chuỗi hex
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Lỗi mã hóa mật khẩu!", e);
        }        
    }
    
    // Phương thức kiểm tra đăng nhập
    public String kiemTraDangNhap(String taikhoan, String matkhau) throws SQLException {
        String role = null;
        // Mã hóa mật khẩu người dùng nhập vào
        String matkhauHash = hashPassword(matkhau);

        // Câu lệnh SQL lấy dữ liệu người dùng theo tài khoản và loại người dùng
        String sql = "SELECT matkhau, loaiuser FROM tbl_NguoiDung WHERE taikhoan = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, taikhoan);
            ResultSet rs = stmt.executeQuery();

            // Kiểm tra nếu có dữ liệu người dùng
            if (rs.next()) {
                String matkhauDB = rs.getString("matkhau"); // Lấy mật khẩu từ CSDL
                if (matkhauHash.equals(matkhauDB)) {
                    role = rs.getString("loaiuser"); // Lấy quyền (user/admin)
                }
            }
        return role; // Trả về quyền nếu đăng nhập thành công, null nếu thất bại
    }
    
    //----------------------------------------------------------------------------------------------------

    public boolean kiemTraTaiKhoanTonTai(String username) throws SQLException {
        String sql = "SELECT COUNT(*) FROM tbl_nguoidung WHERE taikhoan = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; // Nếu số lượng > 0 nghĩa là đã tồn tại
                }
            }
        }
        return false;
    }

    public boolean dangKyTaiKhoan(String username, String password, String hoTen, String soDT) throws SQLException {
        conn.setAutoCommit(false); // Bắt đầu transaction
        try {
            // 1. Mã hóa mật khẩu
            String hashedPassword = hashPassword(password);

            // 2. Thêm vào bảng tbl_nguoidung
            String insertNguoiDungSQL = "INSERT INTO tbl_nguoidung (taikhoan, matkhau, loaiuser) VALUES (?, ?, 'user')";
            try (PreparedStatement stmtNguoiDung = conn.prepareStatement(insertNguoiDungSQL, Statement.RETURN_GENERATED_KEYS)) {
                stmtNguoiDung.setString(1, username);
                stmtNguoiDung.setString(2, hashedPassword);
                stmtNguoiDung.executeUpdate();

                // Lấy id_user vừa tạo
                try (ResultSet rs = stmtNguoiDung.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idUser = rs.getInt(1);

                        // 3. Thêm vào bảng tbl_docgia
                        String insertDocGiaSQL = "INSERT INTO tbl_docgia (hoten, sodt, id_user) VALUES (?, ?, ?)";
                        try (PreparedStatement stmtDocGia = conn.prepareStatement(insertDocGiaSQL)) {
                            stmtDocGia.setString(1, hoTen);
                            stmtDocGia.setString(2, soDT);
                            stmtDocGia.setInt(3, idUser);
                            stmtDocGia.executeUpdate();
                        }
                    }
                }
            }

            conn.commit(); // Xác nhận transaction
            return true;
        } catch (SQLException ex) {
            conn.rollback(); // Hoàn tác nếu xảy ra lỗi
            throw ex;
        } finally {
            conn.setAutoCommit(true);
        }
    }


    
    
    
    

     // Thêm mới người dùng vào cơ sở dữ liệu
    public boolean InsertData(NguoiDungModel user) {
         String sql = "INSERT INTO tbl_NguoiDung (taikhoan, matkhau, loaiuser) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getTaikhoan());
            pstmt.setString(2, hashPassword(user.getMatkhau())); // Mã hóa mật khẩu trước khi lưu
            pstmt.setString(3, user.getLoaiuser());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    
}
