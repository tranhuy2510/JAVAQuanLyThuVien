/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import controllers.TacGiaController;
import java.awt.Color;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.TacGiaModel;


/**
 *
 * @author ADMIN
 */
public final class frmQLTacGia extends javax.swing.JFrame {
    
    
    // Khai báo tableModel
    private final DefaultTableModel tableModel;
    private final TacGiaController dstacgia;
    private final boolean cothem = true; 
    /**
     * Creates new form frmQLTacGia
     * @throws java.sql.SQLException
     */
    public frmQLTacGia() throws SQLException {
        
        initComponents();
        // can giua cho form
        this.setLocationRelativeTo(null);
      
        //set UI
        setupUI();
   
        // Cấu hình bảng và controller
        tableModel = (DefaultTableModel) tblTacgia.getModel();
        dstacgia = new TacGiaController();
        // Khởi tạo các components trên JFrame
        String[] colsName = {"Mã", "Tên tác giả", "Chuyên môn", "Giới thiệu"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // Kết nối JTable với tableModel
        tblTacgia.setModel(tableModel);
        // Gọi hàm showDataOnTable() để hiển thị dữ liệu lên bảng
        ShowData();
        
        lblWarn.setVisible(false);
     
        this.txtMa. setEnabled (false);
        
    }

    private void setupUI(){
        tblTacgia.getTableHeader().setBackground(new java.awt.Color(213, 184, 255));
        tblTacgia.getTableHeader().setForeground(new java.awt.Color(90, 34, 139));
        tblTacgia.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 16));
        tblTacgia.getTableHeader().setOpaque(false);
        
        lblMinus.setOpaque(true); // Cho phép JLabel có background
        lblMinus.setBackground(new java.awt.Color(90,34,139)); 
        lblSystemIC.setOpaque(true); // Cho phép JLabel có background
        lblSystemIC.setBackground(new java.awt.Color(90,34,139)); 
        
        txtAreaGioithieu.setLineWrap(true); // Tự động xuống dòng
        txtAreaGioithieu.setWrapStyleWord(true); // Ngắt từ hợp lý
        txtAreaGioithieu.setMargin(new Insets(10, 10, 10, 5)); // Khoảng cách nội dung với biên
    }
    
    public void ShowData() throws SQLException{ 
        List<TacGiaModel> lst = dstacgia.getdsTacGia();
        // Duyệt qua ArrayList data
        for (TacGiaModel tacgia : lst) { 
            // Tạo một dòng mới 
            String rows[] = new String[4];
            rows[0] = tacgia.getMaTacgia();
            rows[1] = tacgia.getTenTacgia();
            rows[2] = tacgia.getChuyenmon();
            rows[3] = tacgia.getGioithieu();
            

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
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTieude = new javax.swing.JLabel();
        lblMinus = new javax.swing.JLabel();
        lblSystemIC = new javax.swing.JLabel();
        pnlNoidung = new javax.swing.JPanel();
        lblTentg = new javax.swing.JLabel();
        lblMatg = new javax.swing.JLabel();
        scrollInfomation = new javax.swing.JScrollPane();
        tblTacgia = new javax.swing.JTable();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lblWarn = new javax.swing.JLabel();
        txtChuyenmon = new javax.swing.JTextField();
        lblChuyenmon = new javax.swing.JLabel();
        lblGioithieu = new javax.swing.JLabel();
        scrollGioithieu = new javax.swing.JScrollPane();
        txtAreaGioithieu = new javax.swing.JTextArea();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(90, 34, 139));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTieude.setBackground(new java.awt.Color(241, 231, 254));
        lblTieude.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTieude.setForeground(new java.awt.Color(255, 255, 255));
        lblTieude.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTieude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_tacgia64.png"))); // NOI18N
        lblTieude.setText("   Quản lý tác giả");
        lblTieude.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(lblTieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 310, 57));

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
        pnlHeader.add(lblMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 0, 60, 60));

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
        pnlHeader.add(lblSystemIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 0, 60, 60));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        pnlNoidung.setBackground(new java.awt.Color(241, 231, 254));
        pnlNoidung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 34, 139), 3));
        pnlNoidung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTentg.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTentg.setForeground(new java.awt.Color(90, 34, 139));
        lblTentg.setText("Tên tác giả:");
        pnlNoidung.add(lblTentg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        lblMatg.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblMatg.setForeground(new java.awt.Color(90, 34, 139));
        lblMatg.setText("Mã tác giả:");
        pnlNoidung.add(lblMatg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 30));

        scrollInfomation.setBackground(new java.awt.Color(213, 184, 255));
        scrollInfomation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblTacgia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblTacgia.setForeground(new java.awt.Color(90, 34, 139));
        tblTacgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Tên tác giả", "Chuyên môn", "Giới thiệu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTacgia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblTacgia.setFocusable(false);
        tblTacgia.setGridColor(new java.awt.Color(102, 102, 102));
        tblTacgia.setRowHeight(25);
        tblTacgia.setSelectionBackground(new java.awt.Color(241, 231, 254));
        tblTacgia.setSelectionForeground(new java.awt.Color(90, 34, 139));
        tblTacgia.setShowGrid(true);
        tblTacgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTacgiaMouseClicked(evt);
            }
        });
        scrollInfomation.setViewportView(tblTacgia);

        pnlNoidung.add(scrollInfomation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 490, 400));

        txtTen.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTen.setForeground(new java.awt.Color(90, 34, 139));
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKeyReleased(evt);
            }
        });
        pnlNoidung.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, 30));

        txtMa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtMa.setForeground(new java.awt.Color(90, 34, 139));
        pnlNoidung.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 30));

        btnThem.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(90, 34, 139));
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlNoidung.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 120, 32));

        btnSua.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(90, 34, 139));
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlNoidung.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 120, 32));

        btnHuy.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(90, 34, 139));
        btnHuy.setText("Hủy bỏ");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        pnlNoidung.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 120, 32));

        lblWarn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblWarn.setForeground(new java.awt.Color(255, 102, 102));
        lblWarn.setText("* Nhập tên tác giả");
        pnlNoidung.add(lblWarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 20));

        txtChuyenmon.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtChuyenmon.setForeground(new java.awt.Color(90, 34, 139));
        pnlNoidung.add(txtChuyenmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 30));

        lblChuyenmon.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblChuyenmon.setForeground(new java.awt.Color(90, 34, 139));
        lblChuyenmon.setText("Chuyên môn:");
        pnlNoidung.add(lblChuyenmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, 30));

        lblGioithieu.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblGioithieu.setForeground(new java.awt.Color(90, 34, 139));
        lblGioithieu.setText("Giới thiệu:");
        pnlNoidung.add(lblGioithieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 30));

        txtAreaGioithieu.setColumns(20);
        txtAreaGioithieu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtAreaGioithieu.setForeground(new java.awt.Color(90, 34, 139));
        txtAreaGioithieu.setRows(5);
        scrollGioithieu.setViewportView(txtAreaGioithieu);

        pnlNoidung.add(scrollGioithieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 100));

        btnXoa.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(90, 34, 139));
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlNoidung.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 120, 32));

        getContentPane().add(pnlNoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 890, 524));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        lblSystemIC.setBackground(new java.awt.Color(90,34,139));
    }//GEN-LAST:event_lblSystemICMouseExited

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
        lblMinus.setBackground(new java.awt.Color(90,34,139));
    }//GEN-LAST:event_lblMinusMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            String maTacgia = txtMa.getText().trim();
            String tenTacgia = txtTen.getText().trim();
            String chuyenMon = txtChuyenmon.getText().trim();
            String Gioithieu = txtAreaGioithieu.getText().trim();
            
            if (tenTacgia.isEmpty()) {
                txtMa.setText("");
                txtTen.setText("");
                lblWarn.setVisible(true);
                return;
            }
                   
            // Kiểm tra tên  đã tồn tại
            if (dstacgia.IsDuplicate(tenTacgia)) {
                JOptionPane.showMessageDialog(null, "Tác giả này đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return; // Dừng thực hiện
            }
            
            // Tiến hành thêm hoặc sửa
            TacGiaModel obj = new TacGiaModel();
            obj.setTenTacgia(tenTacgia);
            obj.setChuyenmon(chuyenMon);
            obj.setGioithieu(Gioithieu);
            
            if (cothem) { // Thêm mới
                if (dstacgia.InsertData(obj)) {
                    JOptionPane.showMessageDialog(null, "Thêm mới thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } else { // Sửa
                if (dstacgia.EditData(obj)) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            ClearData(); // Xóa dữ liệu trên bảng
            ShowData();  // Hiển thị lại dữ liệu
        } catch (SQLException ex) {
            Logger.getLogger(frmQLTacGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtTen.setText("");
        txtChuyenmon.setText("");
        txtAreaGioithieu.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            String mtg = txtMa.getText();
            String tentg = txtTen.getText();
            String linhvuc = txtChuyenmon.getText();
            String gioithieu = txtAreaGioithieu.getText();
            
            if (mtg.length() == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn loại cần sửa", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (tentg.length() == 0) {
                JOptionPane.showMessageDialog(null, "Tên thể loại không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
            TacGiaModel tacgia = new TacGiaModel();
            tacgia.setMaTacgia(mtg);
            tacgia.setTenTacgia(tentg);
            tacgia.setChuyenmon(linhvuc);
            tacgia.setGioithieu(gioithieu);
            

            if (!dstacgia.EditData(tacgia)) {
                JOptionPane.showMessageDialog(null, "Sửa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                ClearData();
                ShowData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmQLTacGia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String matg = txtMa.getText().trim();
        String tentg = txtTen.getText().trim();
        String chuyenmon = txtChuyenmon.getText().trim();
        String Gioithieu = txtAreaGioithieu.getText().trim();
        
        if (matg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tác giả để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, 
        "Bạn có chắc chắn muốn xóa tác giả tên \"" + tentg + "\" không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean isDeleted = dstacgia.DeleteData(matg);

            if (isDeleted) {
                try {
                    JOptionPane.showMessageDialog(this,  "Xóa thành công tác giả có tên \"" + tentg + "\".",
                            "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    
                    ClearData();   
                    ShowData();
                } catch (SQLException ex) {
                    Logger.getLogger(frmQLTacGia.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, 
                "Không thể xóa thể loại . Vui lòng thử lại.", "Lỗi",  JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyReleased
        // TODO add your handling code here:
        String tg = txtTen.getText().trim();
        if (!tg.isEmpty()) {
            lblWarn.setVisible(false); 
            
        } else {
            lblWarn.setVisible(true); 
        }
    }//GEN-LAST:event_txtTenKeyReleased

    private void tblTacgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTacgiaMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblTacgia.getSelectedRow();
        if (selectedRow != -1) {
            // Get the selected category data
            String maTacgia = (String) tblTacgia.getValueAt(selectedRow, 0);
            String tenTacgia = (String) tblTacgia.getValueAt(selectedRow, 1);
            String chuyenMon = (String) tblTacgia.getValueAt(selectedRow, 2);
            String gioiThieu = (String) tblTacgia.getValueAt(selectedRow, 3);          

            // Populate text fields with selected data
            txtMa.setText(maTacgia);
            txtTen.setText(tenTacgia);
            txtChuyenmon.setText(chuyenMon);
            txtAreaGioithieu.setText(gioiThieu);
           
        }
    }//GEN-LAST:event_tblTacgiaMouseClicked

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
            java.util.logging.Logger.getLogger(frmQLTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new frmQLTacGia().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmQLTacGia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lblChuyenmon;
    private javax.swing.JLabel lblGioithieu;
    private javax.swing.JLabel lblMatg;
    private javax.swing.JLabel lblMinus;
    private javax.swing.JLabel lblSystemIC;
    private javax.swing.JLabel lblTentg;
    private javax.swing.JLabel lblTieude;
    private javax.swing.JLabel lblWarn;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlNoidung;
    private javax.swing.JScrollPane scrollGioithieu;
    private javax.swing.JScrollPane scrollInfomation;
    private javax.swing.JTable tblTacgia;
    private javax.swing.JTextArea txtAreaGioithieu;
    private javax.swing.JTextField txtChuyenmon;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
