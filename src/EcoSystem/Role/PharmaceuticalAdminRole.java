/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem.Role;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import UI.PharmaAdminRole.PharmaceuticalAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ashishkumar
 */
public class PharmaceuticalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PharmaceuticalAdminWorkArea(userProcessContainer,account,business);
    }
}
