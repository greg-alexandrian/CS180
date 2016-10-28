import java.util.Scanner;


public class CountingNumbers {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		int numPositives = 0;
		int userInput;
		System.out.println("Please enter an integer:");
		userInput = input.nextInt();
		if(userInput > 0){
			numPositives = numPositives + 1;
		}*/
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 5 digit number:");
		int num = input.nextInt();
	
	// my int varaiables go backwards as I look for remainders to use as the final output numbers
	// each following integer is subracted by the previous integer to round it out to zero and move decimal places
				
				int first  =  num % 10;
				int second =  ( num - first ) % 100 / 10;
				int third  =  ( num - first - second ) % 1000 / 100;
				int fourth =  ( num - first - second - third ) % 10000 / 1000;
				int fifth = ( num - first - second - third - fourth) % 100000 / 10000;
				
		System.out.println("Your digits when seperated are: ");
		System.out.println(fifth + " " + fourth + " " + third + " " + second + " " + first);

	}

}
