import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yesNo; //1 for yes, 0 for no
		/*
		 * Add 3 tbs of flower one by one stirring 5 times after each spoon
		 */
		/*
		for(int tbs = 1; tbs <=3; tbs++){
			System.out.println("Adding flower");
			for(int stir = 1; stir <= 5; stir++){
				System.out.println("I am stirring;");
				System.out.println("Is it smooth? Enter 1 for yes, or any # for no");
				yesNo = in.nextInt();
				if(yesNo == 1){
					break;
				}
			}
		}*/
		
		/*
		System.out.println("Please ener num or Ctrl-Z to stop");
		while (in.hasNext()){
			int n = in.nextInt();
			System.out.println(n);
			System.out.println("Please ener num or Ctrl-Z to stop");
		}*/
		
		for(int row = 1; row <= 7; row++){
			for(int column =1; column <=7; column++){
				if(column == row || row == 1 || column == 7){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*for(int row = 1; row <= 7; row++){
			for(int column =1; column <=7; column++){
				if(column >= row){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		/*for(int row = 1; row <= 7; row++){
			for(int column =1; column <=7; column++){
				if(column == row || column == 7 || row == 1 || row == 7 || column == 1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/

		//upper half of the diamond 
		//for every row 
			//print blanks starting with #of rows - 1 and less one with each new row
			//print stars starting with one and increasing by 2 for every additional row
			//Insert a blank line
		/*int size = 7;
		for(int row = 1; row <= (size+1)/2; row++){
			for(int blanks = 1; blanks <= (size+1)/2 - row; blanks++){
				System.out.print(" ");
			}
			for(int stars = 1; stars <= 2*row - 1; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		//Lower half of the diamond
		//Do printing of rows in reverse order
		for(int row = (size+1)/2; row >=1 ; row--){
			for(int blanks = 1; blanks <= (size+1)/2 - row; blanks++){
				System.out.print(" ");
			}
			for(int stars = 1; stars <= 2*row - 1; stars++){
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
