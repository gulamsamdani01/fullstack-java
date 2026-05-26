package Java_LLMS.Exception_Handling;

public class Handle_Divison_by_Zero {

	public static void main(String[] args) {
		int a=10 ,b=0;
		
		try {
			int result =a/b;
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("Cannot divided by zero");
			
		}
	}

}
