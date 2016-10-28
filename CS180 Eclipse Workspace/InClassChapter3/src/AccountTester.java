import java.util.Scanner;


public class AccountTester {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please enter name of account holder");
		String name = input.next();*/
		Account myAccount = new Account("Greg", "Alexandrian", 100);
		/*myAccount.setFirstName(name);
		//System.out.println(myAccount.getFirstName());
		System.out.println("Enter your initial deposit amount");
		double depositAmt = input.nextDouble();
		myAccount.depostit(depositAmt);
		System.out.println(myAccount.getBalance());
		myAccount.withdraw(200);*/
		System.out.printf("First Name:%s \n ", myAccount.getFirstName());
		System.out.println("Final Balance is:" + myAccount.getBalance());

	}

}
