package Java_LLMS.Exception_Handling;

public class Multiple_catch_Block {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3};
			int x = arr[5];
			int y =10/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error");
		}catch(ArithmeticException e) {
			System.out.println("Math error");
			
		}
	}

}
