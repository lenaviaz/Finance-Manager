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
		Scanner scan = new Scanner(System.in);
		String file = "chinese.txt";
		FileWriter fw = new FileWriter(file, true);
     	BufferedWriter bw = new BufferedWriter(fw); 
     	List<String> list = new ArrayList<String>();
     	List<String> list2 = new ArrayList<String>();
     	
     	finance myMoney = new finance();
     	int oneExpense=1;
     	boolean running = true;
     	int allSpent = 0;
     	
     	System.out.println("Hello would you like to: ");
     	System.out.println("Start a new week or add new expenses");
     	int choice = scan.nextInt();
     	
     	switch(choice) {
     	case 1: {
     	
		 System.out.println("What was your paycheck this week?");
		 int input = scan.nextInt();
		 myMoney.setpayCheck(input);
		 //automatically take out 100
		 
		    bw.write("Week 1 income: $" +input);
		    System.out.print("Moving $100 to savings, your paycheck is: $" + myMoney.getpayCheck());
		    bw.newLine();
		    
		    bw.write("Your total Savings: $" + 100);
		    bw.newLine();
		    bw.write("paycheck remaining: "+ myMoney.getpayCheck());
		    bw.newLine();
		    bw.close();
     	} break;
     	
     	
     	case 2: {
     		
     		FileReader fr = new FileReader("chinese.txt");
     		BufferedReader br = new BufferedReader(fr);
     		String line;
     		while((line =  br.readLine()) != null){
     		    if (line.contains("paycheck remaining:")) {
     		    	list.add(line);
     		    }
     		    	
     		    }
     		
     	       	String a = list.get(list.size() - 1); 
     		     String rem =  a.split(":")[1].trim();
     		       int check = Integer.parseInt(rem);
     		       myMoney.setRemCheck(check);
     		       System.out.println(myMoney.getpayCheck());
     		    
     		
     		
     		while (running = true) {
     		System.out.println("Enter the dollar amt expense: ");
     	    oneExpense = scan.nextInt();
     	    System.out.print("Location of the expenditure: ");
     	    String whereSpent = scan.next();
     	    System.out.print("enter todays date dd/mm");
     	    String date = scan.next();
     	    if(oneExpense == 0) {
     	    	break;
     	    } else {
     		myMoney.postExp(oneExpense);
     			
        	 bw.write(date + "-" +whereSpent + " - expense: "  +oneExpense);
         
        	 
     	     bw.newLine();
     	    System.out.println("you have this left: $" + myMoney.getpayCheck());
     		} 
     		}
     		 bw.write("paycheck remaining: " + myMoney.getpayCheck());
     		 bw.newLine();
     		 bw.close();
   	         scan.close();
	} break;
	
     	case 3: {
     		
     		FileReader fr = new FileReader("chinese.txt");
     		FileReader fr2 = new FileReader("chinese.txt");
     		FileReader fr3 = new FileReader("chinese.txt");
     		BufferedReader br = new BufferedReader(fr);
     		BufferedReader br2 = new BufferedReader(fr2);
     		BufferedReader br3 = new BufferedReader(fr3);
     		
     		String line;
     		while((line =  br.readLine()) != null){
     		    if (line.contains("paycheck remaining:")) {
     		    	list.add(line);
     		         } 	
     		    }
     		
     	       	String a = list.get(list.size() - 1); 
     		     String rem =  a.split(":")[1].trim();
     		       int check = Integer.parseInt(rem);
     		       myMoney.setRemCheck(check);
     		      
     	     String line2;
     	     		
     	     		while((line2 =  br2.readLine()) != null){
     	     		    if (line2.contains("expense:")) {
     	     		    	list2.add(line2);
     	     		    	
     	     		    	
     	     		         } 	
     	     		    }
     	     		
     	   
     	     	       	for (String j : list2) {
     	     	            String expen =  j.split(":")[1].trim();
     	     	     		int i = Integer.parseInt(expen);
     	            		allSpent += i;
     	              	}
     	     	       	
     	     String line3;
     	     String first="";
     	     	while((line3 =  br3.readLine()) != null){
	     		    if (line3.contains("Week 1 income:")) {
	     		    	String This = line3;
	     		    
	     		    first = This.split(":")[1].trim();
	     		  
	     		    }
     	     	}
     	            System.out.println("Your innitial paycheck was " + first);
     	            System.out.println ("You saved $100");
     		        System.out.println(myMoney.report());
     		        System.out.println("Your total spending:$ " + allSpent);
     	      
     	}
	}
	
}
}

