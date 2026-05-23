/*   Bank Withdrawal Limit
❓ Question
Create a BankAccount class where withdrawal cannot exceed 
balance.*/

package Java.OOPS.Encapsulation;

class BankAccount{
	private double balance = 10000;
	
	public void withdrawal (double amount) {
		if(amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Insufficient Balance..");
		}
	}
	
	public double getbalance(){
		return balance;
	}
}
public class Bank_Withdrawal_limit {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.withdrawal(1000);
		System.out.println("Balance =" + bank.getbalance());
		
	}

}
