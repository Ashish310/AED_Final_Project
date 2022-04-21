/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Emergencies;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class EmergencyDirectory {
    private ArrayList<Emergency> emergencyList;

    public EmergencyDirectory() {
        emergencyList = new ArrayList<>();
    }

    public ArrayList<Emergency> getEmergencyList() {
        return emergencyList;
    }

    public void setEmergencyList(ArrayList<Emergency> emergencyList) {
        this.emergencyList = emergencyList;
    }
    
    public Emergency createNaturalEmergency(){
        Emergency em = new Emergency();
        emergencyList.add(em);
        return em;
    }
}
