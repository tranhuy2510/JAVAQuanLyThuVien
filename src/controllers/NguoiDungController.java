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
    public boolean kiemTraDangNhap(String taikhoan, String matkhau, String loaiNguoiDung) throws SQLException {
        // Mã hóa mật khẩu người dùng nhập vào
        String matkhauHash = hashPassword(matkhau);

        // Câu lệnh SQL lấy dữ liệu người dùng theo tài khoản và loại người dùng
        String sql = "SELECT * FROM tbl_NguoiDung WHERE taikhoan = ? AND loaiuser = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, taikhoan);
            stmt.setString(2, loaiNguoiDung);
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
    
    public boolean isValidAccount(String taikhoan) throws SQLException {
        String sql = "SELECT * FROM tbl_NguoiDung WHERE taikhoan = ?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, taikhoan);
            ResultSet rs = pst.executeQuery();
            return rs.next();  // If account exists, return true
        }
    }

    // Check if password matches for a given account
    public boolean isValidPassword(String matkhau, String taikhoan) throws SQLException {
        String sql = "SELECT * FROM tbl_NguoiDung WHERE taikhoan = ? AND matkhau = ?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, taikhoan);
            pst.setString(2, matkhau);
            ResultSet rs = pst.executeQuery();
            return rs.next();  // If password matches, return true
        }
    }

    public boolean isValidUserType(String loainguoidung, String taikhoan) throws SQLException {
        String sql = "SELECT 1 FROM tbl_NguoiDung WHERE taikhoan = ? AND loainguoidung = ?";  // Sử dụng SELECT 1 thay vì SELECT *

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, taikhoan);
            pst.setString(2, loainguoidung);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next();  // Nếu tìm thấy kết quả, trả về true
            }
        }
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
    
    
}
