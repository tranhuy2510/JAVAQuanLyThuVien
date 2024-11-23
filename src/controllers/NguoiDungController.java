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
    public boolean kiemTraDangNhap(String taikhoan, String matkhau) throws SQLException {
        // Mã hóa mật khẩu người dùng nhập vào
        String matkhauHash = hashPassword(matkhau);

        // Câu lệnh SQL lấy dữ liệu người dùng theo tài khoản và loại người dùng
        String sql = "SELECT * FROM tbl_NguoiDung WHERE taikhoan = ? AND loaiuser = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, taikhoan);
            stmt.setString(2, matkhau);
            ResultSet rs = stmt.executeQuery();

            // Kiểm tra nếu có dữ liệu người dùng
            if (rs.next()) {
                String matkhauDB = rs.getString("matkhau"); // Lấy mật khẩu từ CSDL
                if (matkhauHash.equals(matkhauDB)) {
                    return true; // Đăng nhập thành công
                }
            }
            return false; // Đăng nhập thất bại
    }
    
     // Thêm mới người dùng vào cơ sở dữ liệu
    public boolean InsertData(NguoiDungModel user) {
         String sql = "INSERT INTO tbl_NguoiDung (hoten, taikhoan, matkhau, loaiuser) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getHoten());
            pstmt.setString(2, user.getTaikhoan());
            pstmt.setString(3, hashPassword(user.getMatkhau())); // Mã hóa mật khẩu trước khi lưu
            pstmt.setString(4, user.getLoaiuser());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    // Trả về loại người dùng nếu đăng nhập thành công, null nếu thất bại
    public String getLoaiNguoiDung(String taikhoan, String matkhau) throws SQLException {
        String matkhauHash = hashPassword(matkhau);
        String sql = "SELECT loaiuser FROM tbl_NguoiDung WHERE taikhoan = ? AND matkhau = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, taikhoan);
            stmt.setString(2, matkhauHash);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("loaiuser");
                }
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    
    // Kiểm tra tài khoản tồn tại
    public boolean isValidAccount(String taikhoan) throws SQLException {
        String sql = "SELECT COUNT(*) FROM tbl_NguoiDung WHERE taikhoan = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, taikhoan);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    // Kiểm tra mật khẩu
    public boolean isValidPassword(String matkhau, String taikhoan) throws SQLException {
        String sql = "SELECT matkhau FROM tbl_NguoiDung WHERE taikhoan = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, taikhoan);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return matkhau.equals(rs.getString("matkhau"));
                }
            }
        }
        return false;
    }

    // Kiểm tra loại người dùng
    public boolean kiemTraLoaiNguoiDung(String taikhoan, String loainguoidung) throws SQLException {
        // Kiểm tra nếu kết nối hợp lệ
        if (conn == null || conn.isClosed()) {
            throw new SQLException("Kết nối cơ sở dữ liệu không hợp lệ.");
        }

        // Truy vấn để lấy loại người dùng từ cơ sở dữ liệu
        String query = "SELECT loaiuser FROM tbl_NguoiDung WHERE taikhoan = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, taikhoan);  // Thiết lập giá trị cho tham số tài khoản
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Lấy giá trị loại người dùng từ kết quả truy vấn
                    String storedRole = rs.getString("loaiuser");
                    // Kiểm tra xem loại người dùng có khớp với loại người dùng đã nhập không
                    return storedRole.equals(loainguoidung);
                } else {
                    // Nếu không tìm thấy tài khoản trong cơ sở dữ liệu
                    return false;
                }
            }
        } catch (SQLException ex) {
            // Xử lý lỗi khi thực hiện truy vấn
            System.err.println("Lỗi khi kiểm tra loại người dùng: " + ex.getMessage());
            throw ex;  // Ném lại lỗi để có thể xử lý ở nơi gọi phương thức
        }
    }


}
