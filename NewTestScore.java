import java.util.Scanner;

//NAME: Puja Roy
//DATE: 3/3/22
public class NewTestScore {
	   private int score1,score2,score3;  // Constructed an object to make them accessible to the test scores inside the class
	    void setScore1(int m) {       // Stores the score for Score1
	        score1 = m;
	    }
	    int getScore1() {            // Retrieves the score for Score1
	        return score1;
	    }
	    void setScore2(int m) {     // Stores the score for Score2
	        score2 = m;
	    }
	    int getScore2() {         // Retrieves the score for Score2
	        return score2; 
	    }
	    void setScore3(int m) {    // Stores the score for Score3
	        score3 = m;
	    }
	    int getScore3() {        // Retrieves the score for Score3
	        return score3;
	    }
	    double getAverage() {       
	        return (score1+score2+score3)/3.0;   // Calculates average for the 3 scores stored in the program
	    }
}
