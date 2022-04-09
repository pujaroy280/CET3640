// NAME: Puja Roy
// DATE: 4/7/22

public class Ship implements Movable { // Ship is the class that implements the interface Movable 

	@Override
	public void moveForward() {
		System.out.println("Ship navigates forward"); // Method that prints out message
	}

	@Override
	public void moveBackward() {
		System.out.println("Ship navigates backward"); // Method that prints out message
	}

	@Override
	public void stop() {
		System.out.println("Ship docked"); // Method that prints out message
	}

	@Override
	public void moveLeft() {
		System.out.println("Ship navigates left"); // Method that prints out message
	}

	@Override
	public void moveRight() {
		System.out.println("Ship navigates right"); // Method that prints out message
	}

}
