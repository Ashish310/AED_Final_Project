/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Hospital;

import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author hs_sa
 */
public class HospitalAdmin extends UserAccount {
    private String hospitalName;
    private String address;
    private String orderId;
    private String contactNumber;

    public String getContact() {
        return contactNumber;
    }

    public void setContact(String contact) {
        this.contactNumber = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return hospitalName;
    }

    public void setName(String governmentName) {
        this.hospitalName = governmentName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return hospitalName;
    }
    
}
