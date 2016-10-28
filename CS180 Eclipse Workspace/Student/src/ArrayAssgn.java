import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAssgn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*
		 * Develop a program that will ask the user in a sentinel-controlled
		 * loop to enter words. After all words will be entered the program
		 * should display them in alphabetical order along with the original
		 * order side by side.
		 */

		System.out.println("enter word or cntrl-z to quit");// prompt user for input 
		
		// create a new array list to store words
		String[] words = new String[5];//create an array 'words'
		String[] copy = new String[words.length];// create an array to copy 
		int count = 0;
		while (input.hasNext()) {
			words[count] = input.next();// assign user input to array words index 'count' 
			count++;
		}
		for (int i = 0; i < count; i++) {// for loop to assign elements of array copy a value for each iteration 
			copy[i] = new String(words[i]);
		}
		// call method sort of class arrays
		Arrays.sort(words);
//iterate through array words and print original and copied array value
		for (int i = 0; i < words.length; i++) {

			System.out.println("Original " + words[i] + "     Copy " + copy[i]);
		}
		// for(int i = 0; i < words.length; i++){

		// .out.print("\t\t\nCopy " + copy[i]);
		// }

	}

}
