/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Ambulance;

import DisasterMgmtSystem.Employement.AmbulanceDriver;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class Ambulance {
      private String ambulanceStationName;
    private String ambulanceStationAddress;
    private float distanceFromEmergencyLoc;
    private Boolean availability;
    
    private ArrayList<AmbulanceDriver> driver;
    private ArrayList<AmbulanceDriver> nurse;

    public Ambulance() {
        driver=new ArrayList();
        nurse = new ArrayList();
    }

    public ArrayList<AmbulanceDriver> getNurse() {
        return nurse;
    }

    public void setNurse(ArrayList<AmbulanceDriver> nurse) {
        this.nurse = nurse;
    }

    public ArrayList<AmbulanceDriver> getAmbulanceList() {
        return driver;
    }

    public ArrayList<AmbulanceDriver> getDriver() {
        return driver;
    }

    public void setDriver(ArrayList<AmbulanceDriver> driver) {
        this.driver = driver;
    }

    public void setAmbulanceList(ArrayList<AmbulanceDriver> ambulanceList) {
        this.driver = ambulanceList;
    }
    
    public void addAmbulanceDriver(AmbulanceDriver d)
    {
        driver.add(d); 
    }
    
     public void addAmbulanceNurse(AmbulanceDriver d)
    {
        nurse.add(d);
    }

    public String getAmbulanceStationName() {
        return ambulanceStationName;
    }

    public void setAmbulanceStationName(String ambulanceStationName) {
        this.ambulanceStationName = ambulanceStationName;
    }

    @Override
    public String toString() {
        return  ambulanceStationName;
    }

    public String getAmbulanceStationAddress() {
        return ambulanceStationAddress;
    }

    public void setAmbulanceStationAddress(String ambulanceStationAddress) {
        this.ambulanceStationAddress = ambulanceStationAddress;
    }

    public float getDistanceFromEmergencyLoc() {
        return distanceFromEmergencyLoc;
    }

    public void setDistanceFromEmergencyLoc(float distanceFromEmergencyLoc) {
        this.distanceFromEmergencyLoc = distanceFromEmergencyLoc;
    }
}
