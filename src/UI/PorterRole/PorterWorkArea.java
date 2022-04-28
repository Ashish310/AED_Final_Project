/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PorterRole;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import EcoSystem.WorkList.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashishkumar
 */
public class PorterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PorterWorkArea
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;
    
    
    public PorterWorkArea(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        creatingListenerForDelInfo();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        fillDelRqTable();
    }
    
      private void fillDelRqTable(){
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = ecosystem.getWorkQueue().getWorkRequestListDeliveryMan(userAccount);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblDeliveryManWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getPharmacy();
            row[2] = request.getPatient();
            row[2] = request.getPharmaceutical();
            row[3] = request.getStatus();
            model.addRow(row);
        }
        }

        private void creatingListenerForDelInfo() {
        tblDeliveryManWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryManWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof LabWorkRequest) {
                        LabWorkRequest orderWorkRequest = (LabWorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           ProcessPorterRequest processOrderJPanel = new ProcessPorterRequest(userProcessContainer,ecosystem,userAccount,orderWorkRequest);
                           userProcessContainer.add("ProcessOrderJPanel", processOrderJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 203, 230));

        tblDeliveryManWorkRequest.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblDeliveryManWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryManWorkRequest.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblDeliveryManWorkRequest);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDERS");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryManWorkRequest;
    // End of variables declaration//GEN-END:variables
}
