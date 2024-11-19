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
        }
        return null;
    }

    // Phương thức kiểm tra đăng nhập
    public boolean kiemTraDangNhap(String taikhoan, String matkhau, String loaiNguoiDung) throws SQLException {
        // Mã hóa mật khẩu người dùng nhập vào
        String matkhauHash = hashPassword(matkhau);

        // Câu lệnh SQL lấy dữ liệu người dùng theo tài khoản và loại người dùng
        String sql = "SELECT * FROM tbl_NguoiDung WHERE username = ? AND loaiuser = ?";
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

    // Phương thức đăng ký tài khoản mới
    public boolean dangKyNguoiDung(String hoten, String taikhoan, String matkhau, String loaiuser) throws SQLException {

            // Mã hóa mật khẩu người dùng nhập vào
            String matkhauHash = hashPassword(matkhau);

            // Câu lệnh SQL chèn người dùng mới vào cơ sở dữ liệu
            String sql = "INSERT INTO tbl_NguoiDung (hoten_user, username, matkhau, loaiuser) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, hoten);
                stmt.setString(2, taikhoan);
                stmt.setString(3, matkhauHash);  // Lưu mật khẩu đã mã hóa vào CSDL
                stmt.setString(4, loaiuser);

                // Thực thi câu lệnh SQL và kiểm tra kết quả
                int result = stmt.executeUpdate();
                if (result > 0) {
                    return true;  // Đăng ký thành công
                }
            }
        return false;  // Đăng ký thất bại
    }
    public NguoiDungModel dangNhap(String taikhoan, String matkhau) throws SQLException {
        NguoiDungModel nguoiDung = null;
            // Mã hóa mật khẩu người dùng nhập vào
            String matkhauHash = hashPassword(matkhau);

            // Câu lệnh SQL lấy dữ liệu người dùng theo tài khoản và mật khẩu
            String sql = "SELECT * FROM NguoiDung WHERE TaiKhoan = ? AND MatKhau = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, taikhoan);
                stmt.setString(2, matkhauHash);  // Lưu mật khẩu đã mã hóa vào CSDL
                ResultSet rs = stmt.executeQuery();

                // Kiểm tra nếu có dữ liệu người dùng
                if (rs.next()) {
                    nguoiDung = new NguoiDungModel();
                    nguoiDung.setTaikhoan(rs.getString("TaiKhoan"));
                    nguoiDung.setMatkhau(rs.getString("MatKhau"));
                    nguoiDung.setLoaiuser(rs.getString("LoaiNguoiDung"));
                }
            }
        return nguoiDung;  // Nếu không tìm thấy người dùng, trả về null
    }
//     // Phương thức kiểm tra
//    public static void main(String[] args) {
//        // Kiểm tra chức năng đăng nhập
//        String plainPassword = "123";
//        String hashedPassword = NguoiDungController.hashPassword(plainPassword);
//        System.out.println("Mật khẩu mã hóa: " + hashedPassword);
//    }
}
