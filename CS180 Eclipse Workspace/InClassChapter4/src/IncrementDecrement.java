/*
 * Demo how ++ -- work
 */
public class IncrementDecrement {
	public static void main(String[] args){
		int num = 5;
		int step = 7;
		System.out.println("Value of num before incrementing " + num);
		num+=step; //num = num + step;  num++ the same as num+=1
		System.out.println("Value of num after incrementing " + num);
		System.out.println("checking the value one more time : " + num);
		
	}
	

	
}
