//Problematic code to discuss
import java.util.Scanner;
public class SampleToDiscuss2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); //user input assigned to stdin
		System.out.println("Please enter a temperature (Celsius or Fahrenheit"); //prompt user
		double temperature = stdin.nextDouble(); //user input assigned to double proc
		System.out.println("Would you like to convert to Celsius or Fahrenheit?"); //prompt user
		String act = stdin.next(); //user input assigned to String act
		if (act == "Fahrenheit"){ //checks for a celsius to fahrenheit conversion
			getFahrenheit(temperature); //calls getFahrenheit
		}
		if (act == "Celsius"){
			SampleToDiscuss2.getCelsius(temperature); //calls getCelsius
		}
	}
	
	public static double getCelsius(double ft){
		double conv = (ft - 32) * (5/9); //simple conversion factor
		return conv; //return result
	}
	
	public static double getFahrenheit(double ct){
		double conv = (ct * (9/5)) + 32; //simple conversion factor
		return conv; //return result
	}
}
