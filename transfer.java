import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import java.io.IOException;
public class transfer {

    frame fr = new frame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();

    String[] accounts = {"Checking", "Savings"};
    JComboBox<String> jComboBox = new JComboBox<>(accounts);

    public transfer(){

        // finance fin = new finance();
 
         fr.newFrame();
         fr.setSize(600, 600);
 
       //  JButton b1 = new JButton("yoo");
         //b1.setBounds(50, 100, 150, 20);
        // JTextField t1 = new JTextField();
       
         t2.setText("Enter the ammout to transfer");
         t2.setBounds(50, 50, 150, 20);
         t1.setBounds(50, 100, 150, 20);
         b1.setBounds(50, 150, 150, 20);
         b2.setBounds(50, 200, 150, 20);

         
        jComboBox.setBounds(80, 5, 140, 20);
         
         fr.addtext(t1);
         fr.addtext(t2);
         fr.addbutton(b1);
         fr.addbutton(b2);
         fr.addbox(jComboBox);
 
     }
 
     JButton b1 = new JButton( new AbstractAction("confirm") {
         @Override
         public void actionPerformed( ActionEvent e ) {

            String selected = jComboBox.getItemAt(jComboBox.getSelectedIndex());
            System.out.print(selected);

         //   if(selected.equals(" ")){
         //           System.out.println("Must select an account");
         //   }
         //       else {

            String a = t1.getText();
            int i = Integer.parseInt(a);

             int newChecking = mainframe.fin.getChecking() + i;
             try {
                mainframe.fin.setChecking(newChecking);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
       // }
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
