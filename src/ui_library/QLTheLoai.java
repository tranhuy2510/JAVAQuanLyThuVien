/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui_library;

import controllers.TheLoaiController;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.TheLoaiModel;

/**
 *
 * @author admin
 */
public final class QLTheLoai extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    // Khai báo tableModel
    private final DefaultTableModel tableModel; 
    private final TheLoaiController dstheloai;
    private final boolean cothem = true; 
    
    public QLTheLoai(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        // can giua cho form
        this.setLocationRelativeTo(null);
        
        setupUI();
                
        // Cấu hình bảng và controller
        tableModel = (DefaultTableModel) tblTheloai.getModel();
        dstheloai = new TheLoaiController();
        
        // Khởi tạo các components trên JFrame
        String[] colsName = {"Mã", "Tên thể loại"};
        // đặt tiêu đề cột cho tableModel
        tableModel.setColumnIdentifiers(colsName);
        // Kết nối JTable với tableModel
        tblTheloai.setModel(tableModel);
        // Gọi hàm showDataOnTable() để hiển thị dữ liệu lên bảng
        ShowData();
        
        lblWarn.setVisible(false);
     
        this.txtMa. setEnabled (false); 
        this.txtTheloai. setEnabled (true);
    }

    private void setupUI() {
        // Tùy chỉnh giao diện của tiêu đề bảng
        tblTheloai.getTableHeader().setBackground(new java.awt.Color(200,247,197));
        tblTheloai.getTableHeader().setForeground(new java.awt.Color(4, 147, 114));
        tblTheloai.getTableHeader().setFont(new java.awt.Font("Roboto", 1, 15));
        tblTheloai.getTableHeader().setOpaque(false);      
       
    }

    
    public void ShowData() throws SQLException{ 
        List<TheLoaiModel> lst = dstheloai.getTheloaiSach(); 
        // Duyệt qua ArrayList data
        Object[] rows = new Object[2];
        for(int i =0; i< lst.size() ; i++){
            rows[0] = lst.get(i).getMaTheLoai();
            rows[1] = lst.get(i).getTenTheLoai();
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
        jPanel1 = new javax.swing.JPanel();
        txtTheloai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        scrollTheloai = new javax.swing.JScrollPane();
        tblTheloai = new javax.swing.JTable();
        btnHuy = new javax.swing.JButton();
        lblWarn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(4, 147, 114));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTieude.setBackground(new java.awt.Color(241, 231, 254));
        lblTieude.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTieude.setForeground(new java.awt.Color(255, 255, 255));
        lblTieude.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTieude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_menu.png"))); // NOI18N
        lblTieude.setText("   Quản lý thể loại");
        lblTieude.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlHeader.add(lblTieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 270, 60));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 695, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(4, 147, 114)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTheloai.setBackground(new java.awt.Color(200, 247, 197));
        txtTheloai.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtTheloai.setForeground(new java.awt.Color(4, 147, 114));
        txtTheloai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(4, 147, 114)));
        txtTheloai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTheloaiKeyReleased(evt);
            }
        });
        jPanel1.add(txtTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 32));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 147, 114));
        jLabel8.setText("Tên thể loại:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 185, 120, 30));

        btnThem.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(4, 147, 114));
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 100, 32));

        btnSua.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(4, 147, 114));
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 32));

        btnXoa.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(4, 147, 114));
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 100, 32));

        txtMa.setBackground(new java.awt.Color(200, 247, 197));
        txtMa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtMa.setForeground(new java.awt.Color(4, 147, 114));
        txtMa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(4, 147, 114)));
        jPanel1.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 32));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 147, 114));
        jLabel9.setText("Mã thể loại:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 32));

        tblTheloai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblTheloai.setForeground(new java.awt.Color(4, 147, 114));
        tblTheloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Tên thể loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTheloai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblTheloai.setRowHeight(25);
        tblTheloai.setSelectionBackground(new java.awt.Color(200, 247, 197));
        tblTheloai.setSelectionForeground(new java.awt.Color(4, 147, 114));
        tblTheloai.setShowGrid(true);
        tblTheloai.setSurrendersFocusOnKeystroke(true);
        tblTheloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTheloaiMouseClicked(evt);
            }
        });
        scrollTheloai.setViewportView(tblTheloai);

        jPanel1.add(scrollTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 310, 190));

        btnHuy.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(4, 147, 114));
        btnHuy.setText("Hủy");
        btnHuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, 32));

        lblWarn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblWarn.setForeground(new java.awt.Color(255, 102, 102));
        lblWarn.setText("* Tên thể loại không được để trống");
        jPanel1.add(lblWarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 695, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTheloaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTheloaiKeyReleased
        // TODO add your handling code here:
        String tl = txtTheloai.getText().trim();
        if (!tl.isEmpty()) {
            lblWarn.setVisible(false);

        } else {
            lblWarn.setVisible(true);
        }
    }//GEN-LAST:event_txtTheloaiKeyReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        try {
            // TODO add your handling code here:
            String maTheloai = txtMa.getText().trim();
            String tenTheloai = txtTheloai.getText().trim();

            if (tenTheloai.isEmpty()) {
                txtMa.setText("");
                txtTheloai.setText("");
                lblWarn.setVisible(true);
                return;
            }

            // Kiểm tra tên thể loại đã tồn tại
            if (dstheloai.IsDuplicate(tenTheloai)) {
                JOptionPane.showMessageDialog(null, "Thể loại này đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return; // Dừng thực hiện
            }

            // Tiến hành thêm hoặc sửa
            TheLoaiModel obj = new TheLoaiModel();
            obj.setTenTheLoai(tenTheloai);

            if (cothem) { // Thêm mới
                if (dstheloai.InsertData(obj)) {
                    JOptionPane.showMessageDialog(null, "Thêm mới thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm mới thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } else { // Sửa
                if (dstheloai.EditData(obj)) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }

            ClearData(); // Xóa dữ liệu trên bảng
            ShowData();  // Hiển thị lại dữ liệu
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QLTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        String ml = txtMa.getText();
        String tenTL = txtTheloai.getText();

        if (ml.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn loại cần sửa", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (tenTL.length() == 0) {
            JOptionPane.showMessageDialog(null, "Tên thể loại không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            TheLoaiModel theLoai = new TheLoaiModel();
            theLoai.setMaTheLoai(Integer.valueOf(ml));
            theLoai.setTenTheLoai(tenTL);

            if (dstheloai.EditData(theLoai)) {
                JOptionPane.showMessageDialog(null, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                ClearData();
                ShowData();
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi sửa dữ liệu: " + ex.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String maLoai = txtMa.getText().trim();
        String tenTL = txtTheloai.getText();

        try {
            if (maLoai.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một thế loại để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Confirm the deletion
            int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn xóa thể loại tên \"" + tenTL + "\" không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                boolean isDeleted = dstheloai.DeleteData(maLoai);

                if (isDeleted) {
                    JOptionPane.showMessageDialog(this,  "Xóa thành công thể loại có tên \"" + tenTL + "\".",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                    ClearData();
                    ShowData();
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Không thể xóa thể loại . Vui lòng thử lại.", "Lỗi",  JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            // Handle SQL exceptions
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xóa thể loại : " + ex.getMessage(),
                "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblTheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTheloaiMouseClicked
        // TODO add your handling code here:
        //this.txtTheloai. setEnabled (false);
        int selectedRow = tblTheloai.getSelectedRow();
        if (selectedRow != -1) {
            Object maTheLoaiObj = tblTheloai.getValueAt(selectedRow, 0);
            String maTheLoai = maTheLoaiObj != null ? maTheLoaiObj.toString() : "";
            String tenTheLoai = (String) tblTheloai.getValueAt(selectedRow, 1);
            txtMa.setText(maTheLoai);
            txtTheloai.setText(tenTheLoai);

        }

    }//GEN-LAST:event_tblTheloaiMouseClicked

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtMa.setText("");
        txtTheloai.setText("");

    }//GEN-LAST:event_btnHuyActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLTheLoai dialog = new QLTheLoai(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(QLTheLoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTieude;
    private javax.swing.JLabel lblWarn;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JScrollPane scrollTheloai;
    private javax.swing.JTable tblTheloai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTheloai;
    // End of variables declaration//GEN-END:variables
}