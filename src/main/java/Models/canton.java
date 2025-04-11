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
 * Class to create Canton Objects.
 * <p>
 * This Object contains the same attributes as table Canton in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class canton {
    int id_canton;
    String name_canton;
    int id_province;

    /**
     * Empty Constructor
     */
    public canton() {
    }

    /**
     * Full Constructor
     * @param id_canton int - the canton id
     * @param name_canton String - the canton name
     * @param id_province int - the province id
     */
    public canton(int id_canton, String name_canton, int id_province) {
        this.id_canton = id_canton;
        this.name_canton = name_canton;
        this.id_province = id_province;
    }

    /**
     * Generated Getter
     * @return the canton id 
     */
    public int getId_canton() {
        return id_canton;
    }

    /**
     * Generated Getter
     * @return the canton name
     */
    public String getName_canton() {
        return name_canton;
    }

    /**
     * Generated Getter
     * @return the province id 
     */
    public int getId_province() {
        return id_province;
    }

    /**
     * Generated Setter 
     * @param id_canton int - the canton id
     */
    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }

    /**
     * Generated Setter 
     * @param name_canton String - the canton name
     */
    public void setName_canton(String name_canton) {
        this.name_canton = name_canton;
    }

    /**
     * Generated Setter 
     * @param id_province int - the province id
     */
    public void setId_province(int id_province) {
        this.id_province = id_province;
    }
    
    
}
