package Practice;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {3,6,7,7,7,8,8,8,10,12};
		int target=8;
		int[] ans=new int[2];
		ans=searh(array,target);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		
	}

	private static int[] searh(int[] array, int target) {
		// TODO Auto-generated method stub
		boolean startIndex=true;
		
		int[] ans= {-1,-1};
		ans[0]=binarySearch(array,target,startIndex);
		ans[1]=binarySearch(array,target,!startIndex);
		
		return ans;
	}

	private static int binarySearch(int[] array, int target, boolean startIndex) {
		// TODO Auto-generated method stub
		int s=0,e=array.length-1;
		int ans=-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(array[mid]==target) {
				ans=mid;
				if(startIndex) {
					e=mid-1;
					
			}else {
				s=mid+1;
			}
			}
			else if(array[mid]>target) {
				e=mid-1;
			}
			else 
				s=mid+1;
		
		
	}
		return ans;
	}

}
