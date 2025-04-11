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
 * Class to create Country Objects.
 * <p>
 * This Object contains the same attributes as table Country in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class country {
    int id_country;
    String name_country;

    /**
     * Empty Constructor
     */
    public country() {
    }

    /**
     * Full Constructor
     * @param id_country int - the country id
     * @param name_country String - the country name
     */
    public country(int id_country, String name_country) {
        this.id_country = id_country;
        this.name_country = name_country;
    }

    /**
     * Generated Getter
     * @return the country id
     */
    public int getId_country() {
        return id_country;
    }

    /**
     * Generated Getter
     * @return the country name
     */
    public String getName_country() {
        return name_country;
    }

    /**
     * Generated Setter
     * @param id_country int - country id 
     */
    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    /**
     * Generated Setter
     * @param name_country String - country name
     */
    public void setName_country(String name_country) {
        this.name_country = name_country;
    }
    
    
}
