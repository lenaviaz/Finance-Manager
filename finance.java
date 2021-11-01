import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class finance {

String file = "tester.csv";
String accountfile = "accounts.csv";

Scanner in = new Scanner(System.in);

//FileWriter fw = new FileWriter(file, true);
int payCheck;
int expense;
String date;

double checking = 0;
//eventually grab the most recent number from the .csv file
double savings = 0;
//eventually grab the most recent number from the .csv file

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

// give user option to deposit to checking or savings, then update accounts.csv
checking = checking + payCheck;
System.out.println(checking);
}

public String getDate(){
    return date;
}

public void moveToSavings() throws IOException{
//move x ammount from checking account to savings 
//updates in table
FileWriter fw = new FileWriter(accountfile, true);
BufferedWriter bw = new BufferedWriter(fw); 
System.out.println("How much would you like to move to savings?");
int ammount = in.nextInt();

checking = checking - ammount;
savings = savings + ammount;

bw.write(String.valueOf(checking)+", ");
bw.write(String.valueOf(savings));
bw.newLine();
bw.close();

}

public void moveToChecking() throws IOException {
//move x ammount from savings account to checking 
//updates in table
FileWriter fw = new FileWriter(accountfile, true);
BufferedWriter bw = new BufferedWriter(fw); 
System.out.println("How much would you like to move to checking?");
int ammount = in.nextInt();

savings = savings - ammount;
checking = checking + ammount;

bw.write(String.valueOf(checking)+", ");
bw.write(String.valueOf(savings));
bw.newLine();
bw.close();

}

public void expense(){
//subtract this ammount from checking account
System.out.println("Enter an Expense: ");
expense = in.nextInt();




}

}