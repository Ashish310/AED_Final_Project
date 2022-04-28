/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.AppUserAccount;

import DisasterMgmtSystem.Employement.Employee;
import DisasterMgmtSystem.SOSWaitList.SOSWaitList;
import javax.management.relation.Role;

/**
 *
 * @author hs_sa
 */
public class AppUserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private SOSWaitList waitList;

    public AppUserAccount() {
        waitList = new SOSWaitList();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public SOSWaitList getWorkQueue() {
        return waitList;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
