package HW1;
import java.util.Scanner;

// NAME: Puja Roy
// DATE: 2/18/22
public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first, second, add, subtract, multiply; 
	    float divide;
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = scanner.nextInt();  // Declare a variable for entering the first number in the program
	    second = scanner.nextInt(); // Declare a variable for entering the second number in the program

	    add = first + second; // Declare a variable for the addition method
	    subtract = first - second; // Declare a variable for the subtraction method
	    multiply = first * second; // Declare a variable for the multiplication method
	    divide = (float) first / second; // Declare a variable for the division method

	    System.out.println("Sum = " + add); // The system prints the output of the addition method
	    System.out.println("Difference = " + subtract); // The system prints the output of the addition method
	    System.out.println("Multiplication = " + multiply); // The system prints the output of the multiplication method
	    System.out.println("Division = " + divide); // The system prints the output of the division method
	}

}
