import java.util.Scanner;


public class TemperatureConversions {

	public static void main(String[] args) {
		/*
		 * Prompt user for temperature in *F
		 * Store it
		 * Give that value to getCelcius to calculate *C
		 * Display the result in user-friendly manner
		 */
		
		Scanner input = new Scanner(System.in);
		//asks user to input the temperature and the desired temp type
		System.out.println("Enter a temperature: ");
		double temperature = input.nextDouble();
		System.out.println("Enter the letter of the temperature type (C or c for Celsius, F or f for fahrenheit).: ");
		//initializes all variables needed for calculations below
		String tempType = input.next();
		String temp = input.next();
		
		String C = tempType;
		String c = tempType;
		
		String F = temp;
		String f = temp;
		
		double celsius = temperature;
		double fahrenheit = temperature;
		//if C or c is entered the first if is executed, if F or f is entered the else if is executed
		//displaying the respective type of temp and the actual temp
		if(tempType == C || tempType == c){
			fahrenheit = (9*(celsius/5)+32);
			System.out.println("The celsius degree " + celsius + " is " + fahrenheit + " in fahrenheit.");
		}
		else if(temp == F || temp == f){
			celsius = (5*(fahrenheit-32)/9);
			System.out.println("The fahrenheit degree " + fahrenheit + " is " + celsius + " in celsius.");
		}
	}
}
