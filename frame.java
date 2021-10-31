import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class frame extends main implements ActionListener{

    JFrame frame = new JFrame();
    JTextField t1,t2;

    public void newFrame(){

    t1=new JTextField(" ");  
    t1.setBounds(50,50,150,20);    
    t2=new JTextField("AWT Tutorial");  
    t2.setBounds(50,100,150,20); 
   // t2.setVisible(true);  
    JButton b1=new JButton("+");  
    b1.setBounds(50,200,50,50); 
    frame.add(t1); 
    frame.add(t2); 
    frame.add(b1); 
    frame.setLayout(null);     
    frame.setSize(300, 300);
    //frame.pack();
    frame.setVisible(true);
   


    b1.addActionListener(this);  

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        System.out.print("Text it: +" + s1);
        
    }

   // public void add(JTextField text){
    //text.setBounds(50,150, 200,30);  
    //frame.add(text);

    }