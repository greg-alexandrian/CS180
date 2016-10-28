import java.util.Scanner;


public class MaximumFinder {
	/*
	 * while user wants 
	 * 		prompt for a new number
	 * 		compare with current largest
	 * Ouput the largest
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int largest=5; 
		int counter = 0;
		System.out.println("Please enter a number or Ctrl-Z to stop");
		while(input.hasNext()){
			userInput = input.nextInt();
			if(counter == 0){
				largest = userInput;
			}
			if(userInput > largest){
				largest = userInput;
			}
			counter++;
			System.out.println("Please enter a number or Ctrl-Z to stop");
		}
		System.out.println("The largest number was:" + largest);
	}

}
