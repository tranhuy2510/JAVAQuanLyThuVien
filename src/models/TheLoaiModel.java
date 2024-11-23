/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class TheLoaiModel {
    
    private String maTheLoai;
    private String tenTheLoai;

    public TheLoaiModel() {
    }

    
    public TheLoaiModel(String maTheLoai, String tenTheLoai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

      //khoi tao nhanh khi lam viec voi giao dien
    public TheLoaiModel(ResultSet rs) throws SQLException{
        this.maTheLoai= rs.getString("id_theloai");
        this.tenTheLoai = rs.getString("tentheloai");  
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
    
    
    
    
}
