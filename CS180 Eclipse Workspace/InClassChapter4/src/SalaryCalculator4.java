import java.util.Scanner;
//NOT YET DEMONSTRATED
/*
 * Application that allows to calculate employee's salary based on hours worked
 * and hourly rate. Overtimes are paid at 1.5 rate
 */
public class SalaryCalculator4 {

	public static void main(String[] args) {
		/*
		 * 0. Create a scanner. Counter for employees
		 * 
		 * 1. prompt user for hours worked or Ctrl-Z to stop
		 * 2. Store that info in variable named hoursWorked
		 * 3. promt user for rate
		 * 4. store that info in variable named ratePerHour
		 * 5. Calculate the salary and store it in var 'salary'
		 * 6. print that info
		 * Repeat 1-6 indefinitely until Ctrl-Z is entered
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int numEmployee = 0;
		int employeeCounter = 0;
		double hoursWorked;
		double ratePerHour;
		double salary;
		System.out.println("Please enter hours worked or Ctrl-Z to quit:");
		
		while(input.hasNext()){
			hoursWorked = input.nextDouble();
			System.out.println("Please enter rate per hour");
			ratePerHour = input.nextDouble();
			if(hoursWorked > 40){
				salary = 1.5*(hoursWorked - 40)*ratePerHour + 40*ratePerHour;
			}
			else{
				salary = hoursWorked * ratePerHour;
			}
			System.out.println("Your salary is: "+ salary);
			System.out.println("Please enter hours worked or Ctrl-Z to quit:");
			//hoursWorked = input.nextDouble();
			employeeCounter++;		//employeeCounter = employeeCounter + 1;
		}
		System.out.println("Thank you for using our awesome calculator!!");
		
		

	}

}
