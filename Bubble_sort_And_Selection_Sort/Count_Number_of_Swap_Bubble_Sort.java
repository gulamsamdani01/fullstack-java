package Java.Bubble_sort_And_Selection_Sort;

public class Count_Number_of_Swap_Bubble_Sort {

	public static void main(String[] args) {
		int arr[]= {5,3,4,6,7,9};
		int count =0;
		int n= arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count ++;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num + "");
		}
	}

}
