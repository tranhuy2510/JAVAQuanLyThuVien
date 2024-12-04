/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class SachMuonModel {
    private String idSach;
    private String tenSach;
    private String idTacGia;
    private String tenTacGia;
    private Integer soLuong;
    
    private String madocgia;
    private String hoten;
    private String email;
    private String sodienthoai;
    
    private String ngaymuon;
    private String ngaytra;
    private String status;
    
    public SachMuonModel() {
    }

    public SachMuonModel(String idSach, String tenSach, String idTacGia, String tenTacGia, Integer soLuong, String madocgia, String hoten, String email, String sodienthoai, String ngaymuon, String ngaytra, String status) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.idTacGia = idTacGia;
        this.tenTacGia = tenTacGia;
        this.soLuong = soLuong;
        this.madocgia = madocgia;
        this.hoten = hoten;
        this.email = email;
        this.sodienthoai = sodienthoai;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.status = status;
    }

    

    
    
     //khoi tao nhanh khi lam viec voi giao dien
    public SachMuonModel(ResultSet rs, boolean isDocGia) throws SQLException {
        try {
            if (isDocGia) {
                this.madocgia = rs.getString("id_docgia");
                this.hoten = rs.getString("hoten");
                this.email = rs.getString("email");
                this.sodienthoai = rs.getString("sodt");
            } else {
                this.idSach = rs.getString("id_sach");
                this.tenSach = rs.getString("tensach");
                this.idTacGia = rs.getString("id_tacgia");
                this.tenTacGia = rs.getString("tentacgia");
                this.soLuong = rs.getInt("soluong");
            }
        } catch (SQLException ex) {
            throw new SQLException("Lỗi khi khởi tạo SachMuonModel từ ResultSet: " + ex.getMessage());
        }
    }


    public String getIdSach() {
        return idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getIdTacGia() {
        return idTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public String getMadocgia() {
        return madocgia;
    }

    public String getHoten() {
        return hoten;
    }

    public String getEmail() {
        return email;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setIdTacGia(String idTacGia) {
        this.idTacGia = idTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public void setMadocgia(String madocgia) {
        this.madocgia = madocgia;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public String getStatus() {
        return status;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
