/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class to create Department Objects.
 * <p>
 * This Object contains the same attributes as table Department in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class department {
    int id_department;
    String name_department;

    /**
     * Empty Constructor
     */
    public department() {
    }

    /**
     * Full Constructor
     * @param id_department int - the id department
     * @param name_department String - the department name
     */
    public department(int id_department, String name_department) {
        this.id_department = id_department;
        this.name_department = name_department;
    }

    /**
     * Generated Getter
     * @return the department id
     */
    public int getId_department() {
        return id_department;
    }

    /**
     * Generated Getter
     * @return the department name
     */
    public String getName_department() {
        return name_department;
    }

    /**
     * Generated Setter
     * @param id_department int - the department id 
     */
    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    /**
     * Generated Setter
     * @param name_department String - the department name 
     */
    public void setName_department(String name_department) {
        this.name_department = name_department;
    }
    
    
}
