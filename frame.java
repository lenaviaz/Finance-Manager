import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;

public class frame {

    String checking;
    JFrame frame = new JFrame();

    public void newFrame(){
    frame.setLayout(null);     
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);
    //frame.pack();
    frame.setVisible(true);
    frame.getContentPane().setBackground( Color.decode("#9CBBF2") );
    }

    public void setSize(int x, int y){
        frame.setSize(x, y);
    }

       
    public void visible(boolean b){
        frame.setVisible(b);
    }
 

    public void addtext(JTextField j){
        frame.add(j);
    }

    public void addbutton(JButton b){
        frame.add(b);
    }

    public void close(){
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    public void addbox(JComboBox box){
       frame.add(box);
    }

    
   
    
    }
    