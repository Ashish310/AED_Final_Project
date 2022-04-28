/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterManagementSystem.Network.Network;
import DisasterMgmtSystem.Emergencies.EmergencyDirectory;
import DisasterMgmtSystem.EmergencyLocation.EmergencyLocationDirectory;
import DisasterMgmtSystem.Organizations.Organization;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class DisasterMgmtSystem extends Organization {
    private EmergencyDirectory emergencyDirectory;
    private EmergencyLocationDirectory emergencyLocationDirectory;
    private ArrayList<Network> networkList;

    private DisasterMgmtSystem()
    {
        super(null);
        
        networkList=new ArrayList<>();
        emergencyLocationDirectory = new EmergencyLocationDirectory();
        
    }
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
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    private static DisasterMgmtSystem emergencySys;
    public static DisasterMgmtSystem getInstance()
    {
        if (emergencySys == null)
        {
            emergencySys = new DisasterMgmtSystem();
        }
        return emergencySys;
    }
}
