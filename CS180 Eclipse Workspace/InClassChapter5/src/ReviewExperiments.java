import java.util.Scanner;


public class ReviewExperiments {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the numbe x:");
		
		int x = input.nextInt();
		/*
		int y = 6;
		if(x > 5)
			if(y > 5)
				System.out.println("x and y are > 5");
		else
			System.out.println("x < 5");
		if(x > 5){
			if(y>5){
				System.out.println("x and y are > 5");
			}
		}else{ } {
			System.out.println("x < 5");
		}
		
		System.out.println("End of the program.");*/
		
		/*while(x <= 100){
			x*=3; // x = x*3;
		}*/
		//Try x = 200 in do-while and while
		do{
			if(x > 90){
				break;
			}
			x*=3; 
		}while(x <=100);
		System.out.println("Final value of x is:" + x);
	}

}
