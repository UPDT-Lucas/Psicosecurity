package DataBase;

import Models.campus;
import Models.canton;
import Models.civil_status;
import Models.company;
import Models.country;
import Models.department;
import Models.district;
import Models.email;
import Models.employee;
import Models.log;
import Models.observation;
import Models.phone;
import Models.phone_category;
import Models.post;
import Models.province;
import Models.salary;
import Models.status;
import Models.type_observation;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class that contains all the connections with procedures that returns all data for a specific table from mysql DB.
 */
public class get_all_procs {
    
    /**
    * Filter by its first name all the data from table Employee 
    * @param filter String - a String to filter employees
    * @return ArrayList of employees - filtered employees  
    * @throws ClassNotFoundException if the class is not found
    * @throws SQLException if there is a problem during data collection
    */
    public static ArrayList<employee> filtered_all_employees(String filter) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call filter_search_all_emp(?)}");
        sql.setString(1, filter);
        sql.execute();
        
        ResultSet rs = sql.executeQuery();
        ArrayList<employee> all_employees = new ArrayList<>();
        while(rs.next()){
           employee emp = new employee();
           emp.setId_employee(rs.getInt("id_employee"));
           emp.setFirst_name(rs.getString("first_name"));
           emp.setSecond_name(rs.getString("second_name"));
           emp.setFirst_surname(rs.getString("first_surname"));
           emp.setSecond_surname(rs.getString("second_surname"));
           emp.setEntry_date(rs.getDate("entry_date"));
           emp.setHoliday(rs.getDate("holiday"));
           emp.setId_card(rs.getInt("id_card"));
           emp.setId_district(rs.getInt("id_district"));
           emp.setId_campus(rs.getInt("id_campus"));
           emp.setId_post(rs.getInt("id_post"));
           emp.setId_status(rs.getInt("id_status"));
           emp.setAge(rs.getInt("age"));
           emp.setChildren_count(rs.getInt("children_count"));
           emp.setDay_count(rs.getInt("day_count"));
           emp.setId_civil_status(rs.getInt("id_civil_status"));
           all_employees.add(emp);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_employees;
    }

// -------------------------------------------------------------------------- Campus
    /**
     * Get all data from table Campus
     * @return ArrayList of campus - all campuses
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<campus> get_all_campuses() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_campuses()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<campus> all_campuses = new ArrayList<>();
        while(rs.next()){
           campus campus = new campus();
           campus.setId_campus(rs.getInt("id_campus"));
           campus.setName_campus(rs.getString("name_campus"));
           campus.setId_district(rs.getInt("id_district"));
           campus.setId_company(rs.getInt("id_company"));
           all_campuses.add(campus);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_campuses; 
    
    }
    
// -------------------------------------------------------------------------- Canton
    /**
     * Get all data from table Canton
     * @return ArrayList of canton - all cantons
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<canton> get_all_cantons() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_cantons()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<canton> cantons = new ArrayList<>();
        while(rs.next()){
           canton canton = new canton();
           canton.setId_canton(rs.getInt("id_canton"));
           canton.setName_canton(rs.getString("name_canton"));
           canton.setId_province(rs.getInt("id_province"));
           cantons.add(canton);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return cantons; 
    
    }

// -------------------------------------------------------------------------- Company
    /**
     * Get all data from table Company
     * @return ArrayList of company - all companies
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<company> get_all_companies() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_companies()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<company> all_companies = new ArrayList<>();
        while(rs.next()){
           company company = new company();
           company.setId_company(rs.getInt("id_company"));
           company.setName_company(rs.getString("name_company"));
           all_companies.add(company);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_companies; 
    
    }
    
// -------------------------------------------------------------------------- Country
    /**
     * Get all data from table Country
     * @return ArrayList of country - all countries
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<country> get_all_countries() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_countries()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<country> all_countries = new ArrayList<>();
        while(rs.next()){
           country country = new country();
           country.setId_country(rs.getInt("id_country"));
           country.setName_country(rs.getString("name_country"));
           all_countries.add(country);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_countries; 
    
    }
    
// -------------------------------------------------------------------------- Civil Status
    /**
     * Get all data from table Civil Status
     * @return ArrayList of civil status - all civil statuses
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<civil_status> get_all_civil_status() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_civil_status()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<civil_status> all_civil_statuses = new ArrayList<>();
        while(rs.next()){
           civil_status st = new civil_status();
           st.setId_civil_status(rs.getInt("id_civil_status"));
           st.setName_status(rs.getString("name_status"));
           all_civil_statuses.add(st);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_civil_statuses;
    }
    
// -------------------------------------------------------------------------- Department
    /**
     * Get all data from table Department
     * @return ArrayList of department - all departments
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<department> get_all_departments() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_departments()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<department> all_departments = new ArrayList<>();
        while(rs.next()){
           department department = new department();
           department.setId_department(rs.getInt("id_department"));
           department.setName_department(rs.getString("name_department"));
           all_departments.add(department);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_departments; 
    
    }
    
// -------------------------------------------------------------------------- District
    /**
     * Get all data from table District
     * @return ArrayList of district - all districts
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<district> get_all_districts() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_districts()}");

        
        ResultSet rs = sql.executeQuery();
        ArrayList<district> all_districts = new ArrayList<>();
        while(rs.next()){
           district dist = new district();
           dist.setId_district(rs.getInt("id_district"));
           dist.setName_district(rs.getString("name_district"));
           dist.setId_canton(rs.getInt("id_canton"));
           all_districts.add(dist);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_districts; 
    
    }
    
// -------------------------------------------------------------------------- Email
    /**
     * Get all data from table Email
     * @return ArrayList of email - all emails
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<email> get_all_emails() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_emails()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<email> all_emails = new ArrayList<>();
        while(rs.next()){
           email em = new email();
           em.setId_email(rs.getInt("id_email"));
           em.setAddress_email(rs.getString("address_email"));
           em.setId_employee(rs.getInt("id_employee"));
           all_emails.add(em);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_emails; 
    
    }
    
// -------------------------------------------------------------------------- Employee
    /**
     * Get all data from table Employee
     * @return ArrayList of employee - all employees
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<employee> get_all_employees() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_employees()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<employee> all_employees = new ArrayList<>();
        while(rs.next()){
           employee emp = new employee();
           emp.setId_employee(rs.getInt("id_employee"));
           emp.setFirst_name(rs.getString("first_name"));
           emp.setSecond_name(rs.getString("second_name"));
           emp.setFirst_surname(rs.getString("first_surname"));
           emp.setSecond_surname(rs.getString("second_surname"));
           emp.setEntry_date(rs.getDate("entry_date"));
           emp.setHoliday(rs.getDate("holiday"));
           emp.setId_card(rs.getInt("id_card"));
           emp.setId_district(rs.getInt("id_district"));
           emp.setId_campus(rs.getInt("id_campus"));
           emp.setId_post(rs.getInt("id_post"));
           emp.setId_status(rs.getInt("id_status"));
           emp.setAge(rs.getInt("age"));
           emp.setChildren_count(rs.getInt("children_count"));
           emp.setDay_count(rs.getInt("day_count"));
           emp.setId_civil_status(rs.getInt("id_civil_status"));
           all_employees.add(emp);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_employees; 
    
    }
    
// -------------------------------------------------------------------------- Log
    /**
     * Get all data from table Log
     * @return ArrayList of log - all logs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<log> get_all_logs() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_logs()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<log> all_logs = new ArrayList<>();
        while(rs.next()){
           log lg = new log();
           lg.setId_log(rs.getInt("id_log"));
           lg.setChange_descrp(rs.getString("change_descrp"));
           lg.setCurrent_text(rs.getString("current_text"));
           lg.setPrevious_text(rs.getString("previous_text"));
           lg.setSystem_date(rs.getDate("system_date"));
           lg.setTime_log(rs.getTimestamp("time_log"));
           all_logs.add(lg);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_logs;
    }
    
// -------------------------------------------------------------------------- Observation
    /**
     * Get all data from table Observation
     * @return ArrayList of observation - all observations
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
     public static ArrayList<observation> get_all_observations() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_observations()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<observation> all_observations = new ArrayList<>();
        while(rs.next()){
           observation obs = new observation();
           obs.setId_observation(rs.getInt("id_observation"));
           obs.setDescription_observation(rs.getString("description_observation"));
           obs.setId_type_observation(rs.getInt("id_type_observation"));
           obs.setId_employee(rs.getInt("id_employee"));
           obs.setLast_observation(rs.getString("old_observation"));
           all_observations.add(obs);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_observations; 
    }  
     
// -------------------------------------------------------------------------- TypeObservation
    /**
     * Get all data from table Type Observation
     * @return ArrayList of type observation - all type observations
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
     public static ArrayList<type_observation> get_all_type_observations() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_type_observations()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<type_observation> all_type_obs = new ArrayList<>();
        while(rs.next()){
           type_observation type_obs = new type_observation();
           type_obs.setId_type_observation(rs.getInt("id_type_observation"));
           type_obs.setName_type(rs.getString("name_type"));
           all_type_obs.add(type_obs);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_type_obs; 
    } 
     
// -------------------------------------------------------------------------- Phone
    /**
     * Get all data from table Phone
     * @return ArrayList of phone - all phones
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<phone> get_all_phones() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_phones()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<phone> all_phones = new ArrayList<>();
        while(rs.next()){
           phone ph = new phone();
           ph.setId_phone(rs.getInt("id_phone"));
           ph.setId_phone_category(rs.getInt("id_phone_category"));
           ph.setNumber_phone(rs.getInt("number_phone"));
           all_phones.add(ph);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_phones; 
    }
    
// -------------------------------------------------------------------------- Phone Category
    /**
     * Get all data from table Phone Category
     * @return ArrayList of phone category - all phone categories
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<phone_category> get_all_ph_categories() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_phone_categories()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<phone_category> all_ph_categories = new ArrayList<>();
        while(rs.next()){
           phone_category ph_cat = new phone_category();
           ph_cat.setId_category(rs.getInt("id_category"));
           ph_cat.setDescription_category(rs.getString("description_category"));
           all_ph_categories.add(ph_cat);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_ph_categories;
    }
    
// -------------------------------------------------------------------------- Post
    /**
     * Get all data from table Post
     * @return ArrayList of post - all posts
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<post> get_all_post() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_posts()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<post> all_posts = new ArrayList<>();
        while(rs.next()){
           post pt = new post();
           pt.setId_post(rs.getInt("id_post"));
           pt.setName_post(rs.getString("name_post"));
           pt.setId_department(rs.getInt("id_department"));
           pt.setBase_salary(rs.getFloat("base_salary"));
           
           all_posts.add(pt);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_posts;
    }
    
// -------------------------------------------------------------------------- Province
    /**
     * Get all data from table Province
     * @return ArrayList of province - all provinces
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<province> get_all_provinces() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_provinces()}");
        
        ResultSet rs = sql.executeQuery();
        ArrayList<province> all_provinces = new ArrayList<>();
        while(rs.next()){
           province prov = new province();
           prov.setId_province(rs.getInt("id_province"));
           prov.setName_province(rs.getString("name_province"));
           prov.setId_country(rs.getInt("id_country"));
           
           all_provinces.add(prov);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_provinces;
    }
    
// -------------------------------------------------------------------------- Status
    /**
     * Get all data from table Status
     * @return ArrayList of status - all statuses
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<status> get_all_status() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_all_status()}");
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<status> all_status = new ArrayList<>();
        while(rs.next()){
           status st = new status();
           st.setId_status(rs.getInt("id_status"));
           st.setName_status(rs.getString("name_status"));
           all_status.add(st);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_status;
    } 
     
// -------------------------------------------------------------------------- Salary
    /**
     * Get all data from table Salary
     * @return ArrayList of salary - all salaries
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<salary> get_all_salaries() throws SQLException, ClassNotFoundException{
     Connection conn = connect_db.get_connection();
     CallableStatement sql = conn.prepareCall("{call get_all_salaries()}");
     sql.execute();

     ResultSet rs = sql.executeQuery();
     ArrayList<salary> allSalaries = new ArrayList();
     while(rs.next()){
         salary sal = new salary();
         sal.setId_salary(rs.getInt("id_salary"));
         sal.setCommissions(rs.getFloat("commissions"));
         sal.setExtra_hours(rs.getFloat("extra_hours"));
         sal.setDeductions(rs.getFloat("deductions"));
         sal.setEarned_total(rs.getFloat("earned_total"));
         sal.setCcss_total(rs.getFloat("ccss_total"));
         sal.setWithholdings(rs.getFloat("withholdings"));
         sal.setAdvances(rs.getFloat("advances"));
         sal.setSalary_total(rs.getFloat("salary_total"));
         sal.setId_employee(rs.getInt("id_employee"));
         allSalaries.add(sal);
     }
     return allSalaries;
    }
    
}
