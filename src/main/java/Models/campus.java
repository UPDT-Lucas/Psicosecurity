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
 * Class to create Campus Objects.
 * <p>
 * This Object contains the same attributes as table Campus in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class campus {
    int id_campus;
    String name_campus;
    int id_company;
    int id_district;

    /**
     * Empty Constructor
     */
    public campus() {
    }
    
    /**
     * Full Constructor. Recieves all attributes needed by the Campus in my SQL. <p>
     * Excepting the audit attributes.
     * @param id_campus int - the campus id
     * @param name_campus String - the campus name
     * @param id_company int - the company id
     * @param id_district int - the district id
     */
    public campus(int id_campus, String name_campus, int id_company, int id_district) {
        this.id_campus = id_campus;
        this.name_campus = name_campus;
        this.id_company = id_company;
        this.id_district = id_district;
    }

    /**
     * Generated getter.
     * @return int - the id campus
     */
    public int getId_campus() {
        return id_campus;
    }

    /**
     * Generated getter.
     * @return String - the name campus
     */
    public String getName_campus() {
        return name_campus;
    }

    /**
     * Generated getter.
     * @return int - the id company
     */
    public int getId_company() {
        return id_company;
    }

    /**
     * Generated getter.
     * @return int - the id district
     */
    public int getId_district() {
        return id_district;
    }

    /**
     * Generated setter.
     * @param id_campus int - the id campus 
     */
    public void setId_campus(int id_campus) {
        this.id_campus = id_campus;
    }

    /**
     * Generated setter.
     * @param name_campus String - the name campus 
     */
    public void setName_campus(String name_campus) {
        this.name_campus = name_campus;
    }

    /**
     * Generated setter.
     * @param id_company int - the id company 
     */
    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

     /**
     * Generated setter.
     * @param id_district int - the id district 
     */
    public void setId_district(int id_district) {
        this.id_district = id_district;
    }
    
    
}
