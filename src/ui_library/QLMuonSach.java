/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui_library;

import controllers.SachMuonController;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.SachMuonModel;

/**
 *
 * @author admin
 */
public class QLMuonSach extends javax.swing.JDialog {

    /**
     * Creates new form QLMuonSach
     */
    private final SachMuonController sachmuon;

    
    public QLMuonSach(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        // can giua cho form     
        this.setLocationRelativeTo(null);
        sachmuon = new SachMuonController();
        
        
        
        lblWsach.setVisible(false);
        lblWdocgia.setVisible(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTieudeTL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDSach1 = new javax.swing.JTextField();
        txtTensach = new javax.swing.JTextField();
        txtTacgia = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIDDocgia1 = new javax.swing.JTextField();
        txtDocgia = new javax.swing.JTextField();
        txtLienhe = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        datemuon = new com.toedter.calendar.JDateChooser();
        datetra = new com.toedter.calendar.JDateChooser();
        btnTimsach = new javax.swing.JButton();
        btnTimdocgia = new javax.swing.JButton();
        btnPhatphieu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        txtmadg = new javax.swing.JTextField();
        txtSach = new javax.swing.JTextField();
        lblWsach = new javax.swing.JLabel();
        lblWdocgia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTieudeTL.setBackground(new java.awt.Color(74, 98, 138));
        lblTieudeTL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieudeTL.setForeground(new java.awt.Color(255, 255, 255));
        lblTieudeTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieudeTL.setText("Quản lý sách mượn");
        lblTieudeTL.setOpaque(true);
        getContentPane().add(lblTieudeTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 50));

        jPanel1.setBackground(new java.awt.Color(117, 194, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 0, new java.awt.Color(74, 98, 138)));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 455));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_Obook.png"))); // NOI18N
        jLabel2.setText(" Thông tin sách");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 323, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(270, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 3));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 87, 199));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID sách:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 87, 199));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tên sách:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 87, 199));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tác giả:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 87, 199));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Số lượng:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));

        txtIDSach1.setBackground(new java.awt.Color(117, 194, 246));
        txtIDSach1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtIDSach1.setBorder(null);
        jPanel1.add(txtIDSach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 30));

        txtTensach.setBackground(new java.awt.Color(117, 194, 246));
        txtTensach.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTensach.setBorder(null);
        jPanel1.add(txtTensach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 30));

        txtTacgia.setBackground(new java.awt.Color(117, 194, 246));
        txtTacgia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTacgia.setBorder(null);
        jPanel1.add(txtTacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 30));

        txtSoluong.setBackground(new java.awt.Color(117, 194, 246));
        txtSoluong.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtSoluong.setBorder(null);
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jPanel3.setBackground(new java.awt.Color(86, 171, 232));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(74, 98, 138)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_Dki_Docgia.png"))); // NOI18N
        jLabel3.setText("    Độc giả");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 272, 110));

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(290, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 190, -1, 3));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Mã độc giả:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 240, 120, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Liên hệ:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 120, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 420, 120, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tên độc giả:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 300, 120, 30));

        txtIDDocgia1.setBackground(new java.awt.Color(86, 171, 232));
        txtIDDocgia1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtIDDocgia1.setBorder(null);
        jPanel3.add(txtIDDocgia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, 30));

        txtDocgia.setBackground(new java.awt.Color(86, 171, 232));
        txtDocgia.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtDocgia.setBorder(null);
        jPanel3.add(txtDocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 30));

        txtLienhe.setBackground(new java.awt.Color(86, 171, 232));
        txtLienhe.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtLienhe.setBorder(null);
        jPanel3.add(txtLienhe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, 30));

        txtEmail.setBackground(new java.awt.Color(86, 171, 232));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtEmail.setBorder(null);
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 200, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 360, 550));

        jPanel6.setBackground(new java.awt.Color(61, 144, 211));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(74, 98, 138)));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 565));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/book.png"))); // NOI18N
        jLabel1.setText("   Phiếu mượn");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 257, 77));

        jPanel7.setPreferredSize(new java.awt.Dimension(295, 5));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 3));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Sách:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 80, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Độc giả:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 80, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Ngày mượn:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 115, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Ngày trả:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 390, 115, 30));

        datemuon.setBackground(new java.awt.Color(255, 255, 255));
        datemuon.setForeground(new java.awt.Color(74, 98, 138));
        datemuon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel6.add(datemuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 30));

        datetra.setForeground(new java.awt.Color(74, 98, 138));
        datetra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel6.add(datetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, 30));

        btnTimsach.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnTimsach.setForeground(new java.awt.Color(74, 98, 138));
        btnTimsach.setText("Tìm sách");
        btnTimsach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimsach.setOpaque(true);
        btnTimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimsachActionPerformed(evt);
            }
        });
        jPanel6.add(btnTimsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 30));

        btnTimdocgia.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnTimdocgia.setForeground(new java.awt.Color(74, 98, 138));
        btnTimdocgia.setText("Tìm độc giả");
        btnTimdocgia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimdocgia.setOpaque(true);
        btnTimdocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimdocgiaActionPerformed(evt);
            }
        });
        jPanel6.add(btnTimdocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 130, 30));

        btnPhatphieu.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnPhatphieu.setForeground(new java.awt.Color(74, 98, 138));
        btnPhatphieu.setText("Phát phiếu");
        btnPhatphieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhatphieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhatphieuActionPerformed(evt);
            }
        });
        jPanel6.add(btnPhatphieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 130, 30));

        btnHuy.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(74, 98, 138));
        btnHuy.setText("Hủy");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.setOpaque(true);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel6.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 130, 30));

        txtmadg.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtmadg.setForeground(new java.awt.Color(74, 98, 138));
        txtmadg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmadgKeyReleased(evt);
            }
        });
        jPanel6.add(txtmadg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 30));

        txtSach.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtSach.setForeground(new java.awt.Color(74, 98, 138));
        txtSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSachKeyReleased(evt);
            }
        });
        jPanel6.add(txtSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, 30));

        lblWsach.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblWsach.setForeground(new java.awt.Color(255, 255, 255));
        lblWsach.setText("* Hãy chọn một cuốn sách");
        jPanel6.add(lblWsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, 20));

        lblWdocgia.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblWdocgia.setForeground(new java.awt.Color(255, 255, 255));
        lblWdocgia.setText("* Hãy chọn một thể loại");
        jPanel6.add(lblWdocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 300, 240, 20));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 430, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPhatphieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhatphieuActionPerformed
        // TODO add your handling code here:
        try {
            // Kiểm tra các trường bắt buộc
            if (txtIDSach1.getText().isEmpty()) {
                //JOptionPane.showMessageDialog(this, "Vui lòng chọn sách!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                lblWsach.setVisible(true);
                return;
            }

            if (txtIDDocgia1.getText().isEmpty()) {
                //JOptionPane.showMessageDialog(this, "Vui lòng chọn độc giả!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                lblWdocgia.setVisible(true);
                return;
            }

            if (datemuon.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày mượn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (datetra.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày trả!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Lấy giá trị từ giao diện
            int idSach;
            int idDocGia;
            try {
                idSach = Integer.parseInt(txtIDSach1.getText());
                idDocGia = Integer.parseInt(txtIDDocgia1.getText());

                if (idSach <= 0 || idDocGia <= 0) {
                    JOptionPane.showMessageDialog(this, "ID sách và ID độc giả phải là số nguyên dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID sách hoặc ID độc giả không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String tenSach = txtTensach.getText();
            String hoTenDocGia = txtDocgia.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayMuon = dateFormat.format(datemuon.getDate());
            String ngayTra = dateFormat.format(datetra.getDate());

            // Kiểm tra logic ngày mượn và ngày trả
            if (datemuon.getDate().after(datetra.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày mượn không được sau ngày trả!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo đối tượng SachMuonController và gọi phương thức thêm phiếu mượn
            boolean isAdded = sachmuon.addPhieuMuon(idSach, tenSach, idDocGia, hoTenDocGia, ngayMuon, ngayTra);

            // Xử lý kết quả
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Thêm phiếu mượn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không thể thêm phiếu mượn. Vui lòng kiểm tra lại dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi không xác định: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPhatphieuActionPerformed

    private void btnTimsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimsachActionPerformed
        // TODO add your handling code here:
        // Lấy ID sách từ txtMas
        String input = txtSach.getText().trim();

        // Kiểm tra nếu ID sách không hợp lệ
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sách hoặc tên sách để tìm kiếm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            SachMuonModel sach = null;
            
            if (input.matches("\\d+")) {
                // Tìm theo mã sách
                sach = sachmuon.getSachById(Integer.parseInt(input));
            } else {
                // Tìm theo tên sách
                sach = sachmuon.getSachByTen(input);
            }

            if (sach != null) {
                txtIDSach1.setText(sach.getIdSach());
                txtTensach.setText(sach.getTenSach());
                txtTacgia.setText(sach.getTenTacGia());
                txtSoluong.setText(String.valueOf(sach.getSoLuong()));
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sách với thông tin: " + input, "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm sách: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimsachActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtSach.setText("");
        txtIDSach1.setText(""); // Đặt lại mã sách vào ô nhập liệu
        txtTensach.setText("");
        txtTacgia.setText(""); // Lấy tên tác giả
        txtSoluong.setText("");
        txtIDDocgia1.setText("");
        txtDocgia.setText("");
        txtEmail.setText("");
        txtLienhe.setText("");
        txtSach.setText("");
        txtmadg.setText("");
        datemuon.setDate(null);
        datetra.setDate(null);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnTimdocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimdocgiaActionPerformed
        // TODO add your handling code here:
        String input = txtmadg.getText().trim();

        // Kiểm tra nếu ID sách không hợp lệ
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã độc giả hoặc tên độc giả để tìm kiếm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            SachMuonModel docGia = null;

            // Kiểm tra xem input là mã độc giả hay họ tên
            if (input.matches("\\d+")) {
                // Nếu input là số, tìm theo mã độc giả
                int idDocGia = Integer.parseInt(input);
                docGia = sachmuon.getDocGiaById(idDocGia);
            } else {
                // Nếu input là chữ, tìm theo họ tên
                docGia = sachmuon.getDocGiaByHoTen(input);
            }

            // Kiểm tra kết quả và hiển thị thông tin
            if (docGia != null) {
                txtIDDocgia1.setText(String.valueOf(docGia.getMadocgia()));
                txtDocgia.setText(docGia.getHoten());
                txtEmail.setText(docGia.getEmail());
                txtLienhe.setText(docGia.getSodienthoai());
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy độc giả với thông tin: " + input, "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm độc giả: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        try {
            SachMuonModel docGia = null;
            if (input.matches("\\d+")) {
                // Tìm theo mã độc giả
                docGia = sachmuon.getDocGiaById(Integer.parseInt(input));
            } else {
                // Tìm theo tên độc giả
                docGia = sachmuon.getDocGiaByHoTen(input);
            }

            if (docGia != null) {
                txtIDDocgia1.setText(docGia.getMadocgia());
                txtDocgia.setText(docGia.getHoten());
                txtEmail.setText(docGia.getEmail());
                txtLienhe.setText(docGia.getSodienthoai());
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy độc giả với thông tin: " + input, "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm độc giả: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimdocgiaActionPerformed

    private void txtSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSachKeyReleased
        // TODO add your handling code here:
        String sach = txtSach.getText();
        if (!sach.isEmpty()) {
            lblWsach.setVisible(false);

        } else {
            lblWsach.setVisible(true);
        }
    }//GEN-LAST:event_txtSachKeyReleased

    private void txtmadgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmadgKeyReleased
        // TODO add your handling code here:
        String tensach = txtmadg.getText();
        if (!tensach.isEmpty()) {
            lblWdocgia.setVisible(false);

        } else {
            lblWdocgia.setVisible(true);
        }
    }//GEN-LAST:event_txtmadgKeyReleased

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
            java.util.logging.Logger.getLogger(QLMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                QLMuonSach dialog = new QLMuonSach(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(QLMuonSach.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnPhatphieu;
    private javax.swing.JButton btnTimdocgia;
    private javax.swing.JButton btnTimsach;
    private com.toedter.calendar.JDateChooser datemuon;
    private com.toedter.calendar.JDateChooser datetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblTieudeTL;
    private javax.swing.JLabel lblWdocgia;
    private javax.swing.JLabel lblWsach;
    private javax.swing.JTextField txtDocgia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDDocgia1;
    private javax.swing.JTextField txtIDSach1;
    private javax.swing.JTextField txtLienhe;
    private javax.swing.JTextField txtSach;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTensach;
    private javax.swing.JTextField txtmadg;
    // End of variables declaration//GEN-END:variables
}
