package Java_LLMS.Exception_Handling;

public class Array_index_Exception {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}

}
