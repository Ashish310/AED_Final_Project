/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Enterprise;

/**
 *
 * @author hs_sa
 */
public class PoliceAdministrator extends Enterprise{

 private String name;
 private String address;
    
   
   
    public PoliceAdministrator(String name) {
        super(name, EnterpriseType.EMEREGENCY911ENTERPRISE);
    }
    
    public PoliceAdministrator(String name, String address) {
        super(name, EnterpriseType.EMEREGENCY911ENTERPRISE);
        this.name = name;
        this.address = address;
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
    
}
