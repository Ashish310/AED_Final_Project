/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Emergencies;

import DisasterMgmtSystem.Ambulance.AmbulanceDirectory;
import DisasterMgmtSystem.Enterprise.Hospital;
import DisasterMgmtSystem.Victim.Victim;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author shriyadikshith
 */


public class Emergency {
    private static int emergencyId;
    int count;
    private String emergencyStatus;
    private int rtoNumber;
    private String locationOfEmergency;
    private String callersPhoneNumber;
    private String natureOfEmergency;
    private String emergencyContact;
    private Icon licensePlateLogo;
    private String licensePlateLogoUrl;
    private String description;
    private Victim person;
    private AmbulanceDirectory ambulanceDirectoryObject;
    private int priority;
    private Date reportedTime;
    private Date reolvedTime;
    private String name;
    private String licensePlateURL;
    private Date ambulanceAlerted;
    private long totalTimeToReachAmbulance;
    private Date hospitalAlerted;
    private Date ambulanceDispatched;
    private long totalTimeToDispatchAmbulance;
    private float timeForTheAmbulanceToReachTheAccidentalLocation;
    private Date alertOnCallDoctor;
    private Date onCallDoctorIsConnectedViaCamera;
    private long totalTimeForDoctorToGetComnnected;
    private Date policeAlerted;
    private Date alertedThePatientEmergencyContact;
    private long totatTimeTakenByPoliceToAlertEmergencyContact;
    private Hospital hp;
//    private long totalTime;

       public enum EmergencyType {
        DISASTEREMERGENCY("Accident Emergency");
        private String value;

        private EmergencyType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
       }

    public String getLicensePlateLogoUrl() {
        return licensePlateLogoUrl;
    }

    public void setLicensePlateLogoUrl(String licensePlateLogoUrl) {
        this.licensePlateLogoUrl = licensePlateLogoUrl;
    }

    public Hospital getHp() {
        return hp;
    }

    public void setHp(Hospital hp) {
        this.hp = hp;
    }
       
       
    public Emergency() {
        count++;
        emergencyId = count;
        ambulanceDirectoryObject = new AmbulanceDirectory();
        person = new Victim();

    }

    public Icon getLicensePlateLogo() {
        return licensePlateLogo;
    }

    public void setLicensePlateLogo(Icon licensePlateLogo) {
        this.licensePlateLogo = licensePlateLogo;
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
    
    
    
    public Emergency(String name) {
        this.name = name;
    }

    public int getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(int emergencyid) {
        emergencyId = emergencyid;
    }

    public String getEmergencyStatus() {
        return emergencyStatus;
    }

    public void setEmergencyStatus(String emergencyStatus) {
        this.emergencyStatus = emergencyStatus;
    }

    public int getRtoNumber() {
        return rtoNumber;
    }

    public void setRtoNumber(int rtoNumber) {
        this.rtoNumber = rtoNumber;
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
        return person;
    }

    public void setPerson(Victim person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return locationOfEmergency;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getReportedTime() {
        return reportedTime;
    }

    public void setReportedTime(Date reportedTime) {
        this.reportedTime = reportedTime;
    }

    public Date getReolvedTime() {
        return reolvedTime;
    }

    public void setReolvedTime(Date reolvedTime) {
        this.reolvedTime = reolvedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlateURL() {
        return licensePlateURL;
    }

    public void setLicensePlateURL(String licensePlateURL) {
        this.licensePlateURL = licensePlateURL;
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

    public Date getAmbulanceDispatched() {
        return ambulanceDispatched;
    }

    public void setAmbulanceDispatched(Date ambulanceDispatched) {
        this.ambulanceDispatched = ambulanceDispatched;
    }

    public long getTotalTimeToDispatchAmbulance() {
        return totalTimeToDispatchAmbulance;
    }

    public void setTotalTimeToDispatchAmbulance(long totalTimeToDispatchAmbulance) {
        this.totalTimeToDispatchAmbulance = totalTimeToDispatchAmbulance;
    }
    
    public Date getAlertOnCallDoctor() {
        return alertOnCallDoctor;
    }

    public void setAlertOnCallDoctor(Date alertOnCallDoctor) {
        this.alertOnCallDoctor = alertOnCallDoctor;
    }

    public Date getOnCallDoctorIsConnectedViaCamera() {
        return onCallDoctorIsConnectedViaCamera;
    }

    public void setOnCallDoctorIsConnectedViaCamera(Date onCallDoctorIsConnectedViaCamera) {
        this.onCallDoctorIsConnectedViaCamera = onCallDoctorIsConnectedViaCamera;
    }

    public long getTotalTimeForDoctorToGetComnnected() {
        return totalTimeForDoctorToGetComnnected;
    }

    public void setTotalTimeForDoctorToGetComnnected(long totalTimeForDoctorToGetComnnected) {
        this.totalTimeForDoctorToGetComnnected = totalTimeForDoctorToGetComnnected;
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
}
