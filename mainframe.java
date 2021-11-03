import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
public class mainframe {

    //class instance to be used among all classes
    public static finance fin = new finance();
    public frame f1;
    JTextField hello = new JTextField("Welcome to my shitty little app");

    public void run() {
        frame f1 = new frame();
        f1.newFrame();
        t1.setBounds(50, 100, 150, 20);
        t2.setBounds(50, 150, 150, 20);
        f1.addbutton(t1);
        f1.addbutton(t2);

        hello.setBounds(50, 25, 100, 50);;
        f1.addtext(hello);

        }
 
    JButton t1 = new JButton( new AbstractAction("Add a paycheck!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            addPaycheck p1 = new addPaycheck();
         //   f1.visible(false);
            //fin.setPaycheck(1000);
            System.out.println(fin.getPaycheck());
        }
    });

    JButton t2 = new JButton( new AbstractAction("Add an expense!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            addPaycheck p1 = new addPaycheck();
         //   f1.visible(false);
            //fin.setPaycheck(1000);
            System.out.println(fin.getPaycheck());
        }
    });

    
    
}

