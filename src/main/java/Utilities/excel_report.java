/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import DataBase.get_procs;
import Models.employee;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class to create the employees report in .XMLX format Excel.
 * <p>
 * Gets the information of the selected employees.
 * <p>
 * Uses the OOXML and OOXML-full, version 5.2.3
 * 
 */
public class excel_report {
       static ArrayList<employee> allEmployees;

    /**
     * Writes the report. Receives the list of selected employees to export.
     * @param selectedEmps ArrayList of employees - all selected employees
     * @return true - when the export end
     * @throws IOException if there is a problem with the file
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static boolean escribir_reporte(ArrayList<employee> selectedEmps) throws IOException, SQLException, ClassNotFoundException{
            // Sent employees
            allEmployees = selectedEmps;
        
            //Creates the book and the sheet
            Workbook book = new XSSFWorkbook();
            Sheet sheet = book.createSheet("Reporte de empleados");
            
            //Columns header to export the data and pass it to the excel
            String[] header = new String[]{"Cédula", "Primer Nombre", "Primer Apellido",
            "Estado Civil" , "Hijos", "Sede", "Conteo de vacaciones", "Puesto", "Salario Base", "Comisiones", "Horas extras",
            "Deducciones", "Total devengado", "Porcentaje de la Caja", "Retenciones", "Adelantos", "Total"};
            
            //Creates the header cells and give them styles
            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setAlignment(HorizontalAlignment.CENTER);
            
            //Create a font and assign it to the header sytyle
            Font font = book.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 10);
            headerStyle.setFont(font);
            
            //Creates the body style 
            CellStyle bodyStyle = book.createCellStyle();
            bodyStyle.setAlignment(HorizontalAlignment.CENTER);
            
            //Creates the salary style
            CellStyle salaryStyle = book.createCellStyle();
            DataFormat format = book.createDataFormat();
            salaryStyle.setDataFormat(format.getFormat("_-[$₡-es-CR]* #,##0.00_-;-[$₡-es-CR]* #,##0.00_-;_-[$₡-es-CR]* \"-\"??_-;_-@_-"));
            salaryStyle.setAlignment(HorizontalAlignment.CENTER);
            
            //Creates the headers row, the first row 
            Row headersRow = sheet.createRow(0);
            
            //Writes the header cells
            for(int i = 0; i < header.length; i++){
                Cell headerCell = headersRow.createCell(i);
                headerCell.setCellStyle(headerStyle);
                headerCell.setCellValue(header[i]);
                
            }
            
            //Writes the body cells
            for(int i = 0; i < allEmployees.size(); i++){
                Row row = sheet.createRow(i+1);
                
                row.createCell(0).setCellValue(allEmployees.get(i).getId_card());
                row.createCell(1).setCellValue(allEmployees.get(i).getFirst_name());
                row.createCell(2).setCellValue(allEmployees.get(i).getFirst_surname());
                row.createCell(3).setCellValue(get_procs.get_civil_status(allEmployees.get(i).getId_civil_status()).getName_status());
                row.createCell(4).setCellValue(allEmployees.get(i).getChildren_count());
                row.createCell(5).setCellValue(get_procs.get_campus(allEmployees.get(i).getId_campus()).getName_campus());                
                row.createCell(6).setCellValue(allEmployees.get(i).getDay_count());
                row.createCell(7).setCellValue(get_procs.get_post(allEmployees.get(i).getId_post()).getName_post());
                row.createCell(8).setCellValue(get_procs.get_post(allEmployees.get(i).getId_post()).getBase_salary());
                row.createCell(9).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getCommissions());
                row.createCell(10).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getExtra_hours());
                row.createCell(11).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getDeductions());
                row.createCell(12).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getEarned_total());
                row.createCell(13).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getCcss_total());
                row.createCell(14).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getWithholdings());
                row.createCell(15).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getAdvances());
                row.createCell(16).setCellValue(get_procs.get_salary_by_emp(allEmployees.get(i).getId_employee()).getSalary_total());
                
                row.getCell(0).setCellStyle(bodyStyle); row.getCell(1).setCellStyle(bodyStyle); row.getCell(2).setCellStyle(bodyStyle);
                row.getCell(3).setCellStyle(bodyStyle); row.getCell(4).setCellStyle(bodyStyle);  row.getCell(5).setCellStyle(bodyStyle);
                row.getCell(6).setCellStyle(bodyStyle); row.getCell(7).setCellStyle(bodyStyle);
                
                row.getCell(8).setCellStyle(salaryStyle);row.getCell(9).setCellStyle(salaryStyle); row.getCell(10).setCellStyle(salaryStyle); 
                row.getCell(11).setCellStyle(salaryStyle); row.getCell(12).setCellStyle(salaryStyle);row.getCell(13).setCellStyle(salaryStyle);  
                row.getCell(14).setCellStyle(salaryStyle);row.getCell(15).setCellStyle(salaryStyle);row.getCell(16).setCellStyle(salaryStyle);
            }
            //Autosize the wroten collumns
            for(int i = 0; i < 17; i++){
                sheet.autoSizeColumn(i);
            }

        try {
            FileOutputStream fileout = new FileOutputStream("ReporteDeEmpleados.xlsx");
            book.write(fileout);
            fileout.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(excel_report.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return true;
    }
    
}

