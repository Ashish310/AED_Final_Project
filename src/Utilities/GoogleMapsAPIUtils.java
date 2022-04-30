/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author hs_sa
 */
public class GoogleMapsAPIUtils {
    
    public static void locateAddress(String location) {
        try {
//            String license = "6P830J66YBEV859RNMVMB0VT0VQSS8BPQ7Z1VLVMXMOLZ7SSAKK74RR05XN89D8THQMW";
              String license = "1BNDHFSC1G2GOICV072MQOYAT5RLWSG9PREEL1G79Q1C845CMSRBMACRTQUAGGOHAISUHJ";
//
            Engine engine = Engine.newInstance(
                    EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                            .licenseKey("6P830J66YBLGY2XLYQT2MMTN8845DCPFD7K6446L3CPXER90A4TCIHNRDFLN2WU1BRR3")
                            .build());
            System.setProperty("jxbrowser.license.key", license);
            Browser browser = engine.newBrowser();
            BrowserView browserView = BrowserView.newInstance(browser);
            JFrame frame = new JFrame("Emergency Location");

            frame.add(browserView, BorderLayout.CENTER);
            frame.setSize(1000, 800);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            browser.navigation().loadUrl("http://maps.google.com/?q=" + location);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
