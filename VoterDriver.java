import java.util.ArrayList;
import java.util.Scanner;

//NAME: Puja Roy
//DATE: 4/23/22
public class VoterDriver {      // Main file for the VoterDriver class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList of voters
	       ArrayList<Voter> voters = new ArrayList<>(10);
	      
	       // Adds 10 voters to array list
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	       voters.add(new Voter("Leibowitz",'D'));
	      
	       //For loop that prints the array 10 times 
	       for(int index = 0; index < voters.size(); index++) {
	           if(voters.get(index).getParty()=='D') {
	               System.out.println("Name:"+voters.get(index).getName() +" Party:"+voters.get(index).getParty());
	           }
	       }
	}

}
