/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterMgmtSystem.Ambulance.Ambulance;
import DisasterMgmtSystem.AppUserAccount.AppUserAccount;
import DisasterMgmtSystem.EmergencyLocation.EmergencyLocation;
import DisasterMgmtSystem.Employement.AmbulanceDriver;
import DisasterMgmtSystem.Employement.Doctor;
import DisasterMgmtSystem.Employement.Employee;
import DisasterMgmtSystem.Employement.EnterpriseAdmin;
import DisasterMgmtSystem.Employement.HospitalEnterpriseAdmin;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Enterprise.Enterprise.EnterpriseType;
import DisasterMgmtSystem.Enterprise.Hospital;
import DisasterMgmtSystem.Enterprise.PoliceAdministrator;
import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.Organizations.AmbulanceMgmtOrganization;
import DisasterMgmtSystem.Organizations.DoctorOrganization;
import DisasterMgmtSystem.Organizations.Organization;
import DisasterMgmtSystem.Organizations.Organization.Type;
import DisasterMgmtSystem.Roles.AmbulanceRole;
import DisasterMgmtSystem.Roles.ApplicationAdministrator;
import DisasterMgmtSystem.Roles.DisasterReporter;
import DisasterMgmtSystem.Roles.DoctorRole;
import DisasterMgmtSystem.Roles.HospitalAdmin;
import DisasterMgmtSystem.Roles.PoliceAdmin;
import DisasterMgmtSystem.Roles.PoliceEnterpriseAdminRole;
import DisasterMgmtSystem.Victim.Victim;
import UserInterface.AppAdminArea.AppAdminWorkArea;

/**
 *
 * @author hs_sa
 */
public class SystemConfig {
    
    public static DisasterMgmtSystem config()
    {
        
        DisasterMgmtSystem system = DisasterMgmtSystem.getInstance();
        
        Employee reporter = new Employee("Reporter");
        system.getEmployeeDirectory().createEmployee(reporter);
        AppUserAccount reporterUa = system.getUserAccountDirectory().createUserAccount("reporter", "reporter", reporter, new DisasterReporter());
        
        Employee appadmin=new Employee();
        appadmin.setName("App Admin");
        system.getEmployeeDirectory().createEmployee(appadmin);
        AppUserAccount esadmin_ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", appadmin, new ApplicationAdministrator());
        
        //Creating boston network
        Network n1=system.addNetwork();
        n1.setNetworkName("Boston");
        
        //Creating person directory
        Victim p1=system.getPersonDirectory().addPerson();
        p1.setName("Vasanti Mahajan");
        p1.setAge(23);
        p1.setAddress("44 Clearway street");
        p1.setCarOwned("Honda City");
        p1.setDriversLicenseNumber(871453548);
        p1.setLicensePlateNumber("FP1744");
        p1.setPhoneNumber("6319441865");
        p1.setEmergencyContactNumber("6319441700");
        p1.setPhoto("Images/person1.jpg");
        
        
        Victim p2=system.getPersonDirectory().addPerson();
        p2.setName("Shradha Mahajan");
        p2.setAge(27);
        p2.setAddress("75 st alphonsous street");
        p2.setCarOwned("Mercedes Benz");
        p2.setDriversLicenseNumber(665497258);
        p2.setLicensePlateNumber("CI0000");
        p2.setPhoneNumber("6319771865");
        p2.setEmergencyContactNumber("6319441700");
        p2.setPhoto("Images/person2.jpg");
        
        Victim p3=system.getPersonDirectory().addPerson();
        p3.setName("Vinayak Mahajan");
        p3.setAge(58);
        p3.setAddress("32 Church St, Cambridge");
        p3.setCarOwned("Audi");
        p3.setDriversLicenseNumber(354876495);
        p3.setLicensePlateNumber("RT72LY");
        p3.setPhoneNumber("6319778965");
        p3.setEmergencyContactNumber("6319441700");
        p3.setPhoto("Images/person3.jpg");
        
        Victim p4=system.getPersonDirectory().addPerson();
        p4.setName("Nilima Mahajan");
        p4.setAge(48);
        p4.setAddress("99 Albion St, Somerville");
        p4.setCarOwned("Jaguar");
        p4.setDriversLicenseNumber(879876495);
        p4.setLicensePlateNumber("40559F");
        p4.setPhoneNumber("6319879965");
        p4.setEmergencyContactNumber("6319441700");
        p4.setPhoto("Images/person4.jpg");
        
        Victim p5=system.getPersonDirectory().addPerson();
        p5.setName("Aniruddh Jani");
        p5.setAge(28);
        p5.setAddress("20 Reservoir Rd, Quincy");
        p5.setCarOwned("BMW");
        p5.setDriversLicenseNumber(754896495);
        p5.setLicensePlateNumber("BR2515");
        p5.setPhoneNumber("6719879965");
        p5.setEmergencyContactNumber("6319441700");
        p5.setPhoto("Images/person5.jpg");
        
        Victim p6=system.getPersonDirectory().addPerson();
        p6.setName("Dhaval Jani");
        p6.setAge(32);
        p6.setAddress("1037 Southern Artery, Quincy");
        p6.setCarOwned("Toyota");
        p6.setDriversLicenseNumber(879896495);
        p6.setLicensePlateNumber("PL2020");
        p6.setPhoneNumber("6718799965");
        p6.setEmergencyContactNumber("6319441700");
        p6.setPhoto("Images/person6.png");
        
        Enterprise.EnterpriseType type1_n2 = EnterpriseType.EMEREGENCY911ENTERPRISE;
        Enterprise enterprisen2_2 = n1.getEntDirObj().createAndAddEnterprise("BostonPSAP", type1_n2, "360 Huntington Ave, Boston, MA 02115" );
        
        Enterprise.EnterpriseType type2_n2 = EnterpriseType.POLICEENTERPRISE;
        Enterprise enterprisen2_3 = n1.getEntDirObj().createAndAddEnterprise("BostonPolice", type2_n2, "" );
        
       //Creation of boston enterprise admin
        EnterpriseAdmin bostonpsapAdmin=new EnterpriseAdmin();
        enterprisen2_2.getEmployeeDirectory().createEmployee(bostonpsapAdmin);
        enterprisen2_2.getUserAccountDirectory().createUserAccount("bostonpsap", "bostonpsap", bostonpsapAdmin, new PoliceEnterpriseAdminRole());
        
        
        EnterpriseAdmin bostonPoliceAdmin=new EnterpriseAdmin();
        enterprisen2_3.getEmployeeDirectory().createEmployee(bostonPoliceAdmin);
        enterprisen2_3.getUserAccountDirectory().createUserAccount("bospoliceadmin", "bospoliceadmin", bostonPoliceAdmin, new PoliceAdmin());
        bostonPoliceAdmin.setAvailable(true);
        
        
        Enterprise.EnterpriseType ambE1 = EnterpriseType.AmbulanceAdminEnterprise;
        Enterprise ambE_1 = n1.getEntDirObj().createAndAddEnterprise("Ambulance1", ambE1, "360 Huntington Ave, Boston, MA 02115" );
        
       //Creation of boston enterprise admin
        EnterpriseAdmin ambad=new EnterpriseAdmin();
        enterprisen2_2.getEmployeeDirectory().createEmployee(ambad);
        enterprisen2_2.getUserAccountDirectory().createUserAccount("ambadmin", "ambadmin", ambad, new AmbulanceRole());
           
        
        //creating hospitals in the network
        

        Hospital h1_2=n1.addHospital("Brigham and Womens Hospital");
        h1_2.setHospitalName("Brigham and Womens Hospital");
        h1_2.setHospitalLocation("75 Francis St, Boston, MA 02115");
        h1_2.setSpeciality("Orthopedic");
        
        
        
        
        Hospital h1_3=n1.addHospital("Beth Israel Deaconess Medical Center");
        h1_3.setHospitalName("Beth Israel Deaconess Medical Center");
        h1_3.setHospitalLocation("330 Brookline Ave, Boston, MA 02215");
        h1_3.setSpeciality("Neurology");
       
        
        Hospital h1_4=n1.addHospital("Shriners Hospitals for Children");
        h1_4.setHospitalName("Shriners Hospitals for Children");
        h1_4.setHospitalLocation("51 Blossom St, Boston, MA 02115");
        h1_4.setSpeciality("Cardiothoracic");
       
        
        Hospital h1_5=n1.addHospital("Fenway health center");
        h1_5.setHospitalName("Fenway health center");
        h1_5.setHospitalLocation("1340 Boylston St, Boston, MA 02215");
        h1_5.setSpeciality("Allergist");
       
        
         //creating hospital enterprise admin
        HospitalEnterpriseAdmin h1n1=new HospitalEnterpriseAdmin();
        h1n1.setName("BrighamAdmin");
        h1_2.getEmployeeDirectory().createEmployee(h1n1);
        h1_2.getUserAccountDirectory().createUserAccount("brighamadmin", "brighamadmin", h1n1, new HospitalAdmin());

        HospitalEnterpriseAdmin h2n1=new HospitalEnterpriseAdmin();
        h2n1.setName("BethAdmin");
        h1_3.getEmployeeDirectory().createEmployee(h2n1);
        h1_3.getUserAccountDirectory().createUserAccount("bethadmin", "bethadmin", h2n1, new HospitalAdmin());
         
        HospitalEnterpriseAdmin h3n1=new HospitalEnterpriseAdmin();
        h3n1.setName("ShrinersAdmin");
      
        h1_4.getEmployeeDirectory().createEmployee(h3n1);
        h1_4.getUserAccountDirectory().createUserAccount("shrinersadmin", "shrinersadmin", h3n1, new HospitalAdmin());
         
        HospitalEnterpriseAdmin h4n1=new HospitalEnterpriseAdmin();
        h4n1.setName("FenwayAdmin");
        h1_5.getEmployeeDirectory().createEmployee(h4n1);
        h1_5.getUserAccountDirectory().createUserAccount("fenwayadmin", "fenwayadmin", h4n1, new HospitalAdmin());
         
        
        //creating doctor employees and ambulance employees
        h1_2.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h1_2.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        
        Doctor d1_n1=new Doctor();
        d1_n1.setName("BRDoc1");
        d1_n1.setDoctorsAvailablityStatus(true);
        d1_n1.setDoctorsSpeciality("Car accident-Body Injury");
        
        Doctor d2_n1=new Doctor();
        d2_n1.setName("BRDoc2");
        d2_n1.setDoctorsAvailablityStatus(true);
        d2_n1.setDoctorsSpeciality("Car accident-Head Injury");
        
        
        
       for(Organization org: h1_2.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d1_n1);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d2_n1);
               
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("brdoc1", "brdoc1", d1_n1, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("brdoc2", "brdoc2", d2_n1, new DoctorRole());
               
              
           }
       }
        h1_3.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h1_3.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        
        Doctor d3_n1=new Doctor();
        d3_n1.setName("BEDoc1");
        d3_n1.setDoctorsAvailablityStatus(true);
        d3_n1.setDoctorsSpeciality("Car accident-Head Injury");
        
        Doctor d4_n1=new Doctor();
        d4_n1.setName("BEDoc2");
        d4_n1.setDoctorsAvailablityStatus(true);
        d4_n1.setDoctorsSpeciality("Heart attack");
        
         for(Organization org: h1_3.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d3_n1);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d4_n1);
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("bedoc1", "bedoc1", d3_n1, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("bedoc2", "bedoc2", d4_n1, new DoctorRole());
           
           }
       }
        
        h1_4.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h1_4.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        
        Doctor d5_n1=new Doctor();
        d5_n1.setName("SHDoc1");
        d5_n1.setDoctorsAvailablityStatus(true);
        d5_n1.setDoctorsSpeciality("Heart attack");
        
        Doctor d6_n1=new Doctor();
        d6_n1.setName("SHDoc2");
        d6_n1.setDoctorsAvailablityStatus(true);
        d6_n1.setDoctorsSpeciality("Asthama attack");
        
         for(Organization org: h1_4.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d5_n1);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d6_n1);
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("shdoc1", "shdoc1", d5_n1, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("shdoc2", "shdoc2", d6_n1, new DoctorRole());
               
        
           }
           
       }
         
         
        h1_5.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h1_5.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
         
        Doctor d7_n1=new Doctor();
        d7_n1.setName("FEDoc1");
        d7_n1.setDoctorsAvailablityStatus(true);
        d7_n1.setDoctorsSpeciality("Asthama attack");
        
        Doctor d8_n1=new Doctor();
        d8_n1.setName("FEDoc2");
        d8_n1.setDoctorsAvailablityStatus(true);
        d8_n1.setDoctorsSpeciality("Heart attack");
        
         for(Organization org: h1_5.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
                
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d7_n1);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d8_n1);
               
                
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("fedoc1", "fedoc1", d7_n1, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("fedoc2", "fedoc2", d8_n1, new DoctorRole());

           }
       }
     
        //creating ambulances in the network
        Organization ambulanceOrg_n1=null;
         for (Type type : Organization.Type.values())
         {
            if (type.getValue().equals(Type.AMBULANCEADMIN.getValue()))
            {
          
                ambulanceOrg_n1=((PoliceAdministrator)(enterprisen2_2)).getOrganizationDirectory().createOrganization(type);
            
            }
         }
         
         //creating ambulance stations in bostonpsap enterprise
        Ambulance bostonAmbulanceStation1=null;
        Ambulance bostonAmbulanceStation2=null;
        Ambulance bostonAmbulanceStation3=null;
        for(Organization org:((PoliceAdministrator)enterprisen2_2).getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof AmbulanceMgmtOrganization)
            {
                bostonAmbulanceStation1=((AmbulanceMgmtOrganization)org).getAmbulanceDirectoryObject().addAmbulanceStation();
                bostonAmbulanceStation1.setAmbulanceStationName("Boston Ambulance Station 1");
                bostonAmbulanceStation1.setAmbulanceStationAddress("68 William Cardinal O'Connell Way, Boston, MA 02114");
       
                 bostonAmbulanceStation2=((AmbulanceMgmtOrganization)org).getAmbulanceDirectoryObject().addAmbulanceStation();
                 bostonAmbulanceStation2.setAmbulanceStationName("Boston Ambulance Station 2");
                 bostonAmbulanceStation2.setAmbulanceStationAddress("4 Yawkey Way, Boston, MA 02215");
            
                 bostonAmbulanceStation3=((AmbulanceMgmtOrganization)org).getAmbulanceDirectoryObject().addAmbulanceStation();
                 bostonAmbulanceStation3.setAmbulanceStationName("Boston Ambulance Station 3");
                 bostonAmbulanceStation3.setAmbulanceStationAddress("300 Fenway, Boston, MA 02115");
            }
        }
        
        //adding ambulances to ambulance station
        AmbulanceDriver d1n1=new AmbulanceDriver();
        d1n1.setAmbulanceId("Ambulance_Boston100");
        d1n1.setStatus("Active");
        bostonAmbulanceStation1.addAmbulanceDriver(d1n1);
       
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d1n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos100", "ambulancebos100", d1n1, new AmbulanceRole() );
      

        AmbulanceDriver d2n1= new AmbulanceDriver();
        d2n1.setAmbulanceId("Ambulance_Boston200");
        d2n1.setStatus("Assigned");
        bostonAmbulanceStation1.addAmbulanceDriver(d2n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d2n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos200", "ambulancebos200", d2n1, new AmbulanceRole() );
      
        
        AmbulanceDriver d3n1= new AmbulanceDriver();
        d3n1.setAmbulanceId("Ambulance_Boston300");
        d3n1.setStatus("Active");
        bostonAmbulanceStation1.addAmbulanceDriver(d3n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d3n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos300", "ambulancebos300", d3n1, new AmbulanceRole() );
      
        
        AmbulanceDriver d4n1= new AmbulanceDriver();
        d4n1.setAmbulanceId("Ambulance_Boston400");
        d4n1.setStatus("Assigned");
        bostonAmbulanceStation1.addAmbulanceDriver(d4n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d4n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos400", "ambulancebos400", d4n1, new AmbulanceRole() );
      
        
        AmbulanceDriver d5n1=new AmbulanceDriver();
        d5n1.setAmbulanceId("Ambulance_Boston500");
        d5n1.setStatus("Active");
        bostonAmbulanceStation1.addAmbulanceDriver(d5n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d5n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos500", "ambulancebos500", d5n1, new AmbulanceRole() );

       
        AmbulanceDriver d6n1=new AmbulanceDriver();
              
        d6n1.setAmbulanceId("Ambulance_Boston600");
        d6n1.setStatus("Active");
        bostonAmbulanceStation2.addAmbulanceDriver(d6n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d6n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos600", "ambulancebos600", d6n1, new AmbulanceRole() );
      
        AmbulanceDriver d7n1=new AmbulanceDriver();
        d7n1.setAmbulanceId("Ambulance_Boston700");
        d7n1.setStatus("Active");
        bostonAmbulanceStation2.addAmbulanceDriver(d7n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d7n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos700", "ambulancebos700", d7n1, new AmbulanceRole() );
      
        
        
        AmbulanceDriver d8n1= new AmbulanceDriver();
        d8n1.setAmbulanceId("Ambulance_Boston800");
        d8n1.setStatus("Active");
        bostonAmbulanceStation2.addAmbulanceDriver(d8n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d8n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos800", "ambulancebos800", d8n1, new AmbulanceRole() );
      
        
        
        AmbulanceDriver d9n1=new AmbulanceDriver();
        d9n1.setAmbulanceId("Ambulance_Boston900");
        d9n1.setStatus("Active");
        bostonAmbulanceStation3.addAmbulanceDriver(d9n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d9n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos900", "ambulancebos900", d9n1, new AmbulanceRole() );
      
        
        AmbulanceDriver d10n1= new AmbulanceDriver();
        d10n1.setAmbulanceId("Ambulance_Boston1000");
        d10n1.setStatus("Active");
        bostonAmbulanceStation3.addAmbulanceDriver(d10n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d10n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos1000", "ambulancebos1000", d10n1, new AmbulanceRole() );
      
        
        AmbulanceDriver d11n1= new AmbulanceDriver();
        d11n1.setAmbulanceId("Ambulance_Boston1100");
        d11n1.setStatus("Active");
        bostonAmbulanceStation3.addAmbulanceDriver(d11n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d11n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos1100", "ambulancebos1100", d11n1, new AmbulanceRole() );
      
      
        AmbulanceDriver d12n1= new AmbulanceDriver();
        d12n1.setAmbulanceId("Ambulance_Boston1200");
        d12n1.setStatus("Active");
        bostonAmbulanceStation3.addAmbulanceDriver(d12n1);
        ambulanceOrg_n1.getEmployeeDirectory().createEmployee(d12n1);
        ambulanceOrg_n1.getUserAccountDirectory().createUserAccount("ambulancebos1200", "ambulancebos1200", d12n1, new AmbulanceRole() );
        
        
        Network n2=system.addNetwork();
        n2.setNetworkName("Cambridge");
        
        //Creating enterprises in cambridge network

        Enterprise.EnterpriseType type3_n2 = EnterpriseType.EMEREGENCY911ENTERPRISE;
        Enterprise enterprise_n2_2 = n2.getEntDirObj().createAndAddEnterprise("CambridgePSAP",type3_n2,"1350 Massachusetts Avenue. Cambridge, MA 02138" );
      
        Enterprise.EnterpriseType type4_n2 = EnterpriseType.POLICEENTERPRISE;
        Enterprise enterprisen2_4 = n2.getEntDirObj().createAndAddEnterprise("CambridgePolice",type4_n2,"" );
        //creating cambridge enterprise admin 
        EnterpriseAdmin cambridgepsapAdmin=new EnterpriseAdmin();
        enterprise_n2_2.getEmployeeDirectory().createEmployee(cambridgepsapAdmin);
        enterprise_n2_2.getUserAccountDirectory().createUserAccount("cambridgepsap", "cambridgepsap", cambridgepsapAdmin, new PoliceEnterpriseAdminRole());
        
        EnterpriseAdmin cambridgePoliceAdmin=new EnterpriseAdmin();
        enterprisen2_4.getEmployeeDirectory().createEmployee(cambridgePoliceAdmin);
        enterprisen2_4.getUserAccountDirectory().createUserAccount("campoliceadmin", "campoliceadmin", cambridgePoliceAdmin, new PoliceAdmin());
        cambridgePoliceAdmin.setAvailable(true);

      //hospital creation  
      
        Hospital h2_1=n2.addHospital("CHA Cambridge Hospital campus");
        h2_1.setHospitalName("CHA Cambridge Hospital campus");
        h2_1.setHospitalLocation("1493 Cambridge St, Cambridge, MA 02139");
        h2_1.setSpeciality("Neurology");
     
        
        Hospital h2_2=n2.addHospital("Spaulding Hospital Cambridge");
        h2_2.setHospitalName("Spaulding Hospital Cambridge");
        h2_2.setHospitalLocation("1575 Cambridge St, Cambridge, MA 02138");
        h2_2.setSpeciality("Cardiothoracic");
        
        
        Hospital h2_3=n2.addHospital("Mount Auburn Hospital: Walk-In Center");
        h2_3.setHospitalName("Mount Auburn Hospital: Walk-In Center");
        h2_3.setHospitalLocation("330 Mt Auburn St, Cambridge, MA 02138");
        h2_3.setSpeciality("Plastics");

        
       //creatinh hospital admins
        
        HospitalEnterpriseAdmin h1n2=new HospitalEnterpriseAdmin();
        h1n2.setName("CHACambridgeAdmin");
        h2_1.getEmployeeDirectory().createEmployee(h1n2);
        h2_1.getUserAccountDirectory().createUserAccount("chacamadmin", "chacamadmin", h1n2, new HospitalAdmin());
         
        HospitalEnterpriseAdmin h2n2=new HospitalEnterpriseAdmin();
        h2n2.setName("SpauldingAdmin");
        h2_2.getEmployeeDirectory().createEmployee(h2n2);
        h2_2.getUserAccountDirectory().createUserAccount("spauldingadmin", "spauldingadmin", h2n2, new HospitalAdmin());
         
        HospitalEnterpriseAdmin h3n2=new HospitalEnterpriseAdmin();
        h3n2.setName("MountAdmin");
        h2_3.getEmployeeDirectory().createEmployee(h3n2);
        h2_3.getUserAccountDirectory().createUserAccount("mountadmin", "mountadmin", h3n2, new HospitalAdmin());
         
         
        //creating doctor employees and ambulance employees
       
        h2_1.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h2_1.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        Doctor d1_n2=new Doctor();
        d1_n2.setName("CHACAMDoc1");
        d1_n2.setDoctorsAvailablityStatus(true);
        d1_n2.setDoctorsSpeciality("Car accident-Head Injury");
        
        Doctor d2_n2=new Doctor();
        d2_n2.setName("CHACAMDoc2");
        d2_n2.setDoctorsAvailablityStatus(true);
        d2_n2.setDoctorsSpeciality("Heart attack");
       
        
       for(Organization org: h2_1.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d1_n2);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d2_n2);
              
              
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("chacamdoc1", "chacamdoc1", d1_n2, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("chacamdoc2", "chacamdoc2", d2_n2, new DoctorRole());
               
              
               
           }
       }
       
       
        h2_2.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h2_2.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        Doctor d3_n2=new Doctor();
        d3_n2.setName("SPDoc1");
        d3_n2.setDoctorsAvailablityStatus(true);
        d3_n2.setDoctorsSpeciality("Heart attack");
        
        Doctor d4_n2=new Doctor();
        d4_n2.setName("SPDoc2");
        d4_n2.setDoctorsAvailablityStatus(true);
        d4_n2.setDoctorsSpeciality("Fire");
       
       for(Organization org: h2_2.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d3_n2);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d4_n2);
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("spdoc1", "spdoc1", d3_n2, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("spdoc2", "spdoc2", d4_n2, new DoctorRole());
           }
       }
           
        h2_3.getOrganizationDirectory().createOrganization(Type.DOCTOR);
        h2_3.getOrganizationDirectory().createOrganization(Type.AMBULANCEADMIN);
        
        Doctor d5_n2=new Doctor();
        d5_n2.setName("MODoc1");
        d5_n2.setDoctorsAvailablityStatus(true);
        d5_n2.setDoctorsSpeciality("Fire");
      
        
        Doctor d6_n2=new Doctor();
        d6_n2.setName("MODoc2");
        d6_n2.setDoctorsAvailablityStatus(true);
        d6_n2.setDoctorsSpeciality("Car accident-Head Injury");
        
        for(Organization org: h2_3.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof DoctorOrganization)
           {
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d5_n2);
               ((DoctorOrganization)org).getEmployeeDirectory().createEmployee(d6_n2);
               
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("modoc1", "modoc1", d5_n2, new DoctorRole());
               ((DoctorOrganization)org).getUserAccountDirectory().createUserAccount("modoc2", "modoc2", d6_n2, new DoctorRole());

           }
       }
      
       
        //ambulance creation
         Organization ambulanceOrg_n2=null;
         for (Type type : Organization.Type.values())
         {
            if (type.getValue().equals(Type.AMBULANCEADMIN.getValue()))
            {
            ambulanceOrg_n2=((PoliceAdministrator)(enterprise_n2_2)).getOrganizationDirectory().createOrganization(type);
            }
        }
         
       //creating cambridge ambulance stations  
       Ambulance cambridgeAmbulanceStation1=null;
        
        for(Organization org:((PoliceAdministrator)enterprise_n2_2).getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof AmbulanceMgmtOrganization)
            {
                cambridgeAmbulanceStation1=((AmbulanceMgmtOrganization)org).getAmbulanceDirectoryObject().addAmbulanceStation();
                cambridgeAmbulanceStation1.setAmbulanceStationName("Cambridge Ambulance Station 1");
                cambridgeAmbulanceStation1.setAmbulanceStationAddress("1350 Massachusetts Avenue. Cambridge, MA 02138 ");
                 
            }
        }
        
      
      
        //adding ambulances to cambridge ambulance station
        AmbulanceDriver d1n2=new AmbulanceDriver();
        
        d1n2.setAmbulanceId("Ambulance_Cambrideg100");
        d1n2.setStatus("Active");
        cambridgeAmbulanceStation1.addAmbulanceDriver(d1n2);
        ambulanceOrg_n2.getEmployeeDirectory().createEmployee(d1n2);
        ambulanceOrg_n2.getUserAccountDirectory().createUserAccount("ambulancecam100", "ambulancecam100", d1n2, new AmbulanceRole() );
     
        
        AmbulanceDriver d2n2= new AmbulanceDriver();
        d2n2.setAmbulanceId("Ambulance_Cambridge200");
        d2n2.setStatus("Active");
        cambridgeAmbulanceStation1.addAmbulanceDriver(d2n2);
        ambulanceOrg_n2.getEmployeeDirectory().createEmployee(d2n2);
        ambulanceOrg_n2.getUserAccountDirectory().createUserAccount("ambulancecam200", "ambulancecam200", d2n2, new AmbulanceRole() );
     
        
        AmbulanceDriver d3n2= new AmbulanceDriver();
        d3n2.setAmbulanceId("Ambulance_Cambridge300");
        d3n2.setStatus("Active");
         cambridgeAmbulanceStation1.addAmbulanceDriver(d3n2);
        ambulanceOrg_n2.getEmployeeDirectory().createEmployee(d3n2);
        ambulanceOrg_n2.getUserAccountDirectory().createUserAccount("ambulancecam300", "ambulancecam300", d3n2, new AmbulanceRole() );
     
        
        AmbulanceDriver d4n2=new AmbulanceDriver();
        d4n2.setAmbulanceId("Ambulance_Cambridge400");
        d4n2.setStatus("Active");
        cambridgeAmbulanceStation1.addAmbulanceDriver(d4n2);
        ambulanceOrg_n2.getEmployeeDirectory().createEmployee(d4n2);
        ambulanceOrg_n2.getUserAccountDirectory().createUserAccount("ambulancecam400", "ambulancecam400", d4n2, new AmbulanceRole() );
     
        
        AmbulanceDriver d5n2= new AmbulanceDriver();
        d5n2.setAmbulanceId("Ambulance_Cambridge500");
        d5n2.setStatus("Active");
        cambridgeAmbulanceStation1.addAmbulanceDriver(d5n2);
        ambulanceOrg_n2.getEmployeeDirectory().createEmployee(d5n2);
        ambulanceOrg_n2.getUserAccountDirectory().createUserAccount("ambulancecam500", "ambulancecam500", d5n2, new AmbulanceRole() );
        
        DisasterMgmtSystem disasterSystem = DisasterMgmtSystem.getInstance();
        EmergencyLocation el1 = disasterSystem.getDirectory().addEmergencyLocation();
        el1.setAddress("25 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el2 = disasterSystem.getDirectory().addEmergencyLocation();
        el2.setAddress("29 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el3 = disasterSystem.getDirectory().addEmergencyLocation();
        el3.setAddress("26 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el4 = disasterSystem.getDirectory().addEmergencyLocation();
        el4.setAddress("27 S Huntington Ave, Boston, MA 020120");
        
        EmergencyLocation el5 = disasterSystem.getDirectory().addEmergencyLocation();
        el5.setAddress("28 S Calamut Ave, Boston, MA 020120");
        
        return disasterSystem;
        
    }

    
    

    
}
