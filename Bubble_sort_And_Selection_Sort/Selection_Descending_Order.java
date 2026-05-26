/*🔷 🔹  Selection Sort (Descending Order)
❓ Question
Sort array in descending order using selection sort.*/



package Java.Bubble_sort_And_Selection_Sort;

public class Selection_Descending_Order {

	public static void main(String[] args) {
		int arr[] = {10,4,6,2,9};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int largest =i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[largest]<arr[j]) {
					largest = j;
				}
			}
			
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
		}
		
		for(int num:arr) {
			System.out.println(num + "");
		}
	}

}
