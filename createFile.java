import java.util.*;
import java.lang.*;
import java.io.*;

public class createFile {
	
//ughhhhh
	private Formatter x;
	
	public void openFile() {
		try {
			x= new Formatter("chinese.txt");
		} 
		catch (Exception e) {
			System.out.println("you have error");
		}
	}
	
	public void closeFile() {
		x.close();
	}

}
