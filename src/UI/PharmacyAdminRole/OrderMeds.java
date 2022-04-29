/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyAdminRole;

import EcoSystem.EcoSystem;
import EcoSystem.Pharmaceutical.Inventory;
import EcoSystem.Pharmaceutical.Medicines;
import EcoSystem.Pharmaceutical.Pharmaceutical;
import EcoSystem.Pharmaceutical.PharmaceuticalDirectory;
import EcoSystem.Pharmacy.Pharmacy;
import EcoSystem.Pharmacy.PharmacyMedicine;
import EcoSystem.WorkList.PharmacyInventory;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
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
 * @author ashishkumar
 */
public class OrderMeds extends javax.swing.JPanel {

    /**
     * Creates new form OrderMeds
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Pharmacy pharmacy;
    private DefaultTableModel defaultTableModel;
    private DefaultTableModel defaultCartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private EcoSystem ecosystem;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private List<PharmacyInventory> itemQuantityList = new ArrayList<>();
    
    public OrderMeds(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        pharmacy = (Pharmacy) account;
        pharmaceuticalDirectory = ecosystem.getPharmaceuticalDirectory();
        fillRstList(pharmaceuticalDirectory.getPharmaceuticalDirectory());
        defaultTableModel = (DefaultTableModel) tblPharmaInventory.getModel();
        defaultCartTable  = (DefaultTableModel) tblCart.getModel();
        if(pharmaceuticalDirectory.getPharmaceuticalDirectory().size() > 0){
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
        Pharmaceutical pharmaceutical = pharmaceuticalDirectory.getPharmaceuticalDirectory().get(index);
        Inventory inventory = pharmaceutical.getInventory();
        List<Medicines> items = inventory.getItemList();
        for (Medicines item : items) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = item;
            row[1] = item.getPrice();
            defaultTableModel.addRow(row);
        }
    }
    
    private void populateCartTable() {
        double total = 0.0;
        defaultCartTable.setRowCount(0);
        for (PharmacyInventory itemWithQuantity : itemQuantityList) {
            Object[] row = new Object[defaultCartTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getMedicines().getPrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getMedicines().getPrice() * itemWithQuantity.getQuantity();
            defaultCartTable.addRow(row);
        }
        txtMessage1.setText(total + "");
    }
    
    private void initListners() {
        tblPharmaInventory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblPharmaInventory.getSelectedRow();
                if (selectedRow >= 0) {
                    Medicines medicines = (Medicines) tblPharmaInventory.getValueAt(selectedRow, 0);
                    if (medicines != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {
                        }
                        if (quantity != 0) {
                            PharmacyInventory itemWithQuantity = new PharmacyInventory(medicines, quantity);
                            itemQuantityList.add(itemWithQuantity);
                            populateCartTable();
                        }
                    }
                }
            }
        });
    }

    public void fillRstList(ArrayList<Pharmaceutical> pharmacyList) {
        for (Pharmaceutical pharmaceutical : pharmacyList) {
            rstCombo.addItem(pharmaceutical.getPharmaceuticalName());
        }
    }
    
    

    private boolean creatingOrder() {
            LabWorkRequest orderWorkRequest = new LabWorkRequest();
            orderWorkRequest.setPharmaItemQuantitys(itemQuantityList);
            orderWorkRequest.setMessage(txtMessage.getText());
            if (pharmacy != null) {
                orderWorkRequest.setPharmacy(pharmacy);
            } else {
                return false;
            }
            Pharmaceutical pharmaceutical = pharmaceuticalDirectory.getPharmaceuticalDirectory().get(rstCombo.getSelectedIndex());         
            if (pharmaceutical != null) {
                orderWorkRequest.setPharmaceutical(pharmaceutical);  
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to Pharmaceutical");
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

        requestTestJButton.setBackground(new java.awt.Color(166, 206, 55));
        requestTestJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        requestTestJButton.setText("Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message");

        txtMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Choose Pharmaceutical");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Order Medicines");

        backJButton.setBackground(new java.awt.Color(166, 206, 55));
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
                "PRODUCT NAME", "PRODUCT QUANTITY", "PRODUCT PRICE"
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
                "PRODUCT NAME", "PRODUCT PRICE"
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
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Amount");

        txtMessage1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(enterpriseLabel1)
                        .addGap(17, 17, 17)
                        .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
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
                .addGap(33, 33, 33)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (creatingOrder()) {
            JOptionPane.showMessageDialog(null, "Order Placed");
            MedsOrderInfo medicineOrderInfoJPanel = new MedsOrderInfo(userProcessContainer, ecosystem, pharmacy);
            userProcessContainer.add("MedicineOrderInfoJPanel", medicineOrderInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        PharmacyAdminWorkArea pharmacyAdminWorkAreaJPanel = new PharmacyAdminWorkArea(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("DeliveryManWorkAreaJPanel", pharmacyAdminWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


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
