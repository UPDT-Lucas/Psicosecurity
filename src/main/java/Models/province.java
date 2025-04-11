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
 * Class to create Province Objects.
 * <p>
 * This Object contains the same attributes as table Province in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class province {
    int id_province;
    String name_province;
    int id_country;

    /**
     * Empty Constructor
     */
    public province() {
    }

    /**
     * Full Constructor
     * @param id_province int - province id
     * @param name_province String - province name 
     * @param id_country int - country id
     */
    public province(int id_province, String name_province, int id_country) {
        this.id_province = id_province;
        this.name_province = name_province;
        this.id_country = id_country;
    }

    /**
     * Generated Getter
     * @return province id
     */
    public int getId_province() {
        return id_province;
    }

    /**
     * Generated Getter
     * @return province name
     */
    public String getName_province() {
        return name_province;
    }

    /**
     * Generated Getter
     * @return country id
     */
    public int getId_country() {
        return id_country;
    }

    /**
     * Generated Setter
     * @param id_province int - province id 
     */
    public void setId_province(int id_province) {
        this.id_province = id_province;
    }

    /**
     * Generated Setter
     * @param name_province String - province name 
     */
    public void setName_province(String name_province) {
        this.name_province = name_province;
    }

    /**
     * Generated Setter 
     * @param id_country int - country id
     */
    public void setId_country(int id_country) {
        this.id_country = id_country;
    }
    
    
}
