package Practice;

public class SearchInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4,9,11,7, 6, 5, 4, 3, 2, };
		int target = 9;
		int peak = findPeak(arr);
		int start = 0;
		//int end = 0;
		if (binarySearch(arr, target, start, peak, true) != -1) {
			System.out.println("Found");
		} else if (binarySearch(arr, target, peak + 1, arr.length - 1, false) != -1) {

			System.out.print("Found");
		} else
			System.out.print("not Found");
	}

	private static int binarySearch(int[] arr, int target, int start, int end, boolean isAscending) {
		// TODO Auto-generated method stub

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid])
				return mid;
			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			else {
				if(target<arr[mid]) {
					start=mid+1;
				}
				else
					end=mid-1;
			}
		}
		return -1; // Target not found
	}

	private static int findPeak(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1])
				end = mid;
			else
				start = mid + 1;
		}
		return start;
	}

}
