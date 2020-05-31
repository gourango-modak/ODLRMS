/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PatientGUI;

import Database.DBConnection;
import Views.HomePagePatientLoginGUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sajib
 */
public class PatientDashBoardReportsGUI extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    protected static String selected_App_No;
    
    public PatientDashBoardReportsGUI() {
        initComponents();
        con = DBConnection.getConnection();
        setAppointmentNo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MouseClickBackPatientDashBoardRIGHT = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardBOTTOM = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardLEFT = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardTOP = new javax.swing.JLabel();
        SubmitLabel = new javax.swing.JLabel();
        AppointmentNo = new javax.swing.JComboBox<>();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MouseClickBackPatientDashBoardRIGHT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardRIGHTMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardRIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 42, 308, 466));

        MouseClickBackPatientDashBoardBOTTOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardBOTTOMMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardBOTTOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 508, 900, 42));

        MouseClickBackPatientDashBoardLEFT.setPreferredSize(new java.awt.Dimension(310, 466));
        MouseClickBackPatientDashBoardLEFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardLEFTMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardLEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, -1));

        MouseClickBackPatientDashBoardTOP.setPreferredSize(new java.awt.Dimension(900, 42));
        MouseClickBackPatientDashBoardTOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardTOPMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SubmitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(SubmitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 279, 55, 30));

        AppointmentNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Test ID" }));
        AppointmentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentNoActionPerformed(evt);
            }
        });
        getContentPane().add(AppointmentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 166, 156, 28));

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PatientImg/PatientDashBoardReportsGUI.png"))); // NOI18N
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MouseClickBackPatientDashBoardRIGHTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardRIGHTMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardRIGHTMouseClicked

    private void MouseClickBackPatientDashBoardBOTTOMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardBOTTOMMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardBOTTOMMouseClicked

    private void MouseClickBackPatientDashBoardLEFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardLEFTMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardLEFTMouseClicked

    private void MouseClickBackPatientDashBoardTOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardTOPMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardTOPMouseClicked

    private void SubmitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitLabelMouseClicked
        new PatientDashBoardReportDetailsGUI().setVisible(true);
    }//GEN-LAST:event_SubmitLabelMouseClicked

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

    private void AppointmentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentNoActionPerformed
        selected_App_No = AppointmentNo.getSelectedItem().toString();
    }//GEN-LAST:event_AppointmentNoActionPerformed

    
    
    private void setAppointmentNo() {
        if(con != null) {
            try {
                ps = con.prepareStatement("SELECT * FROM appointment where p_id = ?");
                ps.setInt(1,HomePagePatientLoginGUI.LogINPatientID);
                rs = ps.executeQuery();
                
                while(rs.next()) {
                    AppointmentNo.addItem(String.valueOf(rs.getInt(1)));
                }
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }               
        }
        else
            JOptionPane.showMessageDialog(null, "DateBase Connection Failed");
    }
    
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
            java.util.logging.Logger.getLogger(PatientDashBoardReportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashBoardReportsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AppointmentNo;
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel MouseClickBackPatientDashBoardBOTTOM;
    private javax.swing.JLabel MouseClickBackPatientDashBoardLEFT;
    private javax.swing.JLabel MouseClickBackPatientDashBoardRIGHT;
    private javax.swing.JLabel MouseClickBackPatientDashBoardTOP;
    private javax.swing.JLabel SubmitLabel;
    // End of variables declaration//GEN-END:variables
}