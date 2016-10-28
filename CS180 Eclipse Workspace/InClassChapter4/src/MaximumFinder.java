import java.util.Scanner;


public class MaximumFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int largest = 0; 
		int counter = 0;
		/*System.out.println("Please enter first number");
		userInput = input.nextInt();
		largest = userInput;
		counter++;*/
		while(counter < 3){
			System.out.println("Please enter another number");
			userInput = input.nextInt();
			if(userInput > largest){
				largest = userInput;
			}
			counter++;
		}
		System.out.println("The largest number was:" + largest);
	}

}
