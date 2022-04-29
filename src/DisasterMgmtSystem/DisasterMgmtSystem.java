/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem;

import DisasterMgmtSystem.Network.Network;
import DisasterMgmtSystem.Emergencies.EmergencyDirectory;
import DisasterMgmtSystem.EmergencyLocation.EmergencyLocationDirectory;
import DisasterMgmtSystem.Enterprise.Enterprise;
import DisasterMgmtSystem.Enterprise.Hospital;
import DisasterMgmtSystem.Organizations.Organization;
import DisasterMgmtSystem.Victim.VictimDirectory;
import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class DisasterMgmtSystem extends Organization {
    private ArrayList<Network> networkList;
   private EmergencyDirectory emergencyDirectory;
   private EmergencyLocationDirectory directory;
   private VictimDirectory personDirectory;
   //private PersonLicenseDirectory licensePlateDir;

    public static DisasterMgmtSystem getEmergencySystem() {
        return emergencySystem;
        
    }

    public static void setEmergencySystem(DisasterMgmtSystem aEmergencySystem) {
        emergencySystem = aEmergencySystem;
    }
   
     private static DisasterMgmtSystem emergencySystem;
     public static DisasterMgmtSystem getInstance() 
     {
        if (emergencySystem == null) 
        {
            emergencySystem = new DisasterMgmtSystem();
        }
        return emergencySystem;
    }
     

    
    private DisasterMgmtSystem()
    {
        super(null);
        
        networkList=new ArrayList<>();
        directory=new EmergencyLocationDirectory();
        personDirectory=new VictimDirectory();
        //licensePlateDir=new PersonLicenseDirectory();
        emergencyDirectory=new EmergencyDirectory();
    }
    
     public Network addNetwork(String name)
    {
        Network n=new Network(name);
        networkList.add(n);
        return n;
    }

  
    public Network addNetwork()
    {
        Network n=new Network();
        networkList.add(n);
        return n;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public EmergencyLocationDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(EmergencyLocationDirectory directory) {
        this.directory = directory;
    }

    public VictimDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(VictimDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

//    public PersonLicenseDirectory getLicensePlateDir() {
//        return licensePlateDir;
//    }
//
//    public void setLicensePlateDir(PersonLicenseDirectory licensePlateDir) {
//        this.licensePlateDir = licensePlateDir;
//    }
    public boolean checkIfUserNameIsUnique(String username)
    {
        boolean userNameIsUnique=true;
        userNameIsUnique= emergencySystem.getUserAccountDirectory().checkIfUsernameIsUnique(username);
            if(userNameIsUnique==true)
            {
                for(Network n:emergencySystem.getNetworkList())
                {
                    for(Enterprise ent:n.getEntDirObj().getEnterpriseList())
                    {
                       userNameIsUnique= ent.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                       if(userNameIsUnique==false)
                           break;
                       else
                       {
                           for(Organization org:ent.getOrganizationDirectory().getOrganizationList())
                           {
                               userNameIsUnique=org.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                               if(userNameIsUnique==false)
                                   break;
                           }
                       
                       }
                       if(userNameIsUnique==false)
                           break;
                       
                       
                    }
                    if(userNameIsUnique==false)
                           break;
                }
            }
            
            if(userNameIsUnique==true)
            {
                for(Network n:emergencySystem.getNetworkList())
                {
                    for(Hospital h:n.getHospitalList())
                    {
                       userNameIsUnique=h.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                       if(userNameIsUnique==false)
                        break;
                       else
                       {
                           for(Organization org:h.getOrganizationDirectory().getOrganizationList())
                           {
                               userNameIsUnique=org.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                               if(userNameIsUnique==false)
                                   break;
                           }
                       
                       }
                       if(userNameIsUnique==false)
                           break;
                    }
                    if(userNameIsUnique==false)
                        break;
                }
            
            }
        return userNameIsUnique;
      }
    
    public boolean checkIfUserNameIsUnique(String username,String password)
    {
        boolean userNameIsUnique=true;
        userNameIsUnique= emergencySystem.getUserAccountDirectory().checkIfUsernameIsUnique(username);
            if(userNameIsUnique==true)
            {
                for(Network n:emergencySystem.getNetworkList())
                {
                    for(Enterprise ent:n.getEntDirObj().getEnterpriseList())
                    {
                       userNameIsUnique= ent.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                       if(userNameIsUnique==false)
                           break;
                       else
                       {
                           for(Organization org:ent.getOrganizationDirectory().getOrganizationList())
                           {
                               userNameIsUnique=org.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                               if(userNameIsUnique==false)
                                   break;
                           }
                       
                       }
                       if(userNameIsUnique==false)
                           break;
                       
                       
                    }
                    if(userNameIsUnique==false)
                           break;
                }
            }
            
            if(userNameIsUnique==true)
            {
                for(Network n:emergencySystem.getNetworkList())
                {
                    for(Hospital h:n.getHospitalList())
                    {
                       userNameIsUnique=h.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                       if(userNameIsUnique==false)
                        break;
                       else
                       {
                           for(Organization org:h.getOrganizationDirectory().getOrganizationList())
                           {
                               userNameIsUnique=org.getUserAccountDirectory().checkIfUsernameIsUnique(username);
                               if(userNameIsUnique==false)
                                   break;
                           }
                       
                       }
                       if(userNameIsUnique==false)
                           break;
                    }
                    if(userNameIsUnique==false)
                        break;
                }
            
            }
        return userNameIsUnique;
      }

    public EmergencyDirectory getEmergencyDirectory() {
        return emergencyDirectory;
    }

    public void setEmergencyDirectory(EmergencyDirectory emergencyDirectory) {
        this.emergencyDirectory = emergencyDirectory;
    }
}
