/*Online Food Delivery System
❓ Question
Design an abstract class FoodOrder with method calculateBill().
Create subclasses VegOrder and NonVegOrder with different 
pricing logic.*/

package Java.OOPS.Abstraction_Interface;

abstract class FoodOrder{
	abstract double calculateBill(int quantity); 
		
}
	
	class VegOrder extends FoodOrder{
		double calculateBill(int quantity) {
			return quantity *100;
			
		}
	}
	
	class NonVegOrder extends FoodOrder{
		double calculateBill(int quantity) {
			return quantity * 200;
		}
	}

public class Online_Food_Delivery_System {

	public static void main(String[] args) {
		FoodOrder f;
		
		f = new VegOrder();
		System.out.println("Veg Bill:: " + f.calculateBill(2));
		
		f = new NonVegOrder();
		System.out.println("Non-Veg Bill :: " + f.calculateBill(5));
		
	}

}
