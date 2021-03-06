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
public class PatientDashBoardAppointmentGUI2 extends javax.swing.JFrame {

    private String ccn;
    private String cvv;
    private String cost;
    int t_id;
    int p_id;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public PatientDashBoardAppointmentGUI2() {
        initComponents();
        con = DBConnection.getConnection();
        getTestID();
        setCostField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreditCardField = new javax.swing.JTextField();
        CVV = new javax.swing.JTextField();
        Cost = new javax.swing.JTextField();
        Book = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardTOP = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardLEFT = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardBOTTOM = new javax.swing.JLabel();
        MouseClickBackPatientDashBoardRIGHT = new javax.swing.JLabel();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreditCardField.setBackground(new java.awt.Color(49, 19, 50));
        CreditCardField.setForeground(new java.awt.Color(255, 255, 255));
        CreditCardField.setToolTipText("");
        CreditCardField.setBorder(null);
        CreditCardField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(CreditCardField, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 180, 140, 14));

        CVV.setBackground(new java.awt.Color(49, 19, 50));
        CVV.setForeground(new java.awt.Color(255, 255, 255));
        CVV.setToolTipText("");
        CVV.setBorder(null);
        CVV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(CVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 233, 140, 14));

        Cost.setBackground(new java.awt.Color(49, 19, 50));
        Cost.setForeground(new java.awt.Color(255, 255, 255));
        Cost.setToolTipText("");
        Cost.setBorder(null);
        Cost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 286, 140, 14));

        Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookMouseClicked(evt);
            }
        });
        getContentPane().add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 351, 54, 30));

        MouseClickBackPatientDashBoardTOP.setPreferredSize(new java.awt.Dimension(900, 42));
        MouseClickBackPatientDashBoardTOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardTOPMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardTOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MouseClickBackPatientDashBoardLEFT.setPreferredSize(new java.awt.Dimension(310, 466));
        MouseClickBackPatientDashBoardLEFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardLEFTMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardLEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, -1));

        MouseClickBackPatientDashBoardBOTTOM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardBOTTOMMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardBOTTOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 508, 900, 42));

        MouseClickBackPatientDashBoardRIGHT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickBackPatientDashBoardRIGHTMouseClicked(evt);
            }
        });
        getContentPane().add(MouseClickBackPatientDashBoardRIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 42, 308, 466));

        BackgroundImageLabel.setBackground(new java.awt.Color(48, 19, 49));
        BackgroundImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PatientImg/PatientDashBoardAppointmentGUI2.png"))); // NOI18N
        BackgroundImageLabel.setText("fsaf");
        BackgroundImageLabel.setToolTipText("");
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MouseClickBackPatientDashBoardTOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardTOPMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardTOPMouseClicked

    private void MouseClickBackPatientDashBoardLEFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardLEFTMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardLEFTMouseClicked

    private void MouseClickBackPatientDashBoardBOTTOMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardBOTTOMMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardBOTTOMMouseClicked

    private void MouseClickBackPatientDashBoardRIGHTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickBackPatientDashBoardRIGHTMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_MouseClickBackPatientDashBoardRIGHTMouseClicked

    
    private void setCostField() {
        Cost.setText(cost);
    }
    
    private void getTestID() {
        String test_d = PatientDashBoardAppointmentGUI.Test_detail;
        
        String[] test_Info = test_d.split("-", 2);
        cost = test_Info[1];
        
        if(con != null) {
            try {
                ps = con.prepareStatement("SELECT * FROM Test where type = ?");
                ps.setString(1,test_Info[0]);
                rs = ps.executeQuery();
                
                rs.next();
                
                t_id = rs.getInt(1);
                p_id = HomePagePatientLoginGUI.LogINPatientID;
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }               
        }
        else
            JOptionPane.showMessageDialog(null, "DateBase Connection Failed");
    }
    
    private void BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseClicked
        ccn = CreditCardField.getText();
        cvv = CVV.getText();
        
        if(con != null) {
            try {
                ps = con.prepareStatement("INSERT INTO `appointment`(`date`, `time`, `t_id`, `p_id`) VALUES (?,?,?,?)");
                
                ps.setString(1, PatientDashBoardAppointmentGUI.date);
                ps.setString(2, PatientDashBoardAppointmentGUI.time);
                ps.setInt(3, t_id);
                ps.setInt(4, p_id);
                
                ps.executeUpdate();
                
                ps = con.prepareStatement("INSERT INTO `payment`(`credit_card_no`, `cvv`, `p_id`) VALUES (?,?,?)");
                
                ps.setString(1, ccn);
                ps.setString(2, cvv);
                ps.setInt(3, p_id);
                
                ps.executeUpdate();
                
                ps = con.prepareStatement("Select td_id from test_details where t_id = ?");
                ps.setInt(1, t_id);
                
                rs = ps.executeQuery();
                
                while(rs.next()) {
                    ps = con.prepareStatement("INSERT INTO `patient_test_details`(`app_no`, `td_id`) VALUES (?,?)");
                    ps.setInt(1, Integer.valueOf(PatientDashBoardAppointmentGUI.Appointment_No));
                    ps.setInt(2,rs.getInt(1));
                    ps.executeUpdate();
                }
                
                JOptionPane.showMessageDialog(null, "Appointment BOOK");
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }               
        }
        else
            JOptionPane.showMessageDialog(null, "DateBase Connection Failed");
        
        this.setVisible(false);
    }//GEN-LAST:event_BookMouseClicked

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
            java.util.logging.Logger.getLogger(PatientDashBoardAppointmentGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardAppointmentGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardAppointmentGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardAppointmentGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashBoardAppointmentGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel Book;
    private javax.swing.JTextField CVV;
    private javax.swing.JTextField Cost;
    private javax.swing.JTextField CreditCardField;
    private javax.swing.JLabel MouseClickBackPatientDashBoardBOTTOM;
    private javax.swing.JLabel MouseClickBackPatientDashBoardLEFT;
    private javax.swing.JLabel MouseClickBackPatientDashBoardRIGHT;
    private javax.swing.JLabel MouseClickBackPatientDashBoardTOP;
    // End of variables declaration//GEN-END:variables
}
