/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Views.PatientGUI.*;
import javax.swing.JFrame;

/**
 *
 * @author sajib
 */
public class HomePageGUI extends javax.swing.JFrame {

    public static HomePageGUI hp = null;
    public HomePageGUI() {
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

        ClosedLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        AdminLabel = new javax.swing.JLabel();
        PatientLabel = new javax.swing.JLabel();
        ContactUsLabel = new javax.swing.JLabel();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClosedLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosedLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ClosedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 8, 16, 16));

        MinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 8, 16, 16));

        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
        });
        getContentPane().add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 195, 121, 29));

        AdminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLabelMouseClicked(evt);
            }
        });
        getContentPane().add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 255, 121, 29));

        PatientLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientLabelMouseClicked(evt);
            }
        });
        getContentPane().add(PatientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 315, 121, 29));

        ContactUsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactUsLabelMouseClicked(evt);
            }
        });
        getContentPane().add(ContactUsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 377, 129, 29));

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HomaPageGUI.png"))); // NOI18N
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClosedLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosedLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ClosedLabelMouseClicked

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        if(hp != null) {
            this.setVisible(true);
        }
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void AdminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLabelMouseClicked
        new HomePageAdminLoginGUI().setVisible(true);
    }//GEN-LAST:event_AdminLabelMouseClicked

    private void PatientLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientLabelMouseClicked
        new HomePagePatientLoginGUI().setVisible(true);
    }//GEN-LAST:event_PatientLabelMouseClicked

    private void ContactUsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactUsLabelMouseClicked
        new HomePageContactUsGUI().setVisible(true);
    }//GEN-LAST:event_ContactUsLabelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i=0.0; i<=1.0; i+=0.1) {
            String val = i+"";
            float fval = Float.valueOf(val);
            this.setOpacity(fval);
            try {
                Thread.sleep(50);
            }
            catch(Exception e) {
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hp = new HomePageGUI();
                hp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel ClosedLabel;
    private javax.swing.JLabel ContactUsLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel PatientLabel;
    // End of variables declaration//GEN-END:variables
}