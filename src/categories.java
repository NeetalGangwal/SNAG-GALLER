
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neetal Gangwal
 */
public class categories extends javax.swing.JFrame {

    /**
     * Creates new form categories
     */
    public categories() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        cb3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 2, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stars in Gallery");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setText("General");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 139, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setText("Types");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 98, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Watch", "Frames", "Show Piece", "Tribal", "Photo Frames" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 90, -1));

        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diwali", "Valentines day" }));
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel4.setText("Festival Special");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 196, -1));

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton7.setText("<< BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 320, 270));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        if(cb1.getSelectedItem()=="Watch")
        {
            cb2.removeAllItems();
            cb2.addItem("  ");
            cb2.addItem("Clay");
            cb2.addItem("Denta");
            cb2.addItem("Cone Art");
            cb2.addItem("Paper Quilling");
            cb3.setEnabled(false);
        }
        else
        {
            if(cb1.getSelectedItem()=="Tribal")
            {
                cb2.removeAllItems();
                cb2.addItem("  ");
                cb2.addItem("Painting");
                cb2.addItem("Two Piece Hanging");
                cb2.addItem("Faces");
                cb2.addItem("Wall Hanging");
                cb3.setEnabled(false);
            }
            else
            {
                if(cb1.getSelectedItem()=="Photo Frames")
                {
                    cb2.removeAllItems();
                    cb2.addItem("  ");
                    cb2.addItem("Paper Quilling");
                    cb2.addItem("Clay");
                    cb2.addItem("Lamasa");
                    cb2.addItem("Denta");
                    cb3.setEnabled(false);
                }
                else
                {
                    if(cb1.getSelectedItem()=="Frames")
                    {
                        cb2.removeAllItems();
                        cb2.addItem("  ");
                        cb2.addItem("Clay");
                        cb2.addItem("Denta");
                        cb2.addItem("Four Piece Painting");
                        cb2.addItem("Paper Quilling");
                        cb3.setEnabled(false);
                    }
                    else
                    {

                        {
                            if(cb1.getSelectedItem()=="Show Piece")
                            {
                                cb2.removeAllItems();
                                cb2.addItem("  ");
                                cb2.addItem("Clay");
                                cb2.addItem("Denta");
                                cb2.addItem("Cone Art");
                                cb2.addItem("Lamasa");
                                cb3.setEnabled(false);
                            }
                        }
                    }
                }
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Watch")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\watch\\1.png"));
        }
        if(cb2.getSelectedItem()==("Paper Quilling") && (cb1.getSelectedItem()==("Watch")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\watch\\4.png"));
        }
        if(cb2.getSelectedItem()==("Cone Art") && (cb1.getSelectedItem()==("Watch")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\watch\\3.png"));
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Watch")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\watch\\2.png"));
        }
        if(cb2.getSelectedItem()==("Lamasa") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\photoframes\\3.png"));
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\photoframes\\2.png"));
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\photoframes\\4.png"));
        }
        if(cb2.getSelectedItem()==("Paper Quilling") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\photoframes\\1.png"));
        }
        if(cb2.getSelectedItem()==("Cone Art") && (cb1.getSelectedItem()==("Show Piece")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\showpiece\\3.png"));
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Show Piece")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\showpiece\\2.png"));
        }
        if(cb2.getSelectedItem()==("Lamasa") && (cb1.getSelectedItem()==("Show Piece")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\showpiece\\4.png"));
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Show Piece")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\showpiece\\1.png"));
        }
        if(cb2.getSelectedItem()==("Faces") && (cb1.getSelectedItem()==("Tribal")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\tribal\\3.png"));
        }
        if(cb2.getSelectedItem()==("Wall Hanging") && (cb1.getSelectedItem()==("Tribal")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\tribal\\4.png"));
        }
        if(cb2.getSelectedItem()==("Painting") && (cb1.getSelectedItem()==("Tribal")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\tribal\\1.png"));
        }
        if(cb2.getSelectedItem()==("Two Piece Hanging") && (cb1.getSelectedItem()==("Tribal")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\tribal\\2.png"));
        }
        if(cb2.getSelectedItem()==("Four Piece Painting") && (cb1.getSelectedItem()==("Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\frame\\3.png"));
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\frame\\1.png"));
        }
        if(cb2.getSelectedItem()==("Paper Quilling") && (cb1.getSelectedItem()==("Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\frame\\4.png"));
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Frames")))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\frame\\2.png"));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        if(cb3.getSelectedItem()=="Diwali")
        {
            cb1.setEnabled(false);
            cb2.setEnabled(false);
        }
        if(cb3.getSelectedItem()==("Diwali"))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\combo\\diwali.png"));
        }

        if(cb3.getSelectedItem()=="Valentines day")
        {
            cb1.setEnabled(false);
            cb2.setEnabled(false);
        }
        if(cb3.getSelectedItem()==("Valentines day"))
        {
            l1.setIcon(new ImageIcon("C:\\Users\\Neetal\\Documents\\NetBeansProjects\\snag gallary\\src\\combo\\valentine.png"));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        home s1 = new home ();
        s1.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Watch")))
        {
            wclay s1 = new wclay ();
            s1.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Paper Quilling") && (cb1.getSelectedItem()==("Watch")))
        {
            wquilling s2 = new wquilling ();
            s2.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Cone Art") && (cb1.getSelectedItem()==("Watch")))
        {
            wcone s3 = new wcone ();
            s3.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Watch")))
        {
            wdenta s4 = new wdenta ();
            s4.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Lamasa") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            pflamasa s5 = new pflamasa ();
            s5.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            pfclay s6 = new pfclay ();
            s6.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            pfdenta s7 = new pfdenta ();
            s7.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Papaer Quilling") && (cb1.getSelectedItem()==("Photo Frames")))
        {
            pfquilling s8 = new pfquilling ();
            s8.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Faces") && (cb1.getSelectedItem()==("Tribal")))
        {
            tfaces s9 = new tfaces ();
            s9.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Wall Hanging") && (cb1.getSelectedItem()==("Tribal")))
        {
            twallhanging s10 = new twallhanging ();
            s10.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Painting") && (cb1.getSelectedItem()==("Tribal")))
        {
            tpainting s11 = new tpainting ();
            s11.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Two Piece Hanging") && (cb1.getSelectedItem()==("Tribal")))
        {
            t2pchanging s12 = new t2pchanging ();
            s12.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Four Piece Painting") && (cb1.getSelectedItem()==("Frames")))
        {
            f4pcpainting s13 = new f4pcpainting ();
            s13.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Frames")))
        {
            fclay s14 = new fclay ();
            s14.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Paper Quilling") && (cb1.getSelectedItem()==("Frames")))
        {
            fquilling s15 = new fquilling ();
            s15.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Frames")))
        {
            fdenta s16 = new fdenta ();
            s16.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Cone Art") && (cb1.getSelectedItem()==("Show Piece")))
        {
            spcone s17 = new spcone ();
            s17.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Denta") && (cb1.getSelectedItem()==("Show Piece")))
        {
            spdenta s18 = new spdenta ();
            s18.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Lamasa") && (cb1.getSelectedItem()==("Show Piece")))
        {
            splamasa s19 = new splamasa ();
            s19.setVisible(true);
            this.setVisible(false);
        }
        if(cb2.getSelectedItem()==("Clay") && (cb1.getSelectedItem()==("Show Piece")))
        {
            spclay s20 = new spclay ();
            s20.setVisible(true);
            this.setVisible(false);
        }
        if(cb3.getSelectedItem()==("Diwali"))
        {
            diwali s21 = new diwali ();
            s21.setVisible(true);
            this.setVisible(false);
        }
        if(cb3.getSelectedItem()==("Valentines day"))
        {
            valentine s22 = new valentine ();
            s22.setVisible(true);
            this.setVisible(false);
        }
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}