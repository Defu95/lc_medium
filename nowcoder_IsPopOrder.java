import java.util.*;

public class nowcoder_IsPopOrder {
	public static void main(String[] args) {
		int[] pushA={1,2,3,4,5};
		int[] popA={4,5,3,2,1};
		System.out.println(IsPopOrder(pushA,popA));
	}

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack=new Stack<>();
    	int p=0;
    	for(int num:pushA){
    		if(num!=popA[p]){
    			if(stack.isEmpty())
	    			stack.push(num);
	    		else{
	    			if(stack.peek()==popA[p]){
	    				stack.pop();
	    				p++;
	    			}else
	    				stack.push(num);
	    		}
	    	}else{
	    		p++;
	    	}
    	}
    	while(!stack.isEmpty() && stack.peek()==popA[p]){
    		p++;
    		stack.pop();
    	}
    	return p==popA.length;
    }
}