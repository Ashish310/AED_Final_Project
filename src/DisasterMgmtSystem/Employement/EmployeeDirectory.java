/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Employement;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    
    public void createEmployee(Employee e){ 
        employeeList.add(e);
    }
     public Employee createEmployee(String name){ 
         Employee e = new Employee(name);
         employeeList.add(e);
         return e;
    }
}
