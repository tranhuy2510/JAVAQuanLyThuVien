/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import models.SachModel;

/**
 *
 * @author ADMIN
 */
public class SachController {
    Connection conn;

    /**
     *
     * @throws SQLException
     */
    public SachController() throws SQLException{
        conn = new DBConnect().connectSQL();
    }
    // Lay danh sach Sach
    public List<SachModel> getAllSach() {
        List<SachModel> list = new ArrayList<>();
        String query = "SELECT " +
                       "    s.id_sach, " +
                       "    s.tensach, " +
                       "    tg.id_tacgia, " +
                       "    tg.tentacgia, " +
                       "    tl.tentheloai, " +
                       "    s.nhaxuatban, " +
                       "    s.giasach, " +
                       "    s.soluong, " +
                       "    s.ngaynhan, " +
                       "    s.mota " +
                       "FROM tbl_sach s " +
                       "JOIN tbl_tacgia tg ON s.id_tacgia = tg.id_tacgia " +
                       "JOIN tbl_theloai tl ON s.id_theloai = tl.id_theloai";
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                SachModel sach = new SachModel(
                    rs.getInt("id_sach"),
                    rs.getString("tensach"),
                    rs.getInt("id_tacgia"),    
                    rs.getString("tentacgia"),
                    rs.getString("tentheloai"),
                    rs.getString("nhaxuatban"),
                    rs.getDouble("giasach"),
                    rs.getInt("soluong"),
                    rs.getString("ngaynhan"),
                    rs.getString("mota")
                );
                list.add(sach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public SachModel getSachById(int idSach) {
        SachModel sach = null;
        String query = "SELECT * FROM tbl_sach WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idSach);  // Gán giá trị idSach vào câu lệnh SQL
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Lấy thông tin sách từ ResultSet
                    String tensach = rs.getString("tensach");
                    int idTacgia = rs.getInt("id_tacgia");
                    int idTheloai = rs.getInt("id_theloai");
                    String nhaxuatban = rs.getString("nhaxuatban");
                    double giasach = rs.getDouble("giasach");
                    int soluong = rs.getInt("soluong");
                    String ngaynhan = rs.getString("ngaynhan");
                    String mota = rs.getString("mota");
                    String anhsach = rs.getString("anhsach");

                    // Tạo đối tượng SachModel và trả về
                    sach = new SachModel(idSach, tensach, idTacgia, idTheloai, nhaxuatban, giasach, soluong, ngaynhan, mota, anhsach);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sach; // Trả về đối tượng SachModel, hoặc null nếu không tìm thấy
    }
     // Lấy thông tin mô tả dựa trên id_sach
    public String getMoTaById(int idSach) {
        String query = "SELECT mota FROM tbl_sach WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idSach);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("mota");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    // Phương thức lấy id_theloai từ cơ sở dữ liệu theo tên thể loại
    // Phương thức lấy id_theloai từ cơ sở dữ liệu theo tên thể loại
    // Phương thức lấy id_theloai từ cơ sở dữ liệu theo tên thể loại
    public int getIdTheLoaiFromName(String tenTheLoai) {
        String query = "SELECT id_theloai FROM tbl_theloai WHERE tentheloai = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, tenTheLoai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_theloai");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Trả về -1 nếu không tìm thấy thể loại
    }



     // Phương thức lấy danh sách thể loại
    public List<String> getAllTheLoai() {
        List<String> theLoaiList = new ArrayList<>();
        String query = "SELECT tentheloai FROM tbl_theloai";
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                theLoaiList.add(rs.getString("tentheloai"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return theLoaiList;
    }
    //Luu anh vao co so du lieu
    // Hàm lưu ảnh bìa vào cơ sở dữ liệu
    public void LuuAnhBia(int masach, String imgAnh) {
        // Kiểm tra file có tồn tại không
        File file = new File(imgAnh);
        if (!file.exists()) {
            System.err.println("File không tồn tại: " + file.getAbsolutePath());
            return; // Thoát nếu file không tồn tại
        }
        // Kiểm tra ID sách và đường dẫn file
        System.out.println("Đang cập nhật ảnh cho sách có ID: " + masach);
        System.out.println("Đường dẫn file: " + imgAnh);
        // Câu lệnh SQL để cập nhật ảnh bìa
        String query = "UPDATE tbl_sach SET anhsach = ? WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query);
             FileInputStream fis = new FileInputStream(file)) {
            // Truyền dữ liệu vào câu lệnh SQL
            ps.setBinaryStream(1, fis, (int) file.length());
            ps.setInt(2, masach);

            // Thực thi câu lệnh
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Ảnh bìa đã được lưu thành công.");
            } else {
                System.out.println("Không tìm thấy sách để cập nhật ảnh bìa.");
            }
        } catch (SQLException | IOException e) {
            // Xử lý ngoại lệ và in lỗi
            e.printStackTrace();
        }
    }


    // Phuong thuc lay anh tu co so du lieu ra
    public ImageIcon getBookImage(int masach) {
        String query = "SELECT anhsach FROM tbl_sach WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, masach);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    byte[] imageData = rs.getBytes("anhsach");
                    if (imageData != null) {
                        ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
                        BufferedImage img = ImageIO.read(bis);
                        return new ImageIcon(img); // Trả về hình ảnh
                    }
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public boolean updateSach(SachModel sach, String imagePath) {
        String query = "UPDATE tbl_sach " +
                       "SET tensach = ?, id_tacgia = ?, id_theloai = ?, nhaxuatban = ?, " +
                       "    giasach = ?, soluong = ?, ngaynhan = ?, mota = ?, anhsach = ? " +
                       "WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, sach.getTenSach());
            ps.setInt(2, sach.getIdTacGia());
            ps.setInt(3, sach.getIdTheLoai());
            ps.setString(4, sach.getNhaXuatBan());
            ps.setDouble(5, sach.getGiaSach());
            ps.setInt(6, sach.getSoLuong());
            ps.setString(7, sach.getNgayNhan());
            ps.setString(8, sach.getMoTa());

            // Đọc và lưu ảnh
            FileInputStream fis = new FileInputStream(imagePath);
            ps.setBinaryStream(9, fis, (int) new File(imagePath).length());

            ps.setInt(10, sach.getIdSach());

            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
