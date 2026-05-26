package Java_LLMS.Exception_Handling;

class Bank{
	void withdraw (int amount) {
		int balance =1000;
		
		try {
			if(amount > balance) {
				throw new MyException("Insufficient Balance.");
			}else {
				System.out.println("Succesful Withdraw.");
			}
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}
	}
}
public class Bank_withdrwal_System {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.withdraw(900);
	}

}
