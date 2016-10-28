// Fig. 4.8: ClassAverage.java
// Solving the class-average problem using counter-controlled repetition.
import java.util.Scanner; // program uses class Scanner

public class ClassAverage 
{
   public static void main(String[] args) 
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initialization phase
      int total = 0; // initialize sum of grades entered by the user
      int gradeCounter = 0; // initialize # of grade to be entered next
      System.out.print("Enter grade or Ctrl-Z to stop: "); // prompt 
      // processing phase uses counter-controlled repetition
      while (input.hasNext()) // loop 10 times
      {      
         int grade = input.nextInt(); // input next grade
         total = total + grade; // add grade to total
         gradeCounter = gradeCounter + 1; // increment counter by 1
         System.out.print("Enter grade or Ctrl-Z to stop: "); // prompt 
      } 
   
      // termination phase
      if(gradeCounter !=0){
    	  double average = (double)total / gradeCounter; // integer division yields integer result
    	  System.out.printf("%nTotal of all %d grades is %d%n",gradeCounter, total);
          System.out.printf("Class average is %.2f%n", average);
      }
      else{
    	  System.out.println("No grades were entered. No point of talking about averages!!");
      }
      

      // display total and average of grades
      
   } // end  main
} // end class ClassAverage

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
