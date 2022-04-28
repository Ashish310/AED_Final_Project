/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.SOSWaitList;

import DisasterMgmtSystem.Emergencies.Emergency;
import DisasterMgmtSystem.Employement.Employee;
import javax.swing.Icon;

/**
 *
 * @author hs_sa
 */
public class PoliceWaitList extends SOSWorkRequest {

    private int reporterPhone;
    private String accidentPersonLicense;
    private Icon licenseImage;
    private Employee employee;
    private Emergency emergency;

    public int getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(int reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public String getAccidentPersonLicense() {
        return accidentPersonLicense;
    }

    public void setAccidentPersonLicense(String accidentPersonLicense) {
        this.accidentPersonLicense = accidentPersonLicense;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Emergency getEmergency() {
        return emergency;
    }

    public void setEmergency(Emergency emergency) {
        this.emergency = emergency;
    }

    public Icon getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(Icon licenseImage) {
        this.licenseImage = licenseImage;
    } 
    
}
