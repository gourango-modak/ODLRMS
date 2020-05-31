/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.PatientGUI;

import Database.DBConnection;
import Views.AdminGUI.AdminDashBoardPatientTestDetailsGUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sajib
 */
public class PatientDashBoardReportDetailsGUI extends javax.swing.JFrame {

    ArrayList<ViewReport> list;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;
    int select_TestID;
    
    public PatientDashBoardReportDetailsGUI() {
        initComponents();
        list = new ArrayList<ViewReport>();
        con = DBConnection.getConnection();
        setReportDetail();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Minimum", "Maximum", "Test Value"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 900, 460));

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PatientImg/PatientDashBoardReportDetailsGUI.png"))); // NOI18N
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClosedLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosedLabelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_ClosedLabelMouseClicked

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

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

    
    private class ViewReport {
        String name;
        int min;
        int maxi;
        int testValue;
        
        ViewReport(String name, int min, int maxi, int testValue) {
            this.name = name;
            this.min = min;
            this.maxi = maxi;
            this.testValue = testValue;
        }
    }
    
    
    private void setReportDetail() {
        if(con != null) {
            try {
                ps = con.prepareStatement("SELECT t_id FROM appointment where app_no = ?");
                ps.setInt(1,Integer.valueOf(PatientDashBoardReportsGUI.selected_App_No));
                rs = ps.executeQuery();
                
                rs.next();
                
                select_TestID = rs.getInt(1);
                
                
                
                
                
                ps = con.prepareStatement("SELECT * FROM test_details where t_id = ?");
                ps.setInt(1,select_TestID);
                rs = ps.executeQuery();
                
                while(rs.next()) {
                    ViewReport vr = new ViewReport(rs.getString(2),rs.getInt(3),rs.getInt(4),0);
                    list.add(vr);
                }
                
                ps = con.prepareStatement("Select * from patient_test_details where app_no = ?");
                ps.setString(1, PatientDashBoardReportsGUI.selected_App_No);

                rs = ps.executeQuery();
                int i=0;
                while(rs.next()) {
                    list.get(i).testValue = rs.getInt(2);
                    i++;
                }
                
                
                addRowToTable();
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }               
        }
        else
            JOptionPane.showMessageDialog(null, "DateBase Connection Failed");
    }
    
    private void addRowToTable() {
        model = (DefaultTableModel) jTable1.getModel();
        Object[] rowData = new Object[4];
        for(int i=0; i<list.size(); i++) {
            rowData[0] = list.get(i).name;
            rowData[1] = list.get(i).min;
            rowData[2] = list.get(i).maxi;
            rowData[3] = list.get(i).testValue;
            model.addRow(rowData);
        }
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
            java.util.logging.Logger.getLogger(PatientDashBoardReportDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoardReportDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashBoardReportDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel ClosedLabel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}