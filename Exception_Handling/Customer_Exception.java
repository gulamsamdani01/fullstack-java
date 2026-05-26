package Java_LLMS.Exception_Handling;
import java.util.Scanner;

class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

public class Customer_Exception {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age.");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new MyException("Minor are not eligible");
		}else {
			System.out.println("Eligible ");
		}
			
		}catch(MyException e){
			System.out.println(e.getMessage());
			
		}

		
	}

}
