import java.util.*;
import java.lang.*;
import java.io.*;

public class createFile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x= new Formatter("chinese.txt");
		} 
		catch (Exception e) {
			System.out.println("you have error");
		}
	}
	
	public void addRecords() {
		x.format("%s%s%s", "20", "bucky", "roberts");
	}
	
	public void closeFile() {
		x.close();
	}

}
