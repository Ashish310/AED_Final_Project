/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LabAssisstant;

/**
 *
 * @author shriyadikshith
 */
public class ProcessWorkRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestPanel
     */
    public ProcessWorkRequestPanel() {
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

        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        customerNameValue = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(null);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(47, 49, 77, 29);

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LAB DETAILS");
        add(jLabel9);
        jLabel9.setBounds(136, 35, 567, 43);

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Status");
        add(jLabel5);
        jLabel5.setBounds(199, 194, 57, 22);

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin Name");
        add(jLabel3);
        jLabel3.setBounds(136, 154, 119, 22);

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Select Test");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(160, 240, 101, 21);

        customerNameValue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        customerNameValue.setText("<Value>");
        add(customerNameValue);
        customerNameValue.setBounds(297, 154, 255, 22);

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<Value>");
        add(status);
        status.setBounds(297, 194, 255, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1);
        jComboBox1.setBounds(300, 240, 136, 27);

        jButton2.setText("START LAB");
        add(jButton2);
        jButton2.setBounds(230, 290, 111, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssisstant/lab2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(500, 120, 280, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameValue;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}