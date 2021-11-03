import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import java.io.IOException;


public class addPaycheck {

    JTextField t1 = new JTextField();
 //  public finance fin = new finance();

 

    public addPaycheck(){

       // finance fin = new finance();
        frame fr = new frame();
        fr.newFrame();
        fr.setSize(600, 600);

      //  JButton b1 = new JButton("yoo");
        //b1.setBounds(50, 100, 150, 20);
       // JTextField t1 = new JTextField();
        t1.setBounds(50, 0, 150, 20);
        b1.setBounds(50, 100, 150, 20);
        
        fr.addtext(t1);
        fr.addbutton(b1);

    }

    JButton b1 = new JButton( new AbstractAction("yeeeeeeee") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            String a = t1.getText();
            int i = Integer.parseInt(a);
            System.out.println(i);
           // fin.setPaycheck(i);
              try {
                mainframe.fin.setPaycheck(i);
              } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
              }
            System.out.println(mainframe.fin.getPaycheck());
          //  addPaycheck p1 = new addPaycheck();
            //f1.visible(false);
        }
    });




    
}
