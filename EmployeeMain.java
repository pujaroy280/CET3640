import java.util.Scanner;

// NAME: Puja Roy
// DATE: 4/1/22
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee e=new Employee(40,10,40000,"Yellow");//object of Employee
	        System.out.println(" Employee\t:\t"+e.toString());
	        Secretary s=new Secretary(40,10,40000,"Yellow","Hello"); // System prints out messages 
	        System.out.println("\nSecretary\t:\t"+s.toString());
	        Marketer m=new Marketer(40,10,40000,"Yellow");
	        System.out.println("\nMarketer\t:\t"+m.toString());
	        Lawyer l=new Lawyer(40,15,40000,"Pink");
	        System.out.println("\nLawyer\t:\t"+l.toString());
	        LegalSecretary ls=new LegalSecretary(40,10,40000,"Yellow","Hello");
	        System.out.println("\n Legal Secretary\t:\t"+ls.toString());
	}

}
