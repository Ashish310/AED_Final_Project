/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

import EcoSystem.EcoSystem;
import EcoSystem.Hospital.HospitalAdmin;
import EcoSystem.Hospital.HospitalAdminDirectory;
import EcoSystem.Patient.Patient;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shriyadikshith
 */
public class EmergencyRequest extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyRequest
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Patient patient;
    private DefaultTableModel defaultTableModel;
    private DefaultTableModel defaultCartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private EcoSystem ecosystem;
    private HospitalAdminDirectory hospitalAdminDirectory;
    
    public EmergencyRequest(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        patient = (Patient) account;
        hospitalAdminDirectory = ecosystem.getHospitalDirectory();
        fillRstList(hospitalAdminDirectory.getHospitalList());
    }
    
    public void fillRstList(ArrayList<HospitalAdmin> hospitalAdminList) {
        for (HospitalAdmin hospitalAdmin : hospitalAdminList) {
            rstCombo.addItem(hospitalAdmin.getName());
        }
    }
    
    private boolean creatingOrder() {
            LabWorkRequest orderWorkRequest = new LabWorkRequest();
            orderWorkRequest.setMessage(txtMessage.getText());
            if (patient != null) {
                orderWorkRequest.setPatient(patient);
            } else {
                return false;
            }
            HospitalAdmin hospitalAdmin = hospitalAdminDirectory.getHospitalList().get(rstCombo.getSelectedIndex()); 
            if (hospitalAdmin != null) {
                orderWorkRequest.setHospitalAdmin(hospitalAdmin);
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to HospitalAdmin");
            ecosystem.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        rstCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 203, 230));

        requestTestJButton.setBackground(new java.awt.Color(97, 147, 160));
        requestTestJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        requestTestJButton.setText("Book Emergency");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message");

        txtMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SCHEDULE EMERGENCY REQUEST");

        backJButton.setBackground(new java.awt.Color(97, 147, 160));
        backJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Choose Hospital");

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PatientRole/emerimg.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(enterpriseLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addComponent(jLabel1)
                            .addGap(24, 24, 24)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(316, 316, 316)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 298, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (creatingOrder()) {
            JOptionPane.showMessageDialog(null, "Emergency Request Sent !");
            EmergencyInfo emergencyInfoJPanel = new EmergencyInfo(userProcessContainer, ecosystem, patient);
            userProcessContainer.add("EmergencyInfo", emergencyInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        PatientAreaPanel patientAreaJPanel = new PatientAreaPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("PatientAreaJPanel", patientAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> rstCombo;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
