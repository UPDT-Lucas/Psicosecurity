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
 * Class to create District Objects.
 * <p>
 * This Object contains the same attributes as table District in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class district {
    int id_district;
    String name_district;
    int id_canton;

    /**
     * Empty Constructor
     */
    public district() {
    }

    /**
     * Full Constructor
     * @param id_district int - the district id
     * @param name_district String - the district name
     * @param id_canton int - the canton id
     */
    public district(int id_district, String name_district, int id_canton) {
        this.id_district = id_district;
        this.name_district = name_district;
        this.id_canton = id_canton;
    }

    /**
     * Generated Getter
     * @return district id
     */
    public int getId_district() {
        return id_district;
    }

    /**
     * Generated Getter
     * @return district name
     */
    public String getName_district() {
        return name_district;
    }

    /**
     * Generated Getter
     * @return canton id
     */
    public int getId_canton() {
        return id_canton;
    }

    /**
     * Generated Setter
     * @param id_district int - the district id 
     */
    public void setId_district(int id_district) {
        this.id_district = id_district;
    }

    /**
     * Generated Setter
     * @param name_district String - the district name
     */
    public void setName_district(String name_district) {
        this.name_district = name_district;
    }

    /**
     * Generated Setter
     * @param id_canton int - the canton id
     */
    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }
    
    
    
}
