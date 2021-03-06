/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.WorkList;

import EcoSystem.Pharmaceutical.Medicines;

/**
 *
 * @author ashishkumar
 */
public class PharmacyInventory {
    Medicines medicines;
    
    int quantity;

    public PharmacyInventory(Medicines item, int quantilty) {
        this.medicines = item;
        this.quantity = quantilty;
    }

    public Medicines getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicines medicines) {
        this.medicines = medicines;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantilty(int quantilty) {
        this.quantity = quantilty;
    }
    
    public String toString(){
        if(medicines != null){
            return medicines.getName();
        }
        return null;
    }
}
