/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdmin;

import EcoSystem.AmbulanceDriver.AmbulanceDriver;
import EcoSystem.AmbulanceDriver.AmbulanceDriverDirectory;
import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import UI.AmbulanceRole.AmbulanceWorkArea;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class AcceptEmergencyRequest extends javax.swing.JPanel {

    /**
     * Creates new form Accept
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecosystem;
    LabWorkRequest labTestWorkRequest;
    double total = 0.0;
    
    private AmbulanceDriverDirectory ambulanceDriverDirectory;
    private int index = -1;
    
    public AcceptEmergencyRequest(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, LabWorkRequest labTestWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.labTestWorkRequest = labTestWorkRequest;
        
        ambulanceDriverDirectory = ecosystem.getAmbulanceDirectory();   
        fillDelList(ambulanceDriverDirectory.getAmbulanceDriverList());
        change();
        
        display();
    }
    
    private void fillDelUI() {
        if(labTestWorkRequest.getAmbulanceDriver()== null && !("Request to HospitalAdmin".equalsIgnoreCase(labTestWorkRequest.getStatus()) || "declined".equalsIgnoreCase(labTestWorkRequest.getStatus()))){
            assignDeliveryPersonLabel.setVisible(true);
            assignDeliveryPerson.setVisible(true);
            
            btnassign.setVisible(true);
            
        }
        else{
            btnassign.setVisible(false);
            assignDeliveryPersonLabel.setVisible(false);
            assignDeliveryPerson.setVisible(false);
        }
    }
    
    private void display() {
        
        fillDelUI();
        
        
        status.setText(labTestWorkRequest.getStatus());
        message.setText(labTestWorkRequest.getMessage());

    }
    
    public void fillDelList(ArrayList<AmbulanceDriver> ambulanceDriverList) {
        if(labTestWorkRequest.getAmbulanceDriver()== null) {
            assignDeliveryPerson.setVisible(true);
            for (AmbulanceDriver ambulanceDriver : ambulanceDriverList) {
                assignDeliveryPerson.addItem(ambulanceDriver.getAmbulanceDriverName());
            }
        }
        else {
            assignDeliveryPerson.setVisible(false);
        } 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        assignDeliveryPersonLabel = new javax.swing.JLabel();
        assignDeliveryPerson = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        btnaccept = new javax.swing.JButton();
        btndecline = new javax.swing.JButton();
        btnassign = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(97, 147, 160));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 49, 0, 0);
        add(jButton1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/HospitalAdmin/emergencyimg.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = -20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 40, 6, 218);
        add(jLabel1, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EMERGENCY REQUEST DETAILS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 74, 0, 0);
        add(jLabel12, gridBagConstraints);

        assignDeliveryPersonLabel.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDeliveryPersonLabel.setText("Assign Ambulance Driver");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 64, 0, 0);
        add(assignDeliveryPersonLabel, gridBagConstraints);

        assignDeliveryPerson.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDeliveryPerson.setForeground(new java.awt.Color(255, 153, 51));
        assignDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDeliveryPersonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 69, 0, 0);
        add(assignDeliveryPerson, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel14.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 244, 0, 0);
        add(jLabel14, gridBagConstraints);

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 89, 0, 0);
        add(status, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setText("Message");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 224, 0, 0);
        add(jLabel10, gridBagConstraints);

        message.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 89, 0, 0);
        add(message, gridBagConstraints);

        btnaccept.setBackground(new java.awt.Color(97, 147, 160));
        btnaccept.setText("ACCEPT");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 40, 0, 0);
        add(btnaccept, gridBagConstraints);

        btndecline.setBackground(new java.awt.Color(97, 147, 160));
        btndecline.setText("DECLINE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 33, 0, 0);
        add(btndecline, gridBagConstraints);

        btnassign.setBackground(new java.awt.Color(97, 147, 160));
        btnassign.setText("ASSIGN");
        btnassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 40, 0, 0);
        add(btnassign, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void assignDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDeliveryPersonActionPerformed
        index = assignDeliveryPerson.getSelectedIndex();
    }//GEN-LAST:event_assignDeliveryPersonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AmbulanceWorkArea deliveryManWorkAreaJPanel = new AmbulanceWorkArea(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("PorterWorkArea", deliveryManWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
         if (labTestWorkRequest.getStatus().equals("Request to HospitalAdmin")) {
            labTestWorkRequest.setStatus("Ambulance on the way"); 
            JOptionPane.showMessageDialog(null, " Request Accepted");
        }
        else if(labTestWorkRequest.getStatus().equals("Ambulance on the way")) {
            labTestWorkRequest.setStatus("Request to AmbulanceDriver");
            if(labTestWorkRequest.getDeliverMan() == null){
                JOptionPane.showMessageDialog(null, " Requested Ambulance");
            }
            else {
                JOptionPane.showMessageDialog(null, "Ambulance will be arriving");
            }
        }
        else {  
            btnaccept.setVisible(false);
        }
        change();
        status.setText(labTestWorkRequest.getStatus());
    }//GEN-LAST:event_btnacceptActionPerformed

    private void btnassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignActionPerformed
        // TODO add your handling code here:
        if(index >= 0) {
            AmbulanceDriver ambulanceDriver = ambulanceDriverDirectory.getAmbulanceDriverList().get(assignDeliveryPerson.getSelectedIndex());
            labTestWorkRequest.setAmbulanceDriver(ambulanceDriver);
            JOptionPane.showMessageDialog(null,ambulanceDriver+ " Ambulance Driver assigned");
            fillDelUI();
        }
    }//GEN-LAST:event_btnassignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> assignDeliveryPerson;
    private javax.swing.JLabel assignDeliveryPersonLabel;
    private javax.swing.JButton btnaccept;
    private javax.swing.JButton btnassign;
    private javax.swing.JButton btndecline;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel message;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

private void change() {
        switch(labTestWorkRequest.getStatus()){
            case "Request to HospitalAdmin" -> {
                btnaccept.setText("Accept request");
                btndecline.setVisible(true);
            }
            case "Ambulance on the way" -> {
                btnaccept.setText("Ready for pickup");
                btndecline.setVisible(false);
            }
            default -> {
                btnaccept.setVisible(false);
                btndecline.setVisible(false);
            }
        }
        fillDelUI();
    }
}
