import java.util.Arrays;//import Arrays to allow arrays to be used as lists

import java.util.Scanner;//import Scanner
//Michael Lange
public class Arrays3 {//declare new class

	public static void main(String[] args) {//declare new main method
		/*
		 * ask user to enter 5 words
		 * sort it in alphabetical order
		 * display the sorted list as well as original one 
		 */
		Scanner input = new Scanner(System.in);//initialize Scanner
		System.out.println("Please enter the amount of words you want to put in alphabetical order");//ask user for input
		int numberOfElements = input.nextInt();//declare new int variable so that number of entries is the same as 
		String[] wordArray = new String[numberOfElements];//initialize String array having certain amount of available inputs made by user
		String[] copyArray = new String[numberOfElements];//initialize String array having certain amount of available inputs made by user
		for(int index=0; index < wordArray.length; index++){//loop for being able to use inputs into the arrays
			System.out.println("Please enter a word or Ctrl-Z to stop");//ask input from user
			if(!input.hasNext()){//allow user to use Ctrl-Z to stop program where it is
				break;
			}//end if statement
			wordArray[index]=input.next();//each entry will be assigned to a new number in the array
		}//end loop
		System.arraycopy(wordArray, 0, copyArray, 0, wordArray.length);//make a copy of an array
		Arrays.sort(wordArray);//sort copy of array in alphabetical order
		for(int index =0; index < wordArray.length; index++){//loop for being able to use inputs into the arrays
			System.out.println(copyArray[index] + "--" + wordArray[index]);//how arrays will be displayed
		}//end loop
	}//end main method
}//end class Arrays3