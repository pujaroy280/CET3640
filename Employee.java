import java.util.Scanner;

// NAME: Puja Roy
// DATE: 4/1/22
public class Employee {
   
	// Declares the Member Data
	protected int hrs;
	protected int vd;//Vacation Days
	protected double salary;
	    protected String vf;//Vacation Form
	        //default Constructor
	    public Employee ()
	    {
	         hrs=0;
	        vd=0;
	        salary=0;
	        vf="";
	    }
	//Parameterized Constructor
	public Employee (int h,int v,double s,String st)
	    {
	         hrs=h;
	        vd=v;
	        salary=s;
	        vf=st;
	    }
	//Set Function for Employee  hrs
	    public void sethrs(int i)
	    {
	        hrs=i;
	    }

	//Set Function for Employee Vacation Days
	public void setVD(int i)
	    {
	        vd=i;
	    }

	//Set Function for Employee Salary
	public void setVD(double i)
	    {
	        salary=i;
	    }
	//Set Function for Employee  Form
	    public void setForm(String s)
	    {
	        vf=s;
	    }
	//Get Function for Employee  hrs
	    public int gethrs()
	    {
	        return(hrs);
	    }

	//Get Function for Employee VD
	    public int getVD()
	    {
	        return(vd);
	    }
	//Get Function for Employee  Salary
	    public double getSalary()
	    {
	        return(salary);
	    }
	//Get Function for Employee  Vacation Form
	    public String getForm()
	    {
	        return(vf);
	    }

	        // Converting Employee  to String
	    @Override
	    public String toString()
	    {
	        String s;
	        s="\nHours\t\t:\t"+hrs+" , Salary\t:\t"+salary+" , Vacation Days\t:\t" +vd + ", Vacation Form\t:\t"+vf;
	        return s;
	    }
}
