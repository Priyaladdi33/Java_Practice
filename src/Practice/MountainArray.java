package Practice;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,7,6,5,4,3,2};
		System.out.println(arr[maxInMountanArray(arr)]);
	}
	static public int maxInMountanArray(int array[]) {
		
		int start=0;
		int end=array.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(array[mid]>array[mid+1]) {
				end=mid;
			}
			else 
				start=mid+1;
		}
		return start;
	}

}
