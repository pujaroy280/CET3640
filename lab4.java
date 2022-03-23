import java.util.Scanner;

//NAME: Puja Roy
//DATE: 3/23/22
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[11]; // Array of 11 num size
	       int temp=0,count,k=0;
	       Scanner s=new Scanner(System.in);
	       for(int i=0;i<11;i++) // This loop is a statement to enter 10 numbers ranging between 10 and 100
	       {
	       count=0; // This increments to verify if a duplicate number is found
	       System.out.print("Enter number:");
	       temp=s.nextInt();
	       while(temp<10 || temp>100){ // This loop prompts the user to enter numbers between 10 and 100
	       System.out.println("number should be b/w 10 and 100");
	       System.out.print("Enter number:");
	       temp=s.nextInt();
	       }
	       for(int j=0;j<k;j++) //Compares input to numbers in the array
	       {
	       if(temp==num[j])
	       {
	       count++;
	       System.out.print(temp+" has already been entered ");
	       }
	       }
	       if(count==0)
	       {
	       num[k]=temp; // The input is stored into the array unless a duplicate is found
	       k++; // k is used to indicate number of values that are stored into the array
	       }
	       for(int l=0;l<k;l++)
	       {
	       System.out.print(num[l]+" "); // Prints the elements in the array 
	       }
	       System.out.println();
	       }
	}

}
