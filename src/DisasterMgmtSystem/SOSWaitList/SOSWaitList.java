/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.SOSWaitList;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class SOSWaitList {
    private ArrayList<SOSWaitList> workRequestList;

    public SOSWaitList() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<SOSWaitList> getWorkRequestList() {
        return workRequestList;
    }
    
}
