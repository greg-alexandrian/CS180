import java.util.Scanner;


public class SquareTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the side of square:");
		double userInput = input.nextDouble();
		Square mySquare = new Square(userInput);
		//mySquare.setLength(20);
		//System.out.println(mySquare.getArea());
		mySquare.printInfo();
	}

}
