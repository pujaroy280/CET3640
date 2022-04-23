import java.util.Scanner;
import javax.swing.*;
//NAME: Puja Roy
//DATE: 4/23/22

public class Testtwo {   //This is the main file that will run the overall program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Point point = new Point( 7, 11 );         

	      Square square = new Square( 3.5, 22, 8 );

	      Cube cube = new Cube( 3.3, 10, 10 );

	Shape[] arrayOfShapes = new Shape[ 3 ];   // Create an array 

	      String result = "";

	arrayOfShapes[ 0 ] = point;      // Shapes of the array

	      arrayOfShapes[ 1 ] = square;

	      arrayOfShapes[ 2 ] = cube;

	result += point.getName() + ": " +

	                    point.toString();

	result += "\n" + square.getName() + ": " +

	                    square.toString();

	result += "\n" + cube.getName() + ": " +

	                    cube.toString();

	for ( int i = 0; i < 3; i++ ) {     // For loop that prints out the area and volume of shapes

	         result += "\n" + arrayOfShapes[ i ].getName() +

	            ": " + arrayOfShapes[ i ].toString();

	          result += "\n" + "Area = " +

	            arrayOfShapes[ i ].area();

	         result += "\n" + "Volume = " +

	            arrayOfShapes[ i ].volume();

	      }

	JOptionPane.showMessageDialog(

	            null, result, "Shapes",

	            JOptionPane.INFORMATION_MESSAGE );  

	      System.exit( 0 );
		
	}

}
