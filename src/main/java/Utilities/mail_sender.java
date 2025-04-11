/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import DataBase.get_procs;
import DataBase.ins_procs;
import Models.employee;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.mail.Session;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author Lucas A. Oviedo Castro 
 * <p>
 * Last Modify Date: 06/02/2023.
 * By: Lucas A. Oviedo Castro 
 * <p>
 * Class to send the emails when employees have >= 12 count days
 * <p>
 * Uses the javax.mail version 1.6.2 and the javax.activation version 1.1.1
 * 
 */
public class mail_sender {

    private static final String emailFrom = "p.sscrsa.avisos@gmail.com";
    private static final String passwordFrom = "zgvulerwamvzwwqv";
    private static String subject = "";
    private static String content = "";

    private static Properties mProperties;
    private static Session mSession;
    private static MimeMessage mText;

    private static ArrayList<employee> employeeToAdvice;

    /**
     * Creates the email. Gets the employees with 12>= on count days.
     * <p>
     * Giving it properties, text and all needed.
     * @throws AddressException if there is a problem with the addreses
     * @throws MessagingException if occurs an error with the transport
     * @throws ClassNotFoundException if the class is not found
     * @throws SQLException if there is a problem during data collection
     */
    public static void createEmail(ArrayList<employee> selectedEmployees) throws AddressException, MessagingException, SQLException, ClassNotFoundException {

        //Get the list of employees with >= 12 day count
        employeeToAdvice = selectedEmployees;

        //Create an to address and content array with the quantity of employees to advice
        InternetAddress[] addressTo = new InternetAddress[employeeToAdvice.size()];
        subject = "Recordatorio sobre Acumulación de Vacaciones";
        String[] content = new String[employeeToAdvice.size()];

        //Set the mail properties
        mProperties = new Properties();
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        //For each employee set the message
        for (int i = 0; i < employeeToAdvice.size(); i++) {
            mSession = Session.getDefaultInstance(mProperties);
            mText = new MimeMessage(mSession);
            mText.setFrom(new InternetAddress(emailFrom));

            addressTo[i] = new InternetAddress(get_procs.get_email_by_emp(employeeToAdvice.get(i).getId_employee()).getAddress_email());

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            
            //Type the message with html
            content[i] = """
                        <!DOCTYPE html>
                        <html lang="es">
                            <head>
                            </head>
                            <body style=
                                "
                                 ">
                                    <div style =
                                        "
                                        background-color : transparent;
                                        background-image: linear-gradient(90deg, #ffc3ff 0%, #9be1f7 100%);
                                        ">
                                        <h1 style = "color: black; padding-left: 2vw; padding-top: 3vh; padding-bottom: 3vh; ">
                                        PSICOSECURITY
                                        </h1>
                                        </div>                <div style = "background-color: white;">                <p style = "color: black; padding-left: 2vw; padding-right: 2vw; padding-bottom: 3vh;">
                        """
                    + String.valueOf(dtf.format(now)) + "<br> <br>"
                    + "                    Recordatorio sobre vacaciones: <br>\n"
                    + employeeToAdvice.get(i).getFirst_name() + " " + employeeToAdvice.get(i).getFirst_surname() + " "
                    + employeeToAdvice.get(i).getSecond_surname() + " con cédula " + (employeeToAdvice.get(i).getId_card() + "") + "." + "<br>"
                    + "Se le recuerda que actualmente tiene " + (employeeToAdvice.get(i).getDay_count() + "") + " días de vacaciones acumulados. <br> <br> <br>"
                    + "- Avisos Psicosecurity <br> - <b> Mensaje programado </b> <br>"
                    + "                </p>\n"
                    + "                </div>"
                    + "    </body>\n"
                    + "</html>";

            /*
           + employeeToAdvice.get(i).getFirst_name() + " " + employeeToAdvice.get(i).getFirst_surname()+ " " +
                        employeeToAdvice.get(i).getSecond_surname() + " con cédula "  + (employeeToAdvice.get(i).getId_card() + "<br>") +
                        "Se le recuerda que actualmente tiene " + (employeeToAdvice.get(i).getDay_count() + "") + " días acumulados." +
             */
            mText.setRecipient(Message.RecipientType.TO, addressTo[i]);
            mText.setSubject(subject);
            mText.setText(String.valueOf(content[i]), "ISO-8859-1", "html");
            sendEmail(mSession.getTransport(), mText);
            ins_procs.insert_log_email(addressTo[i].getAddress());
        }
    }

    /**
     * Send the email with al the properties received by createEmail
     * @param mTransport Transport 
     * @param text MimeMessage
     * @throws MessagingException if occurs an error with the transport
     */
    public static void sendEmail(Transport mTransport, MimeMessage text) throws MessagingException {
        try {
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mText, mText.getRecipients(Message.RecipientType.TO));
            mTransport.close();

        } catch (MessagingException ex) {
            Logger.getLogger(mail_sender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
