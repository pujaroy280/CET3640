//NAME: Puja Roy
//DATE: 5/21/22

/** Definition of subclass CruiseShip from superclass Ship */

public class CruiseShip extends Ship

{

/** private member variable */

private int passengerCapacity;

/** Constructor */

public CruiseShip(String nam, String year, int capacity)

{

/** super() keyword is used to call the constructor of

* the superclass before initializing the member variables of

* subclass

*/

super(nam,year);

passengerCapacity = capacity;

}


/** Setter and getter */

public void setPassengerCapacity(int capacity)//setter method for PassengerCapacity

{

passengerCapacity = capacity;

}


public int getPassengerCapacity()//getter method for PassengerCapacity

{

return passengerCapacity;

}

/** The toString() method of superclass Ship is overridden by the subclass */

@Override

public String toString()

{

String s="";

s = "CruiseShip \n";

s = s + "Name: " + getName() + "\n";

s = s + "Passenger Capacity: " + getPassengerCapacity() + " persons\n";

return s;

}

private String getName() {
	// TODO Auto-generated method stub
	return null;
}

}
