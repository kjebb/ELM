/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Kai
 */
        public class getJSON implements Serializable
        {
            {  
       
            
        JSONObject jsonObject = null;

        try { 

            JSONParser parser = new JSONParser();

            InputStream in = getClass().getResourceAsStream(Globals.Filename);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line;
             while ((line = br.readLine()) != null) {
                jsonObject  = (JSONObject) parser.parse(line);
               }
            } 

            String sender = (String) jsonObject.get("Sender");
            String message = (String) jsonObject.get("Message");
            String subject = (String) jsonObject.get("Subject");
            
            
            Globals.sender = sender;
            Globals.body = message;
            Globals.subject = subject;
           
        
            
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            Globals.type = "SMS - Text";
            SMS text = new SMS();
            text.setVisible(true);
        
        System.out.println("einde functie");
        }
}