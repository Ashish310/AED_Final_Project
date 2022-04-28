/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.LabAssistant;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class LabAssistantDirectory {
    
    ArrayList<LabAssistant> labAssistantList;
    
    public LabAssistantDirectory(){
        labAssistantList = new ArrayList<>();
    }

    public ArrayList<LabAssistant> getLabAssistantNameList() {
        return labAssistantList;
    }
    
    public ArrayList<LabAssistant> addLabAssistant(LabAssistant labAssistant){
        
        labAssistantList.add(labAssistant);
        return labAssistantList;
    }
    public void deleteLabAssistant(LabAssistant labAssistant){
        labAssistantList.remove(labAssistant);
    }
    
}
