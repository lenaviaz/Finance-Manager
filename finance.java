import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class finance {

String file = "tester.csv";

Scanner in = new Scanner(System.in);

//FileWriter fw = new FileWriter(file, true);
int payCheck;
int expense;
String date;

double checking = 0;
double savings = 0;

public void newCheck() throws IOException{

FileWriter fw = new FileWriter(file, true);
BufferedWriter bw = new BufferedWriter(fw); 
System.out.println("What is today's date?");
date = in.next();
// new paycheck, move that ammount to savings
System.out.println("What was your paycheck this week?");
payCheck = in.nextInt();

bw.write(date+", ");
bw.write(String.valueOf(payCheck));
bw.newLine();
bw.close();

checking = checking + payCheck;
System.out.println(checking);
}

public String getDate(){
    return date;
}

public void moveToSavings(){
//move x ammount from checking account to savings 
System.out.println("How much would you like to move to savings?");

}

public void moveToChecking(){
//move x ammout from savings to checking 

}

public void expense(){
//subtract this ammount from checking account
System.out.println("Enter an Expense: ");
expense = in.nextInt();


}

}