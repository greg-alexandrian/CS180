import java.util.ArrayList;
import java.util.Scanner;

/*michael hapka
java assignment arrays 3
assignment using array list*/
public class Arrays3Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*
		 * Develop a program that will ask the user in a sentinel-controlled
		 * loop to enter words. After all words will be entered the program
		 * should display them in alphabetical order along with the original
		 * order side by side.
		 */

		System.out.println("enter word or cntrl-z to quit");

		// create a new array list to store words
		ArrayList<String> words = new ArrayList<String>();
		// create a separate array for copying
		ArrayList<String> arrayCopy = new ArrayList<String>();

		while (input.hasNext()) {//assign idex of arraylist words using add method, method call sends arguments input.next
			words.add(input.next());
		}

		// java.util.Collections.sort(words);//call to Collections class 'sort'
		// method sending ArrayList 'words' as an argument

		for (int i = 0; i < words.size(); i++) {

		}
		for (String s : words) {// enhanced for loop 
			arrayCopy.add(new String(s));// call to arrayCopy method add sending argument containing new string object initialized with counter
		}

		java.util.Collections.sort(words);// call to Collections class 'sort' method sending ArrayList 'words' as an argument
		System.out.println("sorted array\t\t copy of array");
		
		System.out.println("\t\t"+arrayCopy+"\n");
		for (int i = 0; i < words.size(); i++) {// for loop to iterate through
												
			
			System.out.printf("%s%n",  words.get(i));
		} // call to 'words' get method, send i as argument

	}

}
