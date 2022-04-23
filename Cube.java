import java.util.Scanner;
import javax.swing.*;
//NAME: Puja Roy
//DATE: 4/23/22
public class Cube extends Square {   // Class for Cube which extends Square 
	private double depth;

	public Cube( double s, double a, double b )

	   {

	      super( s, a, b );

	      depth = s;
}
	public double area() { return super.area() * 6; }   // Doubles the area of the shape

	public double volume() { return super.area() * depth; }  // Doubles the volume of the shape 

	public String toString()

	      { return super.toString() + "; depth = " + depth; }

	public String getName() { return "Cube"; }  // Returns the Cube shape

	}