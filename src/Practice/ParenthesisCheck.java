package Practice;
import java.util.*;
class ParenthesisCheck{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
           ;
            while(sc.hasNext())
            {
            	 Stack<Character> stack=new Stack<>();
                String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                    stack.push(s.charAt(i));
                }
                else {
                    if(!stack.empty()) {
                        if((stack.peek()=='(' && s.charAt(i)==')') || (stack.peek()=='[' && s.charAt(i)==']')|| (stack.peek()=='{' && s.charAt(i)=='}')){
                            stack.pop();
                        }
                        else 
                        	{stack.push(s.charAt(i));
                        	break;
                        	}
                        
                        
                    }
                }
            }
            if(!stack.empty()) {
                System.out.println("false");
                
            }else {
                System.out.println("true");
            }
	}
}
}



