package Practice;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,9,5,6,7};
		int target=5;
		int pivot=findPivot(arr);
		System.out.println(pivot);
		if(arr[pivot]==target) {
			System.out.print("Element Found at "+pivot);
			
		}
		if(target>arr[0]) {
			System.out.print(binarySearch(arr,target,pivot+1,arr.length-1));
		}
		else {
			System.out.print(binarySearch(arr,target,0,pivot-1));
		}
		
	}
	private static int findPivot(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			 int mid = start + (end - start) / 2;
			 if(mid< end && arr[mid]>arr[mid+1])
				 return mid;
			 if(mid>start && arr[mid]<arr[mid-1])
				 return mid-1;
			 if(arr[mid]<=arr[start]) {
				 end=mid-1;
			 }
			 if(arr[mid]>arr[start]) {
				 start=mid+1;
			 }
		}
		return -1;
	}
	private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}
