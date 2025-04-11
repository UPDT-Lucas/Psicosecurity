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
 * Class to create Observation Objects.
 * <p>
 * This Object contains the same attributes as table Observation in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class observation {
    int id_observation;
    String description_observation;
    String last_observation;
    int id_type_observation;
    int id_employee;

    /**
     * Empty Constructor
     */
    public observation() {
    }

    /**
     * Full Constructor
     * @param id_observation int - observation id
     * @param description_observation String - observation description
     * @param last_observation String - the last observation
     * @param id_type_observation int - the observation type id
     * @param id_employee int - the employee id
     */
    public observation(int id_observation, String description_observation, String last_observation, int id_type_observation, int id_employee) {
        this.id_observation = id_observation;
        this.description_observation = description_observation;
        this.last_observation = last_observation;
        this.id_type_observation = id_type_observation;
        this.id_employee = id_employee;
    }

    /**
     * Generated Getter
     * @return last observation
     */
    public String getLast_observation() {
        return last_observation;
    }

    /**
     * Generated Getter
     * @return observation id
     */
    public int getId_observation() {
        return id_observation;
    }

    /**
     * Generated Getter
     * @return observation description
     */
    public String getDescription_observation() {
        return description_observation;
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
     * @return employee id
     */
    public int getId_employee() {
        return id_employee;
    }
    
    /**
     * Generated Setter
     * @param last_observation String - last observation 
     */
    public void setLast_observation(String last_observation) {
        this.last_observation = last_observation;
    }
    
    /**
     * Generated Setter
     * @param id_observation int - observation id 
     */
    public void setId_observation(int id_observation) {
        this.id_observation = id_observation;
    }

    /**
     * Generated Setter
     * @param description_observation String - observation description
     */
    public void setDescription_observation(String description_observation) {
        this.description_observation = description_observation;
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
     * @param id_employee int - employee id 
     */
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
    
    
}
