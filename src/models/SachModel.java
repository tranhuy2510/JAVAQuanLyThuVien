/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ADMIN
 */
public class SachModel {
    private int idSach;
    private String tenSach;
    private String tenTacGia;
    private String tenTheLoai;
    private int idTacGia;
    private int idTheLoai;
    private String nhaXuatBan;
    private double giaSach;
    private int soLuong;
    private String ngayNhan;
    private String moTa;
    private byte[] anhSach;
    
    // Constructor

    /**
     *
     * @param idSach
     * @param tenSach
     * @param idTacGia
     * @param tenTacGia
     * @param tenTheLoai
     * @param nhaXuatBan
     * @param giaSach
     * @param soLuong
     * @param ngayNhan
     * @param moTa
     */
    // Khoi tao constructor co tham so
    public SachModel(int idSach, String tenSach, int idTacGia, String tenTacGia, String tenTheLoai, String nhaXuatBan, double giaSach, int soLuong, String ngayNhan, String moTa) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.idTacGia = idTacGia;
        this.tenTacGia = tenTacGia;
        this.tenTheLoai = tenTheLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.giaSach = giaSach;
        this.soLuong = soLuong;
        this.ngayNhan = ngayNhan;
        this.moTa = moTa;
        this.anhSach = anhSach;

    }

    public SachModel(int idSach, String tensach, int idTacgia,String tenTacgia, int idTheloai, String nhaxuatban, double giasach, int soluong, String ngaynhan, String mota, String imagePath) {
       
    }

    public SachModel(int idSach, String tensach, int idTacgia, int idTheloai, String nhaxuatban, double giasach, int soluong, String ngaynhan, String mota, String imagePath) {
        
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(int idTacGia) {
        this.idTacGia = idTacGia;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public byte[] getAnhSach() {
        return anhSach;
    }

    public void setAnhSach(byte[] anhSach) {
        this.anhSach = anhSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }
    
}
