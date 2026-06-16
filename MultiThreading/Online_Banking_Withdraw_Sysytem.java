package Java.MultiThreading;

class BankAccount{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public synchronized void withdraw (double amount) {
		System.out.println(Thread.currentThread().getName()+
				" requesting withdrwal of $:: "+amount);
		if(balance>=amount) {
			try {
				System.out.println(Thread.currentThread().getName()+
						" is processing Transaction...");
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			balance-=amount;
			
			System.out.println(Thread.currentThread().getName()+
					" Withdraw Successful..");
			
			System.out.println(" Avaliable Balance: $"+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+
					" Payment Failed.");
			
			System.out.println(" Insufficient Balance.");
		}
	}
}

public class Online_Banking_Withdraw_Sysytem {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("ACC101010",10000);
		
		Thread Customer1 = new Thread(()->account.withdraw(7000),
				"Customer-1");
		
		Thread Customer2 = new Thread(()->account.withdraw(7000),
				"Customer-2");
		
		Customer1.start();
		Customer2.start();

	}

}
