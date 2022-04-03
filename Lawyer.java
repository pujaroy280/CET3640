import java.util.Scanner;

// NAME: Puja Roy
// DATE: 4/1/22
public class Lawyer extends Employee {
	Lawyer (int h,int v,double s,String st)  //Set function for the variables 
    {
    
    super(h,v,s,st);
    }
@Override
public String toString()   // Prints out the messages 
{
    String s;
    s="\nHours\t\t:\t"+hrs+" , Salary\t:\t"+salary+" , Vacation Days\t:\t" +vd + ", Vacation Form\t:\t"+vf+",\nI'll See You in Court!!!";
    return s;
}
}
