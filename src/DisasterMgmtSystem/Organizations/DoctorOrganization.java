/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Organizations;

import DisasterMgmtSystem.Roles.DoctorRole;
import DisasterMgmtSystem.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class DoctorOrganization extends Organization 
{
    private  String name;
    private String address;
    public DoctorOrganization() {
        super(Organization.Type.DOCTOR.getValue());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
     public ArrayList<Roles> getSupportedRole() {
       
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    
    }
}
