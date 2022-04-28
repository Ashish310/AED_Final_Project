/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Organizations;

import DisasterMgmtSystem.Organizations.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.AMBULANCEADMIN.getValue())){
            organization = new AmbulanceMgmtOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DOCTOR.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.POLICE.getValue())){
            organization = new PoliceOrganization();
            organizationList.add(organization);
        }
        return organization;
        
    }
     public Organization createOrganization(Type type, String name, String address ){
        Organization organization = null;
        
        if (type.getValue().equals(Type.AMBULANCEADMIN.getValue())){
            organization = new AmbulanceMgmtOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DOCTOR.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
        
    }
}
