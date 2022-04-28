/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Enterprise;

import DisasterMgmtSystem.Enterprise.Enterprise.EnterpriseType;

/**
 *
 * @author hs_sa
 */
public class AmbulanceAdminEnterprise extends Enterprise {
    private String address;
 private String name;
    
   
   
    public AmbulanceAdminEnterprise(String name) {
        super(name, EnterpriseType.AmbulanceAdminEnterprise);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
