
/*☕ 🔹 2️⃣ Bank Account Initialization
❓ Question
Create a BankAccount class where constructor sets account 
holder name and balance. Balance should not be negative.*/

package Java.OOPS.Constructor;

class BankAccount{
	String name;
	double balance;
	
	BankAccount(String name , double balance){
		this.name = name;
		
		if (balance >=0) {
			this.balance=balance;
		}else {
			this.balance=0;
		}
					
		}
	void show() {
		System.out.println("Name =" +name);
		System.out.println("Balance =" +balance);
	}
}

public class Construtors_02 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("Prince Raza", -500);
		b.show();
	}

}

