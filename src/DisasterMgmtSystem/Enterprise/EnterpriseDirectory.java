/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Enterprise;

import java.util.ArrayList;


/**
 *
 * @author hs_sa
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String address){
        
        Enterprise enterprise = null;

        if(type == Enterprise.EnterpriseType.EMEREGENCY911ENTERPRISE)
        {
            enterprise = new PoliceAdministrator(name, address);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EnterpriseType.POLICEENTERPRISE)
        {
            enterprise = new Police(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.AmbulanceAdminEnterprise)
        {
            enterprise = new AmbulanceAdminEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    }
    
     public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;

        if(type == Enterprise.EnterpriseType.EMEREGENCY911ENTERPRISE)
        {
            enterprise = new PoliceAdministrator(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type == Enterprise.EnterpriseType.POLICEENTERPRISE)
        {
            enterprise = new Police(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.AmbulanceAdminEnterprise)
        {
            enterprise = new AmbulanceAdminEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    
     }
}
