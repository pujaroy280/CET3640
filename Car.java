// NAME: Puja Roy
// DATE: 4/7/22

public class Car implements Movable { // Car is the class that implements the interface Movable 

	@Override
	public void moveForward() {
		System.out.println("Car drives forward");  // Method that prints out message
	}

	@Override
	public void moveBackward() {
		System.out.println("Car drives backward");  // Method that prints out message
	}

	@Override
	public void stop() {
		System.out.println("Car parked");  // Method that prints out message
	}

	@Override
	public void moveLeft() {
		System.out.println("Car turns left"); // Method that prints out message
	}

	@Override
	public void moveRight() {
		System.out.println("Car turns right"); // Method that prints out message
	}

}
