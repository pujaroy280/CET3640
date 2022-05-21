//NAME: Puja Roy
//DATE: 5/21/22

public class TestShips

{

/** Driver method to create objects of all three ships

* and print their details

*/

public static void main(String[] args)

{

/** Create an array of type Ship, to hold Ship objects */

Ship ShipArray[] = new Ship[3];

/** Create an object of super class Ship */

Ship ship1 = new Ship("Lolipop","1960");

/** Create an object of subclass CruiseShip and assign the object

to Ship reference variable */

Ship ship2 = new CruiseShip("Disney Magic","1960",2400);

/** Create an object of subclass CargoShip and assign the object

to Ship reference variable */

Ship ship3 = new CargoShip("Black Pearl","1960",50000);


/** Store all three objects in the array */

ShipArray[0] = ship1;

ShipArray[1] = ship2;

ShipArray[2] = ship3;


/** Loop through the array to print all ships */

for(int i=0;i<ShipArray.length;i++)

{

System.out.println(ShipArray[i]);

System.out.println();

}

}

}