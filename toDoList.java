import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.ArrayList;


public class toDoList {


    JTextField notes = new JTextField();
    mainframe m1 = new mainframe();
    JButton t1 = new JButton();
    JTextField t2 = new JTextField();
 //   note myNote = new note();
  
 //  public finance fin = new finance();
    frame fr = new frame();

    note myNote = new note();
    JComboBox removeItem = new JComboBox();
    ArrayList<String> Items = new ArrayList<String>();

    String file = "paychecks.csv";

    public void init() {

       // finance fin = new finance();
  
        fr.newFrame();
       // fr.setSize(600, 600);

      //  JButton b1 = new JButton("yoo");
        //b1.setBounds(50, 100, 150, 20);
       // JTextField t1 = new JTextField();
      
       // t2.setText("Add Items to your to do list");
        //int x int y int width int height
      //  t2.setBounds(50, 50, 150, 20);
       // t1.setBounds(50, 100, 150, 20);
        //b1.setBounds(50, 150, 150, 20);
        back.setBounds(550, 50, 150, 20);
        removeItem.setBounds(550, 100, 150, 20);
      //  view.setBounds(0, 50, 200, 100);
        view.setBackground(Color.WHITE);
        notes.setBounds(300, 50, 200, 400);
        add.setBounds(0, 50, 200, 100);
        add.setBackground(Color.white);
     //   myNote.displayToDo();
        myNote.init();
       // fr.addbutton(t1);
        //fr.addtext(t2);
       // fr.addbutton(b1);
        fr.addbutton(back);
        fr.addbox(removeItem);
     //   fr.addbutton(view);
        fr.addbutton(add);
        fr.getContentPane().add(myNote.scroll);
       // fr.addArea(myNote.toDo);
        //display();
        myNote.test();

        populateRemove();
        fillMenu();
    }


    public void populateRemove(){
      try (BufferedReader br = new BufferedReader(new FileReader("data.txt")))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                Items.add(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } 

    }


    public void fillMenu(){
      for(int i = 0; i < Items.size(); i++){
      //  String a = Items(i);
         removeItem.addItem(Items.get(i));

      }
    }

    JButton view = new JButton( new AbstractAction("View your to do list") {
      @Override
      public void actionPerformed( ActionEvent e ) {
         fr.close();
         m1.run();
      }
  });
  
  
  JButton add = new JButton( new AbstractAction("Add items to list") {
    @Override
    public void actionPerformed( ActionEvent e ) {
     //  fr.close();
     //  mainframe m1 = new mainframe();
     //  m1.run()
         
         myNote.init();
         myNote.window();
  
    }
});


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
            //f1.visible(false)

            myNote.init();
           // mainframe f1 = new mainframe();
            init(); 
            fillMenu();
            populateRemove(); 
        }  
    });

    JButton back = new JButton( new AbstractAction("back to main page") {
      @Override
      public void actionPerformed( ActionEvent e ) {
         fr.close();
         myNote.init();
         m1.run();
      }
  });




    
}