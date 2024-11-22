package Practice;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {3,2,5,8,5,9,6,1,9};
		mergeSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void mergeSort(int[] array) {
		// TODO Auto-generated method stub
		int length=array.length;
		if(length<=1) return;
		
		int middle=length/2;
		int leftArray[]=new int[middle];
		int rightArray[]=new int[length-middle];
		int j=0;
		for(int i=0;i<length;i++) {
			if(i<middle) {
				leftArray[i]=array[i];
			}
			else {
				rightArray[j]=array[i];
				j++;
				
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray,rightArray,array);
		
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		// TODO Auto-generated method stub
		int leftSize=leftArray.length;
		int rightSize=array.length-leftSize;
		int i=0,l=0,r=0;
		while(l<leftSize && r<rightSize) {
			if(leftArray[l]<rightArray[r]) {
				array[i]=leftArray[l];
				l++;
				i++;
			}
			else {
				array[i]=rightArray[r];
				r++;
				i++;
			}
		}
		while(l<leftSize) {
			array[i]=leftArray[l];
			l++;
			i++;
		}
		while(r<rightSize) {
			array[i]=rightArray[r];
			r++;
			i++;
		}
	}

}
