/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> pharmacyList;
     public PharmacyDirectory() {
        pharmacyList = new ArrayList();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }
    
    public void addPharmacy(Pharmacy pharmacy){
        pharmacyList.add(pharmacy);
    }
    public void deletePharmacy(Pharmacy pharmacy){
        pharmacyList.remove(pharmacy);
    }
    
}
