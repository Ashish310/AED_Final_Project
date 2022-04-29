/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Organizations;

import DisasterMgmtSystem.AppUserAccount.AppUserAccountDirectory;
import DisasterMgmtSystem.Employement.EmployeeDirectory;
import DisasterMgmtSystem.SOSWaitList.SOSWaitList;

/**
 *
 * @author hs_sa
 */
public class Organization {
    private String name;
    private String address;
    private SOSWaitList SOSWaitList;
    private EmployeeDirectory employeeDirectory;
    private AppUserAccountDirectory userAccountDirectory;
    
    public enum Type{
        DOCTOR("Doctor Organization"),
        HOSPITALENTERPRISEADMIN("Hospital Enterprise Organisation"),
        AMBULANCEADMIN("Ambulance organization"),
        AMBULANCE("Ambulance"),
        POLICE("Police organization"),
        FIRE("Fire organization"),
        EMERGENCY911DEPARTMENT("Emergency 911 department organization"), 
        EMERGENCYSYSTEMADMIN("Emergency system admin organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.name = name;
        SOSWaitList = new SOSWaitList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AppUserAccountDirectory();
       
    }
    public Organization(String name, String address) {
        this.name = name;
        this.address= address;
        SOSWaitList = new SOSWaitList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AppUserAccountDirectory();
       
    }
    
    public AppUserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public SOSWaitList getWorkQueue() {
        return SOSWaitList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(SOSWaitList workQueue) {
        this.SOSWaitList = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    

    
    

    
}
