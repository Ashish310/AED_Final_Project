/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Emergencies;

import java.util.ArrayList;

/**
 *
 * @author shriyadikshith
 */
public class DisasterEmergency extends Emergency {
    
    
    private ArrayList<String> disasterList;
    
    public DisasterEmergency()
    {
        super(Emergency.EmergencyType.DISASTEREMERGENCY.getValue());
        disasterList = new ArrayList<>();
        disasterList=new ArrayList<>();
        disasterList.add("Storm");
        disasterList.add("Flood");
        disasterList.add("Earthquake");
        disasterList.add("Forest Fires");
    }

    public ArrayList<String> getDisasterList() {
        return disasterList;
    }

    public void setDisasterList(ArrayList<String> disasterList) {
        this.disasterList = disasterList;
    }
   
}
