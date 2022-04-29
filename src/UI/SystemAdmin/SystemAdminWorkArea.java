/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

/**
 *
 * @author shriyadikshith
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    public SystemAdminWorkArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageHospital = new javax.swing.JButton();
        btnManagePharmaceutical = new javax.swing.JButton();
        btnManagePharmacy = new javax.swing.JButton();
        btnManageGovernment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 203, 230));

        btnManageHospital.setBackground(new java.awt.Color(166, 206, 55));
        btnManageHospital.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManageHospital.setText("Manage Hospital");
        btnManageHospital.setBorderPainted(false);
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });

        btnManagePharmaceutical.setBackground(new java.awt.Color(166, 206, 55));
        btnManagePharmaceutical.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManagePharmaceutical.setText("Manage Pharmaceutical");
        btnManagePharmaceutical.setBorderPainted(false);
        btnManagePharmaceutical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmaceuticalActionPerformed(evt);
            }
        });

        btnManagePharmacy.setBackground(new java.awt.Color(166, 206, 55));
        btnManagePharmacy.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManagePharmacy.setText("Manage Pharmacy");
        btnManagePharmacy.setBorderPainted(false);
        btnManagePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyActionPerformed(evt);
            }
        });

        btnManageGovernment.setBackground(new java.awt.Color(166, 206, 55));
        btnManageGovernment.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManageGovernment.setText("Manage Government");
        btnManageGovernment.setBorderPainted(false);
        btnManageGovernment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageGovernmentActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SystemAdmin/Admin.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME SYSTEM ADMIN !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnManagePharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addComponent(btnManageHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManagePharmaceutical, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addComponent(btnManageGovernment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(179, 179, 179)))
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(btnManageHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnManagePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(btnManagePharmaceutical, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnManageGovernment, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        ManageHospitalJPanel manageHospitalJPanel =new ManageHospitalJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageHospitalJPanel",manageHospitalJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnManagePharmaceuticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmaceuticalActionPerformed
        ManageParmaceuticalJPanel manageParmaceuticalJPanel =new ManageParmaceuticalJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageParmaceuticalJPanel",manageParmaceuticalJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManagePharmaceuticalActionPerformed

    private void btnManagePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyActionPerformed
        ManagePharmacyJPanel managePharmacyJPanel =new ManagePharmacyJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("managePharmacyJPanel",managePharmacyJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmacyActionPerformed

    private void btnManageGovernmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageGovernmentActionPerformed
        ManageGovernmentJPanel manageGovernmentJPanel =new ManageGovernmentJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageGovernmentJPanel",manageGovernmentJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageGovernmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageGovernment;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManagePharmaceutical;
    private javax.swing.JButton btnManagePharmacy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
