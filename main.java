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
     	
     	finance myMoney = new finance();
     	
     	double oneExpense=1.00;
     	boolean running = true;
     	double allSpent = 0.00;
     	String choice;
 
do {
	    Scanner scan = new Scanner(System.in);
	    String file = "chinese.txt";
	    FileWriter fw = new FileWriter(file, true);
     	BufferedWriter bw = new BufferedWriter(fw); 
	
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
     		       double check = Double.parseDouble(rem);
     		       myMoney.setRemCheck(check);
     		      
     	     String line2;
     	     		
     	     		while((line2 =  br2.readLine()) != null){
     	     		    if (line2.contains("expense:")) {
     	     		    	list2.add(line2);
     	     		         } 	
     	     		}
     	   
     	     	       	for (String j : list2) {
     	     	            String expen =  j.split(":")[1].trim();
     	     	     		double i = Double.parseDouble(expen);
     	            		allSpent += i;
     	              	}
     	     	       	
     	     String line3;
     	     String first="";
     	     	while((line3 =  br3.readLine()) != null){
	     		    if (line3.contains("income:")) {
	     		    	String This = line3;
	     		    
	     		    first = This.split(":")[1].trim();
	     		  
	     		    }
     	     	}
     	     	//first paycheck will always be two digits entered by user
     	            System.out.println("Your innitial paycheck was " + first);
     	       //     double postSav = Double.parseDouble(first.substring(1));
     	       //    double rounded = (double) Math.round(postSav * 100) / 100;
     	        //   double roundSav = rounded - 100;
     	        //  double toPrint = (double) Math.round(roundSav * 100) / 100;
     	            double dFirst = Double.parseDouble(first);
     	            double Longminus100 = (dFirst - 100);
     	           double toPrint = (double) Math.round(Longminus100 * 100) / 100;
     	          System.out.println ("You moved 100 to savings, leaving your paycheck: $" + toPrint);
     	         double rounded2 = (double) Math.round(allSpent * 100) / 100;
     	          System.out.println("Your total spending:$ " + rounded2);
     		        System.out.println(myMoney.report());
     		    
     		       
     		        
     		        System.exit(0);
     	      
     	} break;
     	
     	case "d" :{
     		 
     		 //even if an exception rises
            try (FileReader fr = new FileReader("chinese.txt");
                 FileWriter fw1 = new FileWriter("finances.txt", true)) {
                int c = fr.read();
                while(c!=-1) {
                    fw1.write(c);
                    c = fr.read();
                }
                fw1.write("----------------------------\n");
            } catch(IOException e) {
                e.printStackTrace();
            }
            fw.close();
            
            FileWriter fw3 = new FileWriter("chinese.txt");
        	 fw3.write(" ");
        	 fw3.close();
            
     	}	
     	}
     	
     	
	
    
} while (choice.equals("a") || choice.equals("b") || choice.equals("c") || choice.equals("d"));
  System.out.print("exit? ");
  System.exit(0);
 } 
 
 }


