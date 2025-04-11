/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class to create Employee Objects.
 * <p>
 * This Object contains the same attributes as table Employee in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class employee {
    int id_employee;
    String first_name;
    String second_name;
    String first_surname;
    String second_surname;
    int id_card;
    Date birth_date;
    int age;
    int children_count;
    Date entry_date;
    Date holiday;
    int day_count;
    int id_civil_status;
    int id_campus;
    int id_district;
    int id_post;
    int id_status;
    
    /**
     * Empty Constructor
     */
    public employee() {
    }

    /**
     * Full Constructor
     * @param id_employee int - the employee id
     * @param first_name String - the employee first name
     * @param second_name String - the employee second name
     * @param first_surname String - the employee first surname
     * @param second_surname String - the employee second surname
     * @param id_card int - the employee identification card
     * @param birth_date Date - the employee birth date
     * @param age int - the employee age
     * @param children_count int - the employee children count
     * @param entry_date Date - the employee company entry date
     * @param holiday Date - the employee next holiday date, +30 days since entry date and so on
     * @param day_count int - the employee holiday count day, updates once holiday change, each 30 days starting with entry date
     * @param id_civil_status int - the employee civil status
     * @param id_campus int - the employee id campus
     * @param id_district int - the employee district id 
     * @param id_post int - the employee post id
     * @param id_status int - the employee status id
     */
    public employee(int id_employee, String first_name, String second_name, String first_surname, String second_surname, int id_card, Date birth_date, int age, int children_count, Date entry_date, Date holiday, int day_count, int id_civil_status, int id_campus, int id_district, int id_post, int id_status) {
        this.id_employee = id_employee;
        this.first_name = first_name;
        this.second_name = second_name;
        this.first_surname = first_surname;
        this.second_surname = second_surname;
        this.id_card = id_card;
        this.birth_date = birth_date;
        this.age = age;
        this.children_count = children_count;
        this.entry_date = entry_date;
        this.holiday = holiday;
        this.day_count = day_count;
        this.id_civil_status = id_civil_status;
        this.id_campus = id_campus;
        this.id_district = id_district;
        this.id_post = id_post;
        this.id_status = id_status;
    }

    /**
     * Generated Getter
     * @return employee id
     */
    public int getId_employee() {
        return id_employee;
    }

    /**
     * Generated Getter
     * @return employee first name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Generated Getter
     * @return employee second name
     */
    public String getSecond_name() {
        return second_name;
    }

    /**
     * Generated Getter
     * @return employee first surname
     */
    public String getFirst_surname() {
        return first_surname;
    }

    /**
     * Generated Getter
     * @return employee second surname
     */
    public String getSecond_surname() {
        return second_surname;
    }

    /**
     * Generated Getter
     * @return employee identification card
     */
    public int getId_card() {
        return id_card;
    }

    /**
     * Generated Getter
     * @return employee entry date
     */
    public Date getEntry_date() {
        return entry_date;
    }

    /**
     * Generated Getter
     * @return employee holiday date
     */
    public Date getHoliday() {
        return holiday;
    }

    /**
     * Generated Getter
     * @return employee campus id
     */
    public int getId_campus() {
        return id_campus;
    }

    /**
     * Generated Getter
     * @return employee district id
     */
    public int getId_district() {
        return id_district;
    }

    /**
     * Generated Getter
     * @return employee post id
     */
    public int getId_post() {
        return id_post;
    }

    /**
     * Generated Getter
     * @return employee status id
     */
    public int getId_status() {
        return id_status;
    }

    /**
     * Generated Getter
     * @return employee birth date
     */
    public Date getBirth_date() {
        return birth_date;
    }

    /**
     * Generated Getter
     * @return employee age
     */
    public int getAge() {
        return age;
    }

    /**
     * Generated Getter
     * @return employee children count
     */
    public int getChildren_count() {
        return children_count;
    }

    /**
     * Generated Getter
     * @return employee holiday day count
     */
    public int getDay_count() {
        return day_count;
    }

    /**
     * Generated Getter
     * @return employee civil status
     */
    public int getId_civil_status() {
        return id_civil_status;
    }
    
    /**
     * Generated Setter
     * @param id_employee int - employee id
     */
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    /**
     * Generated Setter
     * @param first_name String - employee first name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Generated Setter
     * @param second_name String - employee second name
     */
    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
    
    /**
     * Generated Setter
     * @param first_surname String - employee first surname
     */
    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    /**
     * Generated Setter
     * @param second_surname String - employee second surname
     */
    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    /**
     * Generated Setter
     * @param id_card int - employee identification card
     */
    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    /**
     * Generated Setter
     * @param entry_date Date - employee entry date
     */
    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    /**
     * Generated Setter
     * @param holiday Date - employee holiday
     */
    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }

     /**
     * Generated Setter
     * @param id_campus int - employee id campus
     */
    public void setId_campus(int id_campus) {
        this.id_campus = id_campus;
    }

     /**
     * Generated Setter
     * @param id_district int - employee id district
     */
    public void setId_district(int id_district) {
        this.id_district = id_district;
    }

     /**
     * Generated Setter
     * @param id_post int - employee id post
     */
    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

     /**
     * Generated Setter
     * @param id_status int - employee id status
     */
    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

     /**
     * Generated Setter
     * @param birth_date Date - employee birth date
     */
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

     /**
     * Generated Setter
     * @param age int - employee age, its calculated by the birth date
     */
    public void setAge(int age) {
        this.age = age;
    }

     /**
     * Generated Setter
     * @param children_count int - employee children count
     */
    public void setChildren_count(int children_count) {
        this.children_count = children_count;
    }

     /**
     * Generated Setter
     * @param day_count int - employee day count
     */
    public void setDay_count(int day_count) {
        this.day_count = day_count;
    }

     /**
     * Generated Setter
     * @param id_civil_status int - employee id civil status
     */
    public void setId_civil_status(int id_civil_status) {
        this.id_civil_status = id_civil_status;
    }
    
    
}
