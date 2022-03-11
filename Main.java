import java.util.Scanner;

//NAME: Puja Roy
//DATE: 3/3/22
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewTestScore MyTestScores = new NewTestScore();  // Retrieves the scores from the NewTestScore Java program and stores it in the function MyTestScores
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score1 :");  // Input Score1
        int tmp = sc.nextInt();
       MyTestScores.setScore1(tmp);
       System.out.print("Enter Score2 :");   // Input Score2
       tmp = sc.nextInt();
       MyTestScores.setScore2(tmp);
       System.out.print("Enter Score3 :");   // Input Score3
       tmp = sc.nextInt();
       MyTestScores.setScore3(tmp);
       double avg = MyTestScores.getAverage();     // Calculates the Average of the 3 inputted scores
       System.out.println("The average of the scores is "+avg);  // Executes the Average of the 3 scores
	}

}
