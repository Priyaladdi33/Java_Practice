package Practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,3,5,1,7,7,2,8,8,9};
		int min=-1;
		int temp;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}	
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			System.out.print(arr[i]+" ");
		}
		
	}

}
