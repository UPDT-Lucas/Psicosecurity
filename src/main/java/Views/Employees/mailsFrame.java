/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Employees;

import DataBase.get_procs;
import Models.employee;
import Models.phone;
import Utilities.extra_methods;
import Utilities.mail_sender;
import static Views.Dashboard.employeesImage;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * JFrame with the View to the employees to advice and with the option the send the mails
 */
public class mailsFrame extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    static ArrayList<employee> selectedEmp;
    
    /**
     * Creates new form mailsFrame
     * @param empMail ArrayList of employees - the list of employees to advice
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public mailsFrame(ArrayList<employee> empMail) throws SQLException, ClassNotFoundException {
        
        initComponents();
        selectedEmp = empMail;
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/icons8-user-shield-48.png"));
        this.setIconImage(icon);
        setTitle("Ventana de Correos");
                
        String[] header = new String []{"Cédula", "Primer Nombre", "Correo"};
        dtm.setColumnIdentifiers(header);
        mailTable.setModel(dtm);
        for(employee emp : selectedEmp){
            dtm.addRow(new Object[] {emp.getId_card(), emp.getFirst_name(), get_procs.get_email_by_emp(emp.getId_employee()).getAddress_email()});
        }
        mailTable.getColumnModel().getColumn(2).setPreferredWidth(300);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mailTable = new javax.swing.JTable();
        sendImage = new Utilities.image_avatar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(700, 400));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 195, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(155, 225, 247));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        content.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        mailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(mailTable);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 510, 250));

        sendImage.setBorderSize(0);
        sendImage.setBorderSpace(0);
        sendImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/optionsPerPanel/showEmp/sendEmail.png"))); // NOI18N
        sendImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendImageMouseExited(evt);
            }
        });
        content.add(sendImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendImageMouseClicked
        try {
            int[] rows = mailTable.getSelectedRows();
            ArrayList<employee> employees = new ArrayList<employee>();
            
            if(rows.length != 0){
                for(int i = 0; i < rows.length; i++){
                    try {
                        int idCard = (int) mailTable.getValueAt(rows[i], 0);
                        employee selectedEmp = get_procs.get_employee_by_card(idCard);
                        employees.add(selectedEmp);
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(showEmp.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);   
                    }
                }
                mail_sender.createEmail(employees);
            JOptionPane.showMessageDialog(content, "Se envió de manera correcta " + (employees.size() + "") + " correo(s)", "Envío exitoso" , JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(content, "No se ha seleccionado ningún empleado", "Envío no realizado" , JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (MessagingException ex) {
            Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendImageMouseClicked

    private void sendImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendImageMouseEntered
        extra_methods.showSelectedOption(sendImage, 585,190);

    }//GEN-LAST:event_sendImageMouseEntered

    private void sendImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendImageMouseExited
        extra_methods.resetSelectedOption(sendImage, 590,190);
    }//GEN-LAST:event_sendImageMouseExited

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
            java.util.logging.Logger.getLogger(mailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FlatLightFlatIJTheme.setup();
                    new mailsFrame(selectedEmp).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(mailsFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JTable mailTable;
    private Utilities.image_avatar sendImage;
    // End of variables declaration//GEN-END:variables
}
