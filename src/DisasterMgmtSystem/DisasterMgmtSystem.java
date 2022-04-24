/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterMgmtSystem.Emergencies.EmergencyDirectory;
import DisasterMgmtSystem.EmergencyLocation.EmergencyLocationDirectory;
import DisasterMgmtSystem.Organization.Organization;

/**
 *
 * @author hs_sa
 */
public class DisasterMgmtSystem extends Organization{
    private EmergencyDirectory emergencyDirectory;
    private EmergencyLocationDirectory emergencyLocationDirectory;

    public EmergencyDirectory getEmergencyDirectory() {
        return emergencyDirectory;
    }

    public void setEmergencyDirectory(EmergencyDirectory emergencyDirectory) {
        this.emergencyDirectory = emergencyDirectory;
    }

    public EmergencyLocationDirectory getEmergencyLocationDirectory() {
        return emergencyLocationDirectory;
    }

    public void setEmergencyLocationDirectory(EmergencyLocationDirectory emergencyLocationDirectory) {
        this.emergencyLocationDirectory = emergencyLocationDirectory;
    }
    
}
