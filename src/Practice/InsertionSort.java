package Practice;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {3,3,5,1,7,7,2,8,8,9};
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
