package Java.Bubble_sort_And_Selection_Sort;

public class Bubble_Sort_optimization {

	public static void main(String[] args) {

		int arr[] = {6,2,8,4,10};
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			boolean swapped =false;
			
			for(int j=0;j<n-1;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped =true;
				}
			}
		}
		
		for(int num:arr) {
			System.out.println(num + " ");
		}
	}

}
