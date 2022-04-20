/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class MainJFrameUtilities {
    
    private static JPanel workArea;
    private static JPanel mainMenuPanel;



public JPanel getMenuPanel() {
return mainMenuPanel;
}

public void setWorkArea(JPanel workArea) {
this.workArea = workArea;
}

public void setMenuPanel(JPanel menuItem) {
this.mainMenuPanel = menuItem;
}



public JPanel getWorkArea() {
return workArea;
}



public static void redirect(JPanel nextScreen, String screenName) {
workArea.removeAll();
workArea.add(nextScreen, screenName);
CardLayout layout = (CardLayout) workArea.getLayout();
layout.next(workArea);
}
public static void redirect(JPanel nextScreen) {
workArea.removeAll();
workArea.add(nextScreen);
CardLayout layout = (CardLayout) workArea.getLayout();
layout.next(workArea);
}
    
}
