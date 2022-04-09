// NAME: Puja Roy
// DATE: 4/7/22

public class Plane implements Movable {  // Plane is the class that implements the interface Movable 

	@Override
	public void moveForward() {
		System.out.println("Plane flying forward");  // Method that prints out message
	}

	@Override
	public void moveBackward() {
		System.out.println("Plane taxiing backward"); // Method that prints out message
	}

	@Override
	public void stop() {
		System.out.println("Plane landed"); // Method that prints out message
	}

	@Override
	public void moveLeft() {
		System.out.println("Plane flying left"); // Method that prints out message
	}

	@Override
	public void moveRight() {
		System.out.println("Plane flying right"); // Method that prints out message
	}

}
