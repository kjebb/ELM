/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Kai
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importChooser = new javax.swing.JFileChooser();
        headerLabel = new javax.swing.JLabel();
        okayBtn = new javax.swing.JButton();
        splashMessage = new javax.swing.JLabel();
        fileAccessLbl = new javax.swing.JLabel();
        splashTitle = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        importMenu = new javax.swing.JMenuItem();
        ExitMenu = new javax.swing.JMenuItem();

        importChooser.setDialogTitle("Import");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELMFS");
        setLocation(new java.awt.Point(100, 150));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        headerLabel.setText("Welcome to the");
        headerLabel.setToolTipText("");
        headerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        okayBtn.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        okayBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        okayBtn.setLabel("Okay");
        okayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okayBtnMouseClicked(evt);
            }
        });

        splashMessage.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        splashMessage.setText("Please import message file");

        fileAccessLbl.setFont(new java.awt.Font("Serif", 2, 16)); // NOI18N
        fileAccessLbl.setText(Globals.Status);
        fileAccessLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        splashTitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        splashTitle.setText(Globals.title);
        splashTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("File");

        importMenu.setText("Import");
        importMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuActionPerformed(evt);
            }
        });
        jMenu1.add(importMenu);

        ExitMenu.setText("Exit");
        ExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fileAccessLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(okayBtn))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(splashTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(splashMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(75, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(splashTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(splashMessage)
                .addGap(18, 18, 18)
                .addComponent(fileAccessLbl)
                .addGap(14, 14, 14)
                .addComponent(okayBtn)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuActionPerformed
        
    int returnVal = importChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) 
    {
        File path = importChooser.getSelectedFile();
             
        fileAccessLbl.setText(Globals.Status = "Successfully loaded file..");
        
                    
        BufferedReader reader = null;

        try {
            File file = importChooser.getSelectedFile();
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(line.contains("Sender"))
                {
                 int trim = line.indexOf(" ");
                 line = line.substring(trim);
                    Globals.sender = line;
                }
                
                if(line.contains("Body"))
                {
                   int trim = line.indexOf(" ");
                   line = line.substring(trim);
                    Globals.body= " "+line;
                }
                 if(line.contains("Subject"))
                {
                   int trim = line.indexOf(" ");
                   line = line.substring(trim);
                    Globals.subject= " "+line;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        int dot = path.getName().indexOf(".");
        Globals.Filename = path.getName().substring(0, dot);
        
        
        
       

    } else 
        {
            fileAccessLbl.setText(Globals.Status = "Unsuccessful, try again");
        }

    }//GEN-LAST:event_importMenuActionPerformed

    private void okayBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okayBtnMouseClicked
        if(Globals.Filename == null)
        {
            ManualInput Mi = new ManualInput();
            Mi.setVisible(true);
        }
        else if(Globals.Filename.substring(0,1).contains("E") || Globals.Filename.substring(0,1).contains("e") &&  Globals.Filename.endsWith(".txt"))
        {
            Globals.type = "Email";
            Email email = new Email();
            email.setVisible(true);
        }
        else if(Globals.Filename.substring(0,1).contains("T") || Globals.Filename.substring(0,1).contains("t") &&  Globals.Filename.endsWith(".txt"))
        {
            Globals.type = "Tweet";
            Tweet twit = new Tweet();
            twit.setVisible(true);
        }
        else if(Globals.Filename.substring(0,1).contains("S") || Globals.Filename.substring(0,1).contains("s") &&  Globals.Filename.endsWith(".txt") )
        {
            Globals.type = "SMS - Text";
            SMS text = new SMS();
            text.setVisible(true);
        }
        
        		// open file input stream
		BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/assets/textwords.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println(reader);

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<textWords> txtSpeak = new ArrayList<>();

        try {
            while ((line = reader.readLine()) != null) {
                textWords txt = new textWords();
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        txt.settxt(data);
                    else if (index == 1)
                        txt.setfull(data);
                    
                    else
                        System.out.println("invalid data::" + data);
                    index++;
                }
                index = 0;
                txtSpeak.add(txt);
            }
        } catch (IOException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try {
            //close reader
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		if(Globals.body.equals(txtSpeak))
                {
                    Globals.body = Globals.body + txtSpeak.toString();
                }
        

   
 
       

    }//GEN-LAST:event_okayBtnMouseClicked

    
    
    private void ExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   	public static void main(String[] args) {

	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    private class CloseListener implements ActionListener{
   @Override
    public void actionPerformed(ActionEvent e) {
        //close program
        System.exit(0);
    }
    
    
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitMenu;
    private javax.swing.JLabel fileAccessLbl;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JFileChooser importChooser;
    private javax.swing.JMenuItem importMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton okayBtn;
    private javax.swing.JLabel splashMessage;
    private javax.swing.JLabel splashTitle;
    // End of variables declaration//GEN-END:variables
}
