/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class that contains all the connections with procedures that deletes data from mysql DB.
 */
public class del_procs {
    
    /**
     * Delete a campus by its id
     * @param id_campus int - an Id from table Campus
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_campus(int id_campus) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_campus(?)}");
        
        stmt.setInt(1, id_campus);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Delete a canton by its id
     * @param id_canton int - an Id from table Canton
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */    
    public static void delete_canton(int id_canton) throws SQLException, ClassNotFoundException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_canton(?)}");
        
        stmt.setInt(1, id_canton);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Delete a company by its id
     * @param id_company int - an Id from table Company
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_company(int id_company) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_company(?)}");
        
        stmt.setInt(1, id_company);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Delete a country by its id
     * @param id_country int - an Id from table Country
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_country(int id_country) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_country(?)}");
       
        stmt.setInt(1, id_country);
        
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Delete a department by its id
     * @param id_department int - an Id from table Department
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_department(int id_department) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_department(?)}");
        
        stmt.setInt(1, id_department);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
     
    /**
     * Delete a district by its id
     * @param id_district int - an Id from table District
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_district(int id_district) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_district(?)}");
        
        stmt.setInt(1, id_district);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Delete an email by its id
     * @param id_email int - an Id from table Email
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_email(int id_email) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_email(?)}");
        
        stmt.setInt(1, id_email);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Delete an employee by its id
     * @param id_employee int - an Id from table Employee
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_employee(int id_employee) throws ClassNotFoundException, SQLException{
        
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_employee(?)}");
        
        stmt.setInt(1, id_employee);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }   
    
    /**
     * Delete an observation by its id
     * @param id_observation int - an Id from table Observation
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_observation(int id_observation) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_observation(?)}");
        
        stmt.setInt(1, id_observation);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    } 
    
    /**
     * Delete a type observation by its id
     * @param id_type int - an Id from table Type_Observation
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_type_observation(int id_type) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_type_observation(?)}");
        
        stmt.setInt(1, id_type);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }    
   
    /**
     * Delete a phone by its id
     * @param id_phone int - an Id from table Phone
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_phone(int id_phone) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_phone(?)}");
        
        stmt.setInt(1, id_phone);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }
    
    /**
     * Delete a phone category by its id
     * @param id_category int - an Id from table Phone_Category
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_phcategory(int id_category) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_phone_category(?)}");
        
        stmt.setInt(1, id_category);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    } 
    
    /**
     * Delete a post by its id
     * @param id_post int - an Id from table Post
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_post(int id_post) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_post(?)}");
        
        stmt.setInt(1, id_post);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }  
    
    /**
     * Delete a province by its id
     * @param id_province int - an Id from table Province
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void delete_province(int id_province) throws ClassNotFoundException, SQLException{
        Connection con = connect_db.get_connection();
        CallableStatement stmt = con.prepareCall("{ call delete_province(?)}");
        
        stmt.setInt(1, id_province);
        stmt.execute();
        
        connect_db.close_connection(stmt, con);
    }      

}
