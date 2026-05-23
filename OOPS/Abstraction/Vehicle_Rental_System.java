/*  Vehicle Rental System
❓ Question
Create abstract class Vehicle with method rentCost().
Implement Car and Bike.*/

package Java.OOPS.Abstraction;
abstract class Vehicle{
	abstract double rentCost(int days);
}

class Car extends Vehicle{
	double rentCost(int days) {
		return days * 1000;
	}
}

class Bike extends Vehicle{
	double rentCost(int days) {
		return days * 300;
	}
}
public class Vehicle_Rental_System {

	public static void main(String[] args) {
		Vehicle v;
		
		v = new Car();
		System.out.println("Car Rent : " + v.rentCost(5));
		
		v = new Bike();
		System.out.println("Bike Rent :" + v.rentCost(4));
	}

}
