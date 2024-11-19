package models;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class NguoiDungModel {
    
    private String manguoidung;
    private String taikhoan;
    private String matkhau;
    private String hoten;
    private String loaiuser;
    
    // Khởi tạo không tham số
    public NguoiDungModel(){}
    
    // Khởi tạo có tham số
    public NguoiDungModel(String manguoidung, String taikhoan, String matkhau, String hoten, String loaiuser) {
        this.manguoidung = manguoidung;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.loaiuser = loaiuser;
    }
    
     //khoi tao nhanh khi lam viec voi giao dien
    public NguoiDungModel(ResultSet rs) throws SQLException{
        this.taikhoan = rs.getString("taikhoan");
        this.hoten= rs.getString("hoten");  
        this.matkhau = rs.getString("matkhau");
        this.loaiuser = rs.getString(loaiuser);
    }
   

    // Getter và Setter
    
    
    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = hashPassword(matkhau);  // Giả sử bạn mã hóa mật khẩu trước khi set
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLoaiuser() {
        return loaiuser;
    }

    public void setLoaiuser(String loaiuser) {
        this.loaiuser = loaiuser;
    }

    // Giả sử hàm hashPassword thực hiện mã hóa mật khẩu
    private String hashPassword(String password) {
        return password; // Trả về mật khẩu đã được mã hóa (ở đây là ví dụ, bạn cần thực hiện mã hóa thực tế)
    }

    // So sánh mật khẩu đã mã hóa
    public boolean checkPassword(String inputPassword) {
        return this.matkhau.equals(hashPassword(inputPassword));  // So sánh mật khẩu nhập với mật khẩu đã mã hóa
    }
}
