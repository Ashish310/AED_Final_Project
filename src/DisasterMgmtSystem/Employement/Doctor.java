/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Employement;

/**
 *
 * @author hs_sa
 */
public class Doctor extends Employee {
    private boolean doctorsAvailablityStatus;
    private String doctorsSpeciality;

    public boolean isDoctorsAvailablityStatus() {
        return doctorsAvailablityStatus;
    }

    public void setDoctorsAvailablityStatus(boolean doctorsAvailablityStatus) {
        this.doctorsAvailablityStatus = doctorsAvailablityStatus;
    }

    public String getDoctorsSpeciality() {
        return doctorsSpeciality;
    }

    public void setDoctorsSpeciality(String doctorsSpeciality) {
        this.doctorsSpeciality = doctorsSpeciality;
    }
    
}
