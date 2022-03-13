import java.util.Scanner;

//NAME: Puja Roy
//DATE: 3/12/22
// This program compares the SAT or ACT exams of 2 college applicants. This program prompts the user to input their GPA, SAT and ACT score. From there on, the program calculates the scores inputted and determines which applicant is better. 
public class Main {

	public static double applicant(String var, Scanner cin)
    {
        int x;
        double test_res, gpa_res;
        
        System.out.println(var);
        System.out.print("do you have 1)SAT scores or 2)ACT scores ? ");   // Prompts the user if they have SAT or ACT scores
        x = cin.nextInt();
        
        if(x == 1)             // If-Else conditional statement to determine which exam the user has taken
        {
            test_res = computeSAT(cin);
        }
        else
        {
            test_res = computeACT(cin);
        }
        
        gpa_res = computeGPA(cin);
        
        return test_res + gpa_res;
    }
    
    public static double computeSAT(Scanner cin)
    {
        double result;
        double math, verbal;
        System.out.print("SAT math ? ");    // Prompts the user for SAT Math score
        math = cin.nextDouble();
        System.out.print("SAT verbal ? "); // Prompts the user for SAT Verbal score
        verbal = cin.nextDouble();
        
        result = (2*verbal + math)/(24.0);
        return result;
    }
    
    public static double computeACT(Scanner cin)
    {
        double result;
        double m,e,s,r;
        
        System.out.print("ACT English ? ");  // Prompts user for ACT English score
        e = cin.nextDouble();
        System.out.print("ACT math ? ");     // Prompts the user for ACT math score
        m = cin.nextDouble();
        System.out.print("ACT reading ? ");  // Prompts the user for ACT reading score
        r = cin.nextDouble();
        System.out.print("ACT science ? ");  // Prompts the user for ACT science score 
        s = cin.nextDouble();
        
        result = (2*r + e + m + s)/(1.8);    // Calculates scores provided
        return result;
    }
    
    public static double computeGPA(Scanner cin)
    {
        double result, gpa, max_gpa;
        
        System.out.print("overall GPA ? ");   // Prompts user for overall GPA
        gpa = cin.nextDouble();
        System.out.print("max GPA ? ");    // Prompts user for max GPA
        max_gpa = cin.nextDouble();
        
        result = (gpa/max_gpa)*100;   // Calculates the average of the GPA scores
        return result;
    }
    
    public static void reportResults(double var1, double var2)
    {
        if(var1 > var2){
            System.out.println("The first applicant seems to be better");   // Conditional statement to determine which student's scores are better
        }
        else{
            System.out.println("The second applicant seems to be better");
        }
    }

        public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        double score1, score2;
        
        System.out.println("This program compares two applicants to determine which one seems stronger.");  // Executes message of comparing 2 applicants
        System.out.println("For each candidate, Enter either SAT or ACT scores plus a weighted GPA");  // Executes message that requires SAT or ACT scores based on a certain GPA
        
        String var1 = "Information for the first applicant: ";    // Provides overall info of the first applicant
        String var2 = "Information for the second applicant: ";   // Provides overall info of the second applicant
        
        score1 = applicant(var1,cin);
        score2 = applicant(var2,cin);
        
        System.out.println("First applicant overall score = " + score1);  // Prints out overall score of the first applicant
        System.out.println("Second applicant overall score = " + score2);  // Prints out overall score of the second applicant
        
        reportResults(score1,score2);    // Reports the results of score1 and score2
		
	}

}
