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
 * Class to create Phone Objects.
 * <p>
 * This Object contains the same attributes as table Phone in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class phone {
    int id_phone;
    int number_phone;
    int id_phone_category;

    /**
     * Empty Constructor
     */
    public phone() {
    }

    /**
     * Full Constructor
     * @param id_phone int - phone id
     * @param number_phone int - phone number
     * @param id_phone_category int - phone category id
     */
    public phone(int id_phone, int number_phone, int id_phone_category) {
        this.id_phone = id_phone;
        this.number_phone = number_phone;
        this.id_phone_category = id_phone_category;
    }

    /**
     * Generated Getter
     * @return phone id
     */
    public int getId_phone() {
        return id_phone;
    }

    /**
     * Generated Getter
     * @return phone number
     */
    public int getNumber_phone() {
        return number_phone;
    }

    /**
     * Generated Getter
     * @return phone category id
     */
    public int getId_phone_category() {
        return id_phone_category;
    }

    /**
     * Generated Setter
     * @param id_phone int - phone id
     */
    public void setId_phone(int id_phone) {
        this.id_phone = id_phone;
    }

    /**
     * Generated Setter
     * @param number_phone int - phone number
     */
    public void setNumber_phone(int number_phone) {
        this.number_phone = number_phone;
    }

    /**
     * Generated Setter
     * @param id_phone_category  int - phone category id
     */
    public void setId_phone_category(int id_phone_category) {
        this.id_phone_category = id_phone_category;
    }
    
    
    
}
