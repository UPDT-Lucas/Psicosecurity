/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataBase.get_all_procs;
import DataBase.get_procs;
import DataBase.ins_procs;
import Models.campus;
import Models.canton;
import Models.department;
import Models.district;
import Models.post;
import Models.province;
import Utilities.extra_methods;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * JPanel with the View to insert general data into differents tables in mySQL
 */
public class insertData extends javax.swing.JPanel {
        ArrayList<campus> allCampuses;
        ArrayList<department> allDepartments;
        ArrayList<post> allPosts;
        ArrayList<province> allProvinces;
        ArrayList<canton> allCantons;
        ArrayList<district> allDistricts;
        
        
        DefaultTableModel dtmCampus = new DefaultTableModel();
        DefaultTableModel dtmDepartment = new DefaultTableModel();
        DefaultTableModel dtmPost = new DefaultTableModel();
        
    /**
     * View Constructor
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public insertData() throws SQLException, ClassNotFoundException {
        initComponents();
        allCampuses = get_all_procs.get_all_campuses();
        allDepartments = get_all_procs.get_all_departments();
        allPosts = get_all_procs.get_all_post();
        allProvinces = get_all_procs.get_all_provinces();
        
        provinceCombo.removeAllItems();
        for(province prov : allProvinces){
            provinceCombo.addItem(prov.getName_province());
        }
        
        fillDepartmentCombo();
        
        String[] headerCampus = new String[]{"Nombre", "Distrito"};
        dtmCampus.setColumnIdentifiers(headerCampus);
        campusTable.setModel(dtmCampus);
        for(campus cm : allCampuses){
             dtmCampus.addRow(new Object[]{
            cm.getName_campus(), get_procs.get_district(cm.getId_district()).getName_district()
            });
        }

        String[] headerDepartment = new String[]{"Nombre"};
        dtmDepartment.setColumnIdentifiers(headerDepartment);
        DepartmentTable.setModel(dtmDepartment);
        for(department dp : allDepartments){
             dtmDepartment.addRow(new Object[]{
            dp.getName_department()
            });
        }        
        
        String[] headerPost = new String[]{"Nombre", "Departamento", "Salario Base"};
        dtmPost.setColumnIdentifiers(headerPost);
        postTable.setModel(dtmPost);
        for(post pt : allPosts){
             dtmPost.addRow(new Object[]{
            pt.getName_post(), get_procs.get_department(pt.getId_department()).getName_department(), pt.getBase_salary()
            });
        }
    }
    
    
    /**
     * Update the view Campus table
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    private void updateTableCampus() throws SQLException, ClassNotFoundException{
        extra_methods.clearTable(campusTable, dtmCampus);
        allCampuses = get_all_procs.get_all_campuses();
        for(campus cm : allCampuses){
            dtmCampus.addRow(new Object[]{
            cm.getName_campus(), get_procs.get_district(cm.getId_district()).getName_district()
            });
        }
    }
    
    /**
     * Update the view Department table
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    private void updateTableDepartment() throws SQLException, ClassNotFoundException{
        extra_methods.clearTable(DepartmentTable, dtmDepartment);
        allDepartments = get_all_procs.get_all_departments();
        departmentCombo.removeAllItems();
        for(department dp : allDepartments){
             departmentCombo.addItem(dp.getName_department());
             dtmDepartment.addRow(new Object[]{
            dp.getName_department()
            });
        }
    }

    
    /**
     * Update the view Post table
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    private void updateTablePost() throws SQLException, ClassNotFoundException{
        extra_methods.clearTable(postTable, dtmPost);
        allPosts = get_all_procs.get_all_post();
        for(post pt : allPosts){
            dtmPost.addRow(new Object[]{
            pt.getName_post(), get_procs.get_department(pt.getId_department()).getName_department()
            });
        }
    }
    
    /**
     * Update the Department ComboBox
     */
    private void fillDepartmentCombo(){
        departmentCombo.removeAllItems();
        for(department dep : allDepartments){
            departmentCombo.addItem(dep.getName_department());
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
        nextImage = new Utilities.image_avatar();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        postTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        salaryPostField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campusTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campusField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DepartmentTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        departmentField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        districtCombo = new javax.swing.JComboBox<>();
        departmentCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        refreshCampusImage = new Utilities.image_avatar();
        refreshDepartmentImage = new Utilities.image_avatar();
        refreshPostImage = new Utilities.image_avatar();
        jLabel7 = new javax.swing.JLabel();
        namePostField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        provinceCombo = new javax.swing.JComboBox<>();
        cantonCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(1260, 700));

        nextImage.setBorderSize(0);
        nextImage.setBorderSpace(0);
        nextImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/optionsPerPanel/nextImage.png"))); // NOI18N
        nextImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextImageMouseExited(evt);
            }
        });

        postTable = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                for(int i = 0; i < postTable.getRowCount(); i ++){
                    if(row < 0){
                        return true;
                    }
                }
                return false;
            }
        };
        postTable.setModel(new javax.swing.table.DefaultTableModel(
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
        postTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(postTable);

        jLabel1.setText("Sede");

        salaryPostField.setBorder(null);

        jLabel2.setText("Ingresar nueva sede");

        campusTable  = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                for(int i = 0; i < campusTable.getRowCount(); i ++){
                    if(row < 0){
                        return true;
                    }
                }
                return false;
            }
        };
        campusTable.setModel(new javax.swing.table.DefaultTableModel(
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
        campusTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(campusTable);

        jLabel3.setText("Puesto");

        campusField.setBorder(null);

        jLabel4.setText("Salario base del puesto");

        DepartmentTable  = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                for(int i = 0; i < DepartmentTable.getRowCount(); i ++){
                    if(row < 0){
                        return true;
                    }
                }
                return false;
            }
        };
        DepartmentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        DepartmentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(DepartmentTable);

        jLabel5.setText("Departamento");

        departmentField.setBorder(null);

        jLabel6.setText("Ingresar nuevo departamento");

        districtCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        departmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        refreshCampusImage.setBorderSize(0);
        refreshCampusImage.setBorderSpace(0);
        refreshCampusImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/optionsPerPanel/refreshImage.png"))); // NOI18N
        refreshCampusImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshCampusImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshCampusImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshCampusImageMouseExited(evt);
            }
        });

        refreshDepartmentImage.setBorderSize(0);
        refreshDepartmentImage.setBorderSpace(0);
        refreshDepartmentImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/optionsPerPanel/refreshImage.png"))); // NOI18N
        refreshDepartmentImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshDepartmentImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshDepartmentImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshDepartmentImageMouseExited(evt);
            }
        });

        refreshPostImage.setBorderSize(0);
        refreshPostImage.setBorderSpace(0);
        refreshPostImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/optionsPerPanel/refreshImage.png"))); // NOI18N
        refreshPostImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshPostImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshPostImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshPostImageMouseExited(evt);
            }
        });

        jLabel7.setText("Nombre del puesto");

        namePostField.setBorder(null);

        provinceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provinceCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                provinceComboItemStateChanged(evt);
            }
        });

        cantonCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cantonCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cantonComboItemStateChanged(evt);
            }
        });

        jLabel8.setText("Provincia");

        jLabel9.setText("Distrito");

        jLabel10.setText("Cantón");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provinceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(districtCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campusField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(refreshCampusImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(240, 240, 240)
                        .addComponent(refreshDepartmentImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryPostField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namePostField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(refreshPostImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(provinceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(cantonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(districtCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(campusField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(refreshCampusImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshDepartmentImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(salaryPostField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(namePostField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(refreshPostImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(nextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshCampusImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCampusImageMouseClicked
            try {
                if(!campusField.getText().equals("")){
                    if(extra_methods.confirmChanges(content, false)){
                        String district = (String) districtCombo.getSelectedItem();
                        int idDistrict = get_procs.get_district_by_name(district).getId_district();
                        ins_procs.insert_campus(campusField.getText(),1, idDistrict);
                        updateTableCampus();
                    }
                }else{
                    JOptionPane.showMessageDialog(content, "Todos los datos de la sede son obligatorios", "ERROR: Faltan campos de llenar", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_refreshCampusImageMouseClicked

    private void refreshCampusImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCampusImageMouseEntered
        extra_methods.showSelectedOption(refreshCampusImage, 995, 120);
    }//GEN-LAST:event_refreshCampusImageMouseEntered

    private void refreshCampusImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshCampusImageMouseExited
        extra_methods.resetSelectedOption(refreshCampusImage, 1000, 120);
    }//GEN-LAST:event_refreshCampusImageMouseExited

    private void refreshDepartmentImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDepartmentImageMouseClicked
            try {
                if(!departmentField.getText().equals("")){
                    if(extra_methods.confirmChanges(content, false)){
                        ins_procs.insert_department(departmentField.getText());
                        updateTableDepartment();      
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(content, "Todos los datos del departamento son obligatorios", "ERROR: Faltan campos de llenar", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }//GEN-LAST:event_refreshDepartmentImageMouseClicked

    private void refreshDepartmentImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDepartmentImageMouseEntered
        extra_methods.showSelectedOption(refreshDepartmentImage, 995, 300);
    }//GEN-LAST:event_refreshDepartmentImageMouseEntered

    private void refreshDepartmentImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDepartmentImageMouseExited
        extra_methods.resetSelectedOption(refreshDepartmentImage, 1000, 300);
    }//GEN-LAST:event_refreshDepartmentImageMouseExited

    private void refreshPostImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPostImageMouseClicked
            try {
                if(!(salaryPostField.getText().equals("") || namePostField.getText().equals(""))){
                    if(extra_methods.confirmChanges(content, false)){
                        String name = (String) departmentCombo.getSelectedItem();
                        int idDepartment = get_procs.get_department_by_name(name).getId_department();
                        float baseSalary = Integer.parseInt(salaryPostField.getText());
                        ins_procs.insert_post(namePostField.getText(), idDepartment, baseSalary);
                        updateTablePost(); 
                    }
                   
                }else{
                    JOptionPane.showMessageDialog(content, "Todos los datos del puesto son obligatorios", "ERROR: Faltan campos de llenar", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_refreshPostImageMouseClicked

    private void refreshPostImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPostImageMouseEntered
        extra_methods.showSelectedOption(refreshPostImage, 995, 530);
    }//GEN-LAST:event_refreshPostImageMouseEntered

    private void refreshPostImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPostImageMouseExited
       extra_methods.resetSelectedOption(refreshPostImage, 1000, 530);
    }//GEN-LAST:event_refreshPostImageMouseExited

    private void nextImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextImageMouseClicked
            try {
                insertMoreDataPanel p = new insertMoreDataPanel();
                extra_methods.showPanel(p, content);
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_nextImageMouseClicked

    private void nextImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextImageMouseEntered
        extra_methods.showSelectedOption(nextImage, 1105, 530);
    }//GEN-LAST:event_nextImageMouseEntered

    private void nextImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextImageMouseExited
        extra_methods.showSelectedOption(nextImage, 1110, 530);
    }//GEN-LAST:event_nextImageMouseExited

    private void provinceComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_provinceComboItemStateChanged
            try {
                
                cantonCombo.removeAllItems();
                String nameProvince = (String) provinceCombo.getSelectedItem();
                allCantons = get_procs.get_cantons_by_province(get_procs.get_province_by_name(nameProvince).getId_province());
                for(canton cant : allCantons){
                    cantonCombo.addItem(cant.getName_canton());
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_provinceComboItemStateChanged

    private void cantonComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cantonComboItemStateChanged
            try {
                
                districtCombo.removeAllItems();
                String nameCanton = (String) cantonCombo.getSelectedItem();
                allDistricts = get_procs.get_districts_by_canton(get_procs.get_canton_by_name(nameCanton).getId_canton());
                for(district dist : allDistricts){
                    districtCombo.addItem(dist.getName_district());
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insertData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_cantonComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DepartmentTable;
    private javax.swing.JTextField campusField;
    private javax.swing.JTable campusTable;
    private javax.swing.JComboBox<String> cantonCombo;
    private javax.swing.JPanel content;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JTextField departmentField;
    private javax.swing.JComboBox<String> districtCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField namePostField;
    private Utilities.image_avatar nextImage;
    private javax.swing.JTable postTable;
    private javax.swing.JComboBox<String> provinceCombo;
    private Utilities.image_avatar refreshCampusImage;
    private Utilities.image_avatar refreshDepartmentImage;
    private Utilities.image_avatar refreshPostImage;
    private javax.swing.JTextField salaryPostField;
    // End of variables declaration//GEN-END:variables
}
