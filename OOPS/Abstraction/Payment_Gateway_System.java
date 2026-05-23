/*Payment Gateway System (Real Project 🔥)
❓ Question
Create an interface PaymentGateway with method pay().
Implement UPI, Card, and NetBanking.*/

package Java.OOPS.Abstraction;
interface PaymentGateway{
	void pay(double amount);
}

class Upi implements PaymentGateway{
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI.");
	}
}

class Card implements PaymentGateway{
	public void pay (double amount) {
		System.out.println("Paid " + amount + " using card.");
	}
}

class NetBanking implements PaymentGateway{
	public void pay (double amount) {
		System.out.println("Paid " + amount + " using Net Banking.");
	}
}
public class Payment_Gateway_System {

	public static void main(String[] args) {
		PaymentGateway p;
		
		p = new Upi();
		p.pay(500);
		
		p = new Card();
		p.pay(1500);
		
		p = new NetBanking();
		p.pay(5000);
		
	}

}
