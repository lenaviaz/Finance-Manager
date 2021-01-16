
public class finance {
	
	private double payCheck;
	private double Save = 100;
	private double savings = 1564;
	private double expense;
	private double monLeft;
	
	public finance() {
		
	}
	//takes out 100
	public void setpayCheck(double check) {
	    payCheck = check - 100;
	}
	
	public void setRemCheck(double number) {
		payCheck = number;
	}

	public double getpayCheck() {
		return payCheck;
	}

	public String youSave() {
		double save = payCheck - 100;
		return "1) saving $100, you now have $" + save + " to spend";
	
}
	//paycheck after an expense
	public void postExp(double expense) {
		payCheck -= expense;
	}
	
	public String report() {
		return "your remaining paycheck: $" + payCheck;
		
		
		
	}
	
	
}
