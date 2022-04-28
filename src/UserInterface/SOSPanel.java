/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import DisasterMgmtSystem.DisasterMgmtSystem;
import Utilities.MainJFrameUtilities;
import javax.swing.JPanel;
import ui.sosReporter.sosReporterPanel;

/**
 *
 * @author hs_sa
 */
public class SOSPanel extends javax.swing.JPanel {

    /**
     * Creates new form SOSPanel
     */
    
    private JPanel workArea;
    private DisasterMgmtSystem system;
    public SOSPanel(JPanel mainPanelArea, DisasterMgmtSystem disasterSystem) {
        
        initComponents();
        this.system = disasterSystem; 
        this.workArea = mainPanelArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSOS = new javax.swing.JButton();

        btnSOS.setIcon(new javax.swing.ImageIcon("C:\\Users\\hs_sa\\Desktop\\sos.png")); // NOI18N
        btnSOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(btnSOS, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnSOS)
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSOSActionPerformed
        // TODO add your handling code here:
        MainJFrameUtilities.redirect(new sosReporterPanel(workArea, this.system), "SOSPanel");
    }//GEN-LAST:event_btnSOSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSOS;
    // End of variables declaration//GEN-END:variables
}
