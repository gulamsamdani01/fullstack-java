/*❓ Question
Find the k-th smallest element using selection sort idea.*/



package Java.Bubble_sort_And_Selection_Sort;

public class Selection_Sort_Smallest {

	public static void main(String[] args) {
		int arr[] = {5,4,7,3,6,1,8};
		int k = 2;
		int n=arr.length;
		
		for(int i=0;i<k;i++) {
			int smallest = i;
			
			for(int j=i;j<n;j++) {
				if(arr[smallest]>arr[j]) {
					smallest =j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println("K-th Smallest::" + arr[k-1]);
	}

}
