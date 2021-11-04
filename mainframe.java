import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.awt.font.*;
import java.lang.reflect.Array;
import java.awt.Font;
public class mainframe {

    //class instance to be used among all classes
    public static finance fin = new finance();
    public static frame mainframe = new frame();
   // JTextField hello = new JTextField("amt ");

    String[] options = {"Accounts History", "Expenses History", "Start Over", "Exit"};
    JComboBox<String> jComboBox = new JComboBox<>(options);


    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();
    
     String a = dtf.format(now);

     JTextField h1 = new JTextField(a);
     
     int width = 200;
     int height = 100;

    public void run() {

        Font font1 = new Font("SansSerif", Font.BOLD, 20);

        mainframe.newFrame();
        t1.setBounds(0, 50, width, height);
        t1.setBackground(Color.WHITE);
        t2.setBounds(0, 150, width, height);
        t2.setBackground(Color.WHITE);
        t3.setBounds(0, 250, width, height);
        t3.setBackground(Color.WHITE);
        t4.setBounds(0, 350, width, height);
        t2.setBackground(Color.WHITE);
        jComboBox.setBounds(200, 50, 150, 20);
        h1.setBounds(0, 0, 800, 50);
        h1.setFont(font1);
        h1.setCaretColor(Color.WHITE);
        h1.setEditable(false);
        //h1.set
      //  h1.setText(a);
        h1.setHorizontalAlignment(JTextField.CENTER);
        mainframe.addbutton(t1);
        mainframe.addbutton(t2);
        mainframe.addbutton(t3);
        mainframe.addbutton(t4);
        mainframe.addtext(h1);
      //  mainframe.addbox(jComboBox);
       // mainframe.addLabel(dtf.format(now));
        
       // hello.setBounds(50, 25, 100, 50);;
       // mainframe.addtext(hello)


        System.out.println("-------------------");
        System.out.println(fin.getSavings()); 
        System.out.println("--------------------");
        System.out.println(fin.getChecking()); 
        System.out.println("--------------------");  

  

        }

        void showdate(){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            System.out.println(dtf.format(now));
        }
 
        
    JButton t1 = new JButton( new AbstractAction("To Do List") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
           addPaycheck p1 = new addPaycheck();
           p1.init();
            mainframe.close();
         //   mainframe.visible(false);
            //fin.setPaycheck(1000);
           // System.out.println(fin.getPaycheck());
        } 
    });

    JButton t2 = new JButton( new AbstractAction("Budget") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
          //  addPaycheck p1 = new addPaycheck();
         //   mainframe.visible(false);
            //fin.setPaycheck(1000);
          //  System.out.println(fin.getPaycheck() + "dssds");
        }
    });

    JButton t3 = new JButton( new AbstractAction("Notes") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            transfer t = new transfer();
        }
    });

    JButton t4  = new JButton( new AbstractAction("Goals") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            transfer t = new transfer();
        }
    });
    
}

