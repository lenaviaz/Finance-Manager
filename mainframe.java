import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
public class mainframe {

    //class instance to be used among all classes
    public static finance fin = new finance();
    public static frame mainframe = new frame();
    JTextField hello = new JTextField("amt ");

    

    public void run() {
        
        mainframe.newFrame();
        t1.setBounds(50, 100, 150, 20);
        t2.setBounds(50, 150, 150, 20);
        t3.setBounds(50, 200, 150, 20);
        mainframe.addbutton(t1);
        mainframe.addbutton(t2);
        mainframe.addbutton(t3);

        hello.setBounds(50, 25, 100, 50);;
        mainframe.addtext(hello);

        System.out.println("-------------------");
        System.out.println(fin.getPaycheck()); 
        System.out.println("--------------------");
        System.out.println(fin.getChecking()); 
        System.out.println("--------------------");  

        }
 
    JButton t1 = new JButton( new AbstractAction("Add a paycheck!") {
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

    JButton t2 = new JButton( new AbstractAction("Add an expense!") {
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

    
}

