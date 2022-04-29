/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmaAdminRole;

import EcoSystem.EcoSystem;
import EcoSystem.WorkList.PharmacyInventory;
import EcoSystem.Porter.PorterDirectory;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hs_sa
 */
public class AcceptOrRejectOrder extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecosystem;
    LabWorkRequest labTestWorkRequest;
    double total = 0.0;
    private DefaultTableModel defaultTableModel;
    private PorterDirectory deliveryManDirectory;
    private List<PharmacyInventory> itemQuantityList = new ArrayList<>();
    private int index = -1;
    public AcceptOrRejectOrder(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, LabWorkRequest labTestWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.labTestWorkRequest = labTestWorkRequest;
        defaultTableModel = (DefaultTableModel) tblOrderDetails.getModel();
        deliveryManDirectory = ecosystem.getDeliveryManDirectory();   
        change();
        display();
    }
    
    private void display() {
                
        pharmaName.setText(labTestWorkRequest.getPharmacy().getPharmacyName());
        status.setText(labTestWorkRequest.getStatus());
        message.setText(labTestWorkRequest.getMessage());

        defaultTableModel.setRowCount(0);
        for (PharmacyInventory itemWithQuantity : labTestWorkRequest.getPharmaItemQuantitys()) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getMedicines().getPrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getMedicines().getPrice() * itemWithQuantity.getQuantity();
            defaultTableModel.addRow(row);
        }
        totalPrice.setText(total + "");

    }
    
    private void declineOrder(){
        labTestWorkRequest.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Order has been declined");
        change();
        status.setText(labTestWorkRequest.getStatus());
    }
    
    private void change() {
        switch(labTestWorkRequest.getStatus()){
            case "Request to Pharmaceutical" -> {
                acceptOrder.setText("Accept order");
                declineOrder.setVisible(true);
            }
            case "Preparing" -> {
                acceptOrder.setText("Ready for delivery");
                declineOrder.setVisible(false);
            }
            default -> {
                declineOrder.setVisible(false);
                acceptOrder.setVisible(false);
            }
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

        cartScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        lblPharmaName = new javax.swing.JLabel();
        pharmaName = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblOrderTotal = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        acceptOrder = new javax.swing.JButton();
        declineOrder = new javax.swing.JButton();
        lblBackButton = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartScrollPane1.setForeground(new java.awt.Color(255, 153, 51));

        tblOrderDetails.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "ITEM QUANTITY", "ITEM PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane1.setViewportView(tblOrderDetails);

        add(cartScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 830, 114));

        lblPharmaName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblPharmaName.setForeground(new java.awt.Color(255, 255, 255));
        lblPharmaName.setText("Pharmacy Name");
        add(lblPharmaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        pharmaName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        pharmaName.setText("<value>");
        add(pharmaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 206, -1));

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<value>");
        add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 206, -1));

        lblStatus.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        lblOrderTotal.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblOrderTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderTotal.setText("Total");
        add(lblOrderTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        totalPrice.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        totalPrice.setText("<value>");
        add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 120, -1));

        message.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        message.setText("<value>");
        add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 258, -1));

        lblMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage.setText("Message");
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        acceptOrder.setBackground(new java.awt.Color(166, 206, 55));
        acceptOrder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        acceptOrder.setText("Accept Order");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });
        add(acceptOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, 49));

        declineOrder.setBackground(new java.awt.Color(166, 206, 55));
        declineOrder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        declineOrder.setText("Decline Order");
        declineOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                declineOrderMousePressed(evt);
            }
        });
        declineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderActionPerformed(evt);
            }
        });
        add(declineOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, 49));

        lblBackButton.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        lblBackButton.setForeground(new java.awt.Color(255, 255, 255));
        lblBackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackButton.setText("ORDER DETAILS");
        add(lblBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, -1));

        btnBack1.setBackground(new java.awt.Color(166, 206, 55));
        btnBack1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed

        if (labTestWorkRequest.getStatus().equals("Request to Pharmaceutical")) {
            labTestWorkRequest.setStatus("Preparing");
            JOptionPane.showMessageDialog(null, " Order Accepted");
        }
        else if(labTestWorkRequest.getStatus().equals("Preparing")) {
            labTestWorkRequest.setStatus("Prepared for Pharmacy");
            labTestWorkRequest.setMessage("Order List :"+labTestWorkRequest.getPharmaItemQuantitys().toString());
            JOptionPane.showMessageDialog(null, " Order sent to Pharmacy");
        }
        else {
            acceptOrder.setVisible(false);
        }
        change();
        status.setText(labTestWorkRequest.getStatus());

    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineOrderMousePressed
        declineOrder();
    }//GEN-LAST:event_declineOrderMousePressed

    private void declineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declineOrderActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        ViewOrderInformation viewOrderDetails = new ViewOrderInformation(userProcessContainer,ecosystem, userAccount);
        userProcessContainer.add("ViewOrderDetails", viewOrderDetails);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton btnBack1;
    private javax.swing.JScrollPane cartScrollPane1;
    private javax.swing.JButton declineOrder;
    private javax.swing.JLabel lblBackButton;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblPharmaName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel message;
    private javax.swing.JLabel pharmaName;
    private javax.swing.JLabel status;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
