/*  Product Price Update
❓ Question
Create a Product class where price can only increase 
(not decrease).*/

package Java.OOPS.Encapsulation;
class Product{
	private double price;
	
	public void setPrice(double price) {
		if(price > this.price) {
			this.price = price;
		}else {
			System.out.println("Price cannot decrease.");
		}
	}
	
	public double getPrice() {
		return price;
	}
}
public class Product_Price_Update {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPrice(25000);
		System.out.println("Price = " + p.getPrice());
	}

}
