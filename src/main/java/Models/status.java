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
 * Class to create Status Objects.
 * <p>
 * This Object contains the same attributes as table Status in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class status {
    int id_status;
    String name_status;

    /**
     * Empty Constructor
     */
    public status() {
    }

    /**
     * Full Constructor 
     * @param id_status int - status id
     * @param name_status String - status name
     */
    public status(int id_status, String name_status) {
        this.id_status = id_status;
        this.name_status = name_status;
    }

    /**
     * Generated Getter
     * @return status id
     */
    public int getId_status() {
        return id_status;
    }

    /**
     * Generated Getter
     * @return status name
     */
    public String getName_status() {
        return name_status;
    }

    /**
     * Generated Setter
     * @param id_status int - status id 
     */
    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    /**
     * Generated Setter
     * @param name_status String - status name 
     */
    public void setName_status(String name_status) {
        this.name_status = name_status;
    }
    
    
    
}
