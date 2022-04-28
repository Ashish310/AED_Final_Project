/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DisasterMgmtSystem.Db4oUtil;

import DisasterMgmtSystem.DisasterMgmtSystem;
import DisasterMgmtSystem.SystemConfig;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
/**
 *
 * @author hs_sa
 */
public class Db4oUtil {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static Db4oUtil dB4OUtil;
    
    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(DisasterMgmtSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    public DisasterMgmtSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<DisasterMgmtSystem> systems = conn.query(DisasterMgmtSystem.class); // Change to the object you want to save
        DisasterMgmtSystem system;
        if (systems.size() == 0){
            system = SystemConfig.config();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
    
    public synchronized static Db4oUtil getInstance()
    {
        if (dB4OUtil == null)
        {
            dB4OUtil = new Db4oUtil();
        }
        return dB4OUtil;
    }
}
