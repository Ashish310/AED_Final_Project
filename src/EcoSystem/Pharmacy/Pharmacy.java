/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Pharmacy;

import EcoSystem.DeliveryMan.DeliveryMan;
import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author hs_sa
 */
public class Pharmacy extends UserAccount {
    private String orderId;
    private SystemAdminRole systemAdmin;
    private DeliveryMan deliveryMan;
    private String pharmacyName;
    private PharmacyInventory menu;
    private String address;

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
    private String contact;

    public PharmacyInventory getMenu() {
        return menu;
    }

    public void setMenu(PharmacyInventory menu) {
        this.menu = menu;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SystemAdminRole getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SystemAdminRole systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    @Override
    public String toString() {
        return pharmacyName;
    }
    
}
