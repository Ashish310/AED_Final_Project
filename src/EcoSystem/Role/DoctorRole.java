/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import UI.DoctorRole.DoctorAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashishkumar
 */
public class DoctorRole  extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DoctorAreaPanel(userProcessContainer, account, business);
    }
}
