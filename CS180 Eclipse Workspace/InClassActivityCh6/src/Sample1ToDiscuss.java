import java.util.Scanner; //needed for user input
public class Sample1ToDiscuss {

	public static void main(String[] args) {
		
		Sample1ToDiscuss.printSquareOfCharacters(5, "Z"); 
	}
	
	public static void printSquareOfCharacters(int size, String prn){
		int i = 1; //assign i to 1
		int j = 1; //assign j to 1
		while (i <= size){ //if i is less than or equal to value of size
			while (j <= size){ //while j (column) is less than or equal to size
				System.out.print(prn); //print user defined character
				j++; //advance to next column
			}
			if (j > size){ //after printing out last column
				System.out.print("\n"); //terminate line
				j = 1; //reset column to 1
				i++; //advance to next row
			}
		}
	}

}
