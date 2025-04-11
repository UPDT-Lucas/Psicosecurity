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
 * Class to create Post Objects.
 * <p>
 * This Object contains the same attributes as table Post in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class post {
    int id_post;
    String name_post;
    int id_department;
    float base_salary;

    /**
     * Empty Constructor
     */
    public post() {
    }

    /**
     * Full Construcotr
     * @param id_post int - post id 
     * @param name_post String - post name
     * @param id_department int - department id
     * @param base_salary float - base salary
     */
    public post(int id_post, String name_post, int id_department, float base_salary) {
        this.id_post = id_post;
        this.name_post = name_post;
        this.id_department = id_department;
        this.base_salary = base_salary;
    }

    /**
     * Generated Setter
     * @param id_post int - post id
     */
    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    /**
     * Generated Setter
     * @param name_post String - post name
     */
    public void setName_post(String name_post) {
        this.name_post = name_post;
    }

    /**
     * Generated Setter
     * @param id_department int - department id 
     */
    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    /**
     * Generated Setter
     * @param base_salary float - base salary 
     */
    public void setBase_salary(float base_salary) {
        this.base_salary = base_salary;
    }

    /**
     * Generated getter
     * @return post id
     */
    public int getId_post() {
        return id_post;
    }

    /**
     * Generated Getter
     * @return post name
     */
    public String getName_post() {
        return name_post;
    }

    /**
     * Generated Getter
     * @return department id
     */
    public int getId_department() {
        return id_department;
    }

    /**
     * Generated Getter
     * @return base salary
     */
    public float getBase_salary() {
        return base_salary;
    }

    
    
    
}
