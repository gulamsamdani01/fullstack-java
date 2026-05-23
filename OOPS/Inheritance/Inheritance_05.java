/*☕ 🔹 5️. Real-world Example (Vehicle System)
❓ Question
Create a Vehicle class with speed.
Create Car class that inherits it and adds brand. */

package Java.OOPS.Inheritance;

class Vehicle{
	int speed =100;
}

class Car extends Vehicle{
	String brand = "Toyota";
	
	void display() {
		System.out.println("Brand = " +brand);
		System.out.println("Speed = " +speed);
	}
}

public class Inheritance_05 {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
	}

}
