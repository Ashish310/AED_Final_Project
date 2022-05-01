/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Pharmaceutical;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class PharmaceuticalDirectory {
    
    private ArrayList<Pharmaceutical> pharmaceuticalList;
     public PharmaceuticalDirectory() {
        pharmaceuticalList = new ArrayList();
    }

    public ArrayList<Pharmaceutical> getPharmaceuticalDirectory() {
        return pharmaceuticalList;
    }
    
    public void addPharmaceutical(Pharmaceutical pharma){
        pharmaceuticalList.add(pharma);
    }
    public void deletePharmaceutical(Pharmaceutical pharma){
        pharmaceuticalList.remove(pharma);
    }
    
}
