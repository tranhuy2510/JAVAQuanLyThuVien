/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.SachModel;

/**
 *
 * @author ADMIN
 */
public class SachController {
    Connection conn;
    public SachController() throws SQLException{
        conn = new DBConnect().connectSQL();
    }
    
    //Truy van tat ca du lieu trong Table LoaiSP 
    public List<SachModel> getdsSach() throws SQLException{  
        // Truy vấn đọc dữ liệu  
        List<SachModel> dsSach = new ArrayList<>();
        String query = "SELECT * FROM tbl_sach";
        
        try {
            try (Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
                
                // Lấy dữ liệu từ ResultSet và thêm vào danh sách
                while (rs.next()) {
                    SachModel sach = new SachModel(rs); 
                    dsSach.add(sach);
                }
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi lấy dữ liệu  bang tac gia: " + e.getMessage());
        }
        return dsSach;
    }
    
    //Them moi 1 dong du lieu vao table 
    public boolean InsertBook(SachModel obj) throws SQLException {
        // Truy vấn kiểm tra id_tacgia và id_theloai tồn tại hay không
        String checkTacGiaQuery = "SELECT COUNT(*) FROM tbl_tacgia WHERE id_tacgia = ?";
        String checkTheLoaiQuery = "SELECT COUNT(*) FROM tbl_theloai WHERE id_theloai = ?";

        try (
            PreparedStatement pstmtCheckTacGia = conn.prepareStatement(checkTacGiaQuery);
            PreparedStatement pstmtCheckTheLoai = conn.prepareStatement(checkTheLoaiQuery)
        ) {
            // Kiểm tra id_tacgia
            pstmtCheckTacGia.setInt(1, obj.getIdTacGia());
            ResultSet rsTacGia = pstmtCheckTacGia.executeQuery();
            if (rsTacGia.next() && rsTacGia.getInt(1) <= 0) {
                System.err.println("Lỗi: id_tacgia không tồn tại trong bảng tbl_tacgia.");
                return false;
            }

            // Kiểm tra id_theloai
            pstmtCheckTheLoai.setInt(1, obj.getIdTheLoai());
            ResultSet rsTheLoai = pstmtCheckTheLoai.executeQuery();
            if (rsTheLoai.next() && rsTheLoai.getInt(1) <= 0) {
                System.err.println("Lỗi: id_theloai không tồn tại trong bảng tbl_theloai.");
                return false;
            }

            // Nếu id_tacgia và id_theloai hợp lệ, thực hiện câu lệnh INSERT
            String insertQuery = "INSERT INTO tbl_sach (tensach, id_tacgia, id_theloai, nhaxuatban, giasach, soluong, ngaynhan, mota, anhsach) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmtInsert = conn.prepareStatement(insertQuery)) {
                pstmtInsert.setString(1, obj.getTenSach());
                pstmtInsert.setInt(2, obj.getIdTacGia());
                pstmtInsert.setInt(3, obj.getIdTheLoai());
                pstmtInsert.setString(4, obj.getNhaXuatBan());
                pstmtInsert.setDouble(5, obj.getGiaSach());
                pstmtInsert.setInt(6, obj.getSoLuong());
                pstmtInsert.setString(7, obj.getNgayNhan());
                pstmtInsert.setString(8, obj.getMoTa());
                pstmtInsert.setBytes(9, obj.getAnhSach());

                int rowsAffected = pstmtInsert.executeUpdate();
                return rowsAffected > 0; // Trả về true nếu dữ liệu được chèn thành công
            }
        } catch (SQLException ex) {
            // In lỗi nếu có exception
            System.err.println("Lỗi khi thêm dữ liệu: " + ex.getMessage());
            throw ex; // Ném lại lỗi để xử lý bên ngoài nếu cần
        }
    }

    
    /*
     //Dieu chinh 1 dong du lieu vao table LoaiSP 
    public boolean EditData(SachModel obj) throws SQLException{  
        String updateQuery = "UPDATE tbl_tacgia SET tentacgia = ?, linhvuc = ?, gioithieu = ? WHERE id_tacgia = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
            pstmt.setString(1, obj.getTenTacgia());
            pstmt.setString(2, obj.getChuyenmon()); // Lĩnh vực
            pstmt.setString(3, obj.getGioithieu());
            pstmt.setString(4, obj.getMaTacgia()); // ID tác giả
            
            return pstmt.executeUpdate() > 0;
        }
    } 
    
    */
    // Hàm kiểm tra trùng tên 
    public boolean IsDuplicate(String tenTacgia) throws SQLException {
        String checkQuery = "SELECT COUNT(*) FROM tbl_tacgia WHERE tentacgia = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(checkQuery)) {
            pstmt.setString(1, tenTacgia);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; // Trả về true nếu tồn tại
                }
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi kiểm tra trùng lặp: " + ex.getMessage());
            throw ex;
        }
        return false;
    }

    

    



    
}
