/*Real-world Example (Payment System)
❓ Question
Create a Payment class and subclasses UPI and Card with 
method pay().*/

package Java.OOPS.Polymorphism;

class Payment{
	void pay() {
		System.out.println("Payment Processing");
	}
}

class Upi extends Payment{
	void pay() {
		System.out.println("Paid using UPI.. ");
	}
}

class Card extends Upi{
	void pay() {
		System.out.println("Paid using card.. ");
	}
}

public class Payment_System {

	public static void main(String[] args) {
		Payment p;
		
		p = new Upi();
		p.pay();
		
		p = new Card();
		p.pay();
	}

}
