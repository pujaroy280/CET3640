package p4;
import java.util.Scanner;
public class prac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner console = new Scanner(System.in);//user input
		System.out.print("What percentage did you earn? ");
		int percent = console.nextInt();
		System.out.print("Whats your name? ");//name input
		String name = console.next();
		
		if (percent >= 90) {
			System.out.println("You got an A!");
		}
		else if (percent >= 80) {
			System.out.println("You got an B!");
		}
		else if (percent >= 70) {
			System.out.println("You got an C!");
		}
		else if (percent >= 60) {
			System.out.println("You got an D!");
		}
		else if (percent < 60) {
			System.out.println("You got an F!");
		}
		
		
	}

}
