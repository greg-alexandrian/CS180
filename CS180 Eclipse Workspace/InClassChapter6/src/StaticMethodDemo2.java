import java.util.Scanner;
public class StaticMethodDemo2 {

	public static void main(String[] args) {
		/*boolean b = isDivisibleByThree(690);
		System.out.println(b);*/
		//System.out.println(getMaxOfUserInput());
		/*for (int i = 1; i<=10000; i++){
			if(isPerfect(i)){
				printPerfectNum(i);
			}
		}*/
		System.out.println(getSumOfDigits(312));
		

	}
	/*
	 * returns true if number is divisible by three and false otherwise
	 */
	public static boolean isDivisibleByThree(int number){
		boolean isTrue = false;
		if(number % 3 == 0){
			isTrue = true;
		}
		return isTrue;
	}
	/*
	 * return hypotenuse of a right triangle with sides a and b
	 */
	public static double getHypotenuse(double a, double b){
		double hypotenuse;
		hypotenuse = Math.sqrt(a*a + b*b);
		return hypotenuse;
	}
	/*
	 * Returns maximum of user inputs when user terminates input by Ctrl-Z
	 * In case if user is not enering any number an error message will displayed and 0 will returned
	 */
	public static double getMaxOfUserInput(){
		double max = 0; 
		Scanner input = new Scanner(System.in);
		double userInput;
		int counter = 0;
		/*System.out.println("Please enter a number:");
		max = input.nextDouble();*/
		System.out.println("Please enter a number:");
		while (input.hasNext()){
			counter++;
			userInput = input.nextDouble();
			if(counter ==1){
				max = userInput;
			}
			if(userInput>max){
				max = userInput;
			}
			System.out.println("Please enter a number:");
		}
		if(counter == 0){
			System.out.println("No numbers were entered. Default 0 was returned");
		}
		return max;
	}
	public static double getSquareSideByArea(double area){
		double side;
		
		side = Math.sqrt(area);
		if(area < 0){
			System.out.println("invalid");
		}
		return side;
	}
	//returns true if num is a perfect number -- equals to sum of all factors
	public static boolean isPerfect(int num){
		int sumOfFactors = 0;
		for(int i=1; i <= num/2; i++){
			if(num%i == 0){
				sumOfFactors+=i;
			}
		}
		if(sumOfFactors == num)
			return true;		
		return false;
	}
	public static void printPerfectNum(int num){
		if(!isPerfect(num)){
			System.out.println(num + " is not perfect");
		}else{
			System.out.print(num + " is sum of factors:");
			for(int i=1; i<=num/2; i++){
				if(num%i==0){
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
	public static int getSumOfDigits(int num){
		int digitSum = 0;
		//while there are more digits add them to the digitSum
		while(num != 0){
			digitSum += num%10;
			num /= 10;
		}
		return digitSum;
	}
	

}