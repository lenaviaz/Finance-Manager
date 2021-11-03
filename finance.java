import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class finance {

    String file = "paychecks.csv";
    String accountfile = "accounts.csv";


    int payCheck;
    int checking;
    int savings;
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

    public int getChecking(){
        return checking;
    }
    public void setChecking(int c) throws IOException{
        FileWriter fw = new FileWriter(accountfile, true);
        BufferedWriter bw = new BufferedWriter(fw); 
        checking = c;

        bw.write(String.valueOf(checking));
        bw.newLine();
        bw.close(); 
    }


}
