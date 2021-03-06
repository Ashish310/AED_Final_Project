/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import UI.ReceptionRole.ReceptionWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ashishkumar
 */
public class ReceptionistRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new ReceptionWorkArea(userProcessContainer, account, business);
    }
}
