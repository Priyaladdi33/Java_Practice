package Practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,54,67,88};
		int left=0,right=arr.length;
		int key =4;
		int res=binarySearch(arr,left,right,key);
		
		if(res==-1) 
			System.out.print("Not Found");
		else
			System.out.print("Element found ");
	}
	static int binarySearch(int arr[],int left,int right,int key) {
		int mid=(left+right)/2;
		while(left<right) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				return binarySearch( arr,left, mid-1,key);
			}
			else {
				return binarySearch(arr,mid+1,right,key);
			}
		}
		return -1;
	}

}
