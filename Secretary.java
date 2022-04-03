import java.util.Scanner;

// NAME: Puja Roy
// DATE: 4/1/22
public class Secretary extends Employee {
	private String dt;//Dictation Text
    Secretary()
    {
    }
    Secretary(int h,int v,double s,String st,String g)
    {
    
    super(h,v,s,st);// passing to super class constructor
    dt=g;
    }
    public void setDT(String s) // Set function for Dictating text 
    {
            dt=s;
    }
public String getDT()
{
    return(dt);
}
@Override
public String toString()  // Prints out the messages
{
    String s;
    s="\nHours\t\t:\t"+hrs+" , Salary\t:\t"+salary+" , Vacation Days\t:\t" +vd + ", Vacation Form\t:\t"+vf+", Dictating Text\t:\t"+dt;
    return s;
}
}
