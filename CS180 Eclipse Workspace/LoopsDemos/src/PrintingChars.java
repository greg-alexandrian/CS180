import java.util.Scanner;


public class PrintingChars {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		/*System.out.println("Enter char to print:");
		char charToPrint;
		charToPrint = stdin.next().charAt(0);
		switch(charToPrint){
		case 'A':
		case 'a':
			System.out.println("AAA");
			break;
		case 'B':
		case 'b':
			System.out.println("BBB");
		default:
			System.out.println("XXX");
		}*/
		System.out.println("Will you declare CIS major? (Yes, No, Maybe)");
		String answer = stdin.next();
		switch(answer){
		case "Yes":
			System.out.println("This is a great choice. We congratulate you");
			//break;
		case "No":
			System.out.println("Please don't rush with your decision. While it is difficult it will pay off in the long run");
			break;
		case "Maybe":
			System.out.println("It is great that you are considering! The entry level pay for CIS jobs is well above the average!");
			break;
		default: 
			System.out.println("Unexpected answer -:(");
		}
	}

}
