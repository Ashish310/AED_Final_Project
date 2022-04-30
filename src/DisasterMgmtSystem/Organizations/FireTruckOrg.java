/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DisasterMgmtSystem.Organizations.Organization;
import DisasterMgmtSystem.Roles.FireTruck;
import DisasterMgmtSystem.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author shriyadikshith
 */
public class FireTruckOrg extends Organization {
    private  String name;
    private String address;
    public FireTruckOrg() {
        super(Organization.Type.FIRE.getValue());
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
        roles.add(new FireTruck());
        return roles;
    
    }
    
}
