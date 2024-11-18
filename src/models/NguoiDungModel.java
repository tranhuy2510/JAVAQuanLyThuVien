package models;

/**
 *
 * @author ADMIN
 */
public class NguoiDungModel {
    
    private String taikhoan;
    private String matkhau;
    private String hoten;
    private String loaiuser;
    
    // Khởi tạo không tham số
    public NguoiDungModel(){
        
    }
    
    // Khởi tạo có tham số
    public NguoiDungModel(String taikhoan, String matkhau, String hoten, String loaiuser){
        this.taikhoan = taikhoan;
        this.matkhau = hashPassword(matkhau);  // Giả sử hàm hashPassword là để mã hóa mật khẩu
        this.hoten = hoten;
        this.loaiuser = loaiuser;
    }

    // Getter và Setter
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
        // Thực hiện mã hóa mật khẩu ở đây (MD5, SHA-1, hoặc bất kỳ phương thức nào bạn chọn)
        return password; // Trả về mật khẩu đã được mã hóa (ở đây là ví dụ, bạn cần thực hiện mã hóa thực tế)
    }

    // So sánh mật khẩu đã mã hóa
    public boolean checkPassword(String inputPassword) {
        return this.matkhau.equals(hashPassword(inputPassword));  // So sánh mật khẩu nhập với mật khẩu đã mã hóa
    }
}
