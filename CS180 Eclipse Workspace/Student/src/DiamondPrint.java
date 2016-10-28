/**************************
 *  Author: Greg Alexandrian

 *  Date.: 9-27-2016
 **************************/

import java.util.Scanner;

public class DiamondPrint {
	public static void main(String[] args)
	{
		//scanner is needed for user input of integers
		Scanner input = new Scanner(System.in);

		int numberOfRows, middleRow; 

		System.out.println("How many rows would you like your pyramid to be? (please enter only integers)");
		numberOfRows = input.nextInt(); // length of the pyramid that is wanted by user (from top to bottom)

		for(int row = 1; row <= (numberOfRows + 1)/2; row ++){ //in case of numRows= 7 -- row <=4
			for(int spaces = 1; spaces <= (numberOfRows+1)/2 - row; spaces++){ // 4-row
				System.out.print(" ");
			}
			for(int stars =1; stars <= 2*row -1 ; stars++){ // row=1 -> star 1, row 2->stars 3, etc
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row = (numberOfRows-1 )/2; row >= 1 ; row --){ //row = 3 -> 1
			for(int spaces = 1; spaces <= (numberOfRows+1)/2 - row; spaces++){// 4-row
				System.out.print(" ");
			}
			for(int stars =1; stars <= 2*row - 1; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

