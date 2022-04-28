/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Users;

import DisasterMgmtSystem.WorkTypes.WorkTypes;

/**
 *
 * @author shriyadikshith
 */
public class Users {
    private String username;
    private String password;
    private Employees employees;
    private Roles roles;
    private WorkTypes workType;

    public Users() {
        workType = new WorkTypes();
    }
}
