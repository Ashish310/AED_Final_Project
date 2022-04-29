/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ReceptionRole;

/**
 *
 * @author hs_sa
 */
public class ReceptionWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionWorkArea
     */
    public ReceptionWorkArea() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userJButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME RECEPTIONIST !");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        add(jLabel1, gridBagConstraints);

        manageOrganizationJButton.setBackground(new java.awt.Color(166, 206, 55));
        manageOrganizationJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Appointments");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 233, 0, 0);
        add(manageOrganizationJButton, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 192;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(jLabel2, gridBagConstraints);

        userJButton1.setBackground(new java.awt.Color(166, 206, 55));
        userJButton1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        userJButton1.setText("Manage Patients");
        userJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 233, 56, 0);
        add(userJButton1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 432;
        gridBagConstraints.ipady = -40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 6, 0, 0);
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        //manageOrders();
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void userJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton1ActionPerformed
        //managePatients();
    }//GEN-LAST:event_userJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton1;
    // End of variables declaration//GEN-END:variables
}