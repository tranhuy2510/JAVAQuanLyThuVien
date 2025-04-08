 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui_library;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */
public class frmTrangchu extends javax.swing.JFrame {

    /**
     * Creates new form frmTrangchu
     */
    public frmTrangchu() {
        initComponents();
        // can giua cho form
        this.setLocationRelativeTo(null);
        
        //tblSach     tblDocGia
        tblSach.getTableHeader().setBackground(new java.awt.Color(167, 230, 255));
        tblSach.getTableHeader().setForeground(new java.awt.Color(167, 230, 255));
        tblSach.getTableHeader().setFont(new java.awt.Font("Roboto", 0, 16));
        tblSach.getTableHeader().setOpaque(false);
        
        tblDocGia.getTableHeader().setBackground(new java.awt.Color(167, 230, 255));
        tblDocGia.getTableHeader().setForeground(new java.awt.Color(167, 230, 255));
        tblDocGia.getTableHeader().setFont(new java.awt.Font("Roboto", 0, 16));
        tblDocGia.getTableHeader().setOpaque(false);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblSystemIC = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblTaiKhoanIC = new javax.swing.JLabel();
        lblTieude = new javax.swing.JLabel();
        pnlLeftBar = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        lblTrangchu = new javax.swing.JLabel();
        pnlBooks = new javax.swing.JPanel();
        btnQLSach = new javax.swing.JButton();
        pnlAuthors = new javax.swing.JPanel();
        btnQLTacGia = new javax.swing.JButton();
        pnlUsers = new javax.swing.JPanel();
        btnQLNguoiDung = new javax.swing.JButton();
        pnlGenres = new javax.swing.JPanel();
        btnQLTheLoai = new javax.swing.JButton();
        lblFeature = new javax.swing.JLabel();
        pnlReader = new javax.swing.JPanel();
        btnQLDocGia = new javax.swing.JButton();
        pnlBookIssue = new javax.swing.JPanel();
        btnQLMuonSach = new javax.swing.JButton();
        pnlReturnBook = new javax.swing.JPanel();
        btnTraSach = new javax.swing.JButton();
        pnlViewReader = new javax.swing.JPanel();
        btnDSDocGia = new javax.swing.JButton();
        pnlRIList1 = new javax.swing.JPanel();
        btnDSMuonTra1 = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        pnlLstBook = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlCAuthor = new javax.swing.JPanel();
        lblSTacGia = new javax.swing.JLabel();
        lblTacGia = new javax.swing.JLabel();
        pnlCBooks = new javax.swing.JPanel();
        lblSSach = new javax.swing.JLabel();
        lblSach = new javax.swing.JLabel();
        pnlIssue = new javax.swing.JPanel();
        lblMuonS = new javax.swing.JLabel();
        lblSMuon = new javax.swing.JLabel();
        scrollDocGia = new javax.swing.JScrollPane();
        tblDocGia = new javax.swing.JTable();
        scrollSach = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        pnlCReader1 = new javax.swing.JPanel();
        lblDocGia1 = new javax.swing.JLabel();
        lblSDocGia1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lý thư viện");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(5, 12, 156));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSystemIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_library_color.png"))); // NOI18N
        pnlHeader.add(lblSystemIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 70));

        lblDangXuat.setBackground(new java.awt.Color(241, 231, 254));
        lblDangXuat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_exit_color.png"))); // NOI18N
        lblDangXuat.setText("  Đăng xuất");
        lblDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });
        pnlHeader.add(lblDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 120, 70));

        lblTaiKhoanIC.setBackground(new java.awt.Color(241, 231, 254));
        lblTaiKhoanIC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTaiKhoanIC.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoanIC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTaiKhoanIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_User.png"))); // NOI18N
        lblTaiKhoanIC.setText(" Admin");
        lblTaiKhoanIC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(lblTaiKhoanIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 220, 70));

        lblTieude.setBackground(new java.awt.Color(241, 231, 254));
        lblTieude.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTieude.setForeground(new java.awt.Color(255, 255, 255));
        lblTieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieude.setText("Hệ Thống Quản Lý Thư Viện");
        lblTieude.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlHeader.add(lblTieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 310, 70));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 70));

        pnlLeftBar.setBackground(new java.awt.Color(137, 196, 244));
        pnlLeftBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 0, new java.awt.Color(90, 34, 139)));
        pnlLeftBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHome.setBackground(new java.awt.Color(53, 114, 239));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTrangchu.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangchu.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_home.png"))); // NOI18N
        lblTrangchu.setText("     Trang chủ");
        lblTrangchu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHome.add(lblTrangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 60));

        pnlLeftBar.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 42, 266, 60));

        pnlBooks.setBackground(new java.awt.Color(137, 195, 252));
        pnlBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLSach.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLSach.setForeground(new java.awt.Color(5, 12, 156));
        btnQLSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_sach.png"))); // NOI18N
        btnQLSach.setText("    Quản lý sách");
        btnQLSach.setContentAreaFilled(false);
        btnQLSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLSach.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLSachMouseClicked(evt);
            }
        });
        pnlBooks.add(btnQLSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 280, 266, 60));

        pnlAuthors.setBackground(new java.awt.Color(137, 195, 252));
        pnlAuthors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLTacGia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLTacGia.setForeground(new java.awt.Color(5, 12, 156));
        btnQLTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_author.png"))); // NOI18N
        btnQLTacGia.setText("    Quản lý tác giả");
        btnQLTacGia.setContentAreaFilled(false);
        btnQLTacGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLTacGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLTacGia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLTacGiaMouseClicked(evt);
            }
        });
        pnlAuthors.add(btnQLTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlAuthors, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 220, 266, 60));

        pnlUsers.setBackground(new java.awt.Color(137, 195, 252));
        pnlUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLNguoiDung.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLNguoiDung.setForeground(new java.awt.Color(90, 34, 139));
        btnQLNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_user32.png"))); // NOI18N
        btnQLNguoiDung.setText("   Quản lý người dùng");
        btnQLNguoiDung.setContentAreaFilled(false);
        btnQLNguoiDung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNguoiDung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLNguoiDung.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNguoiDungMouseClicked(evt);
            }
        });
        pnlUsers.add(btnQLNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, -1, 60));

        pnlLeftBar.add(pnlUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 640, 266, 60));

        pnlGenres.setBackground(new java.awt.Color(137, 195, 252));
        pnlGenres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLTheLoai.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLTheLoai.setForeground(new java.awt.Color(5, 12, 156));
        btnQLTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_muc.png"))); // NOI18N
        btnQLTheLoai.setText("    Quản lý thế loại");
        btnQLTheLoai.setContentAreaFilled(false);
        btnQLTheLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLTheLoai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLTheLoaiMouseClicked(evt);
            }
        });
        pnlGenres.add(btnQLTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlGenres, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 160, 266, 60));

        lblFeature.setBackground(new java.awt.Color(102, 51, 153));
        lblFeature.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        lblFeature.setForeground(new java.awt.Color(102, 51, 153));
        lblFeature.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFeature.setText("Chức năng");
        pnlLeftBar.add(lblFeature, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 40));

        pnlReader.setBackground(new java.awt.Color(137, 195, 252));
        pnlReader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLDocGia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLDocGia.setForeground(new java.awt.Color(5, 12, 156));
        btnQLDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_team.png"))); // NOI18N
        btnQLDocGia.setText("    Quản lý độc giả");
        btnQLDocGia.setContentAreaFilled(false);
        btnQLDocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLDocGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLDocGia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLDocGiaMouseClicked(evt);
            }
        });
        pnlReader.add(btnQLDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 340, 266, 60));

        pnlBookIssue.setBackground(new java.awt.Color(137, 195, 252));
        pnlBookIssue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLMuonSach.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnQLMuonSach.setForeground(new java.awt.Color(5, 12, 156));
        btnQLMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_muons.png"))); // NOI18N
        btnQLMuonSach.setText("    Sách mượn");
        btnQLMuonSach.setContentAreaFilled(false);
        btnQLMuonSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLMuonSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQLMuonSach.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQLMuonSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLMuonSachMouseClicked(evt);
            }
        });
        pnlBookIssue.add(btnQLMuonSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlBookIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 400, 266, 60));

        pnlReturnBook.setBackground(new java.awt.Color(137, 195, 252));
        pnlReturnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTraSach.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnTraSach.setForeground(new java.awt.Color(5, 12, 156));
        btnTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_returnbook.png"))); // NOI18N
        btnTraSach.setText("    Trả lại sách");
        btnTraSach.setContentAreaFilled(false);
        btnTraSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTraSach.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraSachMouseClicked(evt);
            }
        });
        pnlReturnBook.add(btnTraSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 460, 266, 60));

        pnlViewReader.setBackground(new java.awt.Color(137, 195, 252));
        pnlViewReader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDSDocGia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnDSDocGia.setForeground(new java.awt.Color(5, 12, 156));
        btnDSDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_profile.png"))); // NOI18N
        btnDSDocGia.setText("    Hồ sơ độc giả");
        btnDSDocGia.setContentAreaFilled(false);
        btnDSDocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDSDocGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDSDocGia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDSDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSDocGiaMouseClicked(evt);
            }
        });
        pnlViewReader.add(btnDSDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlViewReader, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 520, 266, 60));

        pnlRIList1.setBackground(new java.awt.Color(137, 195, 252));
        pnlRIList1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDSMuonTra1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnDSMuonTra1.setForeground(new java.awt.Color(90, 34, 139));
        btnDSMuonTra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_DsChiTiet.png"))); // NOI18N
        btnDSMuonTra1.setText("    Danh sách mượn");
        btnDSMuonTra1.setContentAreaFilled(false);
        btnDSMuonTra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDSMuonTra1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDSMuonTra1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDSMuonTra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSMuonTra1MouseClicked(evt);
            }
        });
        pnlRIList1.add(btnDSMuonTra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 230, 60));

        pnlLeftBar.add(pnlRIList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 580, 266, 60));

        getContentPane().add(pnlLeftBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 840));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(90, 34, 139)));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(5, 12, 156));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Xin chào, Admin");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlMain.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        pnlLstBook.setBackground(new java.awt.Color(137, 196, 244));
        pnlLstBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(137, 195, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 210));

        jPanel3.setBackground(new java.awt.Color(137, 195, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, 210));

        jPanel4.setBackground(new java.awt.Color(137, 195, 252));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 160, 210));

        jPanel5.setBackground(new java.awt.Color(137, 195, 252));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 160, 210));

        jPanel6.setBackground(new java.awt.Color(137, 195, 252));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 160, 210));

        jPanel7.setBackground(new java.awt.Color(137, 195, 252));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLstBook.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 160, 210));

        pnlMain.add(pnlLstBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 1130, 270));

        pnlCAuthor.setBackground(new java.awt.Color(137, 196, 244));
        pnlCAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCAuthor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSTacGia.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSTacGia.setForeground(new java.awt.Color(5, 12, 156));
        lblSTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_tacgia.png"))); // NOI18N
        lblSTacGia.setText("10   ");
        lblSTacGia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlCAuthor.add(lblSTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 70));

        lblTacGia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblTacGia.setForeground(new java.awt.Color(102, 102, 102));
        lblTacGia.setText("Tác giả");
        pnlCAuthor.add(lblTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        pnlMain.add(pnlCAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 240, 140));

        pnlCBooks.setBackground(new java.awt.Color(137, 196, 244));
        pnlCBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSSach.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSSach.setForeground(new java.awt.Color(5, 12, 156));
        lblSSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_dausach.png"))); // NOI18N
        lblSSach.setText("10   ");
        lblSSach.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlCBooks.add(lblSSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 70));

        lblSach.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblSach.setForeground(new java.awt.Color(102, 102, 102));
        lblSach.setText("Đầu sách");
        pnlCBooks.add(lblSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        pnlMain.add(pnlCBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 230, 140));

        pnlIssue.setBackground(new java.awt.Color(137, 196, 244));
        pnlIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIssue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMuonS.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMuonS.setForeground(new java.awt.Color(102, 102, 102));
        lblMuonS.setText("Lượt mượn");
        pnlIssue.add(lblMuonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        lblSMuon.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSMuon.setForeground(new java.awt.Color(5, 12, 156));
        lblSMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_luotmuon.png"))); // NOI18N
        lblSMuon.setText("10   ");
        lblSMuon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlIssue.add(lblSMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 70));

        pnlMain.add(pnlIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 240, 140));

        scrollDocGia.setBackground(new java.awt.Color(241, 231, 254));
        scrollDocGia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đầu sách tiêu biểu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(5, 12, 156))); // NOI18N

        tblDocGia.setBackground(new java.awt.Color(137, 196, 244));
        tblDocGia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tiêu đề", "Tác giả", "Lượt mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDocGia.setToolTipText("");
        tblDocGia.setRowHeight(25);
        tblDocGia.setSelectionBackground(new java.awt.Color(167, 230, 255));
        tblDocGia.setShowGrid(true);
        scrollDocGia.setViewportView(tblDocGia);

        pnlMain.add(scrollDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 530, 240));

        scrollSach.setBackground(new java.awt.Color(241, 231, 254));
        scrollSach.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Độc giả nổi bật", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(5, 12, 156))); // NOI18N

        tblSach.setBackground(new java.awt.Color(137, 196, 244));
        tblSach.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã độc giả", "Họ và tên", "Lượt mượn", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSach.setToolTipText("");
        tblSach.setRowHeight(25);
        tblSach.setSelectionBackground(new java.awt.Color(167, 230, 255));
        tblSach.setShowGrid(true);
        scrollSach.setViewportView(tblSach);

        pnlMain.add(scrollSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 540, 240));

        pnlCReader1.setBackground(new java.awt.Color(137, 196, 244));
        pnlCReader1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCReader1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDocGia1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDocGia1.setForeground(new java.awt.Color(102, 102, 102));
        lblDocGia1.setText("Độc giả");
        pnlCReader1.add(lblDocGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 30));

        lblSDocGia1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSDocGia1.setForeground(new java.awt.Color(5, 12, 156));
        lblSDocGia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_docgia.png"))); // NOI18N
        lblSDocGia1.setText("10   ");
        lblSDocGia1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlCReader1.add(lblSDocGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 70));

        pnlMain.add(pnlCReader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, 140));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1270, 840));

        setBounds(0, 0, 1540, 909);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có muốn rời khỏi hệ thống?", "Xác Nhận Đăng Xuất", JOptionPane.YES_NO_OPTION); 
        if (confirmed == JOptionPane.YES_OPTION) { 
            try {
                // Quay về màn hình đăng nhập // Đóng màn hình chính }
                frmDangnhap login = new frmDangnhap();
                login.setVisible(true);
                // Dong form
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void btnQLTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLTheLoaiMouseClicked
        // TODO add your handling code here:
        try {
            QLTheLoai genres = new QLTheLoai(this, true); // Truyền JFrame cha và chế độ modal
            genres.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLTheLoaiMouseClicked

    private void btnQLNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNguoiDungMouseClicked
        try {
            // TODO add your handling code here:
            QLNguoiDung users = new QLNguoiDung(this, true);
            users.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLNguoiDungMouseClicked

    private void btnDSDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSDocGiaMouseClicked
        // TODO add your handling code here:
        DSDocGia lstreader = new DSDocGia(this, true);
        lstreader.setVisible(true);
    }//GEN-LAST:event_btnDSDocGiaMouseClicked

    private void btnTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraSachMouseClicked
        try {
            // TODO add your handling code here:
            QlTraSach returns = new QlTraSach(this, true);
            returns.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTraSachMouseClicked

    private void btnQLMuonSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLMuonSachMouseClicked
        try {
            // TODO add your handling code here:
            QLMuonSach issue = new QLMuonSach(this, true);
            issue.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLMuonSachMouseClicked

    private void btnQLDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLDocGiaMouseClicked
        try {
            // TODO add your handling code here:
            QLDocGia mreader = new QLDocGia(this, true);
            mreader.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLDocGiaMouseClicked

    private void btnQLTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLTacGiaMouseClicked
        try {
            // TODO add your handling code here:
            QLTacGia author = new QLTacGia(this, true);
            author.setVisible(true); // Hiển thị form
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLTacGiaMouseClicked

    private void btnQLSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLSachMouseClicked
        try {
            // TODO add your handling code here:
            QLSach book = new QLSach(this, true);
            book.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmTrangchu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQLSachMouseClicked

    private void btnDSMuonTra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSMuonTra1MouseClicked
        // TODO add your handling code here:
        DSMuonTra lstRI = new DSMuonTra(this, true);
        lstRI.setVisible(true);
    }//GEN-LAST:event_btnDSMuonTra1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmTrangchu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSDocGia;
    private javax.swing.JButton btnDSMuonTra1;
    private javax.swing.JButton btnQLDocGia;
    private javax.swing.JButton btnQLMuonSach;
    private javax.swing.JButton btnQLNguoiDung;
    private javax.swing.JButton btnQLSach;
    private javax.swing.JButton btnQLTacGia;
    private javax.swing.JButton btnQLTheLoai;
    private javax.swing.JButton btnTraSach;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDocGia1;
    private javax.swing.JLabel lblFeature;
    private javax.swing.JLabel lblMuonS;
    private javax.swing.JLabel lblSDocGia1;
    private javax.swing.JLabel lblSMuon;
    private javax.swing.JLabel lblSSach;
    private javax.swing.JLabel lblSTacGia;
    private javax.swing.JLabel lblSach;
    private javax.swing.JLabel lblSystemIC;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTaiKhoanIC;
    private javax.swing.JLabel lblTieude;
    private javax.swing.JLabel lblTrangchu;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlAuthors;
    private javax.swing.JPanel pnlBookIssue;
    private javax.swing.JPanel pnlBooks;
    private javax.swing.JPanel pnlCAuthor;
    private javax.swing.JPanel pnlCBooks;
    private javax.swing.JPanel pnlCReader1;
    private javax.swing.JPanel pnlGenres;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlIssue;
    private javax.swing.JPanel pnlLeftBar;
    private javax.swing.JPanel pnlLstBook;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlRIList1;
    private javax.swing.JPanel pnlReader;
    private javax.swing.JPanel pnlReturnBook;
    private javax.swing.JPanel pnlUsers;
    private javax.swing.JPanel pnlViewReader;
    private javax.swing.JScrollPane scrollDocGia;
    private javax.swing.JScrollPane scrollSach;
    private javax.swing.JTable tblDocGia;
    private javax.swing.JTable tblSach;
    // End of variables declaration//GEN-END:variables
}
