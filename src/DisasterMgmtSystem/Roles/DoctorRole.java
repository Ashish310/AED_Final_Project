/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Roles;

import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import DisasterMgmtSystem.DisasterMgmtSystem;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.Organizations.Organization;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class DoctorRole extends Roles{
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
            AppUserAccount appuseraccount, 
            DisasterMgmtSystem system, Organization org,Enterprise enterprise, Network network) {
      return null; //new DoctorWorkArea( userProcessContainer,  account,  system,  network,  enterprise);
    }

  
    
}
