package ArrayBasicProblems;

public class SecondSmallestAndSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,4,1,7,9,3,4,6,5};
		findSecondSmallAndLarge(array);
	}

	private static void findSecondSmallAndLarge(int[] array) {
		// TODO Auto-generated method stub
		int secondSmall=0;
		int secondLarge=0;
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<small) {
				secondSmall=small;
				small=array[i];
				
			}
			if(array[i]>large) {
				secondLarge=large;
				large=array[i];
			}
		}
		
		System.out.println("Second Small:"+ secondSmall);
		System.out.println("Second Large:"+ secondLarge);
		
	}

}
