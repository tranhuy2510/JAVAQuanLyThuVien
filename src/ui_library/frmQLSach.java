/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui_library;

import controllers.SachController;
import controllers.TacGiaController;
import controllers.TheLoaiController;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import models.SachModel;

/**
 *
 * @author ADMIN
 */
public final class frmQLSach extends javax.swing.JFrame {

    private Object fileChooser;
    private final TheLoaiController theLoai; // Đối tượng để kết nối dữ liệu thể loại
    private final TacGiaController tacGia;
    private HashMap<String, Integer> theLoaiMap; // Lưu trữ dữ liệu thể loại
    // Khai báo tableModel
    private final DefaultTableModel tableModel;
    private final SachController dssach;
    private final boolean cothem = true;
    String imagePath ="";
    /**
     * Creates new form frmQLTheLoai
     * @throws java.sql.SQLException
     */
    public frmQLSach() throws SQLException {
        initComponents();        
        // can giua cho form     
        this.setLocationRelativeTo(null);
        setupUI();
        // Cấu hình bảng và controller
        tableModel = (DefaultTableModel) tblsach.getModel();
        dssach = new SachController();
        tacGia = new TacGiaController();
        // Khởi tạo các components trên JFrame
        String[] colsName = {"ID", "Tên", "Tác giả", "Thể loại", "Nhà xuất bản", "Số lượng", "Giá", "Ngày nhập", "Mô tả", "Đường dẫn ảnh"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // Kết nối JTable với tableModel
        tblsach.setModel(tableModel);
        // Gọi hàm showDataOnTable() để hiển thị dữ liệu lên bảng
        ShowData();
        theLoai = new TheLoaiController(); // Khởi tạo đối tượng controller
        insertCmbTheLoai();
        this.txtMasach. setEnabled (false);

        lblWarn.setVisible(false);
        lblWarn1.setVisible(false);
        lblWarn2.setVisible(false);
    }

    private void setupUI(){
        //this.setSize(1400,725);
        // tao vien xam cho khung panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255, 255, 255));
        
        // thiet ke cho hang tren dau cua bang
        tblsach.getTableHeader().setBackground(new Color(242, 120, 75)); 
        tblsach.getTableHeader().setForeground(Color.white);
        tblsach.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 12));
        tblsach.getTableHeader().setOpaque(false);

        tblsach.getTableHeader().repaint();
       
        tblsach.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblsach.getColumnModel().getColumn(4).setPreferredWidth(40);
        tblsach.getColumnModel().getColumn(5).setPreferredWidth(40);
        
        txtmota.setLineWrap(true); // Tự động xuống dòng
        txtmota.setWrapStyleWord(true); // Ngắt từ hợp lý
        txtmota.setMargin(new Insets(10, 10, 10, 5)); // Khoảng cách nội dung với biên

        lblMinus.setOpaque(true); // Cho phép JLabel có background
        lblMinus.setBackground(new java.awt.Color(238,180,34)); 
        lblSystemIC.setOpaque(true); // Cho phép JLabel có background
        lblSystemIC.setBackground(new java.awt.Color(238,180,34)); 
    }
    public void ShowData() throws SQLException{ 
        List<SachModel> lst = dssach.getdsSach();
        // Duyệt qua ArrayList data
        Object[] rows = new Object[10];
        for(int i =0; i< lst.size() ; i++){
            rows[0] = lst.get(i).getIdSach();
            rows[1] = lst.get(i).getTenSach();
            rows[2] = lst.get(i).getIdTacGia();
            rows[3] = lst.get(i).getIdTheLoai();
            rows[4] = lst.get(i).getNhaXuatBan();
            rows[5] = lst.get(i).getSoLuong();
            rows[6] = lst.get(i).getGiaSach();
            rows[7] = lst.get(i).getNgayNhan();
            rows[8] = lst.get(i).getMoTa();
            rows[9] = lst.get(i).getAnhSach();
            // Đưa dòng dữ liệu vào tableModel
            tableModel.addRow(rows);
        }     
    }
    
    //Ham xoa du lieu trong tableModel 
    public void ClearData() throws SQLException{ 
        int rowCount = tableModel.getRowCount(); // Lấy số lượng dòng hiện tại
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel.removeRow(i); // Xóa từng dòng
        }
    } 
    
    // Phương thức tải dữ liệu thể loại vào ComboBox
    public void insertCmbTheLoai() {
        cmbTheloai.removeAllItems(); // Xóa dữ liệu cũ
        cmbTheloai.addItem("Chọn thể loại"); // Thêm mục mặc định

        // Gọi phương thức từ controller để lấy danh sách thể loại
        theLoaiMap = theLoai.GetTheloaiMap();
        for (String tenTheLoai : theLoaiMap.keySet()) {
            cmbTheloai.addItem(tenTheLoai);
        }
    }
    
    public void AddtgData(String tenTg, String maTg){
        txtTenTacGia.setText(tenTg);
        Matg.setText(maTg);
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
        lblMinus = new javax.swing.JLabel();
        lblTieude = new javax.swing.JLabel();
        lblSystemIC = new javax.swing.JLabel();
        jPanel_Theloaisach = new javax.swing.JPanel();
        lblMasach = new javax.swing.JLabel();
        lblTensach = new javax.swing.JLabel();
        lblTacgia = new javax.swing.JLabel();
        lblTheloai = new javax.swing.JLabel();
        lblSoluong = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtTenTacGia = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        lblAnh = new javax.swing.JLabel();
        cmbTheloai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNhaxuatban = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsach = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NgayNhap = new com.toedter.calendar.JDateChooser();
        spnSoluong = new javax.swing.JSpinner();
        btnChonanhbia = new javax.swing.JButton();
        lblPathAnh = new javax.swing.JLabel();
        Matg = new javax.swing.JTextField();
        Matl = new javax.swing.JTextField();
        btnChon_Tacgia = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblWarn = new javax.swing.JLabel();
        lblWarn1 = new javax.swing.JLabel();
        lblWarn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(238, 180, 34));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_minus.png"))); // NOI18N
        lblMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinusMouseExited(evt);
            }
        });
        pnlHeader.add(lblMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 0, 60, 60));

        lblTieude.setBackground(new java.awt.Color(241, 231, 254));
        lblTieude.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTieude.setForeground(new java.awt.Color(255, 255, 255));
        lblTieude.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTieude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_Books_color.png"))); // NOI18N
        lblTieude.setText("   Quản lý sách");
        lblTieude.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(lblTieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 270, 60));

        lblSystemIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_close24.png"))); // NOI18N
        lblSystemIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSystemIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSystemICMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSystemICMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSystemICMouseExited(evt);
            }
        });
        pnlHeader.add(lblSystemIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1138, 0, 60, 60));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 60));

        jPanel_Theloaisach.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Theloaisach.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(238, 180, 34)));
        jPanel_Theloaisach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMasach.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblMasach.setForeground(new java.awt.Color(255, 102, 51));
        lblMasach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMasach.setText("ID sách:   ");
        jPanel_Theloaisach.add(lblMasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

        lblTensach.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTensach.setForeground(new java.awt.Color(255, 102, 51));
        lblTensach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTensach.setText("Tên sách:   ");
        jPanel_Theloaisach.add(lblTensach, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 30));

        lblTacgia.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTacgia.setForeground(new java.awt.Color(255, 102, 51));
        lblTacgia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTacgia.setText("Tác giả:   ");
        jPanel_Theloaisach.add(lblTacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, 120, 30));

        lblTheloai.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTheloai.setForeground(new java.awt.Color(255, 102, 51));
        lblTheloai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTheloai.setText("Thể loại:   ");
        jPanel_Theloaisach.add(lblTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 120, 30));

        lblSoluong.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblSoluong.setForeground(new java.awt.Color(255, 102, 51));
        lblSoluong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoluong.setText("Số Lượng:   ");
        jPanel_Theloaisach.add(lblSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 30));

        lblGia.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblGia.setForeground(new java.awt.Color(255, 102, 51));
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGia.setText("Giá:   ");
        jPanel_Theloaisach.add(lblGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 120, 30));

        txtMasach.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtMasach.setForeground(new java.awt.Color(255, 102, 51));
        jPanel_Theloaisach.add(txtMasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 32));

        txtTenSach.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTenSach.setForeground(new java.awt.Color(255, 102, 51));
        jPanel_Theloaisach.add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 430, 32));

        txtTenTacGia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTenTacGia.setForeground(new java.awt.Color(255, 102, 51));
        jPanel_Theloaisach.add(txtTenTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 182, 240, 32));

        txtGia.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtGia.setForeground(new java.awt.Color(255, 102, 51));
        jPanel_Theloaisach.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 240, 32));

        txtmota.setColumns(20);
        txtmota.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtmota.setForeground(new java.awt.Color(255, 102, 51));
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        jPanel_Theloaisach.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 505, 240, 115));

        lblAnh.setBackground(new java.awt.Color(255, 148, 112));
        lblAnh.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAnh.setOpaque(true);
        jPanel_Theloaisach.add(lblAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 150, 200));

        cmbTheloai.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cmbTheloai.setForeground(new java.awt.Color(255, 102, 51));
        cmbTheloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTheloaiActionPerformed(evt);
            }
        });
        jPanel_Theloaisach.add(cmbTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 235, 240, 32));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ngày nhập:   ");
        jPanel_Theloaisach.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Nhà xuất bản:   ");
        jPanel_Theloaisach.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 395, 150, 30));

        txtNhaxuatban.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNhaxuatban.setForeground(new java.awt.Color(255, 102, 51));
        jPanel_Theloaisach.add(txtNhaxuatban, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 395, 240, 32));

        tblsach.setBackground(new java.awt.Color(247, 239, 232));
        tblsach.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblsach.setForeground(new java.awt.Color(255, 102, 51));
        tblsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Tác giả", "Thể loại", "Số lượng", "Giá", "Ngày nhập", "Nhà xuất bản", "Mô tả", "Ảnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblsach.setFocusable(false);
        tblsach.setGridColor(new java.awt.Color(255, 102, 51));
        tblsach.setRowHeight(25);
        tblsach.setSelectionBackground(new java.awt.Color(255, 148, 112));
        tblsach.setShowGrid(true);
        tblsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsach);

        jPanel_Theloaisach.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 125, 570, 495));

        btnXoa.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 102, 51));
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Theloaisach.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 110, 32));

        btnSua.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 102, 51));
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Theloaisach.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 110, 32));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Bảng thông tin sách");
        jPanel_Theloaisach.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 290, 50));

        btnThem.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 102, 51));
        btnThem.setText("Thêm ");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel_Theloaisach.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 110, 32));

        btnHuy.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 102, 51));
        btnHuy.setText("Hủy bỏ");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel_Theloaisach.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 110, 32));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mô tả:   ");
        jPanel_Theloaisach.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 505, 120, 30));

        NgayNhap.setForeground(new java.awt.Color(255, 102, 51));
        NgayNhap.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jPanel_Theloaisach.add(NgayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 32));

        spnSoluong.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jPanel_Theloaisach.add(spnSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 32));

        btnChonanhbia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnChonanhbia.setForeground(new java.awt.Color(255, 102, 51));
        btnChonanhbia.setText("Chọn ảnh bìa");
        btnChonanhbia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 51)));
        btnChonanhbia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChonanhbia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonanhbiaActionPerformed(evt);
            }
        });
        jPanel_Theloaisach.add(btnChonanhbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 150, 30));

        lblPathAnh.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        lblPathAnh.setForeground(new java.awt.Color(255, 102, 51));
        lblPathAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPathAnh.setText("Lựa chọn ảnh bìa sách");
        lblPathAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Theloaisach.add(lblPathAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 170, 20));

        Matg.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel_Theloaisach.add(Matg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 182, 35, 32));

        Matl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel_Theloaisach.add(Matl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 235, 35, 32));

        btnChon_Tacgia.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnChon_Tacgia.setForeground(new java.awt.Color(255, 102, 51));
        btnChon_Tacgia.setText("Chọn tác giả");
        btnChon_Tacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChon_TacgiaActionPerformed(evt);
            }
        });
        jPanel_Theloaisach.add(btnChon_Tacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 182, 140, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ảnh bìa:");
        jPanel_Theloaisach.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 120, 30));

        lblWarn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblWarn.setForeground(new java.awt.Color(255, 102, 102));
        lblWarn.setText("* Tên sách không được để trống");
        jPanel_Theloaisach.add(lblWarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 162, 240, 20));

        lblWarn1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblWarn1.setForeground(new java.awt.Color(255, 102, 102));
        lblWarn1.setText("* Tên sách không được để trống");
        jPanel_Theloaisach.add(lblWarn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 265, 240, 20));

        lblWarn2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblWarn2.setForeground(new java.awt.Color(255, 102, 102));
        lblWarn2.setText("* Tên sách không được để trống");
        jPanel_Theloaisach.add(lblWarn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, 240, 20));

        getContentPane().add(jPanel_Theloaisach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinusMouseClicked
        // TODO add your handling code here:
        // Thu nhỏ form lại
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinusMouseClicked

    private void lblMinusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinusMouseEntered
        // TODO add your handling code here:
        lblMinus.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblMinusMouseEntered

    private void lblMinusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinusMouseExited
        // TODO add your handling code here:
        lblMinus.setBackground(new java.awt.Color(238,180,34));
    }//GEN-LAST:event_lblMinusMouseExited

    private void lblSystemICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSystemICMouseClicked
        // TODO add your handling code here:
        // Dong form
        this.dispose();
    }//GEN-LAST:event_lblSystemICMouseClicked

    private void lblSystemICMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSystemICMouseEntered
        // TODO add your handling code here:
        lblSystemIC.setBackground(new java.awt.Color(255,102,102));
    }//GEN-LAST:event_lblSystemICMouseEntered

    private void lblSystemICMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSystemICMouseExited
        // TODO add your handling code here:
        lblSystemIC.setBackground(new java.awt.Color(238,180,34));
    }//GEN-LAST:event_lblSystemICMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {                                        
            // TODO add your handling code here:
            //Them sach moi
            //Lay gia tri
            String masach = txtMasach.getText();
            String tensach = txtTenSach.getText();
            String nhaxuatban = txtNhaxuatban.getText();
            String mota = txtmota.getText();
            
            int matacgia = Integer.parseInt(Matg.getText());
            int matheloai = Integer.parseInt(Matl.getText());

            int soluong= Integer.parseInt(spnSoluong.getValue().toString());
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngaynhap = dateFormat.format(NgayNhap.getDate());
            double giasach = Double.parseDouble(txtGia.getText());
            
            // Kiểm tra ảnh sách
            byte[] anhSach = null;
            if (lblPathAnh.getText() != null && !lblPathAnh.getText().isEmpty()) {
                anhSach = Files.readAllBytes(Paths.get(lblPathAnh.getText()));
            }
            // Kiểm tra thông tin
            if (tensach.isEmpty() || matacgia <= 0 || matheloai <= 0 || nhaxuatban.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Tạo đối tượng SachModel
            SachModel sach = new SachModel();
            sach.setTenSach(tensach);
            sach.setIdTacGia(matacgia);
            sach.setIdTheLoai(matheloai);
            sach.setNhaXuatBan(nhaxuatban);
            sach.setGiaSach(giasach);
            sach.setSoLuong(soluong);
            sach.setNgayNhan(ngaynhap);
            sach.setMoTa(mota);
            sach.setAnhSach(anhSach);
            
            if (cothem) {
                // Thêm sách vào cơ sở dữ liệu
                if (dssach.InsertBook(sach)) {
                    JOptionPane.showMessageDialog(this, "Thêm sách thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                // Reset form hoặc cập nhật lại danh sách sách hiển thị
                ClearData();
                ShowData();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm sách thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
            
          
        } catch (SQLException | IOException ex) {
            Logger.getLogger(frmQLSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtMasach.setText("");
        txtTenSach.setText("");
        Matg.setText("ID");
        txtTenTacGia.setText("");
        Matl.setText("ID");
        cmbTheloai.setSelectedIndex(0);
        spnSoluong.setValue(0);
        NgayNhap.setDate(null);
        txtNhaxuatban.setText("");
        txtGia.setText("");
        txtmota.setText("");
        lblPathAnh.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnChonanhbiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonanhbiaActionPerformed
        // TODO add your handling code here:
        // Tạo JFileChooser để chọn tệp ảnh
        JFileChooser chonfile = new JFileChooser();
        chonfile.setDialogTitle("Chọn ảnh bìa sách");
        chonfile.setCurrentDirectory(new File("D:\\img_books")); // Đặt thư mục mặc định

        // Thêm bộ lọc tệp để chỉ cho phép chọn ảnh (jpg, png, jpeg)
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg");
        chonfile.setFileFilter(extensionFilter);

        // Hiển thị hộp thoại chọn tệp
        int fileState = chonfile.showOpenDialog(this);
        // Lấy đường dẫn tệp ảnh được chọn
        String path = chonfile.getSelectedFile().getAbsolutePath();
        if (fileState == JFileChooser.APPROVE_OPTION) {
            
            
            lblPathAnh.setText(path); // Hiển thị đường dẫn ảnh trong lblPathAnh

            // Hiển thị ảnh trong lblAnh
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH));
            lblAnh.setIcon(imageIcon); // Gắn hình ảnh vào JLabel
        }
        imagePath = path;
    }//GEN-LAST:event_btnChonanhbiaActionPerformed

    private void btnChon_TacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChon_TacgiaActionPerformed
        try {
            frmDStg authors = new frmDStg(this);
            authors.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmQLSach.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnChon_TacgiaActionPerformed

    private void cmbTheloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTheloaiActionPerformed
        // TODO add your handling code here:
        String selectedTheLoai = (String) cmbTheloai.getSelectedItem();
        if (!"Chọn thể loại".equals(selectedTheLoai)) {
            int maTheLoai = theLoaiMap.get(selectedTheLoai); // Lấy mã thể loại
            //System.out.println("Thể loại đã chọn: " + selectedTheLoai + " - Mã: " + maTheLoai);
            Matl.setText(String.valueOf(maTheLoai));
        }
    }//GEN-LAST:event_cmbTheloaiActionPerformed

    private void tblsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsachMouseClicked
        // TODO add your handling code here:
        // Lấy hàng được chọn trong bảng
        int selectedRow = tblsach.getSelectedRow();

        // Kiểm tra xem hàng có được chọn không
        if (selectedRow >= 0) {
            // Lấy model của bảng
            DefaultTableModel model = (DefaultTableModel) tblsach.getModel();

            try {
                // Gán dữ liệu từ bảng vào các trường
                txtMasach.setText(model.getValueAt(selectedRow, 0).toString());   // Cột 0: ID
                txtTenSach.setText(model.getValueAt(selectedRow, 1).toString()); // Cột 1: Tên sách

                // Lấy mã tác giả (Cột 2)
                int matacgia = Integer.parseInt(model.getValueAt(selectedRow, 2).toString());
                // Sử dụng SachController để lấy tên tác giả từ mã tác giả
                String tenTacGia = tacGia.getTenTacGiaById(matacgia);
                txtTenTacGia.setText(tenTacGia);  // Hiển thị tên tác giả trong text field

                // Lấy mã thể loại (Cột 3)
                int matheloai = Integer.parseInt(model.getValueAt(selectedRow, 3).toString());
                // Sử dụng SachController để lấy tên thể loại từ mã thể loại
                String tenTheLoai = theLoai.getTenTheLoaiById(matheloai);
                cmbTheloai.setSelectedItem(tenTheLoai); // Hiển thị thể loại tương ứng trong combobox

                // Gán Nhà xuất bản (cột 4)
                txtNhaxuatban.setText(model.getValueAt(selectedRow, 4).toString()); 

                // Chuyển đổi Số lượng (cột 5)
                String soLuongStr = model.getValueAt(selectedRow, 5).toString();
                if (soLuongStr.matches("\\d+")) { // Kiểm tra số nguyên dương
                    spnSoluong.setValue(Integer.valueOf(soLuongStr));
                } else {
                    throw new NumberFormatException("Số lượng không hợp lệ: " + soLuongStr);
                }

                // Gán Giá (cột 6)
                txtGia.setText(model.getValueAt(selectedRow, 6).toString());

                // Gán Ngày nhập (cột 7)
                String ngayNhapStr = model.getValueAt(selectedRow, 7).toString();
                ((JTextField) NgayNhap.getDateEditor().getUiComponent()).setText(ngayNhapStr);
                txtmota.setText(model.getValueAt(selectedRow, 8).toString());
                
                // Kiểm tra đường dẫn ảnh
                String imagePath = model.getValueAt(selectedRow, 9).toString();
                File file = new File(imagePath);
                if (!file.exists() || !file.isFile()) {
                    JOptionPane.showMessageDialog(this, "File ảnh không tồn tại: " + imagePath, "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                lblPathAnh.setText(imagePath);

                // Hiển thị ảnh
                ImageIcon icon = new ImageIcon(imagePath);
                Image img = icon.getImage();
                Image resizedImg = img.getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), Image.SCALE_SMOOTH);
                lblAnh.setIcon(new ImageIcon(resizedImg));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ: " + e.getMessage(),
                                              "Lỗi dữ liệu", JOptionPane.ERROR_MESSAGE);
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(),
                                              "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblsachMouseClicked
    

    
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
            java.util.logging.Logger.getLogger(frmQLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new frmQLSach().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmQLSach.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Matg;
    private javax.swing.JTextField Matl;
    private com.toedter.calendar.JDateChooser NgayNhap;
    private javax.swing.JButton btnChon_Tacgia;
    private javax.swing.JButton btnChonanhbia;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbTheloai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_Theloaisach;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblMasach;
    private javax.swing.JLabel lblMinus;
    private javax.swing.JLabel lblPathAnh;
    private javax.swing.JLabel lblSoluong;
    private javax.swing.JLabel lblSystemIC;
    private javax.swing.JLabel lblTacgia;
    private javax.swing.JLabel lblTensach;
    private javax.swing.JLabel lblTheloai;
    private javax.swing.JLabel lblTieude;
    private javax.swing.JLabel lblWarn;
    private javax.swing.JLabel lblWarn1;
    private javax.swing.JLabel lblWarn2;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JSpinner spnSoluong;
    private javax.swing.JTable tblsach;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtNhaxuatban;
    private javax.swing.JTextField txtTenSach;
    private static javax.swing.JTextField txtTenTacGia;
    private javax.swing.JTextArea txtmota;
    // End of variables declaration//GEN-END:variables
}
