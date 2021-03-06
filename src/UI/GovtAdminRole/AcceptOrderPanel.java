/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.GovtAdminRole;

import EcoSystem.EcoSystem;
import EcoSystem.MedicalInformation.MedicalInformation;
import EcoSystem.MedicalInformation.MedicalInformationDirectory;
import EcoSystem.Porter.PorterDirectory;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class AcceptOrderPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecosystem;
    LabWorkRequest labTestWorkRequest;
    double total = 0.0;
    private PorterDirectory deliveryManDirectory;
    private MedicalInformationDirectory medInfoDirectory;
    private int index = -1;

    /**
     * Creates new form AcceptOrderPanel
     */
    public AcceptOrderPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, LabWorkRequest labTestWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.labTestWorkRequest = labTestWorkRequest;
        deliveryManDirectory = ecosystem.getDeliveryManDirectory();  
        medInfoDirectory = ecosystem.getMedInfoDirectory();       
        change();        
        display();
    }


    private void display() {

        MedicalInformation medInfo = labTestWorkRequest.getMedInfoList().get(labTestWorkRequest.getMedInfoList().size()-1);
        medicine.setText(labTestWorkRequest.getPharmaceutical().getPharmaceuticalName());
        medicine2.setText(medInfo.getDosage());
        medicine3.setText(medInfo.getName());
        medicine4.setText(medInfo.getContraIndications());
        medicine5.setText(medInfo.getPrecautions());
        medicine6.setText(medInfo.getReactions());
        medicine7.setText(medInfo.getDescription());
        medicine8.setText(medInfo.getPharmacology());
        status.setText(labTestWorkRequest.getStatus());



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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        medicine = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicine2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medicine3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        medicine4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        medicine5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        medicine6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        medicine7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        medicine8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btndecline = new javax.swing.JButton();
        btnaccept = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pharmaceutical Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 33, 0, 0);
        add(jLabel4, gridBagConstraints);

        medicine.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 53, 0, 0);
        add(medicine, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dosage & Administration");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 33, 0, 0);
        add(jLabel5, gridBagConstraints);

        medicine2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine2.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 53, 0, 0);
        add(medicine2, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   Medicine Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 33, 0, 0);
        add(jLabel6, gridBagConstraints);

        medicine3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine3.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 53, 0, 0);
        add(medicine3, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraindications");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 35, 0, 0);
        add(jLabel7, gridBagConstraints);

        medicine4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine4.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 54, 0, 0);
        add(medicine4, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Warnings & Precautions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        add(jLabel8, gridBagConstraints);

        medicine5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine5.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        add(medicine5, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adverse Reactions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        add(jLabel9, gridBagConstraints);

        medicine6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine6.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        add(medicine6, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Drug Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        add(jLabel10, gridBagConstraints);

        medicine7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine7.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        add(medicine7, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clinical Pharmacology");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        add(jLabel11, gridBagConstraints);

        medicine8.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        medicine8.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        add(medicine8, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE APPROVAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 105, 0, 0);
        add(jLabel1, gridBagConstraints);

        btnback.setBackground(new java.awt.Color(97, 147, 160));
        btnback.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 23, 0, 0);
        add(btnback, gridBagConstraints);

        btndecline.setBackground(new java.awt.Color(97, 147, 160));
        btndecline.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btndecline.setText("DECLINE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 84, 71, 0);
        add(btndecline, gridBagConstraints);

        btnaccept.setBackground(new java.awt.Color(97, 147, 160));
        btnaccept.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnaccept.setText("ACCEPT");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 67, 71, 0);
        add(btnaccept, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 184, 0, 0);
        add(jLabel12, gridBagConstraints);

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        add(status, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
        
        if (labTestWorkRequest.getStatus().equals("Request to CDC")) {
            labTestWorkRequest.setStatus("Request Accepted"); 
            JOptionPane.showMessageDialog(null, " Request Accepted");
        }
        else if(labTestWorkRequest.getStatus().equals("Request Accepted")) {
            labTestWorkRequest.setStatus("Request Approved");
            if(labTestWorkRequest.getDeliverMan() == null){
                JOptionPane.showMessageDialog(null, "Request Approved");
            }
        }
        else {  
            btnaccept.setVisible(false);
        }
        change();
        status.setText(labTestWorkRequest.getStatus());
    }//GEN-LAST:event_btnacceptActionPerformed

     private void change() {
        switch(labTestWorkRequest.getStatus()){
            case "Request to CDC" -> {
                btnaccept.setText("Accept request");
                btndecline.setVisible(true);
            }
            case "Request Accepted" -> {
                btnaccept.setText("Approve request");
                btndecline.setVisible(false);
            }
            default -> {
                btndecline.setVisible(false);
                btnaccept.setVisible(false);
            }
        }
        
    }
       
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        ViewOrderDetails viewOrderDetails = new ViewOrderDetails(userProcessContainer,ecosystem, userAccount);
        userProcessContainer.add("ViewOrderDetails", viewOrderDetails);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccept;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndecline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel medicine;
    private javax.swing.JLabel medicine2;
    private javax.swing.JLabel medicine3;
    private javax.swing.JLabel medicine4;
    private javax.swing.JLabel medicine5;
    private javax.swing.JLabel medicine6;
    private javax.swing.JLabel medicine7;
    private javax.swing.JLabel medicine8;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
