/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    public ArrayList<DeliveryMan> addDeliveryMan(DeliveryMan deliveryMan){
        
        deliveryManList.add(deliveryMan);
        return deliveryManList;
    }
    public void deleteDeliveryMan(DeliveryMan deliveryMan){
        deliveryManList.remove(deliveryMan);
    }
    
}
