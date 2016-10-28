
public class CheckingAccount extends Account {
	private static final double CHECK_FEE = .5;
	private int checkCount;
	
	public CheckingAccount(String name, String pin, double balance){
		super(name, pin, balance);
	}
}
