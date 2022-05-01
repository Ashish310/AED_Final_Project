/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.DeliveryMan;

import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author hs_sa
 */
public class DeliveryMan extends UserAccount{
    private String deliveryManName;

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    @Override
    public String toString() {
        return this.deliveryManName;
    }
    
}
