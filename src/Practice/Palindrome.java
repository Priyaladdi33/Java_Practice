package Practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] B=A.toCharArray();
        int start=0;
        boolean isPalindrome=true;
        int end=B.length-1;
        while(start<=end) {
        	if(B[start]!=B[end]) {
        		isPalindrome=false;
        		break;
        		
        	}
        }
       if(isPalindrome)
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
        
	}

}
