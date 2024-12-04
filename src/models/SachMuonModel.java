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
    

    public SachMuonModel() {
    }

    public SachMuonModel(String idSach, String tenSach, String idTacGia, String tenTacGia, Integer soLuong) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.idTacGia = idTacGia;
        this.tenTacGia = tenTacGia;
        this.soLuong = soLuong;
    }
    
     //khoi tao nhanh khi lam viec voi giao dien
    public SachMuonModel(ResultSet rs) throws SQLException{
        this.idSach = rs.getString("id_sach");
        this.tenSach = rs.getString("tensach");
        this.idTacGia = rs.getString("id_tacgia");
        this.tenTacGia = rs.getString("tentacgia");
        this.soLuong = rs.getInt("soluong");
        
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
    
    
    
    
    
}
