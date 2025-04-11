/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class that contains all the connections with procedures that update data from mysql DB.
 */
public class upd_procs {
   
// -------------------------------------------------------------------------- Campus
    /**
     * Update the name of a Campus
     * @param name_campus String - The new campus name
     * @param id_campus int - The Id of Campus that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_campus_name(String name_campus, int id_campus) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_campus_name(?,?)}");
        
        stmt.setString(1, name_campus);
        stmt.setInt(2, id_campus);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Update the district of a Campus
     * @param id_district int - The new district Id
     * @param id_campus int - The Id of Campus that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_campus_district(int id_district, int id_campus) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_campus_district(?,?)}");
        
        stmt.setInt(1, id_district);
        stmt.setInt(2, id_campus);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Update the company of a Campus
     * @param id_company int - The new company Id
     * @param id_campus int - The Id of Campus that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_campus_company(int id_company, int id_campus) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_campus_company(?,?)}");
        
        stmt.setInt(1, id_company);
        stmt.setInt(2, id_campus);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

// -------------------------------------------------------------------------- Canton
    /**
     * Update the name of a Canton
     * @param name_canton String - The new canton name
     * @param id_canton int - The Id of Canton that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_canton_name(String name_canton, int id_canton) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_canton_name(?,?)}");
        
        stmt.setString(1, name_canton);
        stmt.setInt(2, id_canton);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Update the province of a Canton
     * @param id_province int - The new province Id
     * @param id_canton int - The Id of Canton that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_canton_province(int id_province, int id_canton) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_canton_province(?,?)}");
        
        stmt.setInt(1, id_province);
        stmt.setInt(2, id_canton);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

// -------------------------------------------------------------------------- Company
    /**
     * Update the name of a Company
     * @param name_company String - The new company name
     * @param id_company int - The Id of Company that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_company_name(String name_company, int id_company) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_company_name(?,?)}");
        
        stmt.setString(1, name_company);
        stmt.setInt(2, id_company);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
// -------------------------------------------------------------------------- Country
    /**
     * Update the name of a Country
     * @param name_country String - The new country name
     * @param id_country int - The Id of Country that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_country_name(String name_country, int id_country) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_country_name(?,?)}");
        
        stmt.setString(1, name_country);
        stmt.setInt(2, id_country);
        
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

// -------------------------------------------------------------------------- Department
    /**
     * Update the name of a Department
     * @param name_department String - The new department name
     * @param id_department int - The Id of Department that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_department_name(String name_department, int id_department) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_department_name(?,?)}");
        
        stmt.setString(1, name_department);
        stmt.setInt(2, id_department);
        
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

// -------------------------------------------------------------------------- District
    /**
     * Update the name of a District
     * @param name_district String - The new district name
     * @param id_district int - The Id of District that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_district_name(String name_district, int id_district) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_district_name(?,?)}");
        
        stmt.setString(1, name_district);
        stmt.setInt(2, id_district);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the canton of a District
     * @param id_canton String - The new canton Id
     * @param id_district int - The Id of District that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_district_canton(int id_canton, int id_district) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_district_canton(?,?)}");
        
        stmt.setInt(1, id_canton);
        stmt.setInt(2, id_district);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    } 

// -------------------------------------------------------------------------- Email 
    /**
     * Update the address of an Email
     * @param address String - The new email address
     * @param id_email int - The Id of the email that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_email_address(String address, int id_email) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_email_address(?,?)}");
        
        stmt.setString(1, address);
        stmt.setInt(2, id_email);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

    /**
     * Update the employee of an Email
     * @param id_employee int - The new employee Id
     * @param id_email int - The Id of the email that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_email_employee(int id_employee, int id_email) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_email_employee(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setInt(2, id_email);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
// -------------------------------------------------------------------------- Employee
    /**
     * Update the first name of an employee
     * @param first_name String - The new employee first name
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_first_name(String first_name, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_first_name(?,?)}");
        
        stmt.setString(1, first_name);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }

    /**
     * Update the second name of an employee
     * @param second_name String - The new employee first name
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_second_name(String second_name, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_second_name(?,?)}");
        
        stmt.setString(1, second_name);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
    /**
     * Update the first surname of an employee
     * @param first_surname String - The new employee first surname
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_first_surname(String first_surname, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_first_surname(?,?)}");
        
        stmt.setString(1, first_surname);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
    /**
     * Update the second surname of an employee
     * @param second_surname String - The new employee second surname
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_second_surname(String second_surname, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_second_surname(?,?)}");
        
        stmt.setString(1, second_surname);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
    /**
     * Update the identification card of an employee
     * @param id_card int - The new employee id card
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_id_card(int id_card, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_card(?,?)}");
        
        stmt.setInt(1, id_card);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the entry date of an employee
     * @param entry_date Date - The new employee entry date
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_entry_date(Date entry_date, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_entry_date(?,?)}");
        
        stmt.setDate(1, entry_date);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
    /**
     * Update the holiday Date of an employee
     * @param holiday Date - The new employee holiday Date
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_holiday(Date holiday, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_holiday(?,?)}");
        
        stmt.setDate(1, holiday);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
    /**
     * Update the Campus of an employee
     * @param id_campus int - The new campus Id 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_campus(int id_campus, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_campus(?,?)}");
        
        stmt.setInt(1, id_campus);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the District of an employee
     * @param id_district int - The new district Id 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_district(int id_district, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_district(?,?)}");
        
        stmt.setInt(1, id_district);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the Post of an employee
     * @param id_post int - The new post Id 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_post(int id_post, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_post(?,?)}");
        
        stmt.setInt(1, id_post);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the Status of an employee
     * @param id_status int - The new status Id 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_status(int id_status, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_status(?,?)}");
        
        stmt.setInt(1, id_status);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the Civil Status of an employee
     * @param id_status int - The new civil status Id 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_civil_status(int id_status, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_id_civil_status(?,?)}");
        
        stmt.setInt(1, id_status);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the Children count of an employee
     * @param new_count int - The new children count
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_children_count(int new_count, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_children_count(?,?)}");
        
        stmt.setInt(1, new_count);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Update the free day count of an employee
     * @param new_count int - The new free day count 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection 
     */
    public static void update_employee_day_count(int new_count, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_day_count(?,?)}");
        
        stmt.setInt(1, new_count);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Update the birth day of an employee
     * @param new_date Date - The new birth date 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_birth_date(Date new_date, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_birth_date(?,?)}");
        
        stmt.setDate(1, new_date);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Update the age of an employee
     * @param new_age int - The new age 
     * @param id_employee int - The Id of the employee that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_employee_age(int new_age, int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_employee_age(?,?)}");
        
        stmt.setInt(1, new_age);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
// -------------------------------------------------------------------------- Observation
    /**
     * Update the description of an observation
     * @param descrp String - The new description
     * @param id_observation int - The Id of the observation that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_observation_descrp(String descrp, int id_observation) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_observation_description(?,?)}");
        
        stmt.setString(1, descrp);
        stmt.setInt(2, id_observation);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
   
    /**
     * Update the type of an observation
     * @param id_type int - The new type observation
     * @param id_observation int - The Id of the observation that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_observation_type(int id_type, int id_observation) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_observation_type(?,?)}");
        
        stmt.setInt(1, id_type);
        stmt.setInt(2, id_observation);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Update the employee of an observation
     * @param id_employee int - The new employee
     * @param id_observation int - The Id of the observation that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_observation_employee(int id_employee, int id_observation) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_observation_employee(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setInt(2, id_observation);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
            
// -------------------------------------------------------------------------- Type Observation
    /**
     * Update the name of a observation type
     * @param name_type String - The new type name
     * @param id_type int - The Id of the type observation that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_type_observation_name(String name_type, int id_type) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_type_observation_name(?,?)}");
        
        stmt.setString(1, name_type);
        stmt.setInt(2, id_type);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
                
    
// -------------------------------------------------------------------------- Phone 
    /**
     * Update the number of a Phone
     * @param number int - The new number
     * @param id_phone int - The Id of the phone that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_phone_number(int number, int id_phone) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_phone_number(?,?)}");
        
        stmt.setInt(1, number);
        stmt.setInt(2, id_phone);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Update the category of a Phone
     * @param id_category int - The new phone category
     * @param id_phone int - The Id of the phone that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_phone_category(int id_category, int id_phone) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_phone_category(?,?)}");
        
        stmt.setInt(1, id_category);
        stmt.setInt(2, id_phone);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Update the employee of a Phone
     * @param id_employee int - The new employee
     * @param id_phone int - The Id of the phone that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_phone_employee(int id_employee, int id_phone) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_phone_id_employee(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setInt(2, id_phone);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }      
    
// -------------------------------------------------------------------------- Phone Category
    /**
     * Update the name of a Phone Category
     * @param category_name String - The new phone category name
     * @param id_category int - The Id of the phone category that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_phcategory_name(String category_name, int id_category) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_phcategory_name(?,?)}");
        
        stmt.setString(1, category_name);
        stmt.setInt(2, id_category);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    } 

// -------------------------------------------------------------------------- Post
    /**
     * Update the name of a Post
     * @param name String - The new post name
     * @param id_post int - The Id of the post that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_post_name(String name, int id_post) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_post_name(?,?)}");
        
        stmt.setString(1, name);
        stmt.setInt(2, id_post);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }        
 
    /**
     * Update the department of a Post
     * @param id_department int - The new department id
     * @param id_post int - The Id of the post that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_post_department(int id_department, int id_post) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_post_id_department(?,?)}");
        
        stmt.setInt(1, id_department);
        stmt.setInt(2, id_post);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }             
    
// -------------------------------------------------------------------------- Province
    /**
     * Update the name of a Province
     * @param name String - The new province name
     * @param id_province int - The Id of the province that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_province_name(String name, int id_province) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_province_name(?,?)}");
        
        stmt.setString(1, name);
        stmt.setInt(2, id_province);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }      
  
    /**
     * Update the country of a Province
     * @param id_country int - The new country Id
     * @param id_province int - The Id of the province that will be modified
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_province_country(int id_country, int id_province) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call update_province_country(?,?)}");
        
        stmt.setInt(1, id_country);
        stmt.setInt(2, id_province);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
// -------------------------------------------------------------------------- Salary
    /**
     * Update the comissions of a Salary
     * @param id_employee int - The Id of the employee that will be modified
     * @param comissions float - The new commisions quantity
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_salary_commisions(int id_employee, float comissions) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall(" {call update_salary_commissions(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setFloat(2, comissions);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
        
    }

    /**
     * Update the deductions of a Salary
     * @param id_employee int - The Id of the employee that will be modified
     * @param deductions float - The new deductions quantity
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_salary_deductions(int id_employee, float deductions) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall(" {call update_salary_deductions(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setFloat(2, deductions);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
        
    }
    
    /**
     * Update the extra hours of a Salary
     * @param id_employee int - The Id of the employee that will be modified
     * @param extra_hours int - The quantity of extra hours for the employee to calculate
     * the gains total
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_salary_extra_hours(int id_employee, int extra_hours) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall(" {call update_salary_extra_hours(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setInt(2, extra_hours);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Update the advances of a Salary
     * @param id_employee int - The Id of the employee that will be modified
     * @param advances float - The employee total of advances 
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void update_salary_advances(int id_employee, float advances) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall(" {call update_salary_advances(?,?)}");
        
        stmt.setInt(1, id_employee);
        stmt.setFloat(2, advances);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    
   

}
