/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class PatientAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientAreaPanel
     */
    
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    
    public PatientAreaPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
    }
    private void OrderIssue() {
        AppointmentSchedule placeOrderJPanel = new AppointmentSchedule(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("PlaceOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void OrderInfoAndFeedback() {
        AppointmentInfo orderStatusJPanel = new AppointmentInfo(userProcessContainer, ecosystem, userAccount);
        userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void MedicineOrderIssue(){
        MedicineOrder medicineOrderJPanel = new MedicineOrder(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("MedicineOrderJPanel", medicineOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void emergencyRequest() {
        EmergencyRequest emergencyRequestJPanel = new EmergencyRequest(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("EmergencyRequestJPanel", emergencyRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void doctorInfo() {
        DoctorInfo doctorInfo = new DoctorInfo(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("DoctorInfoJPanel", doctorInfo);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderIssue = new javax.swing.JButton();
        btnorderInfoAndFeedback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnOrderIssue1 = new javax.swing.JButton();
        btnOrderIssue2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnorderInfoAndFeedback1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 203, 230));

        btnOrderIssue.setBackground(new java.awt.Color(166, 206, 55));
        btnOrderIssue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue.setText("Manage Medicine Order");
        btnOrderIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssueActionPerformed(evt);
            }
        });

        btnorderInfoAndFeedback.setBackground(new java.awt.Color(166, 206, 55));
        btnorderInfoAndFeedback.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnorderInfoAndFeedback.setText("View Hospital Information");
        btnorderInfoAndFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderInfoAndFeedbackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME !!!");
        jLabel2.setToolTipText("");

        btnOrderIssue1.setBackground(new java.awt.Color(166, 206, 55));
        btnOrderIssue1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue1.setText("Manage Appointment");
        btnOrderIssue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssue1ActionPerformed(evt);
            }
        });

        btnOrderIssue2.setBackground(new java.awt.Color(166, 206, 55));
        btnOrderIssue2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue2.setText("Schedule Emergency Request");
        btnOrderIssue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssue2ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PatientRole/welcome.png"))); // NOI18N

        btnorderInfoAndFeedback1.setBackground(new java.awt.Color(166, 206, 55));
        btnorderInfoAndFeedback1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnorderInfoAndFeedback1.setText("View Doctor Information");
        btnorderInfoAndFeedback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderInfoAndFeedback1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 49, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(btnOrderIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(btnorderInfoAndFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(btnOrderIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(btnOrderIssue2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(btnorderInfoAndFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 49, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnOrderIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(btnorderInfoAndFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnOrderIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnOrderIssue2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(btnorderInfoAndFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssueActionPerformed
        MedicineOrderIssue();
    }//GEN-LAST:event_btnOrderIssueActionPerformed

    private void btnorderInfoAndFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderInfoAndFeedbackActionPerformed
        OrderInfoAndFeedback();
    }//GEN-LAST:event_btnorderInfoAndFeedbackActionPerformed

    private void btnOrderIssue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssue1ActionPerformed
        OrderIssue();
    }//GEN-LAST:event_btnOrderIssue1ActionPerformed

    private void btnOrderIssue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssue2ActionPerformed
        emergencyRequest();
    }//GEN-LAST:event_btnOrderIssue2ActionPerformed

    private void btnorderInfoAndFeedback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderInfoAndFeedback1ActionPerformed
        doctorInfo();
    }//GEN-LAST:event_btnorderInfoAndFeedback1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderIssue;
    private javax.swing.JButton btnOrderIssue1;
    private javax.swing.JButton btnOrderIssue2;
    private javax.swing.JButton btnorderInfoAndFeedback;
    private javax.swing.JButton btnorderInfoAndFeedback1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
