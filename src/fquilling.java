import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neetal Gangwal
 */
public class fquilling extends javax.swing.JFrame {

    /**
     * Creates new form fquilling
     */
    public fquilling() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        l1.setText("Sn0108");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 110, 40));

        l2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        l2.setText("Paper Quilling");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 180, 40));

        l3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        l3.setText("50x50x3cm");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 170, 40));

        l4.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        l4.setText("Rs 500");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 120, 40));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton2.setText("Add To Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 200, 50));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frame/4.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/snag","root","tiger");
            String mno = (String)l1.getText();
            String type = (String)l2.getText();
            String s = (String)l3.getText();
            String p = (String)l4.getText();
            String sql = "insert into cart values('"+mno+"', '"+type+"', '"+s+"', '"+p+"'); ";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane,"record saved");
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        categories s1 = new categories ();
        s1.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fquilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fquilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fquilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fquilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fquilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    // End of variables declaration//GEN-END:variables
}