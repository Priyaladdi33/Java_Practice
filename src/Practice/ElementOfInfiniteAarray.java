package Practice;

public class ElementOfInfiniteAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6,7,8,9,12,13,14,16,17,18};
		int target=7;
		int start=0;
		int end=1;
		while(end < arr.length && arr[end] < target) {
			int temp=end+1;
			 end=end+2*(end-start+1);
			 start=temp;
		}
		end = Math.min(end, arr.length - 1);
		System.out.println(binarySearch(arr,target,start,end));
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
