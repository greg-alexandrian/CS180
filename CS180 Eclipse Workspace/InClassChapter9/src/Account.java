import java.util.Scanner;

public class Account {
	private static Scanner input = new Scanner(System.in);
	private double balance;
	private String name;
	private String pin;
	
	public Account (String name, String pin, double balance){
		this.name = name;
		this.pin = pin;
		credit(balance);
	}

	public void credit(double amt) {
		if(amt > 0)
			balance+=amt;
	}
	public void debit(double amt, String thePin){
		if(thePin.equals(pin)){
			balance -= amt;
		}else{
			System.out.println("Transaction was not processed. Pin incorrect.");
		}
	}
	public void debit(double amt){
		System.out.println("Is signature is correct (1- Yes; 2 - NO)? ");
		int yesNo = input.nextInt();
		if(yesNo == 1){
			balance -= amt;
		}
	}
	public String toString(){
		return String.format("%s holder:%s", getClass().getName(), name);
	}
}
