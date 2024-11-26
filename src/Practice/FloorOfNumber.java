package Practice;

public class FloorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,9,10,11};
		int target=1;
		int floor=floorOfNumber(arr,target);
		if (floor!=-1) {
			System.out.println(arr[floor]);
		}
		else {
			System.out.println("No Floor found");
		}
	}

	private static int floorOfNumber(int[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0,e=arr.length-1;
		
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
		return e;
	}


}
