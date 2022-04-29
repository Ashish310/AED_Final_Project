/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.AppAdminArea;

import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import DisasterMgmtSystem.DisasterMgmtSystem;
import DisasterMgmtSystem.Employement.Employee;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.Roles.AmbulanceRole;
import DisasterMgmtSystem.Roles.HospitalAdmin;
import DisasterMgmtSystem.Roles.PoliceAdmin;
import Utilities.ManageTableStyles;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Utilities;
import Utilities.Utils;

/**
 *
 * @author hs_sa
 */
public class ManageEnterpriseAdminPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private DisasterMgmtSystem system;

    /**
     * Creates new form ManageEnterpriseAdminPanel
     */
    public ManageEnterpriseAdminPanel() {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
        
    }
    
    private void populateTable() {
        enterpriseJTable.getTableHeader().setDefaultRenderer(new ManageTableStyles());
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEntDirObj().getEnterpriseList()) {
                for (AppUserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        cmbNetworkList.removeAllItems();

        for (Network network : system.getNetworkList()) {
            cmbNetworkList.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        cmbEnterprise.removeAllItems();

        for (Enterprise enterprise : network.getEntDirObj().getEnterpriseList()) {
            cmbEnterprise.addItem(enterprise);
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbEnterprise = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 92, 59));
        jLabel4.setText("User Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Enteprise Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 2, 1030, 30));

        cmbNetworkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkListActionPerformed(evt);
            }
        });
        add(cmbNetworkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 170, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 170, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 92, 59));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 170, -1));

        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 170, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 92, 59));
        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 20));

        btnSubmit.setBackground(new java.awt.Color(37, 116, 187));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setMaximumSize(new java.awt.Dimension(79, 29));
        btnSubmit.setMinimumSize(new java.awt.Dimension(79, 29));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 110, 50));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 92, 59));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, 20));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 540, 170));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 92, 59));
        jLabel2.setText("Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkListActionPerformed
        // TODO add your handling code here:
        Network network = (Network) cmbNetworkList.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_cmbNetworkListActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        Enterprise enterprise = (Enterprise) cmbEnterprise.getSelectedItem();

        String username = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());

        String name = txtName.getText();
        if (username.isEmpty() || password.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            if (!Utils.validateUserName(username)) {
                JOptionPane.showMessageDialog(null, "Please enter valid user name!", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Utils.validatePassword(password)) {
                JOptionPane.showMessageDialog(null, "Not a Strong password!", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);

            if (system.checkIfUserNameIsUnique(username+"")) {
                AppUserAccount account = null;
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.AmbulanceAdminEnterprise) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AmbulanceRole());
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.POLICEENTERPRISE) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PoliceAdmin());
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HOSPITALENTERPRISE) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdmin());
                }
                txtUserName.setText("");
                txtPassword.setText("");
                txtName.setText("");
                JOptionPane.showMessageDialog(null, "Account created sucessfully");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Username Exists! Please enter unique username.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
