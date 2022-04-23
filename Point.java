import java.util.Scanner;
import javax.swing.*;

//NAME: Puja Roy
//DATE: 4/23/22
public class Point extends Shape {    // This is a class file for Point which extends the shape
	protected double x, y;

	public Point( double a, double b ) { setPoint( a, b ); }     // Function that doubles the shape

	public void setPoint( double a, double b )

	   {

	      x = a;

	      y = b;

	   }

	public double getX() { return x; }   // Returns x 

	public double getY() { return y; }   // Returns y

	public String toString()

	      { return "[" + x + ", " + y + "]"; }

	public String getName() { return "Point"; }   // Return Point
}
