/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterMgmtSystem.EmergencyLocation.EmergencyLocation;

/**
 *
 * @author hs_sa
 */
public class SystemConfig {
    
    public static DisasterMgmtSystem config()
    {
        DisasterMgmtSystem disasterSystem = DisasterMgmtSystem.getInstance();
        EmergencyLocation el1 = disasterSystem.getDirectory().addEmergencyLocation();
        el1.setAddress("25 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el2 = disasterSystem.getDirectory().addEmergencyLocation();
        el2.setAddress("29 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el3 = disasterSystem.getDirectory().addEmergencyLocation();
        el3.setAddress("26 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el4 = disasterSystem.getDirectory().addEmergencyLocation();
        el4.setAddress("27 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el5 = disasterSystem.getDirectory().addEmergencyLocation();
        el5.setAddress("28 S Calamut Ave, Boston, MA 020120");
        
        return disasterSystem;
        
    }

    
    

    
}
