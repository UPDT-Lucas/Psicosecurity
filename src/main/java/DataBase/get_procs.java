/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class get_procs {
    
    /**
     * Filter all Employees by its first name and status
     * @param filter String - a String to filter employees
     * @param id_status int - an Id from table Status
     * @return ArrayList of employees - filtered employees 
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<employee> filtered_employees(String filter, int id_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call filter_search(?,?)}");
        sql.setString(1, filter);
        sql.setInt(2, id_status);
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
     * Get a specific Campus by its Id
     * @param id_campus int - an Id from table Campus
     * @return the specific campus
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static campus get_campus(int id_campus) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_campus(?)}");
        sql.setInt(1, id_campus);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        campus campus = new campus();
        while(rs.next()){
           campus.setId_campus(rs.getInt("id_campus"));
           campus.setName_campus(rs.getString("name_campus"));
           campus.setId_district(rs.getInt("id_district"));
           campus.setId_company(rs.getInt("id_company"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return campus;
    } 
    
    /**
     * Get a specific Campus by its name
     * @param name_campus String - a Campus name from table Campus
     * @return the specific campus
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static campus get_campus_by_name(String name_campus) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_campus_by_name(?)}");
        sql.setString(1, name_campus);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        campus campus = new campus();
        while(rs.next()){
           campus.setId_campus(rs.getInt("id_campus"));
           campus.setName_campus(rs.getString("name_campus"));
           campus.setId_district(rs.getInt("id_district"));
           campus.setId_company(rs.getInt("id_company"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return campus;
    }

// -------------------------------------------------------------------------- Canton
     /**
     * Get a specific Canton by its id
     * @param id_canton int - an Id from table Canton
     * @return The specific canton
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static canton get_canton(int id_canton) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_canton(?)}");
        sql.setInt(1, id_canton);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        canton canton = new canton();
        while(rs.next()){
           canton.setId_canton(rs.getInt("id_canton"));
           canton.setName_canton(rs.getString("name_canton"));
           canton.setId_province(rs.getInt("id_province"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return canton;
    }
    
     /**
     * Get an ArrayList of Cantons by an Id Province
     * @param id_province int - an Id from table Province
     * @return An ArrayList of cantons belong to that province
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<canton> get_cantons_by_province(int id_province) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_cantons_by_province(?)}");
        sql.setInt(1, id_province);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<canton> selectedCantons = new ArrayList<>();
        while(rs.next()){
           canton canton = new canton();
           canton.setId_canton(rs.getInt("id_canton"));
           canton.setName_canton(rs.getString("name_canton"));
           canton.setId_province(rs.getInt("id_province"));
           selectedCantons.add(canton);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return selectedCantons;
    } 
    
     /**
     * Get a Canton by its name
     * @param name String - a Canton name from table Canton
     * @return The specific canton
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static canton get_canton_by_name(String name) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_canton_by_name(?)}");
        sql.setString(1, name);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        canton canton = new canton();
        while(rs.next()){
           canton.setId_canton(rs.getInt("id_canton"));
           canton.setName_canton(rs.getString("name_canton"));
           canton.setId_province(rs.getInt("id_province"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return canton;
    }   
    
    
    
    // -------------------------------------------------------------------------- Company
     /**
     * Get a Company by its Id
     * @param id_company int - an Id from table Company
     * @return The specific company
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static company get_company(int id_company) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_company(?)}");
        sql.setInt(1, id_company);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        company company = new company();
        while(rs.next()){
           company.setId_company(rs.getInt("id_company"));
           company.setName_company(rs.getString("name_company"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return company;
    } 
    
// -------------------------------------------------------------------------- Country
     /**
     * Get a Country by its Id
     * @param id_country int - an Id from table Country
     * @return The specific country
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static country get_country(int id_country) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_country(?)}");
        sql.setInt(1, id_country);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        country country = new country();
        while(rs.next()){
           country.setId_country(rs.getInt("id_country"));
           country.setName_country(rs.getString("name_country"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return country;
    }
    
// -------------------------------------------------------------------------- Civil Status
     /**
     * Get a Civil Status by its Id
     * @param id_status int - an Id from table Civil Status
     * @return The specific Civil Status
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static civil_status get_civil_status(int id_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_civil_status(?)}");
        sql.setInt(1, id_status);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        civil_status st = new civil_status();
        while(rs.next()){
           st.setId_civil_status(rs.getInt("id_civil_status"));
           st.setName_status(rs.getString("name_status"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return st;
    }        
    
     /**
     * Get a Civil Status by its name
     * @param name_status String - a Civil Status name from table Civil Status
     * @return The specific Civil Status
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static civil_status get_civil_status_by_name(String name_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_civil_status_by_name(?)}");
        sql.setString(1, name_status);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        civil_status st = new civil_status();
        while(rs.next()){
           st.setId_civil_status(rs.getInt("id_civil_status"));
           st.setName_status(rs.getString("name_status"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return st;
    }        
  
// -------------------------------------------------------------------------- Department    
     /**
     * Get a Department by its Id
     * @param id_department int - an Id from table Department
     * @return The specific Department
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static department get_department(int id_department) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_department(?)}");
        sql.setInt(1, id_department);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        department department = new department();
        while(rs.next()){
           department.setId_department(rs.getInt("id_department"));
           department.setName_department(rs.getString("name_department"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return department;
    }        
    
     /**
     * Get a Department by its name
     * @param name_department String - a Department name from table Department
     * @return The specific Department
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static department get_department_by_name(String name_department) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_department_by_name(?)}");
        sql.setString(1, name_department);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        department department = new department();
        while(rs.next()){
           department.setId_department(rs.getInt("id_department"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return department;
    }     
// -------------------------------------------------------------------------- District
     /**
     * Get a District by its Id
     * @param id_district int - an Id from table District
     * @return The specific District
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static district get_district(int id_district) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_district(?)}");
        sql.setInt(1, id_district);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        district dist = new district();
        while(rs.next()){
           dist.setId_district(rs.getInt("id_district"));
           dist.setName_district(rs.getString("name_district"));
           dist.setId_canton(rs.getInt("id_canton"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return dist;
    }     

     /**
     * Get a District by its name
     * @param name_district String - a District name from table District
     * @return The specific District
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static district get_district_by_name(String name_district) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_district_by_name(?)}");
        sql.setString(1, name_district);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        district dist = new district();
        while(rs.next()){
           dist.setId_district(rs.getInt("id_district"));
           dist.setId_canton(rs.getInt("id_canton"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return dist;
    }    

     /**
     * Get an ArrayList of Districts by an Id Canton
     * @param id_canton int - an Id from table Canton
     * @return An ArrayList of districts belong to that canton
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<district> get_districts_by_canton(int id_canton) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_districts_by_canton(?)}");
        sql.setInt(1, id_canton);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<district> selectedDistricts = new ArrayList<>();
        while(rs.next()){
           district district = new district();
           district.setId_district(rs.getInt("id_district"));
           district.setName_district(rs.getString("name_district"));
           district.setId_canton(rs.getInt("id_canton"));
           selectedDistricts.add(district);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return selectedDistricts;
    } 
    
    
// -------------------------------------------------------------------------- Email
     /**
     * Get a Email by its Id
     * @param id_email int - an Id from table Email
     * @return The specific Email
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static email get_email(int id_email) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_email(?)}");
        sql.setInt(1, id_email);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        email em = new email();
        while(rs.next()){
           em.setId_email(rs.getInt("id_email"));
           em.setAddress_email(rs.getString("address_email"));
           em.setId_employee(rs.getInt("id_employee"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return em;
    }    
    
     /** 
     * Get a Email by its Id Employee
     * @param id_employee int - an id_employee from table Email
     * @return The specific Email
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static email get_email_by_emp(int id_employee) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_email_by_employee(?)}");
        sql.setInt(1, id_employee);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        email em = new email();
        while(rs.next()){
           em.setId_email(rs.getInt("id_email"));
           em.setAddress_email(rs.getString("address_email"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return em;
    }  

// -------------------------------------------------------------------------- Employee
     /**
     * Get a Employee by its Id
     * @param id_employee int - an Id from table Employee
     * @return The specific Employee
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */    
    public static employee get_employee(int id_employee) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_employee(?)}");
        sql.setInt(1, id_employee);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        employee emp = new employee();
        while(rs.next()){
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
           emp.setBirth_date(rs.getDate("birth_date"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return emp;
    }    
    
     /**
     * Get a Employee by its id_card
     * @param id_card int - an id_card from table Employee
     * @return The specific Employee
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static employee get_employee_by_card(int id_card) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_employee_by_id_card(?)}");
        sql.setInt(1, id_card);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        employee emp = new employee();
        while(rs.next()){
           emp.setId_card(rs.getInt("id_card"));
           emp.setId_employee(rs.getInt("id_employee"));
           emp.setFirst_name(rs.getString("first_name"));
           emp.setSecond_name(rs.getString("second_name"));
           emp.setFirst_surname(rs.getString("first_surname"));
           emp.setSecond_surname(rs.getString("second_surname"));
           emp.setEntry_date(rs.getDate("entry_date"));
           emp.setHoliday(rs.getDate("holiday"));
           emp.setId_district(rs.getInt("id_district"));
           emp.setId_campus(rs.getInt("id_campus"));
           emp.setId_post(rs.getInt("id_post"));
           emp.setId_status(rs.getInt("id_status"));
           emp.setAge(rs.getInt("age"));
           emp.setChildren_count(rs.getInt("children_count"));
           emp.setDay_count(rs.getInt("day_count"));
           emp.setId_civil_status(rs.getInt("id_civil_status"));
           emp.setBirth_date(rs.getDate("birth_date"));        
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return emp;
    } 
    
     /**
     * Get an ArrayList of Employees belong to that status
     * @param id_status int - an Id from table Status
     * @return An ArrayList of Employees belong to that status
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<employee> get_employee_by_status(int id_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_employee_by_status(?)}");
        sql.setInt(1, id_status);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<employee> all_employees = new ArrayList<>();
        while(rs.next()){
           employee emp = new employee();
           emp.setId_employee(rs.getInt("id_employee"));
           emp.setId_card(rs.getInt("id_card"));
           emp.setFirst_name(rs.getString("first_name"));
           emp.setSecond_name(rs.getString("second_name"));
           emp.setFirst_surname(rs.getString("first_surname"));
           emp.setSecond_surname(rs.getString("second_surname"));
           emp.setEntry_date(rs.getDate("entry_date"));
           emp.setHoliday(rs.getDate("holiday"));
           emp.setId_district(rs.getInt("id_district"));
           emp.setId_campus(rs.getInt("id_campus"));
           emp.setId_post(rs.getInt("id_post"));
           emp.setAge(rs.getInt("age"));
           emp.setChildren_count(rs.getInt("children_count"));
           emp.setDay_count(rs.getInt("day_count"));
           emp.setId_civil_status(rs.getInt("id_civil_status"));
           emp.setBirth_date(rs.getDate("birth_date"));
           all_employees.add(emp);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_employees;
    } 
    
     /**
     * Get an ArrayList of Employees having day_count >= 12
     * @return An ArrayList of Employees having day_count >= 12
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static ArrayList<employee> get_employee_to_count_advice() throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_employee_to_count_advice}");
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<employee> all_employees = new ArrayList<>();
        while(rs.next()){
           employee emp = new employee();
           emp.setId_employee(rs.getInt("id_employee"));
           emp.setId_card(rs.getInt("id_card"));
           emp.setFirst_name(rs.getString("first_name"));
           emp.setSecond_name(rs.getString("second_name"));
           emp.setFirst_surname(rs.getString("first_surname"));
           emp.setSecond_surname(rs.getString("second_surname"));
           emp.setEntry_date(rs.getDate("entry_date"));
           emp.setHoliday(rs.getDate("holiday"));
           emp.setId_district(rs.getInt("id_district"));
           emp.setId_campus(rs.getInt("id_campus"));
           emp.setId_post(rs.getInt("id_post"));
           emp.setAge(rs.getInt("age"));
           emp.setChildren_count(rs.getInt("children_count"));
           emp.setDay_count(rs.getInt("day_count"));
           emp.setId_civil_status(rs.getInt("id_civil_status"));
           emp.setBirth_date(rs.getDate("birth_date"));
           all_employees.add(emp);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return all_employees;
    } 
    
// -------------------------------------------------------------------------- Log
     /**
     * Get a Log by its Id
     * @param id_log int - an Id from table Log
     * @return The specific Log
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static log get_log(int id_log) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_log(?)}");
        sql.setInt(1, id_log);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        log lg = new log();
        while(rs.next()){
           lg.setId_log(rs.getInt("id_log"));
           lg.setChange_descrp(rs.getString("change_descrp"));
           lg.setCurrent_text(rs.getString("current_text"));
           lg.setPrevious_text(rs.getString("previous_text"));
           lg.setSystem_date(rs.getDate("system_date"));
           lg.setTime_log(rs.getTimestamp("time_log"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return lg;
    }   
    
// -------------------------------------------------------------------------- Observation
     /**
     * Get an Observation by its id_employee and id_type_observation
     * @param id_employee int - an Id employee from table Observation
     * @param id_type int - an Id type_observation from table Observation
     * @return The specific Log
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static observation get_observation_by_employee_type(int id_employee, int id_type) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_observation_by_employee_type(?,?)}");
        
        sql.setInt(1, id_employee);
        sql.setInt(2, id_type);
        sql.execute();
        
        ResultSet rs = sql.executeQuery();
        observation obs = new observation();
        while(rs.next()){
           obs.setId_observation(rs.getInt("id_observation"));
           obs.setDescription_observation(rs.getString("description_observation"));
           obs.setId_type_observation(rs.getInt("id_type_observation"));
           obs.setId_employee(rs.getInt("id_employee"));
           obs.setLast_observation(rs.getString("old_observation"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return obs; 
    }       
    
// -------------------------------------------------------------------------- Phone
     /**
     * Get a Phone by its Id
     * @param id_phone int - an Id from table Phone
     * @return The specific Phone
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static phone get_phone(int id_phone) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_phone(?)}");
        sql.setInt(1, id_phone);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        phone ph = new phone();
        while(rs.next()){
           ph.setId_phone(rs.getInt("id_phone"));
           ph.setId_phone_category(rs.getInt("id_phone_category"));
           ph.setNumber_phone(rs.getInt("number_phone"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return ph;
    }     
    
     /**
     * Get a Phones by its id_employee
     * @param id_employee int - an id_employee from table Phone
     * @return ArrayList of phones belong to that id_employee
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static ArrayList<phone> get_phone_by_emp(int id_employee) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_phone_by_employee(?)}");
        sql.setInt(1, id_employee);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        ArrayList<phone> empPhones = new ArrayList<>();
        while(rs.next()){
           phone ph = new phone();
           ph.setId_phone(rs.getInt("id_phone"));
           ph.setId_phone_category(rs.getInt("id_phone_category"));
           ph.setNumber_phone(rs.getInt("number_phone"));
           empPhones.add(ph);
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return empPhones;
    }     

// -------------------------------------------------------------------------- Phone Category
     /**
     * Get a Phone Category by its Id
     * @param id_ph_cat int - an Id from table Phone Category
     * @return The specific Phone Category
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static phone_category get_ph_category(int id_ph_cat) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_phone_category(?)}");
        sql.setInt(1, id_ph_cat);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        phone_category ph_cat = new phone_category();
        while(rs.next()){
           ph_cat.setId_category(rs.getInt("id_category"));
           ph_cat.setDescription_category(rs.getString("description_category"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return ph_cat;
    }  
    
     /**
     * Get a Phone Category by its id_employee
     * @param id_employee int - an id_employee from table Phone Category
     * @return The specific Phone Category
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static String get_phcat_by_emp(int id_employee) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_phcat_by_employee(?)}");
        sql.setInt(1, id_employee);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        phone_category ph_cat = new phone_category();
        while(rs.next()){
           ph_cat.setDescription_category(rs.getString("description_category"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return ph_cat.getDescription_category();
    }  
    
     /**
     * Get a Phone Category by its name
     * @param name_cat String - a Phone Category name from table Phone Category
     * @return The specific Phone Category
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static phone_category get_phcat_by_name(String name_cat) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_phcat_by_name(?)}");
        sql.setString(1, name_cat);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        phone_category ph_cat = new phone_category();
        while(rs.next()){
           ph_cat.setId_category(rs.getInt("id_category"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return ph_cat;
    }  
    
// -------------------------------------------------------------------------- Post
     /**
     * Get a Post by its Id
     * @param id_post int - an Id from table Post
     * @return The specific Post
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static post get_post(int id_post) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_post(?)}");
        sql.setInt(1, id_post);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        post pt = new post();
        while(rs.next()){
           pt.setId_post(rs.getInt("id_post"));
           pt.setName_post(rs.getString("name_post"));
           pt.setId_department(rs.getInt("id_department"));
           pt.setBase_salary(rs.getFloat("base_salary"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return pt;
    }  
    
     /**
     * Get a Post by its name
     * @param name_post String - a name Post from table Post
     * @return The specific Post
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */  
    public static post get_post_by_name(String name_post) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_post_by_name(?)}");
        sql.setString(1, name_post);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        post pt = new post();
        while(rs.next()){
           pt.setId_post(rs.getInt("id_post"));
           pt.setName_post(rs.getString("name_post"));
           pt.setId_department(rs.getInt("id_department"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return pt;
    }
// -------------------------------------------------------------------------- Province
     /**
     * Get a Province by its Id
     * @param id_province int - an Id from table Province
     * @return The specific Province
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static province get_province(int id_province) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_province(?)}");
        sql.setInt(1, id_province);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        province prov = new province();
        while(rs.next()){
           prov.setId_province(rs.getInt("id_province"));
           prov.setName_province(rs.getString("name_province"));
           prov.setId_country(rs.getInt("id_country"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return prov;
    }    
    
     /**
     * Get a Province by its name
     * @param name String - a name Province from table Province
     * @return The specific Province
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */  
    public static province get_province_by_name(String name) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_province_by_name(?)}");
        sql.setString(1, name);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        province province = new province();
        while(rs.next()){
           province.setId_province(rs.getInt("id_province"));
           province.setName_province(rs.getString("name_province"));
           province.setId_country(rs.getInt("id_country"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return province;
    }
    
// -------------------------------------------------------------------------- Status
     /**
     * Get a Status by its Id
     * @param id_status int - an Id from table Status
     * @return The specific Status
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static status get_status(int id_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_status(?)}");
        sql.setInt(1, id_status);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        status st = new status();
        while(rs.next()){
           st.setName_status(rs.getString("name_status"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return st;
    }    
    
     /**
     * Get a Status by its name
     * @param name_status String - a name Status from table Status
     * @return The specific Status
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */  
    public static status get_status_by_name(String name_status) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_status_by_name(?)}");
        sql.setString(1, name_status);
        sql.execute();

        ResultSet rs = sql.executeQuery();
        status st = new status();
        while(rs.next()){
           st.setId_status(rs.getInt("id_status"));
        }
        connect_db.close_connection_gets(sql, conn, rs);
        return st;
    }     
    
// -------------------------------------------------------------------------- Salary
     /**
     * Get a Salary by its id_employee
     * @param id_employee int - an id_employee from table Salary
     * @return The specific Salary
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */   
    public static salary get_salary_by_emp(int id_employee) throws SQLException, ClassNotFoundException{
        Connection conn = connect_db.get_connection();
        CallableStatement sql = conn.prepareCall("{call get_salary_by_employee(?)}");
        sql.setInt(1, id_employee);
        sql.execute();
        
        ResultSet rs = sql.executeQuery();
        salary sal = new salary();
        while(rs.next()){
            sal.setCommissions(rs.getFloat("commissions"));
            sal.setExtra_hours(rs.getFloat("extra_hours"));
            sal.setDeductions(rs.getFloat("deductions"));
            sal.setEarned_total(rs.getFloat("earned_total"));
            sal.setCcss_total(rs.getFloat("ccss_total"));
            sal.setWithholdings(rs.getFloat("withholdings"));
            sal.setAdvances(rs.getFloat("advances"));
            sal.setSalary_total(rs.getFloat("salary_total"));
        }
        return sal;
    }
}
