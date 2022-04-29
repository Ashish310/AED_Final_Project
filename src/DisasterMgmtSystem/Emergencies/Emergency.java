/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Emergencies;

import DisasterMgmtSystem.Ambulance.AmbulanceDirectory;
import DisasterMgmtSystem.Enterprise.Hospital;
import DisasterMgmtSystem.Victim.Victim;
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
    private long totalTimeToReachAmbulance;
    private Date hospitalAlerted;
    private String locationOfEmergency;
    private Date reportedTime;
    private Victim victim;
    private Date reolvedTime;
    private String emergencyContact;
     private String description;
     private String callersPhoneNumber;
     private String natureOfEmergency;
     private AmbulanceDirectory ambulanceDirectoryObject;
    private float timeForTheAmbulanceToReachTheAccidentalLocation;
    private Date policeAlerted;
    private Date alertedThePatientEmergencyContact;
    private long totatTimeTakenByPoliceToAlertEmergencyContact;
    private Date ambulanceAlerted;
    private Hospital hp;
    
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
    
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public float getTimeForTheAmbulanceToReachTheAccidentalLocation() {
        return timeForTheAmbulanceToReachTheAccidentalLocation;
    }

    public void setTimeForTheAmbulanceToReachTheAccidentalLocation(float timeForTheAmbulanceToReachTheAccidentalLocation) {
        this.timeForTheAmbulanceToReachTheAccidentalLocation = timeForTheAmbulanceToReachTheAccidentalLocation;
    }
    public String getLocationOfEmergency() {
        return locationOfEmergency;
    }

    public void setLocationOfEmergency(String locationOfEmergency) {
        this.locationOfEmergency = locationOfEmergency;
    }

    public String getCallersPhoneNumber() {
        return callersPhoneNumber;
    }

    public void setCallersPhoneNumber(String callersPhoneNumber) {
        this.callersPhoneNumber = callersPhoneNumber;
    }

    public String getNatureOfEmergency() {
        return natureOfEmergency;
    }

    public void setNatureOfEmergency(String natureOfEmergency) {
        this.natureOfEmergency = natureOfEmergency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AmbulanceDirectory getAmbulanceDirectoryObject() {
        return ambulanceDirectoryObject;
    }

    public void setAmbulanceDirectoryObject(AmbulanceDirectory ambulanceDirectoryObject) {
        this.ambulanceDirectoryObject = ambulanceDirectoryObject;
    }

    public Victim getPerson() {
        return victim;
    }

    public void setPerson(Victim person) {
        this.victim = person;
    }
    
    public Date getPoliceAlerted() {
        return policeAlerted;
    }

    public void setPoliceAlerted(Date policeAlerted) {
        this.policeAlerted = policeAlerted;
    }

    public Date getAlertedThePatientEmergencyContact() {
        return alertedThePatientEmergencyContact;
    }

    public void setAlertedThePatientEmergencyContact(Date alertedThePatientEmergencyContact) {
        this.alertedThePatientEmergencyContact = alertedThePatientEmergencyContact;
    }

    public long getTotatTimeTakenByPoliceToAlertEmergencyContact() {
        return totatTimeTakenByPoliceToAlertEmergencyContact;
    }

    public void setTotatTimeTakenByPoliceToAlertEmergencyContact(long totatTimeTakenByPoliceToAlertEmergencyContact) {
        this.totatTimeTakenByPoliceToAlertEmergencyContact = totatTimeTakenByPoliceToAlertEmergencyContact;
    }

    public Date getAmbulanceAlerted() {
        return ambulanceAlerted;
    }

    public void setAmbulanceAlerted(Date psapAlerted) {
        this.ambulanceAlerted = psapAlerted;
    }
    
    public Hospital getHp() {
        return hp;
    }

    public void setHp(Hospital hp) {
        this.hp = hp;
    }
    
    public long getTotalTimeToReachAmbulance() {
        return totalTimeToReachAmbulance;
    }

    public void setTotalTimeToReachAmbulance(long totalTimeToReachAmbulance) {
        this.totalTimeToReachAmbulance = totalTimeToReachAmbulance;
    }

    public Date getHospitalAlertedDate() {
        return hospitalAlerted;
    }

    public void setHospitalAlertedDate(Date hospitalAlerted) {
        this.hospitalAlerted = hospitalAlerted;
    }

}
