/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

import EcoSystem.EcoSystem;
import EcoSystem.Patient.Patient;
import EcoSystem.Pharmacy.Pharmacy;
import EcoSystem.Pharmacy.PharmacyDirectory;
import EcoSystem.Pharmacy.PharmacyInventory;
import EcoSystem.Pharmacy.PharmacyMedicine;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import EcoSystem.WorkList.ProductQuantity;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shriyadikshith
 */
public class MedicineOrder extends javax.swing.JPanel {

    /**
     * Creates new form MedicineOrder
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
    private PharmacyDirectory pharmacyDirectory;
    private List<ProductQuantity> itemQuantityList = new ArrayList<>();
    
    
    public MedicineOrder(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        patient = (Patient) account;
        pharmacyDirectory = ecosystem.getPharmacyDirectory();
        fillRstList(pharmacyDirectory.getPharmacyList());
        defaultTableModel = (DefaultTableModel) tblPharmaInventory.getModel();
        defaultCartTable  = (DefaultTableModel) tblCart.getModel();
        if(pharmacyDirectory.getPharmacyList().size() > 0){
            index = 0;
            populateMenu();
        }
        txtMessage1.setEditable(false);
    }
    
    public boolean isItemSelected(PharmacyMedicine pharmacyMedicine) {
        int nRow = tblPharmaInventory.getRowCount();
        int count1 = 0;
        boolean res = true;

 

        for (int i = 0; i < nRow; i++) {
            if (null != tblPharmaInventory.getValueAt(i, 2)) {
                if ((Boolean) tblPharmaInventory.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            res = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return res;
    }
    
    private void populateMenu() {
        defaultTableModel.setRowCount(0);
        Pharmacy pharmacy = pharmacyDirectory.getPharmacyList().get(index);
        PharmacyInventory pharmacyInventory = pharmacy.getMenu();
        List<PharmacyMedicine> items = pharmacyInventory.getItemList();
        for (PharmacyMedicine item : items) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = item;
            row[1] = item.getPrice();
            defaultTableModel.addRow(row);
        }
    }
    
    private void populateCartTable() {
        double total = 0.0;
        defaultCartTable.setRowCount(0);
        for (ProductQuantity itemWithQuantity : itemQuantityList) {
            Object[] row = new Object[defaultCartTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            defaultCartTable.addRow(row);
        }
        txtMessage1.setText(total + "");
    }
    
    private void initListners() {
        tblPharmaInventory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblPharmaInventory.getSelectedRow();
                if (selectedRow >= 0) {
                    PharmacyMedicine pharmacyMedicine = (PharmacyMedicine) tblPharmaInventory.getValueAt(selectedRow, 0);
                    if (pharmacyMedicine != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

 

                        }
                        if (quantity != 0) {
                            ProductQuantity itemWithQuantity = new ProductQuantity(pharmacyMedicine, quantity);
                            itemQuantityList.add(itemWithQuantity);
                            populateCartTable();
                        }

 

                    }
                }
            }
        });
    }

    public void fillRstList(ArrayList<Pharmacy> pharmacyList) {
        for (Pharmacy pharmacy : pharmacyList) {
            rstCombo.addItem(pharmacy.getPharmacyName());
        }
    }
    
    

    private boolean creatingOrder() {
            LabWorkRequest orderWorkRequest = new LabWorkRequest();
            orderWorkRequest.setItemsWithQuatityList(itemQuantityList);
            orderWorkRequest.setMessage(txtMessage.getText());
            if (patient != null) {
                orderWorkRequest.setPatient(patient);
            } else {
                return false;
            }
            Pharmacy pharmacy = pharmacyDirectory.getPharmacyList().get(rstCombo.getSelectedIndex());         
            if (pharmacy != null) {
                orderWorkRequest.setPharmacy(pharmacy);  
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to Pharmacy");
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
        rstCombo = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPharmaInventory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMessage1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(166, 203, 230));

        requestTestJButton.setBackground(new java.awt.Color(97, 147, 160));
        requestTestJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        requestTestJButton.setText("Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Message");

        txtMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(51, 0, 51));
        enterpriseLabel1.setText("Choose Pharmacy");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ORDER MEDICINES");

        backJButton.setBackground(new java.awt.Color(97, 147, 160));
        backJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        tblCart.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Quantity", "Product Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCart);

        tblPharmaInventory.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblPharmaInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Price"
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
        jScrollPane2.setViewportView(tblPharmaInventory);

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Total Amount");

        txtMessage1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtMessage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(221, 221, 221)
                            .addComponent(enterpriseLabel1)
                            .addGap(34, 34, 34)
                            .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(jLabel2)
                            .addGap(41, 41, 41)
                            .addComponent(txtMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(jLabel1)
                            .addGap(47, 47, 47)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(361, 361, 361)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2))
                        .addComponent(txtMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (creatingOrder()) {
            JOptionPane.showMessageDialog(null, "Order Placed");
            MedcineOrderInfo medicineOrderInfoJPanel = new MedcineOrderInfo(userProcessContainer, ecosystem, patient);
            userProcessContainer.add("RequestLabTestJPanel", medicineOrderInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        PatientAreaPanel customerAreaJPanel = new PatientAreaPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("DeliveryManWorkAreaJPanel", customerAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtMessage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessage1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> rstCombo;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblPharmaInventory;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessage1;
    // End of variables declaration//GEN-END:variables
}
