/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Victim;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class VictimDirectory {
    
    private ArrayList<Victim> personList;
    
    public VictimDirectory()
    {
        personList=new ArrayList<Victim>();
    }

    public ArrayList<Victim> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Victim> personList) {
        this.personList = personList;
    }
    
    public Victim addPerson()
    {
        Victim p=new Victim();
        personList.add(p);
        return p;
    }
    
}
