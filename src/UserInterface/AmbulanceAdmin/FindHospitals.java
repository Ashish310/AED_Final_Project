/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.AmbulanceAdmin;

import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import DisasterMgmtSystem.DisasterMgmtSystem;
import DisasterMgmtSystem.Emergencies.Emergency;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Enterprise.Hospital;
import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.SOSWaitList.SOSWorkRequest;
import java.net.URL;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author shriyadikshith
 */
public class FindHospitals extends javax.swing.JPanel {

    /**
     * Creates new form FindHospitals
     */
    
    private JPanel userProcessContainer;
    private DisasterMgmtSystem system;
    private AppUserAccount account;
    private Network network;
    private Enterprise enterprise;
    private Emergency emergency;
    private SOSWorkRequest workrequest;
    
    
    public FindHospitals(JPanel userProcessContainer, AppUserAccount account, DisasterMgmtSystem system, Network network, Enterprise enterprise, Emergency emergency, SOSWorkRequest workrequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.network = network;
        this.enterprise = enterprise;
        this.emergency = emergency;
        this.workrequest = workrequest;
    }
    
    public URL constructUrl(Network n) {
        try {
            String emergencyLocation = emergency.getLocationOfEmergency().replaceAll("\\s", "");
            StringBuilder hospitalLocation = new StringBuilder();
            for (Hospital h : n.getHospitalList()) {
                String temp = h.getHospitalLocation().replaceAll("\\s", "");
                hospitalLocation.append(temp + "|");
            }
            URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + emergencyLocation + "&destinations=" + hospitalLocation + "&key=AIzaSyAUftFKfNIO2RI64ZJM0joAG6Xtnolpc_8");
            return url;
        } catch (Exception ex) {
            System.out.println("Exception while building url" + ex);
        }
        return null;
    }
    
    public String getResponseString(URL url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            String line, outputString = "";
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            while ((line = reader.readLine()) != null) {
                outputString += line;
            }
            return outputString;
        } catch (Exception ex) {
            System.out.println("Exception while building response" + ex);
        }
        return null;
    }
    
    public void assignDistanceToHospitals(Network n) {
        int count = n.getHospitalList().size();
        try {
            URL url = this.constructUrl(n);
            String outputString = this.getResponseString(url);
            try {
                JSONObject obj = new JSONObject(outputString);
                JSONArray rows = obj.getJSONArray("rows");
                String[] distanceStringArray = new String[count];
                String[] timeStringArray = new String[count];

                for (int i = 0; i < rows.length(); i++) {
                    JSONArray e = rows.getJSONObject(i).getJSONArray("elements");

                    for (int j = 0; j < e.length(); j++) {
                        String dist1;
                        String time1;

                        String distance = e.getJSONObject(j).getJSONObject("distance").getString("text");
                        String time = e.getJSONObject(j).getJSONObject("duration").getString("text");
                        timeStringArray[j] = time;
                        int p1 = distance.indexOf(' ');
                        if (p1 >= 0) {
                            dist1 = distance.substring(0, p1);
                            distanceStringArray[j] = dist1;
                        }

                        int p2 = time.indexOf(' ');
                        if (p2 >= 0) {
                            time1 = time.substring(0, p2);
                            timeStringArray[j] = time1;
                        }
                    }
                }
                for (int i = 0; i < count; i++) {
                    for (int j = 0; j < count; j++) {
                        n.getHospitalList().get(i).setDistanceFromEmergencyLocation(Float.parseFloat(distanceStringArray[i]));
                        n.getHospitalList().get(i).setTimeTakenToReachTheAccidentLoc(Float.parseFloat(timeStringArray[i]));
                    }
                }
            } catch (Exception e) {
                System.out.println("An exception has occurred while processing maps response" + e.getMessage());
            }
            //DistancePojo capRes = new Gson().fromJson(outputString, DistancePojo.class);
        } catch (Exception e) {
            System.err.println("An exception has occurred while trying to calculate distance and time " + e);
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

        jPanel2 = new javax.swing.JPanel();
        assignHospitalBtn = new javax.swing.JButton();
        additionalDetailsTable = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        alertHospitalBtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        assignHospitalBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignHospitalBtn.setText("Assign");
        assignHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignHospitalBtnActionPerformed(evt);
            }
        });

        additionalDetailsTable.setEnabled(false);

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Speciality", "Distance from location (in kms)", "Travel Time (in mins)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
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
        hospitalTable.setEnabled(false);
        additionalDetailsTable.setViewportView(hospitalTable);

        jLabel1.setText("Hospitals");

        alertHospitalBtn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alertHospitalBtn1.setText("Route to Hospital");
        alertHospitalBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertHospitalBtn1ActionPerformed(evt);
            }
        });

        jButton1.setText("Find Distance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)
                        .addGap(84, 84, 84)
                        .addComponent(assignHospitalBtn)
                        .addGap(76, 76, 76)
                        .addComponent(alertHospitalBtn1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(additionalDetailsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(additionalDetailsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alertHospitalBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignHospitalBtnActionPerformed
        // TODO add your handling code here:

        int rowSelected = hospitalTable.getSelectedRow();
        if (rowSelected >= 0) {
            Hospital h = (Hospital) hospitalTable.getValueAt(rowSelected, 0);
            this.emergency.setHp(h);
        }
    }//GEN-LAST:event_assignHospitalBtnActionPerformed

    private void alertHospitalBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertHospitalBtn1ActionPerformed
        // TODO add your handling code here:
        int rowSelected = hospitalTable.getSelectedRow();
        if (rowSelected >= 0) {
            Hospital h = (Hospital) hospitalTable.getValueAt(rowSelected, 0);

            for(AppUserAccount ua: h.getUserAccountDirectory().getUserAccountList()){
                this.workrequest.setReceiver(ua);
                this.emergency.setEmergencyStatus("Routed to Hospital");
                ua.getWorkQueue().getWorkRequestList().add(this.workrequest);
                JOptionPane.showMessageDialog(this,"Emergency routed to the Hospital Admin");
                Date d=new Date();
                this.emergency.setHospitalAlertedDate(d);
            }
        }
    }//GEN-LAST:event_alertHospitalBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        assignDistanceToHospitals(this.network);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane additionalDetailsTable;
    private javax.swing.JButton alertHospitalBtn1;
    private javax.swing.JButton assignHospitalBtn;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
