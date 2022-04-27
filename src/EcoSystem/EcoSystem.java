/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem;

import EcoSystem.Account.AccountDirectory;
import EcoSystem.AmbulanceDriver.AmbulanceDriverDirectory;
import EcoSystem.Doctor.DoctorDirectory;
import EcoSystem.Government.MunicipalityDirectory;
import EcoSystem.Hospital.HospitalAdminDirectory;
import EcoSystem.LabAssistant.LabAssistantDirectory;
import EcoSystem.MedicalInformation.MedicalInformationDirectory;
import EcoSystem.Patient.PatientDirectory;
import EcoSystem.Pharmaceutical.PharmaceuticalDirectory;
import EcoSystem.Pharmacy.PharmacyDirectory;
import EcoSystem.Porter.PorterDirectory;
import EcoSystem.Reception.ReceptionDirectory;
import EcoSystem.Role.Role;
import EcoSystem.Role.SysAdminRole;
import EcoSystem.WorkList.WorkList;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PharmacyDirectory pharmacyDirectory;
    private PatientDirectory patientDirectory;
    private PorterDirectory deliveryManDirectory;
    private HospitalAdminDirectory hospitalDirectory;
    
    private MunicipalityDirectory governmentDirectory;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private DoctorDirectory doctorDirectory;
    private ReceptionDirectory receptionDirectory;
    private AmbulanceDriverDirectory ambulanceDriverDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private AccountDirectory accountDirectory;
    private MedicalInformationDirectory medInfoDirectory;
    private WorkList workQueue;
    
    
    public EcoSystem(PharmacyDirectory pharmacyDirectory,MedicalInformationDirectory medInfoDirectory,AccountDirectory accountDirectory,LabAssistantDirectory labAssistantDirectory,AmbulanceDriverDirectory ambulanceDriverDirectory, PatientDirectory patientDirectory, PorterDirectory deliveryManDirectory,HospitalAdminDirectory hospitalDirectory,MunicipalityDirectory governmentDirectory,PharmaceuticalDirectory pharmaceuticalDirectory,DoctorDirectory doctorDirectory,ReceptionDirectory receptionDirectory,WorkList workQueue) {
        this.pharmacyDirectory = pharmacyDirectory;
        this.patientDirectory = patientDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.governmentDirectory = governmentDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.pharmaceuticalDirectory = pharmaceuticalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.receptionDirectory = receptionDirectory;
        this.ambulanceDriverDirectory = ambulanceDriverDirectory;
        this.labAssistantDirectory = labAssistantDirectory;
        this.accountDirectory = accountDirectory;
        this.medInfoDirectory = medInfoDirectory;
        
        this.workQueue = workQueue;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        //networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      if(!this.getUserAccountDirectory().checkUsernameUnique(userName)){
            return false;
        }
       return true;
    }
    
}
