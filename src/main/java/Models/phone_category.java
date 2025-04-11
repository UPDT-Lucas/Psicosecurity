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
 * Class to create Phone Category Objects.
 * <p>
 * This Object contains the same attributes as table Phone Category in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class phone_category {
    int id_category;
    String description_category;

    /**
     * Empty Constructor
     */
    public phone_category() {
    }

    /**
     * Full Constructor
     * @param id_category int - category id
     * @param description_category String - category description
     */
    public phone_category(int id_category, String description_category) {
        this.id_category = id_category;
        this.description_category = description_category;
    }

    /**
     * Generated Getter
     * @return category id
     */
    public int getId_category() {
        return id_category;
    }

    /**
     * Generated Getter
     * @return category description
     */
    public String getDescription_category() {
        return description_category;
    }

    /**
     * Generated Setter
     * @param id_category int - category id 
     */
    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    /**
     * Generated Setter
     * @param description_category String - category description
     */
    public void setDescription_category(String description_category) {
        this.description_category = description_category;
    }
    
    
}
