import java.util.Scanner;
import javax.swing.*;
//NAME: Puja Roy
//DATE: 4/23/22
public class Square extends Point {   // Class for Square which extends Point
	protected double side;  // Doubles the side of the Square 

	public Square()

	      { this( 0.0, 0.0, 0.0 ); }

	public Square( double s, double a, double b )

	   {

	      super( a, b );

	      setSide( s );
}
	public void setSide( double s )

    { side = ( s >= 0 ? s : 0 ); }

public double getSide() { return side; }   // Retrieves and gets the side of the shape

public double area() { return Math.pow( side, 2 ); }  // Doubles the area of the shape 

public String toString()

    { return "Corner = " + super.toString() +

             "; side = " + side; }

public String getName() { return "Square"; }  // Returns the square 

}