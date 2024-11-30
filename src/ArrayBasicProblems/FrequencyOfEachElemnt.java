package ArrayBasicProblems;

public class FrequencyOfEachElemnt {
	public static void main(String args[]) {
		int[] array= {2,2,5,7,2,6,7,8,6};
		countFrequency(array);
	}

	private static void countFrequency(int[] array) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			int count=0;
			int element=array[i];
			if(visited[i]==true)
				continue;
		
			else {
			for(int j=i;j<array.length;j++) {
				if(element==array[j]) {
					visited[j]=true;
					count++;
				}
				
			}
		}
			System.out.println(element+" "+count);
	}
}
}
