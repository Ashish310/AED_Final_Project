/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Employement;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author hs_sa
 */
public class Employee {
    private static AtomicInteger atomicInteger = new AtomicInteger(100);
    private String name;
    private int id;

    public Employee() {
        this.id =  atomicInteger.getAndIncrement();
    }
    
    public Employee(String name) {
        this.id =  atomicInteger.getAndIncrement();
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
