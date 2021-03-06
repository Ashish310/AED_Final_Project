/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Pharmaceutical;

import EcoSystem.Porter.Porter;
import EcoSystem.Role.SysAdminRole;
import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author hs_sa
 */
public class Pharmaceutical extends UserAccount {
    private String orderId;
    private SysAdminRole systemAdmin;
    private Porter deliveryMan;
    private String pharmaceuticalName;
    private Inventory inventory;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    private String address;
    private String contact;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String restaurantName) {
        this.pharmaceuticalName = restaurantName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SysAdminRole getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SysAdminRole systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public Porter getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(Porter deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    @Override
    public String toString() {
        return pharmaceuticalName;
    }
    
    
}
