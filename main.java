import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class main {

public static void main(String[] args) throws IOException{

finance f1 = new finance();
Scanner in = new Scanner(System.in);

//frame fr = new frame();
//fr.newFrame();
//JTextField field = new JTextField("helllloooo");
//fr.add(field);

Boolean runing = true;
while(runing){
    f1.message();
    String choice = in.next();
        switch(choice){
            case "A":
            f1.newCheck();
                break;
            case "B" :
            f1.moveToChecking();
                break;
            case "X":
            runing = false;
            }
    
//System.out.print(date);


}

}
    
}

