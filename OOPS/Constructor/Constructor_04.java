/*☕ 🔹 4️. Product Discount System
❓ Queston
Create a Product class where constructor applies discount 
if price > 1000.*/

package Java.OOPS.Constructor;

class Product{
	String name;
	double price;
	
	Product(String name,double price){
		this.name = name;
		
		if(price > 1000) {
			this.price = price * 0.9;
		}else {
			this.price = price;
		}
	}
	
	void show() {
		System.out.println("Name = "+name);
		System.out.println("Price = "+ price );
	}
}
public class Constructor_04 {

	public static void main(String[] args) {
		Product p1 = new Product ("Laptop",2000);
		Product p2 = new Product ("Mobile",9980);
		p1.show();
		p2.show();
	}

}
