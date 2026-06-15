package Java_LLMS.Nested_try_catch;
import java.util.*;
public class Real_world_Nested_try {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			try {
				System.out.println("Enter a Number:");
				int a= sc.nextInt();
				
				System.out.println("Enter Divisor:");
				int b = sc.nextInt();
				
				System.out.println("Result:: " + (a / b));
			}catch(InputMismatchException e) {
				System.out.println("Invalid Input");
			}
		}catch(ArithmeticException e) {
			System.out.println("cannot divided by zero.");
		}
	}

}
