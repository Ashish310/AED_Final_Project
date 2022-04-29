/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Roles;

import DisasterMgmtSystem.DisasterMgmtSystem;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.Organizations.Organization;
import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public abstract class Roles {
    public enum RoleType{
        
        DOCTOR("Doctor"),
        AMBULANCE("Ambulance"),
        EMERGENCYSYSTEMADMIN("Emergency system admin"),
        EMERGENCY911DEPARTMENTADMIN("Emergency 911 department admin"),
        DRONE("Ambulance"),
        FIRE("Fire"),
        HOSPITALENTERPRISEADMIN("Hospital Enterprise Admin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    


public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            AppUserAccount AppUserAccount, 
            DisasterMgmtSystem system, Organization org,Enterprise enterprise, Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
