/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.PatientRole.PatientAreaPanel;

/**
 *
 * @author ashishkumar
 */
public class PatientRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PatientAreaPanel(userProcessContainer, account, business);
    }
}
