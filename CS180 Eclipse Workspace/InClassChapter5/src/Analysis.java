
// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses class Scanner

public class Analysis 
{
   public static void main(String[] args) 
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initializing variables in declarations
      int passes = 0; // variable that will contain #of students that passed the course
      int failures = 0; // variable that will contain #of students that fail the course
      int studentCounter = 1; // Counter of students that are processed
      int result; // one exam result (obtained from user)

      // process 10 students using counter-controlled loop
      /*while (studentCounter <= 3) 
      {
         // prompt user for input and obtain value from user
         System.out.print("Enter result (1 = pass, 2 = fail): ");
         result = input.nextInt();

         // if...else is nested in the while statement           
         if (result == 1)         
            passes = passes + 1;   
         else                        
            failures = failures + 1; 

         // increment studentCounter so loop eventually terminates
         studentCounter = studentCounter + 1;  
      } */
      /*int count;
      for( count = 1; count <= 3; count ++){
    	  System.out.print("Enter result (1 = pass, 2 = fail): ");
          result = input.nextInt();

          // if...else is nested in the while statement           
          if (result == 1)         
             passes = passes + 1;   
          else                        
             failures = failures + 1; 
      }
      //int count = 100;
      System.out.println("Number of students processed is : "+ count);*/
      
      System.out.print("Enter result (1 = pass, 2 = fail): ");
      for(;input.hasNext();){
    	  result = input.nextInt();

          // if...else is nested in the while statement           
          if (result == 1)         
             passes = passes + 1;   
          else                        
             failures = failures + 1; 
      }
      
      // termination phase; prepare and display results
      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

      /*// determine whether more than 8 students passed
      if (passes > 8)
         System.out.println("Bonus to instructor!");*/
   } 
} // end class Analysis
