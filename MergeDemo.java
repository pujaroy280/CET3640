import java.util.Arrays;
import java.util.Scanner;

//NAME: Puja Roy
//DATE: 5/12/22
public class MergeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("How many lines to be sorted:");  // Prompts the user how many lines to be sorted
		int size=input.nextInt();  // Scans how many lines are inputted by the user
		String[] lines=new String[size];
		lines[0]=input.nextLine();  //Scans the next line inputted by the user 
		System.out.println("please enter lines...");  // Allows user to enter lines 
		for(int i=0;i<lines.length;i++)   // For loop that runs through the lines 
		{
		lines[i]=input.nextLine();
		}
		System.out.println();
		System.out.println("Lines Before Sorting:");  // Prints the lines that are not sorted 
		System.out.println(Arrays.toString(lines));
		mergeSort(lines);
		System.out.println();
		System.out.println("Lines after Sorting:");  //  Prints the lines that are sorted 
		System.out.println(Arrays.toString(lines));
		}

		public static void mergeSort(String[] s)
		{
		if(s.length>1)   // If else statement that categorizes the lines in alphabetical order
		{
		String[] left=Arrays.copyOfRange(s,0,s.length/2);
		String[] right=Arrays.copyOfRange(s,s.length/2,s.length);
		mergeSort(left);
		mergeSort(right);
		merge(s,left,right);
		}
		}
		public static void merge(String[] result, String[] left, String[] right) // Algorithm that sorts the lines from left and right 
		{
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++)
		   {
		   if (i2 >= right.length || (i1 < left.length &&left[i1].compareToIgnoreCase(right[i2])<0))
		   {
		result[i] = left[i1];
		i1++;
		}
		   else
		   {
		result[i] = right[i2];
		i2++;
		}
		}
		}		
	}

