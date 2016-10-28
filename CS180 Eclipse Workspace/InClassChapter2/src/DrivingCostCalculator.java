import java.util.Scanner;


public class DrivingCostCalculator {

	public static void main(String[] args) {
		/*
		 * 0. create a Scanner to help with input from keyboar
		 * 1. Prompt user for miles per day
		 * 2. Store that info in milesPerDay
		 * 3. Prompt for mpg and store in mpg
		 * 4. Prompt for the price of gaz 
		 * 5. Store that info in gazPrice
		 * 6. Calculate the cost of driving and store in 'drivinCost'
		 * 7. output to the screen the result
		 */
		Scanner input = new Scanner(System.in);
		double milesPerDay;
		double mpg;
		double gazPrice;
		double drivingCost; //cost of driving per day
		System.out.println("Please enter miles driven per day:");
		milesPerDay = input.nextDouble();
		System.out.println("Enter the mpg of your car");
		mpg = input.nextDouble();
		System.out.println("What was the gaz per galon last time you filled?");
		gazPrice = input.nextDouble();
		drivingCost = milesPerDay/mpg*gazPrice;
		System.out.printf("Your cost of driving per day is %.2f", drivingCost);


	}

}
