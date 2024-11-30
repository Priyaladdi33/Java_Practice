package ArrayBasicProblems;
import java.util.*;
import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,2,6};
		int target=4;
		int a[]=solve.twoSum(arr,target);
		System.out.println(a[0]+" "+a[1]);
	}

}
class solve {
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return null;
    }
}