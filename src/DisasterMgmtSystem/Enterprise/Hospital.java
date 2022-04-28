/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Enterprise;

/**
 *
 * @author hs_sa
 */
public class Hospital extends Enterprise{
    private String hospitalName;
    private String hospitalLocation;
    private String speciality;
    private float distanceFromEmergencyLocation;
    private float timeTakenToReachTheAccidentLoc;

    public Hospital(String name, EnterpriseType type) {
        super(name, type);
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

//    public OrganizationDirectory getHospitalOrganisationDirectoryObject() {
//        return hospitalOrganisationDirectoryObject;
//    }
//
//    public void setHospitalOrganisationDirectoryObject(OrganizationDirectory hospitalOrganisationDirectoryObject) {
//        this.hospitalOrganisationDirectoryObject = hospitalOrganisationDirectoryObject;
//    }

    @Override
    public String toString() {
        return hospitalName;
    }

    public float getDistanceFromEmergencyLocation() {
        return distanceFromEmergencyLocation;
    }

    public void setDistanceFromEmergencyLocation(float distanceFromEmergencyLocation) {
        this.distanceFromEmergencyLocation = distanceFromEmergencyLocation;
    }

    public float getTimeTakenToReachTheAccidentLoc() {
        return timeTakenToReachTheAccidentLoc;
    }

    public void setTimeTakenToReachTheAccidentLoc(float timeTakenToReachTheAccidentLoc) {
        this.timeTakenToReachTheAccidentLoc = timeTakenToReachTheAccidentLoc;
    }

    
}
