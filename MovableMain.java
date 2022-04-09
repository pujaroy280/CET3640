import java.util.Scanner;
import java.lang.*;

// NAME: Puja Roy
// DATE: 4/7/22
public class MovableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movable[] arr = new Movable[] {new Plane(), new Car(), new Ship()};  // Movable is implemented by the classes
	        for(int i = 0; i < arr.length; ++i) {
	            arr[i].moveForward();
	            arr[i].moveBackward();
	            arr[i].stop();
	            arr[i].moveLeft();
	            arr[i].moveRight();
	            System.out.println("---------------------");  // Prints out the messages of the classes that are interfaced by Movable
	        }
		
		
	}

}
