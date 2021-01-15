
public class finance {
	
	private int payCheck;
	private int Save = 100;
	private int savings = 1564;
	private int expense;
	private int monLeft;
	
	public finance() {
		
	}
	//takes out 100
	public void setpayCheck(int check) {
	    payCheck = check - 100;
	}
	
	public void setRemCheck(int number) {
		payCheck = number;
	}

	public int getpayCheck() {
		return payCheck;
	}

	public String youSave() {
		int save = payCheck - 100;
		return "1) saving $100, you now have $" + save + " to spend";
	
}
	//paycheck after an expense
	public void postExp(int expense) {
		payCheck -= expense;
	}
	
	public String report() {
		return "your remaining paycheck: $" + payCheck;
		
		
		
	}
	
	
}
