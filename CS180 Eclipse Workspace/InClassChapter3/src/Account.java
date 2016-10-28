/*
 * Represent a bank account
 */
public class Account {
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account(String fName, String lName, double initBalance){
		firstName = fName;
		lastName = lName;
		balance = initBalance;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String fName){
		firstName = fName;
	}
	public void depostit(double amt){
		balance = balance + amt;
	}
	public double getBalance(){
		return balance;
	}
	public void withdraw(double withdrawAmt){
		balance = balance - withdrawAmt;
	}
}
