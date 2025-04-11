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
 * Class to create Email Objects.
 * <p>
 * This Object contains the same attributes as table Email in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class email {
    int id_email;
    String address_email;
    int id_employee;

    /**
     * Empty Constructor
     */
    public email() {
    }

    /**
     * Full Constructor
     * @param id_email int - email id
     * @param address_email String - email address
     * @param id_employee int - email id employee
     */
    public email(int id_email, String address_email, int id_employee) {
        this.id_email = id_email;
        this.address_email = address_email;
        this.id_employee = id_employee;
    }

    /**
     * Generated Getter
     * @return email id
     */
    public int getId_email() {
        return id_email;
    }

    /**
     * Generated Getter
     * @return email address email
     */
    public String getAddress_email() {
        return address_email;
    }

    /**
     * Generated Getter
     * @return email employee id
     */
    public int getId_employee() {
        return id_employee;
    }

    /**
     * Generated Setter
     * @param id_email int - email id
     */
    public void setId_email(int id_email) {
        this.id_email = id_email;
    }

    /**
     * Generated Setter
     * @param address_email String - email address
     */
    public void setAddress_email(String address_email) {
        this.address_email = address_email;
    }

    /**
     * Generated Setter
     * @param id_employee int - employee id 
     */
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
    
    
}
