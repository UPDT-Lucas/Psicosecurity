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
 * Class to create Company Objects.
 * <p>
 * This Object contains the same attributes as table Company in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class company {
    int id_company;
    String name_company;

    /**
     * Empty Constructor
     */
    public company() {
    }

    /**
     * Full Constructor
     * @param id_company int - the company id
     * @param name_company String - the company name
     */
    public company(int id_company, String name_company) {
        this.id_company = id_company;
        this.name_company = name_company;
    }

    /**
     * Generated Getter
     * @return company id 
     */
    public int getId_company() {
        return id_company;
    }

    /**
     * Generated Getter
     * @return company id 
     */
    public String getName_company() {
        return name_company;
    }

    /**
     * Generated Setter
     * @param id_company int - the company id
     */
    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    /**
     * Generated Setter
     * @param name_company String - the company name
     */
    public void setName_company(String name_company) {
        this.name_company = name_company;
    }
    
    
}
