package lab2;
import java.util.Scanner;

//NAME: Puja Roy
//DATE: 2/22/22
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Store user inputs
		// Declare variables 
		int i = 0;
        int num = 0;
        int sum = 0;
        int smallest = 0;
        int largest = 0;

        // Create Scanner object for obtaining the input
        Scanner input = new Scanner(System.in);

        // Print a line that prompts the user to enter a number or -99 to end the program from running (Program Instructions)
        System.out.println("Enter a number or -99 to end: ");
        num = input.nextInt(); // This function allows to input a number and stores it in the program (Prompt user for input)

        // This is the while loop that executes which number is smallest or largest 
        while(num != -99) {   // If the number is not equal to -99
            //System.out.println(num);
            i++; // The input of the number increments 
            sum += num; 
            // sum = sum + num;
            System.out.println("Enter a number or -99 to end: "); // Prompt user for input of another number
            num = input.nextInt();
            if (num > largest)
                largest = num;
            else {
                smallest = num;
            }
        }
           // Display the output
        System.out.println("Smallest value entered = " + smallest); // Displays the smallest number
        System.out.println("Largest value entered = " + largest);   // Displays the largest number 
        System.out.println("Sum = " + sum);  // Displays the sum
        System.out.println("Average = " + (float)sum/i); // Displays the Average // The float is used to print a decimal value of the average 
	}

}
