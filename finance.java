import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class finance {

    String file = "paychecks.csv";
    String accountfile = "accounts.csv";


    int payCheck;
    int expense;
    String date;

    public finance(){

    }

    public void setPaycheck(int a) throws IOException{
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw); 
        payCheck = a;

        bw.write(String.valueOf(payCheck));
        bw.newLine();
        bw.close(); 
    }

    public int getPaycheck(){
        return payCheck;
    }
}
