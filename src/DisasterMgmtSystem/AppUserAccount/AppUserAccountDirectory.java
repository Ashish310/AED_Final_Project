/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.AppUserAccount;

import DisasterMgmtSystem.Employement.Employee;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author hs_sa
 */
public class AppUserAccountDirectory {
    private ArrayList<AppUserAccount> userAccountList;

    public AppUserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<AppUserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public AppUserAccount authenticateUser(String username, String password){
        for (AppUserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public AppUserAccount createUserAccount(String username, String password, Employee employee, Role role){
        AppUserAccount userAccount = new AppUserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (AppUserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
              return false;
        }
        return true;
    }
    
}
