package Java.MultiThreading;

class BankAccount22{
	private final String accountNumber;
	
	public BankAccount22(String accountNumber) {
		this.accountNumber=accountNumber;	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
		
	
}

public class Bank_fund_transfer_Deadlock {

	public static void main(String[] args) {
		
		BankAccount22 accountA = new BankAccount22("ACC-1001");
		BankAccount22 accountB = new BankAccount22("ACC-1002");
		
		Thread transfer1 = new Thread(()->{
			synchronized (accountA) {
				
				System.out.println(Thread.currentThread().getName()+
						" Locked " + accountA.getAccountNumber());
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized (accountB) {
				
				System.out.println(Thread.currentThread().getName()+
						" Locked " + accountB.getAccountNumber());
				
				System.out.println("Transfer A-->B Succesfully");
			}
		},"Transfer-Thread-1");
		
		Thread transfer2 = new Thread(()->{
			synchronized (accountB) {
				
				System.out.println(Thread.currentThread().getName()+
						" Locked "+accountA.getAccountNumber());
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized (accountA) {
				System.out.println(Thread.currentThread().getName()+
						" Locked "+accountB.getAccountNumber());
				
				System.out.println("Transfer B-->A Succesfully");
				
			}
		},"Transfer-Thread-2");
		
		transfer1.start();
		transfer2.start();
		
		
	}

}
