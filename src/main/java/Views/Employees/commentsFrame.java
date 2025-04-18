/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Employees;

import DataBase.get_all_procs;
import DataBase.get_procs;
import DataBase.ins_procs;
import DataBase.upd_procs;
import Models.employee;
import Models.observation;
import Models.type_observation;
import Utilities.extra_methods;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * JFrame with the View to check employee observation
 */
public class commentsFrame extends javax.swing.JFrame {
    ArrayList<type_observation> allTypes;
    employee selectedEmp;

    /**
     * View Constructor
     * @param selectedEmp ArrayList of employees - the selected employees
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public commentsFrame(employee selectedEmp) throws SQLException, ClassNotFoundException {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/icons8-user-shield-48.png"));
        this.setIconImage(icon);
        setTitle("Ventana de Observaciones");
     
        this.selectedEmp = selectedEmp;
        typeCombo.removeAllItems();
        allTypes = get_all_procs.get_all_type_observations();
        
        for(type_observation type : allTypes){
            typeCombo.addItem(type.getName_type());
        }
    }
    
    /**
     * Update Text Fields
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    private void updateField() throws SQLException, ClassNotFoundException{
            observation obs = get_procs.get_observation_by_employee_type(selectedEmp.getId_employee(), typeCombo.getSelectedIndex()+1);
            System.out.println(obs.getDescription_observation());
            System.out.println(obs.getLast_observation());
            if(obs.getDescription_observation() != null){
                actualCommentField.setText(obs.getDescription_observation());
                if(obs.getLast_observation() != null){
                    oldCommentField.setText(obs.getLast_observation());
                }else{
                    oldCommentField.setText("No hay observationes");
                }
                
            }else{
                actualCommentField.setText("No hay observaciones");
                oldCommentField.setText("No hay observaciones");
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

        content = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        typeCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        actualCommentField = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        newCommentField = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        oldCommentField = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 460));
        setResizable(false);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(650, 460));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 195, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(155, 225, 247));

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeComboItemStateChanged(evt);
            }
        });
        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        actualCommentField.setColumns(20);
        actualCommentField.setRows(5);
        actualCommentField.setBorder(null);
        actualCommentField.setFocusable(false);
        jScrollPane1.setViewportView(actualCommentField);

        addButton.setText("Agregar");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Comentario Anterior");

        jLabel2.setText("Comentario Actual");

        newCommentField.setColumns(20);
        newCommentField.setRows(5);
        newCommentField.setBorder(null);
        jScrollPane2.setViewportView(newCommentField);

        oldCommentField.setColumns(20);
        oldCommentField.setRows(5);
        oldCommentField.setBorder(null);
        oldCommentField.setFocusable(false);
        jScrollPane3.setViewportView(oldCommentField);

        jLabel3.setText("Ingresar un Nuevo Comentario");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed

    }//GEN-LAST:event_typeComboActionPerformed

    private void typeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeComboItemStateChanged
        try {
            updateField();
        } catch (SQLException ex) {
            Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_typeComboItemStateChanged

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        try {
            if(!newCommentField.getText().equals(get_procs.get_observation_by_employee_type(selectedEmp.getId_employee(), typeCombo.getSelectedIndex()+1).getDescription_observation())){
                if(extra_methods.confirmChanges(content, false)){
                    if(get_procs.get_observation_by_employee_type(selectedEmp.getId_employee(), typeCombo.getSelectedIndex()+1).getDescription_observation() == null){
                    ins_procs.insert_observation(newCommentField.getText(), typeCombo.getSelectedIndex()+1, selectedEmp.getId_employee());
                    newCommentField.setText("");
                    }else{
                        upd_procs.update_observation_descrp(newCommentField.getText(), 
                            get_procs.get_observation_by_employee_type(selectedEmp.getId_employee(), typeCombo.getSelectedIndex()+1).getId_observation());
                        newCommentField.setText("");
                    }
                }
                updateField();
            }
        } catch (SQLException ex) {
            Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(commentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                try {
                    FlatLightFlatIJTheme.setup();
                    new commentsFrame(selectedEmp).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(commentsFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea actualCommentField;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextArea newCommentField;
    private javax.swing.JTextArea oldCommentField;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables
}
