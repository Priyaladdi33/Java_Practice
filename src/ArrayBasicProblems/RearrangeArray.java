package ArrayBasicProblems;

import java.util.Arrays;

//Problem Statement: Rearrange the array such that the first half is arranged in
//increasing order, and the second half is arranged in decreasing order

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= { 8 ,7 ,1, 6 ,5 ,9};
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
			int n=arr.length;
			Arrays.sort(arr);
			int j=0;
			int newArray[]=new int[n];
			for(int i=0;i<n/2;i++) {
				newArray[j]=arr[i];
				j++;
				
			}
			for(int i=n-1;i>=n/2;i--) {
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
