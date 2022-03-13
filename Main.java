import java.util.Scanner;

//NAME: Puja Roy
//DATE: 3/12/22
// This program calculates hours worked, hours paid, the gross salary of the job. It also provides information of how much federal tax, state tax and net pay the employee earns. 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String firstName;
        System.out.println("Enter your first name: ");   // Input First Name
        firstName = sc.nextLine();
        String lastName;
        System.out.println("Enter your last name: ");    // Input Last Name 
        lastName = sc.nextLine();
        int hoursWorked;
        System.out.println("Enter the number of hours worked: ");  // Input # of hours worked
        hoursWorked = sc.nextInt();
        double hourlyRate;
        System.out.println("Enter the hourly rate: ");   // Input hourly rate of the job
        hourlyRate = sc.nextDouble();

        double grossSalary;    
        if (hoursWorked <= 40) {                         // Calculates gross salary by multiplying hourly rate and hours worked
            grossSalary = hourlyRate * hoursWorked;
        } else {
            grossSalary = 40 * hourlyRate + (hoursWorked - 40) * 1.5 * hourlyRate;
        }
        double federalTax = 0.2 * grossSalary;
        double stateTax = 0.05 * grossSalary;
        double netPay = grossSalary - federalTax - stateTax;

        System.out.println("Name: " + firstName + " " + lastName);   // Prints the output of the code 
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly Paid: " + hourlyRate);
        System.out.println("The gross salary is: " + grossSalary);
        System.out.println("Federal tax: " + federalTax);
        System.out.println("State tax: " + stateTax);
        System.out.println("Net Pay: " + netPay);	
		
	}

}
