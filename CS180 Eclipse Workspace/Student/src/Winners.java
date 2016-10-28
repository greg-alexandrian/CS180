import java.util.ArrayList;
import java.util.Scanner;

public class Winners {

	public static void main(String[] args) {
		/*Random rnd = new Random();
		int firstWinner = rnd.nextInt(41) + 1;
		int secondWinner = rnd.nextInt(41) + 1;
		System.out.printf("And the winners are: # %d, and # %d", firstWinner, secondWinner);*/
		/*Integer [] a = {7,3, -6, 27, 31, 0};
		Arrays.sort(a);
		for(int element : a)
			System.out.print(element + " ");
		int location = Arrays.binarySearch(a, 7);
		System.out.println(location);*/
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> aList= new ArrayList();
		System.out.println("Add num or Ctrl-z to stop");
		while(in.hasNext()){
			aList.add(in.nextInt());
		}
		System.out.println(aList);
		Object[] array = aList.toArray();
		System.out.println(array);

	}

}
