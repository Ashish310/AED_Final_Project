/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LabAssisstant;

import EcoSystem.EcoSystem;
import EcoSystem.UserAccount.UserAccount;
import EcoSystem.WorkList.LabWorkRequest;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JPanel;

/**
 *
 * @author shriyadikshith
 */
public class ProcessWorkRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    LabWorkRequest workRequest;
    LabWorkRequest labTestWorkRequest;
    Random r = new Random();
    String[] report = {"Normal","Below Normal","Above Normal","Visit the Doctor"};
    private int index = -1;
    public ProcessWorkRequestPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, LabWorkRequest workRequest) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.workRequest = workRequest;
        fillTest();
        changeButtonText();
        display();
    }
    
    private void fillTest(){
        comboRstTest.addItem("X-ray");
        comboRstTest.addItem("Blood Test");
        comboRstTest.addItem("Urine Test");
        comboRstTest.addItem("Stool Test");
        comboRstTest.addItem("Swab Test");
        comboRstTest.addItem("CT-scan");
        comboRstTest.addItem("Sonography Test");
        comboRstTest.addItem("MRI");
    }

    private void display() {

        customerNameValue.setText(workRequest.getHospitalAdmin().getName());
        status.setText(workRequest.getStatus());

    }

    private void changeButtonText() {
        switch (workRequest.getStatus()) {
            case "Request to LabAssistant":
                btnStatus.setText("Start Lab");
                break;
            case "Lab in Process":
                btnStatus.setText("Complete Lab Results");
                break;
            default:
                btnStatus.setVisible(false);
        }
    }
    
    private void sendMail(){
        String from = "bhiwanderahul71@gmail.com";
        String pass = "Rahul@1997";
        String[] to = { workRequest.getPatient().getEmail() }; // list of recipient email addresses
        String subject = "LAB RESULTS";
        String body = workRequest.getTestType()+" results are "+report[r.nextInt(4)];

        sendFromGMail(from, pass, to, subject, body);
    }
    
    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
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

        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        customerNameValue = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        comboRstTest = new javax.swing.JComboBox<>();
        btnStatus = new javax.swing.JButton();
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
        jButton1.setBounds(47, 49, 63, 25);

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LAB DETAILS");
        add(jLabel9);
        jLabel9.setBounds(136, 35, 567, 41);

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Status");
        add(jLabel5);
        jLabel5.setBounds(199, 194, 47, 21);

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admin Name");
        add(jLabel3);
        jLabel3.setBounds(136, 154, 105, 21);

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Select Test");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(160, 240, 82, 21);

        customerNameValue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        customerNameValue.setText("<Value>");
        add(customerNameValue);
        customerNameValue.setBounds(297, 154, 255, 21);

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<Value>");
        add(status);
        status.setBounds(297, 194, 255, 21);

        comboRstTest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboRstTest);
        comboRstTest.setBounds(300, 240, 136, 22);

        btnStatus.setText("START LAB");
        add(btnStatus);
        btnStatus.setBounds(230, 290, 89, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssisstant/lab2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(500, 120, 280, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatus;
    private javax.swing.JComboBox<String> comboRstTest;
    private javax.swing.JLabel customerNameValue;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
