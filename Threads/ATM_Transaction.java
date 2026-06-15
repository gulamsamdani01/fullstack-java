package Java.Threads;

class ATMTransaction extends Thread{
	
	private String accountNumber;
	private double amount;
	
	public ATMTransaction(String accountNumber , double amount) {
		this.accountNumber=accountNumber;
		this.amount=amount;
		
	}
	@Override
	public void run(){
		try {
			System.out.println("=========================");
			System.out.println("ATM Transaction Started");
			System.out.println("Account Number::"+accountNumber);
			System.out.println("Withdraw Amount::"+amount);
			
			System.out.println("Verifying Account..");
			Thread.sleep(2000);
			
			System.out.println("Checking Balance...");
			Thread.sleep(2000);
			
			System.out.println("Processing Withdrwal...");
			Thread.sleep(3000);
			
			System.out.println("Cash Dispensed Successfully");
			System.out.println("Transaction Complete");
			System.out.println("================================");
		}catch(InterruptedException e) {
			System.out.println("Transaction Interrupted.");
		}
	}
}
public class ATM_Transaction {

	public static void main(String[] args) throws Exception {
		
		ATMTransaction transaction = new ATMTransaction("123456789" ,5000 );
		
		System.out.println("Before Start State::"+transaction.getState());
		
		transaction.start();
		
		System.out.println("After Start State::"+transaction.getState());
		Thread.sleep(1000);
		
		System.out.println("Current State:"+transaction.getState());
		transaction.join();
		
		System.out.println("Final State::"+transaction.getState());
		

	}

}
