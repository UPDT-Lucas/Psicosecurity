/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Views.Dashboard;
import Views.Employees.insertPersonalPanel;
import Views.Employees.showEmp;
import Views.insertData;
import Views.logPanel;
import java.awt.BorderLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class that contains methods needed in some differents views.
 */
public class extra_methods {
    
    private static final Pattern ALPHA_PATTERN = Pattern.compile("^[a-zA-Z]*$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    /**
     * 
     * @param content JPanel - the content panel to display the message 
     * @param s String - the string to check if its alpha
     * @return 
     */
    public static boolean isAlpha(JPanel content, String s){
        if(ALPHA_PATTERN.matcher(s).find()){
            return true;
        }
        JOptionPane.showMessageDialog(content, "Formato incorrecto \nSe esperan caracteres del alfabeto", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public static boolean isFloat(JPanel content, String s){
        try{
            Float.parseFloat(s);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
     /**
     * 
     * @param content JPanel - the content panel to display the message 
     * @param s String - the string to check if its numeric
     * @return true if its, false if not
     */
    public static boolean isNumeric(JPanel content, String s){
        if(s.matches("[0-9]+")){
            return true;
        }
        JOptionPane.showMessageDialog(content, "Formato incorrecto \nSe esperan caracteres de tipo entero", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    /**
     * 
     * @param content JPanel - the content panel to display the message 
     * @param s String - the string to check if its a valid mail -> example@gmail.com
     * @return true if its, false if not
     */
    public static boolean isValidMail(JPanel content, String s){
        if(EMAIL_PATTERN.matcher(s).find()){
            return true;
        }
        JOptionPane.showMessageDialog(content, "Formato incorrecto \nSe espera una dirección de correo electrónico válida", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    /**
     * Increase the image size, to show is focused
     * @param thisImage image_avatar - the image to resize
     * @param x int - x coords
     * @param y int - y coords
     */
    public static void showSelectedOption(image_avatar thisImage, int x, int y){
        thisImage.setSize(60,60);
        thisImage.setLocation(x, y);
    }
    
    /**
     * Decrease the image size, to show is not focused
     * @param thisImage image_avatar - the image to resize
     * @param x int - x coords
     * @param y int - y coords
     */
    public static void resetSelectedOption(image_avatar thisImage, int x, int y){
        thisImage.setSize(50,50);
        thisImage.setLocation(x, y);
    }
    
    /**
     * Changes the panel
     * @param p JPanel - the panel to be shown
     * @param content JPanel - the content panel
     */
    public static void showPanel(JPanel p, JPanel content){
        p.setSize(1260, 700);
        p.setLocation(0,0);
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        if(p instanceof showEmp){
            Dashboard.movePosition(Dashboard.employeesImage.getX()+40, Dashboard.employeesImage.getY()+10);
        }else if(p instanceof insertPersonalPanel){
            Dashboard.movePosition(Dashboard.insertImage.getX()+40, Dashboard.insertImage.getY()+10);
        }else if(p instanceof insertData){
            Dashboard.movePosition(Dashboard.configImages.getX()+40, Dashboard.configImages.getY()+10);
        }else if(p instanceof logPanel){
            Dashboard.movePosition(Dashboard.logImage.getX()+40, Dashboard.logImage.getY()+10);
        }
    }
        
    /**
     * Advice if there is a change
     * @param content JPanel - the panel to show the message 
     * @param flag boolean - if there is a change
     */
    public static void changesAdvice(JPanel content, boolean flag){
        if(flag){
            JOptionPane.showMessageDialog(content, "Cambios realizado correctamente!", "Aviso de Cambios", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(content, "No se han realizado cambios", "Aviso de Cambios", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    /**
     * Confirm message to continue the action
     * @param content JPanel - the panel to show the message
     * @param isChanged boolean - if there is a change
     * @return 
     */
    public static boolean confirmChanges(JPanel content, boolean isChanged){
        if(!isChanged){
            int input = JOptionPane.showConfirmDialog(content, "¿Desea realizar cambios?", "Está modificando información", JOptionPane.YES_NO_OPTION);
            return input == 0;
        }
        return true;
    }
    
    /**
     * Clears a table
     * @param table JTable - table to clear
     * @param dtm DefaultTableModel
     */
    public static void clearTable(JTable table, DefaultTableModel dtm) {
        for (int i = 0; i < table.getRowCount(); i++) {
            dtm.removeRow(i);
            i -= 1;
        }
    }
   
   /**
    * Checks the format to an id card entry
    * @param content JPanel - the panel to show the message
    * @param idCard String - the string to check
    * @return 
    */
   public static boolean idCardCheck(JPanel content, String idCard){
       if(idCard.length()==9){
           try{
               int idNumber = Integer.parseInt(idCard);
           } catch(NumberFormatException excepcion){
                JOptionPane.showMessageDialog(content, "Formato incorrecto \nSe esperan caracteres de tipo entero", "Cédula inválida", JOptionPane.ERROR_MESSAGE);
                return false;
           }
           
       }else{
           JOptionPane.showMessageDialog(content, "Tamaño incorrecto \nSe esperan 9 caracteres", "Cédula inválida", JOptionPane.ERROR_MESSAGE);
           return false;
       }
       return true;
   }
}
