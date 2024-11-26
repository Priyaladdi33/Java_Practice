package Practice;

public class CielingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,9,10,11};
		int target=7;
		int ciel=cielingFunction(arr,target);
		if (ciel!=-1) {
			System.out.println(arr[ciel]);
		}
		else {
			System.out.println("No cieling found");
		}
	}

	private static int cielingFunction(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0,e=arr.length-1;
		if(arr[arr.length-1]<target) {
			return -1;
		}
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				e=mid-1;
			}
			else 
				s=mid+1;
		}
		return s;
	}

}
