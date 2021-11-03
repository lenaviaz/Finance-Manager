import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import java.io.IOException;


public class addPaycheck {

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
 //  public finance fin = new finance();
    frame fr = new frame();

    public addPaycheck(){

       // finance fin = new finance();

        fr.newFrame();
       // fr.setSize(600, 600);

      //  JButton b1 = new JButton("yoo");
        //b1.setBounds(50, 100, 150, 20);
       // JTextField t1 = new JTextField();
      
        t2.setText("Enter your paycheck this week");
        t2.setBounds(50, 50, 150, 20);
        t1.setBounds(50, 100, 150, 20);
        b1.setBounds(50, 150, 150, 20);
        b2.setBounds(50, 200, 150, 20);
        
        fr.addtext(t1);
        fr.addtext(t2);
        fr.addbutton(b1);
        fr.addbutton(b2);

        

    }

    JButton b1 = new JButton( new AbstractAction("confirm") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            String a = t1.getText();
            int i = Integer.parseInt(a);
            int current = mainframe.fin.getSavings();
            int newSave = current + i;
           // fin.setPaycheck(i);
              try {
                mainframe.fin.setPaycheck(i);
              //  mainframe.fin.setChecking(i);
              } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
              } 
                try {
                  mainframe.fin.setSavings(newSave);
                } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
                }
                try {
                  mainframe.fin.writeSavings();
                } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
                }

                try {
                  mainframe.fin.writeChecking();
                } catch (IOException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
                }


              System.out.println(mainframe.fin.getSavings() + " "+ mainframe.fin.getChecking());
           // System.out.println(mainframe.fin.getPaycheck());
          //  addPaycheck p1 = new addPaycheck();
            //f1.visible(false);
        }
    });

    JButton b2 = new JButton( new AbstractAction("back to main page") {
      @Override
      public void actionPerformed( ActionEvent e ) {
         fr.close();
         mainframe m1 = new mainframe();
         m1.run();
      }
  });




    
}
