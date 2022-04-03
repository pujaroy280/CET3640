import java.util.Scanner;

// NAME: Puja Roy
// DATE: 4/1/22
public class LegalSecretary extends Secretary {
	LegalSecretary(int h,int v,double s,String st,String g) //Set function for the variables 
    {
    
    super(h,v,s,st,g);
    }
@Override
public String toString() // Prints out the messages 
{
    String s;
    s="\nHours\t\t:\t"+hrs+" , Salary\t:\t"+salary+" , Vacation Days\t:\t" +vd + ", Vacation Form\t:\t"+vf+"\n I could File all Day!!!";
    return s;
}
}
