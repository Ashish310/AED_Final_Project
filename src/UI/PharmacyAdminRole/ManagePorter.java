/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyAdminRole;

import EcoSystem.EcoSystem;
import EcoSystem.Porter.Porter;
import EcoSystem.Porter.PorterDirectory;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashishkumar
 */
public class ManagePorter extends javax.swing.JPanel {

    /**
     * Creates new form ManagePorter
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountDirectory;
    UserAccount userAccount;
    public ManagePorter(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        populateTable();
    }
    
    private void populateTable() {
        PorterDirectory deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
       
        model.setRowCount(0);
        
        for (Porter deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    Object[] row = new Object[4];
                    row[0] = deliveryMan.getUsername();
                    row[1] = deliveryMan.getPassword();
                    model.addRow(row);
                
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        staffName = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passwordTextfield = new javax.swing.JTextField();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE DELIVERY MAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 83, 819, 48));

        tblMenu.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DELIVERYMAN NAME", "DELIVERYMAN PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 149, 819, 199));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DeliveryMan Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 380, -1, -1));

        staffName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        add(staffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 374, 225, -1));

        btnAddItem.setBackground(new java.awt.Color(97, 147, 160));
        btnAddItem.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnAddItem.setText("Add Staff");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 462, 163, 60));

        btnBack2.setBackground(new java.awt.Color(97, 147, 160));
        btnBack2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 21, 111, 51));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DeliveryMan Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 420, -1, -1));

        passwordTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        passwordTextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(passwordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 419, 225, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
//        if (staffName.getText().isEmpty() || passwordTextfield.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Enter all fields");
//            return;
//        }
//        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(staffName.getText())){
//
//            DeliveryMan deliveryMan = new DeliveryMan();
//            deliveryMan.setDeliveryManName(staffName.getText());
//            deliveryMan.setUsername(staffName.getText());
//            deliveryMan.setPassword(passwordTextfield.getText());
//            deliveryMan.setRole(new DeliverManRole());
//            ecosystem.getUserAccountDirectory().addUserAccount(deliveryMan);
//            ecosystem.getDeliveryManDirectory().addDeliveryMan(deliveryMan);
//
//            populateTable();
//            staffName.setText("");
//            passwordTextfield.setText("");
//
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Username " + staffName.getText() + " exists");
//        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
//        PharmacyAdminWorkAreaJPanel pharmacyAdminWorkAreaJPanel = new PharmacyAdminWorkAreaJPanel(userProcessContainer,userAccount, ecosystem);
//        userProcessContainer.add("AdminWorkAreaJPanel", pharmacyAdminWorkAreaJPanel);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordTextfield;
    private javax.swing.JTextField staffName;
    private javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables
}
