package Java.Threads;

class PaymentService extends Thread{
	private String orderId;
	private double amount;
	
	public PaymentService(String orderId,double amount) {
		this.orderId=orderId;
		this.amount=amount;
	}
	@Override
	public void run() {
		try {
			System.out.println("===========================");
			System.out.println("Payment Processing Started....");
			System.out.println("Order Id::"+orderId);
			System.out.println("Amount:: $"+amount);
			
			System.out.println("Verifying Payment Details....");
			Thread.sleep(2000);
			
			System.out.println("Connected to Payment gateway.....");
			Thread.sleep(2000);
			
			System.out.println("Payment Succesfull..");
			System.out.println("================================");
		}catch(InterruptedException e) {
			System.out.println("Payment Failed..");
		}
	}
}

public class E_Commerce_Order_Processsing_System {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Customer Order Processing");
		
		PaymentService payment = new PaymentService("ORD1010",2500);
		
		payment.start();
		
        // Wait until payment thread completes
		payment.join();
		
		System.out.println("Order Confirmed..");
		System.out.println("Invoice Genrated..");
		System.out.println("Order Shipped..");
	}

}
