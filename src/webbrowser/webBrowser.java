/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser;

import javafx.application.Platform;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


/**
 *
 * @author Barry Grevink
 * @version 1.2
 */
public class webBrowser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                      
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1024,800);
        final JFXPanel fxpanel = new JFXPanel();
        frame.add(fxpanel);
        Platform.runLater(new Runnable() {
            @Override
            public void run(){
                WebEngine engine;
                WebView wv= new WebView();
                engine = wv.getEngine();
                fxpanel.setScene(new Scene(wv));
                engine.load("https://www.google.com");
                        
            }
            
        });
        frame.setVisible(true);
        
        
    }
} 
        