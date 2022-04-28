/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.AmbulanceDriver;

import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author hs_sa
 */
public class AmbulanceDriver extends UserAccount{
    private String ambulanceDriverName;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmbulanceDriverName() {
        return ambulanceDriverName;
    }

    public void setAmbulanceDriverName(String ambulanceDriverName) {
        this.ambulanceDriverName = ambulanceDriverName;
    }

    @Override
    public String toString() {
        return this.ambulanceDriverName;
    }
    
}
