/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Government;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class GovernmentDirectory {
    private ArrayList<Government> governmentList;
    
    public GovernmentDirectory(){
        governmentList = new ArrayList<Government>();
    }
    public ArrayList<Government> getGovernmentList() {
        return governmentList;
        
    }
    
    public ArrayList<Government> addGovernment(Government c){
       
        governmentList.add(c);
        return governmentList;
    }
     public ArrayList<Government> deleteGovernment(Government c){
       
        governmentList.remove(c);
        return governmentList;
    }
    
}
