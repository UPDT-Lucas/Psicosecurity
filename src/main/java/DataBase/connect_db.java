/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class that contains the methods and attributes needed to make relation with the mysql DB
 * 
 */
public class connect_db {
   
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String host = "jdbc:mysql://localhost:3306/controlempleados";
    private static final String Uname = "root";
    private static final String Upass = "Lalexanderoc03";
    
    /**
     * Get the mysql connection, with the host, name and password of the DB 
     * @return The connection if has been made, else returns null
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static Connection get_connection() throws SQLException, ClassNotFoundException{
        try{
            java.sql.Connection con = DriverManager.getConnection(host, Uname, Upass);
            return con;
        }catch(SQLException e){
            System.out.println("The exception raised is:" + e);
            return null;
        }
    }
     
   /**
    * Checks if the statement or connection is null, if not closes them
    * @param stmt a CallableStatemet to close
    * @param con a Connection to close
    * @throws SQLException if there is a problem during data collection
    */
    public static void close_connection(CallableStatement stmt, Connection con) throws SQLException{
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
    
    /**
     * Checks if the statement, connection or  result set is null, if not closes them
     * @param stmt a CallableStatement to close
     * @param con a Connection to close
     * @param rs ResultSet
     * @throws SQLException if there is a problem during data collection
     */
    public static void close_connection_gets(CallableStatement stmt, Connection con, ResultSet rs) throws SQLException{
        if(rs != null){
            rs.close();
        }
        if(stmt != null) {
            stmt.close();
        }
        if(con != null) {
              con.close();
        }
    }
}
