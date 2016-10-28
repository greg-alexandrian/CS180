
public class ReversingString {

	public static void main(String[] args) {
		int i; // index i for outer loop
	      int j; // index j for inner loop
	      String[] myCourses = {"CS", "ENG", "GEOG", "HIST"};
	      for (i = 0; i < myCourses.length; i++) {
	          //Inner loop reverses one string in the array
	          String reversed = "";
	          for (j = 0; j < myCourses[i].length(); j++) {
	             reversed = myCourses[i].charAt(j) + reversed;
	          }

	          System.out.println(myCourses[i] + " when reversed is: " + reversed);
	       }
	    } 

	}

