/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterManagementSystem.Network;

import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Enterprise.EnterpriseDirectory;
import DisasterMgmtSystem.Enterprise.Hospital;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class Network {
    
private String networkName;
    private EnterpriseDirectory entDirObj;
    private ArrayList<Hospital> hospitalList;

    public Network() {
        entDirObj = new EnterpriseDirectory();
        hospitalList = new ArrayList<Hospital>();
    }
     public Network(String name) {
        this.networkName = name;
        entDirObj = new EnterpriseDirectory();
        hospitalList = new ArrayList<Hospital>();

    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    @Override
    public String toString() {
        return networkName;
    }

    public EnterpriseDirectory getEntDirObj() {
        return entDirObj;
    }

    public void setEntDirObj(EnterpriseDirectory entDirObj) {
        this.entDirObj = entDirObj;
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalEnterpriseList) {
        this.hospitalList = hospitalEnterpriseList;
    }

    public Hospital addHospital(String name) {
        Hospital h = null;
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (type.getValue().equals("Hospital Enterprise")) {
                h = new Hospital(name, type);
                hospitalList.add(h);

            }
        }
        return h;

    }
    
}
