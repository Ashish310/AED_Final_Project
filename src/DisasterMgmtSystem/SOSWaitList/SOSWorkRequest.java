/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.SOSWaitList;

import DisasterMgmtSystem.AppUserAccount.AppUserAccount;

/**
 *
 * @author hs_sa
 */
public abstract class SOSWorkRequest {
    
    private String message;
    private AppUserAccount sender;
    private AppUserAccount receiver;
    private String status;
    
    
    public SOSWorkRequest(){
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AppUserAccount getSender() {
        return sender;
    }

    public void setSender(AppUserAccount sender) {
        this.sender = sender;
    }

    public AppUserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(AppUserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return sender.getEmployee().getName();
    }

    
}
