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
 * Class to create Civil Status Objects.
 * <p>
 * This Object contains the same attributes as table Civil Status in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class civil_status {
    int id_civil_status;
    String name_status;

    /**
     * Empty Constructor
     */
    public civil_status() {
    }

    /**
     * Full Constructor
     * @param id_civil_status int - civil status id
     * @param name_status String - status name
     */
    public civil_status(int id_civil_status, String name_status) {
        this.id_civil_status = id_civil_status;
        this.name_status = name_status;
    }

    /**
     * Generated Getter
     * @return the civil status id
     */
    public int getId_civil_status() {
        return id_civil_status;
    }

    /**
     * Generated Getter
     * @return the status name
     */
    public String getName_status() {
        return name_status;
    }

    /**
     * Generated Setter
     * @param id_civil_status int - civil status id 
     */
    public void setId_civil_status(int id_civil_status) {
        this.id_civil_status = id_civil_status;
    }

    /**
     * Generated Setter
     * @param name_status
     */
    public void setName_status(String name_status) {
        this.name_status = name_status;
    }
   
    
}
