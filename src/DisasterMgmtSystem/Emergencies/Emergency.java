/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Emergencies;

import java.util.Date;

/**
 *
 * @author shriyadikshith
 */


public class Emergency {
    private static int emergencyId;
    private String emergencyStatus;
    private String location;
    private String phone;
    private int priority;
    private String name;
    private String locationOfEmergency;
    private Date reportedTime;
    private Date reolvedTime;
    
    int count;
    public enum EmergencyType{
        DISASTEREMERGENCY("Landslides");
        public String value;

        private EmergencyType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
    }
    public Emergency() {
        count++;
        emergencyId = count;
    }
    
    public Emergency(String s)
    {
        this.name = s;
    }

    public static int getEmergencyId() {
        return emergencyId;
    }

    public static void setEmergencyId(int emergencyId) {
        Emergency.emergencyId = emergencyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public String getEmergencyStatus() {
        return emergencyStatus;
    }

    public void setEmergencyStatus(String emergencyStatus) {
        this.emergencyStatus = emergencyStatus;
    }
    
    public Date getReportedTime() {
        return reportedTime;
    }

    public void setReportedTime(Date reportedTime) {
        this.reportedTime = reportedTime;
    }
}
