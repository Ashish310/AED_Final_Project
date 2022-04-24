/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Organization;

import DisasterMgmtSystem.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shriyadikshith
 */
public class OrganizationDir {
    private ArrayList<Organization> organizationList;

    public OrganizationDir() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.AMBULANCEADMIN.getValue())){
            organization = new AmbulanceOrganization();
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
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DOCTOR.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
        
    }
}
