import java.util.Scanner;


public class StaticMethodDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a non-negative number:");
		int cheerCount = input.nextInt();
		/*double userInput = input.nextDouble();
		double result = Math.sqrt(userInput);
		System.out.println("The square root is:" + result);
		System.out.println("Now I am squaring that result will it be the initial user Input?");
		System.out.println(getSquare(result));*/
		StaticMethodDemo1.cheer(cheerCount, "Good Job");
		

	}
	/*
	 * returning square of anyNumber 
	 */
	public static double getSquare(double anyNumber){
		double result = anyNumber*anyNumber;
		return result;
	}
	/*
	 * Printing out Hurrah count times
	 */
	public static void cheer(int count){
		for(int i=1; i<=count; i++){
			System.out.println("Hurrah!!");
		}
	}
	/*
	 * Printing out cheeringText count times
	 */
	public static void cheer(int count, String cheeringText){
		for(int i=1; i<=count; i++){
			System.out.println(cheeringText);
		}
	}
}
