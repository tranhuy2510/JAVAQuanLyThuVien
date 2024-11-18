
package models;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author ADMIN
 */
public class NguoiDungModel {
    
    private String taikhoan;
    private String matkhau;
    
    // khoi tao khong tham so
    public NguoiDungModel(){
        
    }
     public NguoiDungModel(String taikhoan, String matkhau){
         this.taikhoan = taikhoan;
         this.matkhau = hashPassword(matkhau);
     }

    public String getTaikhoan() {
        return taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = hashPassword(matkhau);
    }
    // kiểm tra xem người dùng có nhập đúng mật khẩu hay không
    public boolean kiemtramatkhau(String matkhaunhap){
        //return this.matkhau.equals(hashPassword(matkhaunhap));
        String hashedPassword = hashPassword(matkhaunhap);
    
        // Kiểm tra tài khoản "admin" với mật khẩu mã hóa
        if ("admin".equals(taikhoan) && hashPassword("123456").equals(hashedPassword)) {
            return true;
        } 
        // Kiểm tra tài khoản "user" với mật khẩu mã hóa
        else if ("user".equals(taikhoan) && hashPassword("password").equals(hashedPassword)) {
            return true;
        }
        // Kiểm tra mật khẩu nhập vào có khớp với mật khẩu đã lưu hay không
        return this.matkhau.equals(hashedPassword);
    }
    
    // Mã hóa mật khẩu sử dụng thuật toán SHA-256
    private String hashPassword(String password) {
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for(byte b : hash){
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }

    // Phương thức tótring() để in thông tin đối tượng
    
    @Override
    public String toString(){
        return "NguoiDungModel{" + "taikhoan='" + taikhoan + '\'' + '}';
    }
     
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        NguoiDungModel that  = (NguoiDungModel) obj;
        return taikhoan.equals(that.taikhoan);
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode(){
        return taikhoan.hashCode();
    }
}
