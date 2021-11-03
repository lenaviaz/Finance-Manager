import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
public class mainframe extends frame {

    public frame f1;
    JTextField hello = new JTextField("Hello!!!!!!!");

    public void run() {
        frame f1 = new frame();
        f1.newFrame();
        t1.setBounds(50, 100, 150, 20);
        f1.addbutton(t1);

        hello.setBounds(50, 25, 150, 200);
        f1.addtext(hello);
        }
 
    JButton t1 = new JButton( new AbstractAction("add") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            //System.out.print("Heck yeah");
            addPaycheck p1 = new addPaycheck();
            f1.visible(false);
        }
    });

     
    JButton t2 = new JButton( new AbstractAction("add") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            System.out.print("heeeeeeeeeeee");
        }
    });

    
    
}

