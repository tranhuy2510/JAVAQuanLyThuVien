package ui_library;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class frmDSMuonTra extends javax.swing.JFrame {

    public frmDSMuonTra() {
                
        initComponents();
        setupUI();
        // can giua cho form
        
//        this.setSize(1099,691);
        this.setLocationRelativeTo(null);
        // tao vien cho khung panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(74,98,138));
        
        jPanel_Theloaisach.setBorder(panelHeaderBorder);
     
        controllers.Func_Class func = new controllers.Func_Class();
        func.displayImage(60,60,"/image/books-1977235.png", lblTieudeTL );
    
    }
    private void setupUI(){
      
        
        // thiet ke cho hang tren dau cua bang
        tblSachmuon.getTableHeader().setBackground(new Color(74,98,138)); 
        tblSachmuon.getTableHeader().setForeground(Color.white);
        tblSachmuon.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 12));
        tblSachmuon.getTableHeader().setOpaque(false);

        tblSachmuon.getTableHeader().repaint();
       
//        tblSachmuon.getColumnModel().getColumn(0).setPreferredWidth(20);
//        tblSachmuon.getColumnModel().getColumn(4).setPreferredWidth(40);
//        tblSachmuon.getColumnModel().getColumn(5).setPreferredWidth(40);
        

      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Theloaisach = new javax.swing.JPanel();
        lblTieudeTL = new javax.swing.JLabel();
        lblMinus = new javax.swing.JLabel();
        lbl_Close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ngaymuon = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        Ngaytra = new com.toedter.calendar.JDateChooser();
        btnTim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSachmuon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel_Theloaisach.setBackground(new java.awt.Color(148, 170, 214));
        jPanel_Theloaisach.setPreferredSize(new java.awt.Dimension(1105, 636));

        lblTieudeTL.setBackground(new java.awt.Color(74, 98, 138));
        lblTieudeTL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieudeTL.setForeground(new java.awt.Color(255, 255, 255));
        lblTieudeTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieudeTL.setText("Danh sách sách mượn");
        lblTieudeTL.setOpaque(true);

        lblMinus.setBackground(new java.awt.Color(74, 98, 138));
        lblMinus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_minus.png"))); // NOI18N
        lblMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinus.setOpaque(true);
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

        lbl_Close.setBackground(new java.awt.Color(74, 98, 138));
        lbl_Close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_close24.png"))); // NOI18N
        lbl_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Close.setOpaque(true);
        lbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CloseMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(191, 202, 230));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Ngày mượn:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Ngày trả:");

        btnTim.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnTim.setText("Tìm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnTim)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTim)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(Ngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        tblSachmuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Tên độc giả", "Ngày mượn", "Ngày trả", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSachmuon.setSelectionBackground(new java.awt.Color(191, 202, 230));
        jScrollPane1.setViewportView(tblSachmuon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TheloaisachLayout = new javax.swing.GroupLayout(jPanel_Theloaisach);
        jPanel_Theloaisach.setLayout(jPanel_TheloaisachLayout);
        jPanel_TheloaisachLayout.setHorizontalGroup(
            jPanel_TheloaisachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TheloaisachLayout.createSequentialGroup()
                .addComponent(lblTieudeTL, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
            .addGroup(jPanel_TheloaisachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_TheloaisachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_TheloaisachLayout.setVerticalGroup(
            jPanel_TheloaisachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TheloaisachLayout.createSequentialGroup()
                .addGroup(jPanel_TheloaisachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTieudeTL, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lbl_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Theloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Theloaisach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseClicked
        // TODO add your handling code here:
        // Dong form the loai sach
        this.dispose();
    }//GEN-LAST:event_lbl_CloseMouseClicked

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
        lblMinus.setBackground(new java.awt.Color(74,98,138));
    }//GEN-LAST:event_lblMinusMouseExited

    private void lbl_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseEntered
        // TODO add your handling code here:
        lbl_Close.setBackground(Color.red);
    }//GEN-LAST:event_lbl_CloseMouseEntered

    private void lbl_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CloseMouseExited
        // TODO add your handling code here:
        lbl_Close.setBackground(new java.awt.Color(74,98,138));
    }//GEN-LAST:event_lbl_CloseMouseExited

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDSMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDSMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDSMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDSMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDSMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Ngaymuon;
    private com.toedter.calendar.JDateChooser Ngaytra;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Theloaisach;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMinus;
    private javax.swing.JLabel lblTieudeTL;
    private javax.swing.JLabel lbl_Close;
    private javax.swing.JTable tblSachmuon;
    // End of variables declaration//GEN-END:variables
}
