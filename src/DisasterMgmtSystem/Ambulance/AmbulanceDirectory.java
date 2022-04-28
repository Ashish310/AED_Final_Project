/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class AmbulanceDirectory {
    private ArrayList<Ambulance> ambulanceStopList;
    
    
    public AmbulanceDirectory()
    {
       ambulanceStopList=new ArrayList();
    }
    
    public ArrayList<Ambulance> getAmbulanceStationList() {
        return ambulanceStopList;
    }

    public void setAmbulanceStationList(ArrayList<Ambulance> ambulanceStationList) {
        this.ambulanceStopList = ambulanceStationList;
    }

    public Ambulance addAmbulanceStation()
    {
        Ambulance d=new Ambulance();
        ambulanceStopList.add(d);
        return d;
    }
}
