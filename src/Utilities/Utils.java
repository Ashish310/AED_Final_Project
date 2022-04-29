/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author hs_sa
 */
public class Utils {
    public static boolean isValidDate(Date date) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat.setLenient(false);
        try {
            Date givenDate = dateFormat.parse(dateFormat.format(date));
            Date todayDate = dateFormat.parse(dateFormat.format(today));
            if (!givenDate.before(todayDate)) {
                return false;
            }
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
    // Function to Validate Email

    public static boolean isValidEmail(String emailStr) {
        String regexForEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern validEmail = Pattern.compile(regexForEmail, Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(emailStr);
        return matcher.matches();
    }
    // End of Email Validation Function
    
    public static String fetchErrorMessageForString(JTextComponent field, String fieldName) {
        String errorMessage = "";
        if(field.getText().isEmpty()) {
            errorMessage = "Please fill the " + fieldName + " field\n";
            return errorMessage;
        }
        String txt = (field.getText());
        if(!txt.matches("^[a-zA-Z,' ']+$")){
            errorMessage = fieldName + " must only contain alphabets\n ";
        }       
        return errorMessage;  
    }
    
    public static String fetchErrorMessageForAddress(JTextComponent field, String fieldName) {
        String errorMessage = "";
        if(field.getText().isEmpty()) {
            errorMessage = "Please fill the " + fieldName + " field\n";
            return errorMessage;
        }      
        return errorMessage;  
    }
    
    public static String fetchErrorMessageForDate(JTextField field, String fieldName) {
        String errorMessage = "";
        if(field.getText().isEmpty()) {
            errorMessage = "Please fill the " +fieldName+ " Field\n";
            return errorMessage;
        } 
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate.parse(field.getText(), dtf);
        }catch(Exception e) {
            errorMessage = fieldName + " is not in right format, please use MM/dd/yyyy\n";
        } 
        return errorMessage;      
    }

    public static String fetchErrorMessageForPhoneNumber(JTextComponent field, String fieldName) {
        String errorMessage = "";
        if(field.getText().isEmpty()) {
            errorMessage = "Please fill the "+fieldName+" field\n";
            return errorMessage;
        } 
        try {
            Long phoneNumber = Long.valueOf(field.getText());
            if(phoneNumber<0){
                errorMessage = "Phone number cannot be a negative value\n ";
            }
            if(field.getText().length()!=10){
                errorMessage = "Phone number should be a 10 digit value\n ";
            }
        }catch(NumberFormatException e) {
            errorMessage = "Phone number Field has invalid characters\n";
        } 
        return errorMessage;
    }
    
    public static String fetchErrorMessageForEmail(JTextComponent field, String fieldName) {
        String errorMessage = "";
        String input = field.getText();
        if(input.isEmpty()) {
            errorMessage = "Please fill the "+fieldName+" field\n";
            return errorMessage;
        } 
        if(!input.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$")) {
            errorMessage = "Please enter valid ID for " + fieldName +"\n";
            return errorMessage;
        }
        return errorMessage;

    }
    
    /* 
    A username is considered valid if all the following constraints are satisfied:

    The username consists of 6 to 15 characters inclusive. 
    The username can only contain alphanumeric characters and underscores (_). 
    Alphanumeric characters describe the character set consisting of lowercase characters [a – z], uppercase characters [A – Z], and digits [0 – 9].
    The first character of the username must be an alphabetic character, i.e., either lowercase character
    [a – z] or uppercase character [A – Z].
    */
    
    public static boolean validateUserName(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z]\\w{5,14}$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        System.out.println("value: " + matcher.matches());
        return matcher.matches();
    }
    
    /*
    A password is considered valid if all the following constraints are satisfied:

    It contains at least 8 characters and at most 20 characters.
    It contains at least one digit.
    It contains at least one upper case alphabet.
    It contains at least one lower case alphabet.
    It contains at least one special character which includes !@#$%&*()-+=^.
    It doesn’t contain any white space.
    */
    
    public static boolean validatePassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        System.out.println("value: " + matcher.matches());
        return matcher.matches();
    }
    
}
