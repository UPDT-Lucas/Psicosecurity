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
 * Class that contains all the connections with procedures that insert data from mysql DB.
 */
public class ins_procs {
    
    /**
     * Insert a Campus into the Campus Table
     * @param name_campus String - The campus name
     * @param id_company int - The company it belongs
     * @param id_district int - The district it belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_campus(String name_campus, int id_company, int id_district) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_campus(?,?,?)}");
        
        stmt.setString(1, name_campus);
        stmt.setInt(2, id_company);
        stmt.setInt(3, id_district);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Canton into the Canton Table
     * @param name_canton String - The canton name
     * @param id_province int - The province it belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_canton(String name_canton, int id_province) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_canton(?,?)}");
        
        stmt.setString(1, name_canton);
        stmt.setInt(2, id_province);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Company into the Company Table
     * @param name_company String - The company name
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_company(String name_company) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_company(?)}");
        
        stmt.setString(1, name_company);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Insert a Country into the Country Table
     * @param name_country String - The country name
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_country(String name_country) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_country(?)}");
        
        stmt.setString(1, name_country);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Department into the Department Table
     * @param name_department String - The department name
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_department(String name_department) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_department(?)}");
        
        stmt.setString(1, name_department);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a District into the District Table
     * @param name_district String - The District name
     * @param id_canton int - The canton it belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_district(String name_district, int id_canton) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_district(?,?)}");
        
        stmt.setString(1, name_district);
        stmt.setInt(2, id_canton);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    

     /**
     * Insert a Email into the Email Table
     * @param address String - The mail address
     * @param id_employee int - The employee it belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_email(String address, int id_employee) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_email(?,?)}");
        
        stmt.setString(1, address);
        stmt.setInt(2, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
     /**
     * Insert a Employee into the Employee Table
     * @param first_name String - The employee first name
     * @param second_name String - The employee second name
     * @param first_surname String - The employee first surname
     * @param second_surname String - The employee second surname
     * @param id_card int - The employee identification card
     * @param entry_date Date - The employee entry date to the company
     * @param id_campus int - The campus it belogns
     * @param id_district int - The district it belogns
     * @param id_post int - The employee post
     * @param birth_date Date - The employee birth date
     * @param id_civil_status int - The employee civil status
     * @param id_status int - The employee status
     * @param children_count int - The employee children quantity
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_employee(String first_name, String second_name, String first_surname, String second_surname, int id_card, 
        Date entry_date, int id_campus, int id_district, int id_post, int id_status, int id_civil_status, Date birth_date, 
        int children_count) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_employee(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        
        stmt.setString(1, first_name);
        stmt.setString(2, second_name);
        stmt.setString(3, first_surname);
        stmt.setString(4, second_surname);
        stmt.setInt(5, id_card);
        stmt.setDate(6, entry_date);
        stmt.setInt(7, id_campus);
        stmt.setInt(8, id_district);
        stmt.setInt(9, id_post);
        stmt.setInt(10, id_status);
        stmt.setInt(11, id_civil_status);
        stmt.setDate(12, birth_date);
        stmt.setInt(13, children_count);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Observation into the Observation Table
     * @param description String - The observation name
     * @param id_employee int - The employee it belongs
     * @param id_type int - The observation type Id
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_observation(String description, int id_type, int id_employee) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_observation(?,?,?)}");
        
        stmt.setString(1, description);
        stmt.setInt(2, id_type);
        stmt.setInt(3, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
     /**
     * Insert a Type Observation into the Type Observation Table
     * @param name_type String - The observation type name
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_type_observation(String name_type) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_type_observation(?)}");
        
        stmt.setString(1, name_type);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
     /**
     * Insert a Phone into the Phone Table
     * @param number int - The phone number 
     * @param id_employee int - The employee it belongs
     * @param id_category int - The category the phone belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_phone(int number, int id_employee, int id_category) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_phone(?,?,?)}");
        
        stmt.setInt(1, number);
        stmt.setInt(2, id_employee);
        stmt.setInt(3, id_category);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
     /**
     * Insert a Phone Category into the Phone Category Table
     * @param category String - The category name 
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_phcategory(String category) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_phone_category(?)}");
        
        stmt.setString(1, category);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
    
     /**
     * Insert a Post into the Post Table
     * @param name String - The post name 
     * @param id_department int - The department it belongs
     * @param base_salary int - The post base salary
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_post(String name, int id_department, float base_salary) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_post(?,?,?)}");
        
        stmt.setString(1, name);
        stmt.setInt(2, id_department);
        stmt.setFloat(3, base_salary);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }            
   
     /**
     * Insert a Province into the Province Table
     * @param name String - The post name 
     * @param id_country int - The country it belongs
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_province(String name, int id_country) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_province(?,?)}");
        
        stmt.setString(1, name);
        stmt.setInt(2, id_country);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Status into the Status Table
     * @param name String - The status name 
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void insert_status(String name) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_status(?)}");
        
        stmt.setString(1, name);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
     /**
     * Insert a Email register into Log
     * This is use to save which directions are been warne to count days
     * @param email String - The email address
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */    
    public static void insert_log_email(String email) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call insert_log_email(?)}");
        
        stmt.setString(1, email);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
}
