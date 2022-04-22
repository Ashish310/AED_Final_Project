/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.EmergencyLocation;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class EmergencyLocationDirectory {
    private ArrayList<EmergencyLocation> emergencyLocationList;

    public EmergencyLocationDirectory() {
        emergencyLocationList = new ArrayList<>();
    }

    public ArrayList<EmergencyLocation> getEmergencyLocationList() {
        return emergencyLocationList;
    }

    public void setEmergencyLocationList(ArrayList<EmergencyLocation> emergencyLocationList) {
        this.emergencyLocationList = emergencyLocationList;
    }
    
    public EmergencyLocation addEmergencyLocation() {
        EmergencyLocation location = new EmergencyLocation();
        emergencyLocationList.add(location);
        return location;
    }
}
