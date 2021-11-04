import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class note {

    JTextField notes = new JTextField();

    JTextArea toDo = new JTextArea();
    ArrayList<String> listOfLines = new ArrayList<>();
   // JButton confirm = new JButton("confirm");

    JFrame j1 = new JFrame();
    String file = "data.txt";
    String accountfile = "accounts.csv";
    String a;

    public void init(){
        j1.setBounds(200, 200, 400, 400);
        notes.setBounds(100, 100, 75, 25);//displayedtexts
        confirm.setBounds(50, 50, 50, 20);
        toDo.setBounds(150, 150, 300, 200);
        j1.add(notes);
        j1.add(confirm);
        j1.setLayout(null);
        j1.setVisible(true);

        try (Reader myReader = new BufferedReader(new FileReader("data.txt"))) {
            toDo.read(myReader, "Inventory");
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
    
    public void addNote(String a) throws IOException{

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(a);
        bw.newLine();
        bw.close(); 
    }
    
    public void test() {
    //    toDo.setText("ssssssssssssssssssssssssssssss");
    }


    public void toList() throws IOException{
        BufferedReader bufReader = new BufferedReader(new FileReader("file.txt"));

        String line = bufReader.readLine();

        while (line != null) {
             listOfLines.add(line); 
             line = bufReader.readLine();
             } bufReader.close();

    }

    
    public void displayToDo() {
   
    //  FileReader fr=new FileReader(file);          //Creation of file reader object 
   //   BufferedReader br=new BufferedReader(fr);  //Creation of buffer reader object
    //  FileWriter fw= new FileWriter(notes);      //Creation of file writer object 
     // String s=null;
     // while((s=br.readLine())!=null)             //Copying Content to the new file
      
        //String a = listOfLines.get(0);
     //   toDo.setText("aaaaaaaaaaaaaaaaaaaaa");
        //fw.write(s);
         //fw.write("\n");
         //fw.flush();
      
       //  br.close();
   }

    JButton confirm = new JButton( new AbstractAction("Confirm") {
        @Override
        public void actionPerformed( ActionEvent e ) {
          // fr.close();
   
         a = notes.getText();
          try {
            addNote(a);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        j1.setVisible(false);
         //  mainframe m1 = new mainframe();
          // m1.run();
          init();
        }
    });





    }

