//NAME: Puja Roy
//DATE: 5/21/22
/** Definition of subclass CargoShip from superclass Ship */

public class CargoShip extends Ship

{

/** private member variable */

private int tonnage;

/** Constructor */

public CargoShip(String nam, String year, int weight)

{

/** super() keyword is used to call the constructor of

* the superclass before initializing the member variables of

* subclass

*/

super(nam,year);

tonnage = weight;

}


/** Setter and getter */

public void setTonnage(int weight)//setter method for tonnage

{

tonnage = weight;

}


public int getTonnage()//getter method for tonnage

{

return tonnage;

}

/** The toString() method of superclass Ship is overridden by the subclass */

@Override

public String toString()//toStrinf method for print the output

{

String s="";

s = "CargoShip \n";

s = s + "Name: " + getName() + "\n";

s = s + "Cargo Capacity: " + getTonnage() + " tons\n";

return s;

}


private String getName() {
	// TODO Auto-generated method stub
	return null;
}

}
