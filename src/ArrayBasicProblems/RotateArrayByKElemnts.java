package ArrayBasicProblems;

//import java.util.Arrays;

public class RotateArrayByKElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5} ;
		int k=2;
		rotateArray(arr,k);
		
		}
	

	private static void rotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		if(k==0 && k==arr.length) {
			return;
		}
		int n=arr.length;
		int j=0;
		int newArray[]=new int[n];
		for(int i=k;i<n;i++) {
			newArray[j]=arr[i];
			j++;
		}
		for(int i=0;i<k;i++) {
			newArray[j]=arr[i];
			j++;
		}
		//System.out.println();
		
		System.out.println();
		for(int a:newArray) {
			System.out.print(a+" ");
	}

}
}
