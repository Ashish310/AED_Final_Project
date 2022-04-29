/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import DisasterMgmtSystem.EmergencyLocation.EmergencyLocation;
import DisasterMgmtSystem.Employement.Employee;
import DisasterMgmtSystem.Roles.ApplicationAdministrator;
import DisasterMgmtSystem.Roles.DisasterReporter;
import UserInterface.AppAdminArea.AppAdminWorkArea;

/**
 *
 * @author hs_sa
 */
public class SystemConfig {
    
    public static DisasterMgmtSystem config()
    {
        
        DisasterMgmtSystem system = DisasterMgmtSystem.getInstance();
        
        Employee reporter = new Employee("Reporter");
        system.getEmployeeDirectory().createEmployee(reporter);
        AppUserAccount reporterUa = system.getUserAccountDirectory().createUserAccount("reporter", "reporter", reporter, new DisasterReporter());
        
        Employee sysadmin=new Employee();
        sysadmin.setName("System Admin");
        system.getEmployeeDirectory().createEmployee(sysadmin);
        AppUserAccount esadmin_ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysadmin, new ApplicationAdministrator());
        
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
