package Practice;

public class smallestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','c','e','f','j'};
		char target='k';
		int ciel=smallestL(arr,target);
		if (ciel!=-1) {
			System.out.println(arr[ciel]);
		}
		else {
			System.out.println("No cieling found");
		}
	}

	private static int smallestL(char[] arr, int target) {
		// TODO Auto-generated method stub
		int s=0,e=arr.length-1;
		if(arr[arr.length-1]<target) {
			return 0;
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
