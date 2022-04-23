import java.util.Scanner;

//NAME: Puja Roy
//DATE: 4/23/22

public class Voter {     // Voter class declaring the string name and party 
	   //instance variables
	   private String name;
	   private char party;
	  
	   //constructor
	   public Voter(String name, char party) {
	       this.name = name;
	       this.party = party;
	   }
	  
	   //methods implementation
	   public char getParty() {
	       return this.party;
	   }
	  
	   public String getName() {
	       return this.name;
	   }  
}
