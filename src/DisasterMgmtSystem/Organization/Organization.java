/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Organization;

import DisasterMgmtSystem.WorkTypes.WorkTypes;

/**
 *
 * @author shriyadikshith
 */
public class Organization {
    private String name;
    private String address;
    private WorkTypes worktypes;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    public enum Type{
        DOCTOR("Doctor Organization"),
        HOSPITALENTERPRISEADMIN("Hospital Enterprise Organisation"),
        AMBULANCEADMIN("Ambulance organization"),
        AMBULANCE("Ambulance"),
        POLICE("Police organization"),
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
    
}
