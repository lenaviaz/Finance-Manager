import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.font.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class frame {

    String checking;
    JFrame frame = new JFrame();

    Font font1 = new Font("SansSerif", Font.BOLD, 20);

    public void newFrame(){

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();

    String a = dtf.format(now);

 JTextField h1 = new JTextField(a);

 h1.setBounds(0, 0, 800, 50);
 h1.setFont(font1);
 h1.setCaretColor(Color.WHITE);
 h1.setEditable(false);
 //h1.set
//  h1.setText(a);
 h1.setHorizontalAlignment(JTextField.CENTER);

    frame.add(h1);
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

    public void addLabel(JLabel j){
        frame.add(j);
    }
    
   
    
    }
    