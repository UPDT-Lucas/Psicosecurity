/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class to create Log Objects.
 * <p>
 * This Object contains the same attributes as table Log in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class log {
    int id_log;
    Date system_date;
    Timestamp time_log;
    String change_descrp;
    String previous_text;
    String current_text;

    /**
     * Empty Constructor
     */
    public log() {
    }

    /**
     * Full Constructor
     * @param id_log int - the log id 
     * @param system_date Date - date the log has been created
     * @param time_log Timestamp - time the log has been created
     * @param change_descrp String - the log description
     * @param previous_text String - the previous change
     * @param current_text String - the actual text
     */
    public log(int id_log, Date system_date, Timestamp time_log, String change_descrp, String previous_text, String current_text) {
        this.id_log = id_log;
        this.system_date = system_date;
        this.time_log = time_log;
        this.change_descrp = change_descrp;
        this.previous_text = previous_text;
        this.current_text = current_text;
    }

    /**
     * Generated Getter
     * @return log id 
     */
    public int getId_log() {
        return id_log;
    }

    /**
     * Generated Getter
     * @return system date  
     */    
    public Date getSystem_date() {
        return system_date;
    }

    /**
     * Generated Getter
     * @return log time
     */    
    public Timestamp getTime_log() {
        return time_log;
    }

    /**
     * Generated Getter
     * @return description change 
     */
    public String getChange_descrp() {
        return change_descrp;
    }

    /**
     * Generated Getter
     * @return previous text
     */
    public String getPrevious_text() {
        return previous_text;
    }

    /**
     * Generated Getter
     * @return current text
     */
    public String getCurrent_text() {
        return current_text;
    }

    /**
     * Generated Setter
     * @param id_log int - log id
     */
    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    /**
     * Generated Setter
     * @param system_date Date - system date
     */
    public void setSystem_date(Date system_date) {
        this.system_date = system_date;
    }

    /**
     * Generated Setter
     * @param time_log Timestamp - log time
     */
    public void setTime_log(Timestamp time_log) {
        this.time_log = time_log;
    }

    /**
     * Generated Setter
     * @param change_descrp String - description change
     */
    public void setChange_descrp(String change_descrp) {
        this.change_descrp = change_descrp;
    }

    /**
     * Generated Setter
     * @param previous_text String - previous text
     */
    public void setPrevious_text(String previous_text) {
        this.previous_text = previous_text;
    }

    /**
     * Generated Setter
     * @param current_text String - current text
     */
    public void setCurrent_text(String current_text) {
        this.current_text = current_text;
    }
    
}
