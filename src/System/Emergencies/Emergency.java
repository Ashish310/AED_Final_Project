/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Emergencies;

/**
 *
 * @author shriyadikshith
 */


public class Emergency {
    private static int emergencyId;
    private String location;
    private String phone;
    private int priority;
    private String name;
    public enum EmergencyType{
        DISASTEREMERGENCY("Disaster Emergency");
        public String value;

        private EmergencyType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
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
}
