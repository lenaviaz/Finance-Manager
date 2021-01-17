import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void main(String [] args) throws IOException {
		
     	List<String> list = new ArrayList<String>();
     	List<String> list2 = new ArrayList<String>();
     	List<Double> list3 = new ArrayList<Double>();
     	
     	finance myMoney = new finance();
     	
     	double oneExpense=1.00;
     	boolean running = true;
     	double allSpent = 0.00;
     	String choice;
 
do {
	    Scanner scan = new Scanner(System.in);
	    String file = "weekly.txt";
	    FileWriter fw = new FileWriter(file, true);
     	BufferedWriter bw = new BufferedWriter(fw); 
     	FileReader fr = new FileReader("weekly.txt");
 		BufferedReader br = new BufferedReader(fr);
	
     	System.out.println("Hello would you like to: ");
     	System.out.println("Start a new week (a) ");
     	System.out.println("Add new weely expenses (b) ");
     	System.out.println("View your weekly financial summary (c) ");
     	System.out.println("Start a new week and clear your weekly financial sheet: (d) ");
     	System.out.println("Exit? (e) ");

     	choice = scan.next(); 

     	switch(choice) {
     	case "a": {
     	
     	 System.out.print("enter todays date: dd/MM/yy");
     	 String date = scan.next();
		 System.out.print("What was your paycheck this week?\n$");
		 double input = scan.nextDouble();
		 myMoney.setpayCheck(input);
		 //automatically take out 100
		 
		    bw.write(date);
		    bw.newLine();
		    bw.write("income: " +input);
		    double rounded = (double) Math.round(myMoney.getpayCheck() * 100) / 100;
		    System.out.println("Moving $100 to savings, your remaining paycheck is: $" + rounded);
		    bw.newLine();
		    
		    bw.write("Your total Savings: $" + 100);
		    bw.newLine();
		    bw.write("paycheck remaining: "+ rounded);
		    bw.newLine();
		    bw.close();
     	} break;
     	 
     	case "b": {
     		
     		String line;
     		while((line =  br.readLine()) != null){
     		    if (line.contains("paycheck remaining:")) {
     		    	list.add(line);
     		    }
     		   // for(String h : list) {
     		 //   	System.out.print(h);
     		  //  }
     		    }
     		
     	       	String a = list.get(list.size() - 1); 
     		     String rem =  a.split(":")[1].trim();
     		       double check = Double.parseDouble(rem);
     		       myMoney.setRemCheck(check);
     		       System.out.println("Your remaining paycheck: $" +myMoney.getpayCheck());
     		    
     		
     	
     		System.out.println("Enter the dollar amt expense: ");
     	    oneExpense = scan.nextDouble();
     	    System.out.print("Location of the expenditure: ");
     	    String whereSpent = scan.next();
     		myMoney.postExp(oneExpense);
     		
        	 bw.write(whereSpent + " - expense: "  +oneExpense);
        	 
     	     bw.newLine();
     	     
     	    double toPrint1 = (double) Math.round(myMoney.getpayCheck() * 100) / 100;
     	    System.out.println("you have this left: $" + toPrint1);
     		
     	   
     		 bw.write("paycheck remaining: " + toPrint1);
     		 bw.newLine();
     		 bw.close();
	               
     	}    
     	      break;
	
     	case "c": {
     		
   //// this function finds the total amount the user spent
        		String line;
      		while((line =  br.readLine()) != null){
     		    if (line.contains("expense:")) {
     		    	 String rem =  line.split(":")[1].trim();
     		    	list.add(rem);
    		            }
     		}
    	for(String h : list) {
     		 double check = Double.parseDouble(h);
     		list3.add(check);
     	
     	}
    		Double totalSpend = 0.00;
     	 for(double i : list3) {
    		 totalSpend +=i;
     	 } 
     	 
     //	System.out.println(totalSpend);
      //initial paycheck
     		
     	 FileReader fr2 = new FileReader("weekly.txt");
     	 BufferedReader br2 = new BufferedReader(fr2);
     	String income;
 		while((income =  br2.readLine()) != null){
 		    if (income.contains("income:")) {
 		    	 list2.add(income);	    
 		    }
 		}
        String totIncome = list2.get(list2.size() - 1);
        String splitIncome =  totIncome.split(":")[1].trim();
        Double dobIncome = Double.parseDouble(splitIncome);
        System.out.println(dobIncome);
        Double afterSavings = dobIncome - 100;
        double haveLeft = afterSavings - totalSpend;
        System.out.println("your initial paycheck was: $" + dobIncome);
        System.out.println("After moving 100 to savings, you have: $" + afterSavings + " left in your paycheck");
        System.out.println("you spent $" + totalSpend + " this week");
        System.out.println("You have left $" + haveLeft + "to spend this week");
        
        System.exit(0);
        
     	} break;
     	
     	case "d" :{
     		 
     		 //even if an exception rises
            try (FileReader fr1 = new FileReader("weekly.txt");
                 FileWriter fw1 = new FileWriter("finances.txt", true)) {
                int c = fr.read();
                while(c!=-1) {
                    fw1.write(c);
                    c = fr1.read();
                }
                fw1.write("----------------------------\n");
            } catch(IOException e) {
                e.printStackTrace();
            }
            fw.close();
            
            FileWriter fw3 = new FileWriter("weekly.txt");
        	 fw3.write(" ");
        	 fw3.close();
            
           	}	
     	}
    
} while (choice.equals("a") || choice.equals("b") || choice.equals("c") || choice.equals("d"));
  System.out.print("exit? ");
  System.exit(0);
 
	}
 }


