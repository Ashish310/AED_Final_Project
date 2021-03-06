/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmaAdminRole;

import EcoSystem.EcoSystem;
import EcoSystem.Government.Municipality;
import EcoSystem.Government.MunicipalityDirectory;
import EcoSystem.MedicalInformation.MedicalInformation;
import EcoSystem.Pharmaceutical.Pharmaceutical;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hs_sa
 */
public class MedicineApprovalForm extends javax.swing.JPanel {

    /**
     * Creates new form MedicineApprovalForm
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Pharmaceutical pharmaceutical;
    MunicipalityDirectory governmentDirectory;
    private List<MedicalInformation> itemQuantityList = new ArrayList<>();
    private int index = -1;
    public MedicineApprovalForm(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        governmentDirectory = ecosystem.getGovernmentDirectory();
        pharmaceutical = (Pharmaceutical) userAccount;
        fillRstList(governmentDirectory.getGovernmentList());
        
        
    }
    
     
    
    public void fillRstList(ArrayList<Municipality> doctorList) {
        for (Municipality government : doctorList) {
            rstCombo.addItem(government.getName());
        }
    }
    
    private boolean creatingOrder() {
        LabWorkRequest orderWorkRequest = new LabWorkRequest();
            MedicalInformation medInfo = new MedicalInformation();
            medInfo.setDosage(dosageField.getText());
            medInfo.setName(nameField.getText());
            medInfo.setContraIndications(contraField.getText());
            medInfo.setPrecautions(precField.getText());
            medInfo.setReactions(adverseReactionField.getText());
            medInfo.setDescription(drugField.getText());
            medInfo.setPharmacology(clinicalField.getText());
            medInfo.setToxicology(toxicologyField.getText());
            itemQuantityList.add(medInfo);
            orderWorkRequest.setMessage("Medicine Approval");
            orderWorkRequest.setMedInfoList(itemQuantityList);
            if (pharmaceutical != null) {
                orderWorkRequest.setPharmaceutical(pharmaceutical);
            } else {
                return false;
            }
            Municipality government = governmentDirectory.getGovernmentList().get(index);
            
            if (government != null) {
                orderWorkRequest.setGovernment(government);                
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to CDC");
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        dosageField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        contraField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        adverseReactionField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        drugField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        clinicalField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        toxicologyField = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();
        rstCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        sendToCDCbtn = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 203, 230));
        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medicine Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 93, 0, 0);
        add(jLabel2, gridBagConstraints);

        dosageField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 39, 0, 0);
        add(dosageField, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dosage & Administration");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 19, 0, 0);
        add(jLabel3, gridBagConstraints);

        nameField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 39, 0, 0);
        add(nameField, gridBagConstraints);

        contraField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 38, 0, 0);
        add(contraField, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraindications");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 77, 0, 0);
        add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Warnings & Precautions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 25, 0, 0);
        add(jLabel8, gridBagConstraints);

        precField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 38, 0, 0);
        add(precField, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Adverse Reactions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 71, 0, 0);
        add(jLabel9, gridBagConstraints);

        adverseReactionField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 38, 0, 0);
        add(adverseReactionField, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Drug Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 80, 0, 0);
        add(jLabel10, gridBagConstraints);

        drugField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 39, 0, 0);
        add(drugField, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clinical Pharmacology");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 39, 0, 0);
        add(jLabel11, gridBagConstraints);

        clinicalField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 39, 0, 0);
        add(clinicalField, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Non-clinical Toxicology");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 26, 0, 0);
        add(jLabel12, gridBagConstraints);

        toxicologyField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 39, 0, 0);
        add(toxicologyField, gridBagConstraints);

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Choose CDC Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 59, 0, 0);
        add(enterpriseLabel1, gridBagConstraints);

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 37, 0, 0);
        add(rstCombo, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE INFORMATION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.ipadx = 263;
        gridBagConstraints.ipady = -7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 39, 0, 39);
        add(jLabel1, gridBagConstraints);

        sendToCDCbtn.setBackground(new java.awt.Color(97, 147, 160));
        sendToCDCbtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sendToCDCbtn.setText("Send to CDC");
        sendToCDCbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCDCbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 171, 56, 0);
        add(sendToCDCbtn, gridBagConstraints);

        btnBack2.setBackground(new java.awt.Color(166, 206, 55));
        btnBack2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed

    private void sendToCDCbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCDCbtnActionPerformed
        if (dosageField.getText().isEmpty() || nameField.getText().isEmpty() || clinicalField.getText().isEmpty() || contraField.getText().isEmpty() || drugField.getText().isEmpty() || precField.getText().isEmpty() || adverseReactionField.getText().isEmpty() || toxicologyField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        }
        LabWorkRequest orderWorkRequest = new LabWorkRequest();
        //        MedInfoDirectory medInfoDirectory = new MedInfoDirectory();
        //        if(medInfoDirectory.getMedInfoList() != null){
            //            medInfoDirectory.addMedInfo(medInfo);
            //        }
        //        else{
            //            medInfoDirectory.addMedInfo(medInfo);
            //        }
        creatingOrder();
        dosageField.setText("");
        nameField.setText("");
        contraField.setText("");
        precField.setText("");
        precField.setText("");
        adverseReactionField.setText("");
        drugField.setText("");
        clinicalField.setText("");
        toxicologyField.setText("");
        JOptionPane.showMessageDialog(null, "Sent to CDC");
    }//GEN-LAST:event_sendToCDCbtnActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        PharmaceuticalAdminWorkArea adminWorkAreaJPanel = new PharmaceuticalAdminWorkArea(userProcessContainer,userAccount, ecosystem);
        userProcessContainer.add("AdminWorkAreaJPanel", adminWorkAreaJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adverseReactionField;
    private javax.swing.JButton btnBack2;
    private javax.swing.JTextField clinicalField;
    private javax.swing.JTextField contraField;
    private javax.swing.JTextField dosageField;
    private javax.swing.JTextField drugField;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField precField;
    private javax.swing.JComboBox<String> rstCombo;
    private javax.swing.JButton sendToCDCbtn;
    private javax.swing.JTextField toxicologyField;
    // End of variables declaration//GEN-END:variables
}
