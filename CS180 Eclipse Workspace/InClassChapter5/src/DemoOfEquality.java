/*
 * Example illustrating danger of comparing doubles for equality
 */
public class DemoOfEquality {

	public static void main(String[] args) {
		double number = .05;
		double counter = 0;
		while (counter != number){
			counter+=.01;
			System.out.println("Adding .01");
		}
		System.out.println("Final value of counter is:" + counter);

	}

}
