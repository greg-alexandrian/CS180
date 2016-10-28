import java.util.Scanner;


public class Example5_17 {

	public static void main(String[] args) {
		/*
		 * 1.Ask user for product # 
		 * 2.store that in productNum
		 * 3.Ask for quantity
		 * 4.Store quantity in 'quantity'
		 * 5.Determin what the price of the item is
		 * 		in case prodNum was 1 then price is 2.98
		 * 		in case prodNum  2 -- 4.5
		 *   	in case ......
		 *   Store that price in variable 'price'
		 * 6. calculate the total = price * quantity
		 * 7.Print out the result
		 */
		Scanner input = new Scanner(System.in); 
		int itemNum;
		int quantity;
		double price;
		double total;
		System.out.println("Please enter prod num");
		itemNum = input.nextInt();
		System.out.println("please enter the quantity:");
		quantity = input.nextInt();
		/*if(itemNum == 1){
			price = 2.98;
		}
		if(itemNum == 2){
			price = 4.5;
		}*/
		switch (itemNum){
		case 1:
			price = 2.98;
			break;
		case 2:
			price = 4.50;
			break;
		case 3:
			price = 9.98;
			break;
		case 4:
			price = 4.49;
			break;
		case 5:
			price = 6.87;
			break;
		default:
			System.out.println("Wrong item # price is 0");
			price = 0;			
		}
		
		total = price*quantity;
		System.out.println("The total is:" + total);

	}

}
