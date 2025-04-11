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
 * Class to create Salary Objects.
 * <p>
 * This Object contains the same attributes as table Salary in my SQL. 
 * <p>
 * Excepting the audit attributes for each table. 
 * 
 */
public class salary {
    int id_salary;
    float commissions;
    float extra_hours;
    float deductions;
    float earned_total;
    float ccss_total;
    float withholdings;
    float advances;
    float salary_total;
    int id_employee;

    /**
     * Empty Constructor
     */
    public salary() {
    }

    /**
     * Full Constructor 
     * @param id_salary int - salary id
     * @param commissions float - commissions 
     * @param extra_hours float - extra hours total
     * @param deductions float - less hours total 
     * @param earned_total float - earned total = (base salary + commisions + extra hours) - deductions
     * @param ccss_total float - 10.50% of earned total
     * @param withholdings float - percentage depending on the earned total - (spouse(+2650) + per children(+1750))
     * @param advances float - advances
     * @param salary_total float - earned total - (ccss total + withholdings + advances)
     * @param id_employee int - employee id
     */
    public salary(int id_salary, float commissions, float extra_hours, float deductions, float earned_total, float ccss_total, float withholdings, float advances, float salary_total, int id_employee) {
        this.id_salary = id_salary;
        this.commissions = commissions;
        this.extra_hours = extra_hours;
        this.deductions = deductions;
        this.earned_total = earned_total;
        this.ccss_total = ccss_total;
        this.withholdings = withholdings;
        this.advances = advances;
        this.salary_total = salary_total;
        this.id_employee = id_employee;
    }
    
    /**
     * Generated Getter
     * @return salary id
     */
    public int getId_salary() {
        return id_salary;
    }
    
    /**
     * Generated Getter
     * @return commissions
     */
    public float getCommissions() {
        return commissions;
    }

    /**
     * Generated Getter
     * @return extra hours
     */
    public float getExtra_hours() {
        return extra_hours;
    }

    /**
     * Generated Getter
     * @return deductions
     */
    public float getDeductions() {
        return deductions;
    }

    /**
     * Generated Getter
     * @return earned total
     */
    public float getEarned_total() {
        return earned_total;
    }

    /**
     * Generated Getter
     * @return ccss total
     */
    public float getCcss_total() {
        return ccss_total;
    }

    /**
     * Generated Getter
     * @return withholdings
     */
    public float getWithholdings() {
        return withholdings;
    }

    /**
     * Generated Getter
     * @return advances
     */
    public float getAdvances() {
        return advances;
    }

    /**
     * Generated Getter
     * @return salary total
     */
    public float getSalary_total() {
        return salary_total;
    }

    /**
     * Generated Getter
     * @return employee id
     */
    public int getId_employee() {
        return id_employee;
    }

    /**
     * Generated Setter
     * @param id_salary int - salary id
     */
    public void setId_salary(int id_salary) {
        this.id_salary = id_salary;
    }

    /**
     * Generated Setter
     * @param commissions float - commissions
     */
    public void setCommissions(float commissions) {
        this.commissions = commissions;
    }

    /**
     * Generated Setter
     * @param extra_hours float - extra hours
     */
    public void setExtra_hours(float extra_hours) {
        this.extra_hours = extra_hours;
    }

    /**
     * Generated Setter
     * @param deductions float - less hours 
     */
    public void setDeductions(float deductions) {
        this.deductions = deductions;
    }

    /**
     * Generated Setter
     * @param earned_total float - earned totals 
     */
    public void setEarned_total(float earned_total) {
        this.earned_total = earned_total;
    }

    /**
     * Generated Setter
     * @param ccss_total float - ccss total 
     */
    public void setCcss_total(float ccss_total) {
        this.ccss_total = ccss_total;
    }

    /**
     * Generated Setter
     * @param withholdings float - withholdings 
     */
    public void setWithholdings(float withholdings) {
        this.withholdings = withholdings;
    }
    
    /**
     * Generated Setter
     * @param advances float - advances 
     */
    public void setAdvances(float advances) {
        this.advances = advances;
    }

    /**
     * Generated Setter
     * @param salary_total float - salary_total 
     */
    public void setSalary_total(float salary_total) {
        this.salary_total = salary_total;
    }

    /**
     * Generated Setter
     * @param id_employee int - employee id 
     */
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
    
    
}
