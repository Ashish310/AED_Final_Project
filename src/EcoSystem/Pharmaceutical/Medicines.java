/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Pharmaceutical;

/**
 *
 * @author hs_sa
 */
public class Medicines {
    
    private String medicineName;
    private double medicinePrice;
   
    public Medicines(String name, double price) {
        this.medicineName = name;
        this.medicinePrice = price;
        
    }
  
    public String getName() {
        return medicineName;
    }

    public void setName(String name) {
        this.medicineName = name;
    }

    public double getPrice() {
        return medicinePrice;
    }

    public void setPrice(double price) {
        this.medicinePrice = price;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }
    
}
