package Practice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,4,2,6,3};
			int key=3,flag=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==key) {
					flag=1;
				}
			}
			if(flag==1)
				System.out.print("Element found");
			else
				System.out.print("Not Found");
	}

}
