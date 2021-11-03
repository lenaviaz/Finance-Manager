import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;
public class mainframe {

    //class instance to be used among all classes
    public static finance fin = new finance();
    public static frame mainframe = new frame();
   // JTextField hello = new JTextField("amt ");
    JTextField h1 = new JTextField();

    String[] options = {"Accounts History", "Expenses History", "Start Over", "Exit"};
    JComboBox<String> jComboBox = new JComboBox<>(options);


    public void run() {
        
        mainframe.newFrame();
        t1.setBounds(0, 50, 200, 50);
        t1.setBackground(Color.WHITE);
        t2.setBounds(0, 100, 200, 50);
        t2.setBackground(Color.WHITE);
        t3.setBounds(0, 150, 200, 50);
        t3.setBackground(Color.WHITE);
        t4.setBounds(0, 200, 200, 50);
        t2.setBackground(Color.WHITE);
        jComboBox.setBounds(200, 50, 150, 20);
        h1.setBounds(0, 0, 800, 50);
        h1.setHorizontalAlignment(JTextField.CENTER);
        mainframe.addbutton(t1);
        mainframe.addbutton(t2);
        mainframe.addbutton(t3);
        mainframe.addbutton(t4);
        mainframe.addtext(h1);
        mainframe.addbox(jComboBox);
        

       // hello.setBounds(50, 25, 100, 50);;
       // mainframe.addtext(hello);
        

        System.out.println("-------------------");
        System.out.println(fin.getSavings()); 
        System.out.println("--------------------");
        System.out.println(fin.getChecking()); 
        System.out.println("--------------------");  

        }
 
    JButton t1 = new JButton( new AbstractAction("Deposit check") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            addPaycheck p1 = new addPaycheck();
            mainframe.close();
         //   mainframe.visible(false);
            //fin.setPaycheck(1000);
           // System.out.println(fin.getPaycheck());
        }
    });

    JButton t2 = new JButton( new AbstractAction("Check balances") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            addPaycheck p1 = new addPaycheck();
         //   mainframe.visible(false);
            //fin.setPaycheck(1000);
          //  System.out.println(fin.getPaycheck() + "dssds");
        }
    });

    JButton t3 = new JButton( new AbstractAction("Transfer funds") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            transfer t = new transfer();
        }
    });

    JButton t4  = new JButton( new AbstractAction("Add expense") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            transfer t = new transfer();
        }
    });

    
}

