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
                return new SachMuonModel(rs); // Trả về sách nếu tìm thấy
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
                return new SachMuonModel(rs); // Trả về sách nếu tìm thấy
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
                return new SachMuonModel(rs); // Trả về độc giả nếu tìm thấy
            }
        }

        return null; // Nếu không tìm thấy
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
                return new SachMuonModel(rs); // Trả về độc giả nếu tìm thấy
            }
        }

        return null; // Nếu không tìm thấy
    }


    
    
    
    
    
}
