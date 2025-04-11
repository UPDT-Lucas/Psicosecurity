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
 * Class to create Type Obsevation Objects.
 * <p>
 * This Object contains the same attributes as table Type Observation in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class type_observation {
    int id_type_observation;
    String name_type;

    /**
     * Empty Constructor 
     */
    public type_observation() {
    }

    /**
     * Full Constructor 
     * @param id_type_observation int - type observation id
     * @param name_type String - type name
     */
    public type_observation(int id_type_observation, String name_type) {
        this.id_type_observation = id_type_observation;
        this.name_type = name_type;
    }

    /**
     * Generated Getter
     * @return type observation id
     */
    public int getId_type_observation() {
        return id_type_observation;
    }

    /**
     * Generated Getter
     * @return type observation name
     */
    public String getName_type() {
        return name_type;
    }

    /**
     * Generated Setter
     * @param id_type_observation int - type observation id
     */
    public void setId_type_observation(int id_type_observation) {
        this.id_type_observation = id_type_observation;
    }

    /**
     * Generated Setter
     * @param name_type String - type observation name 
     */
    public void setName_type(String name_type) {
        this.name_type = name_type;
    }
    
    
    
}
