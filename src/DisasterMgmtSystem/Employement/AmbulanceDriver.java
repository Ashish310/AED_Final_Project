/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Employement;

/**
 *
 * @author hs_sa
 */
public class AmbulanceDriver extends Employee{
    private String id;
    private String status;

    private double speedOfAmbulance=100;
   
   
    
    public AmbulanceDriver()
    {

    }

    public String getAmbulanceId() {
        return id;
    }

    public void setAmbulanceId(String ambulanceId) {
        this.id = ambulanceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    
    public String toString() {
        return id;
    }

    public double getSpeedOfAmbulance() {
        return speedOfAmbulance;
    }

    public void setSpeedOfAmbulance(double speedOfAmbulance) {
        this.speedOfAmbulance = speedOfAmbulance;
    }
}
