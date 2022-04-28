/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoSystem;

import EcoSystem.Account.AccountDirectory;
import EcoSystem.AmbulanceDriver.AmbulanceDriverDirectory;
import EcoSystem.Porter.PorterDirectory;
import EcoSystem.Doctor.DoctorDirectory;
import EcoSystem.Employee.EmployeeDirectory;
import EcoSystem.Government.MunicipalityDirectory;
import EcoSystem.Hospital.HospitalAdminDirectory;
import EcoSystem.LabAssistant.LabAssistantDirectory;
import EcoSystem.MedicalInformation.MedicalInformationDirectory;
import EcoSystem.Patient.PatientDirectory;
import EcoSystem.Pharmaceutical.PharmaceuticalDirectory;
import EcoSystem.Pharmacy.PharmacyDirectory;
import EcoSystem.Pharmacy.PharmacyInventory;
import EcoSystem.Reception.ReceptionDirectory;
import EcoSystem.Role.Role;
import EcoSystem.UserAccount.UserAccountDirectory;
import EcoSystem.WorkList.WorkList;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public abstract class Organization {
    private String name;
    private WorkList workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private PorterDirectory deliveryManDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private MunicipalityDirectory governmentDirectory;
    private HospitalAdminDirectory hospitalDirectory;
    private DoctorDirectory doctorDirectory;
    private ReceptionDirectory receptionDirectory;
    private AmbulanceDriverDirectory ambulanceDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private AccountDirectory accountDirectory; 
    private MedicalInformationDirectory medInfoDirectory;
    private PharmacyInventory itemList;
    
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        PharmacyAdmin("PharmacyAdmin"),
        HospitalAdmin("HospitalAdmin"),
        PharmaceuticalAdmin("PharmaceuticalAdmin"),
        GovernmentAdmin("GovernmentAdmin"),
        Patient("Patient"),
        Doctor("Doctor"),
        Reception("Reception"),
        Ambulance("Ambulance"),
        Lab("Lab"),
        Account("Account"),
        DeliveryMan("Delivery"),

        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        deliveryManDirectory = new PorterDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        doctorDirectory = new DoctorDirectory();
        receptionDirectory = new ReceptionDirectory();
        ambulanceDirectory = new AmbulanceDriverDirectory();
        labAssistantDirectory = new LabAssistantDirectory();
        accountDirectory = new AccountDirectory();
        hospitalDirectory = new HospitalAdminDirectory();
        governmentDirectory = new MunicipalityDirectory();
        pharmaceuticalDirectory = new PharmaceuticalDirectory();
        medInfoDirectory = new MedicalInformationDirectory();
        
        itemList = new PharmacyInventory();
        organizationID = counter;
        ++counter;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public LabAssistantDirectory getLabAssistantDirectory() {
        return labAssistantDirectory;
    }

    public MedicalInformationDirectory getMedInfoDirectory() {
        return medInfoDirectory;
    }

    public void setMedInfoDirectory(MedicalInformationDirectory medInfoDirectory) {
        this.medInfoDirectory = medInfoDirectory;
    }
    
    public void setLabAssistantDirectory(LabAssistantDirectory labAssistantDirectory) {
        this.labAssistantDirectory = labAssistantDirectory;
    }

    
    

    public AmbulanceDriverDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDriverDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public ReceptionDirectory getReceptionDirectory() {
        return receptionDirectory;
    }

    public void setReceptionDirectory(ReceptionDirectory receptionDirectory) {
        this.receptionDirectory = receptionDirectory;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkList getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkList workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PorterDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(PorterDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    public PharmaceuticalDirectory getPharmaceuticalDirectory() {
        return pharmaceuticalDirectory;
    }

    public void setPharmaceuticalDirectory(PharmaceuticalDirectory pharmaceuticalDirectory) {
        this.pharmaceuticalDirectory = pharmaceuticalDirectory;
    }

    public PharmacyInventory getItemList() {
        return itemList;
    }

    public void setItemList(PharmacyInventory itemList) {
        this.itemList = itemList;
    }
    
    public MunicipalityDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(MunicipalityDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }

    public HospitalAdminDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalAdminDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
}
