/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author ADMIN
 */
public class frmCardMember extends javax.swing.JFrame {

    /**
     * Creates new form frmCardMember
     */
    public frmCardMember() {
        initComponents();
        // can giua cho form
        this.setLocationRelativeTo(null);
        
        
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
        lblTieude = new javax.swing.JLabel();
        lblSystemIC1 = new javax.swing.JLabel();
        pnlRiview = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        lblMadg = new javax.swing.JLabel();
        lblTendg = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(211, 84, 0));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSystemIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_close24.png"))); // NOI18N
        lblSystemIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSystemICMouseClicked(evt);
            }
        });
        pnlHeader.add(lblSystemIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 60, 57));

        lblTieude.setBackground(new java.awt.Color(241, 231, 254));
        lblTieude.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTieude.setForeground(new java.awt.Color(247, 239, 232));
        lblTieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieude.setText("Vắn tắt độc giả");
        lblTieude.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlHeader.add(lblTieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 170, 57));

        lblSystemIC1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSystemIC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ic_tacgia64.png"))); // NOI18N
        pnlHeader.add(lblSystemIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 57));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        pnlRiview.setBackground(new java.awt.Color(247, 239, 232));
        pnlRiview.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(211, 84, 0)));
        pnlRiview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(211, 84, 0)));
        pnlRiview.add(lblAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 180));

        lblMadg.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblMadg.setForeground(new java.awt.Color(211, 84, 0));
        lblMadg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMadg.setText("Mã độc giả:");
        pnlRiview.add(lblMadg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 25));

        lblTendg.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblTendg.setForeground(new java.awt.Color(211, 84, 0));
        lblTendg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTendg.setText("Tên độc giả:");
        pnlRiview.add(lblTendg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 25));

        lblSdt.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblSdt.setForeground(new java.awt.Color(211, 84, 0));
        lblSdt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSdt.setText("Số điện thoại:");
        pnlRiview.add(lblSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 25));

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(211, 84, 0));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email:");
        pnlRiview.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, 25));

        lblGioiTinh.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(211, 84, 0));
        lblGioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGioiTinh.setText("Giới tính:");
        pnlRiview.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 25));

        getContentPane().add(pnlRiview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSystemICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSystemICMouseClicked
        // TODO add your handling code here:
        // Dong form
        this.dispose();
    }//GEN-LAST:event_lblSystemICMouseClicked

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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCardMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCardMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCardMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCardMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCardMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMadg;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblSystemIC;
    private javax.swing.JLabel lblSystemIC1;
    private javax.swing.JLabel lblTendg;
    private javax.swing.JLabel lblTieude;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlRiview;
    // End of variables declaration//GEN-END:variables
}
