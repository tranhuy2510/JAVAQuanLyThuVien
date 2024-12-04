/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.*;
import models.SachMuonModel;

/**
 *
 * @author admin
 */
public class SachMuonController {
    Connection conn;
    public SachMuonController() throws SQLException{
        conn = new DBConnect().connectSQL();
    }
    
    public SachMuonModel getSachById(int idSach) throws SQLException {
        String query = """
            SELECT 
                s.id_sach, 
                s.tensach, 
                tg.tentacgia, 
                s.id_tacgia, -- Thêm cột này
                s.soluong
            FROM 
                tbl_sach s
            INNER JOIN 
                tbl_tacgia tg ON s.id_tacgia = tg.id_tacgia
            WHERE 
                s.id_sach = ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idSach);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new SachMuonModel(rs,false); // Trả về sách nếu tìm thấy
            }
        }

        return null; // Nếu không tìm thấy sách
    }

    
    public SachMuonModel getSachByTen(String tenSach) throws SQLException {
        String query = """
            SELECT 
                s.id_sach, 
                s.tensach, 
                tg.tentacgia,
                s.id_tacgia,
                s.soluong
            FROM 
                tbl_sach s
            INNER JOIN 
                tbl_tacgia tg ON s.id_tacgia = tg.id_tacgia
            WHERE 
                s.tensach LIKE ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, "%" + tenSach + "%"); // Tìm kiếm gần đúng
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new SachMuonModel(rs, false); // Trả về sách nếu tìm thấy
            }
        }

        return null; // Nếu không tìm thấy sách
    }

    public SachMuonModel getDocGiaById(int idDocGia) throws SQLException {
        String query = """
            SELECT 
                id_docgia, 
                hoten, 
                email, 
                sodt
            FROM 
                tbl_docgia
            WHERE 
                id_docgia = ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idDocGia);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new SachMuonModel(rs, true); // Truyền true vì đây là độc giả
            }
        }

        return null; // Nếu không tìm thấy độc giả
    }


    public SachMuonModel getDocGiaByHoTen(String hoTen) throws SQLException {
        String query = """
            SELECT 
                id_docgia, 
                hoten, 
                email, 
                sodt
            FROM 
                tbl_docgia
            WHERE 
                hoten LIKE ?;
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, "%" + hoTen + "%"); // Tìm kiếm gần đúng
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new SachMuonModel(rs, true); // Truyền true vì đây là độc giả
            }
        }

        return null; // Nếu không tìm thấy độc giả
    }

    public boolean isSachAvailable(int idSach) throws SQLException {
        String query = "SELECT soluong FROM tbl_sach WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idSach);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("soluong") > 0; // Trả về true nếu sách còn
            }
        }
        return false; // Sách không còn
    }

    public boolean updateSoLuongSach(int idSach, int soLuongMuon) throws SQLException {
        String query = "UPDATE tbl_sach SET soluong = soluong - ? WHERE id_sach = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, soLuongMuon);
            ps.setInt(2, idSach);
            return ps.executeUpdate() > 0; // Trả về true nếu cập nhật thành công
        }
    }

    
    public boolean addPhieuMuon(int idSach, String tenSach, int idDocGia, String hoTenDocGia, String ngayMuon, String ngayTra) throws SQLException {
        if (!isSachAvailable(idSach)) {
            System.out.println("Sách không đủ số lượng để mượn!");
            return false; // Không thêm phiếu nếu sách hết
        }

        String query = """
            INSERT INTO tbl_sachmuon 
            (id_sach, tensach, id_docgia, hoten, trangthai, ngaymuon, ngaytra, status) 
            VALUES (?, ?, ?, ?, ?, ?, ?, ?);
        """;

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idSach);
            ps.setString(2, tenSach);
            ps.setInt(3, idDocGia);
            ps.setString(4, hoTenDocGia);
            ps.setString(5, "Đang mượn");
            ps.setString(6, ngayMuon);
            ps.setString(7, ngayTra);
            ps.setString(8, "Active");

            if (ps.executeUpdate() > 0) {
                // Cập nhật số lượng sách sau khi thêm phiếu
                return updateSoLuongSach(idSach, 1);
            }
        }
        return false; // Thêm phiếu thất bại
    }

    

    
    
    
    
    
}
