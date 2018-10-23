import java.util.*;
public class Daily_Temperatures{
	public static void main(String[] args) {
		 int[] T = {73, 74, 75, 71, 69, 72, 76, 73}; //output should be [1, 1, 4, 2, 1, 1, 0, 0].
		 int[] res=dailyTemperatures(T);
		 for(int i=0;i<res.length;i++)
		 	System.out.print(res[i]+" ");
	}
    public static int[] dailyTemperatures(int[] T) {
        // int[] res=new int[T.length];
        // for(int i=0;i<res.length;i++){
        // 	for(int j=i+1;j<res.length;j++){
        // 		if(T[j]>T[i]){
        // 			res[i]=j-i;
        // 			break;
        // 		}
        // 	}
        // }
        // return res;
        // int[] res = new int[T.length];
        // Stack<Integer> stack = new Stack<>();
        // for(int i = 0; i < T.length; i++) {
        //     while(!stack.isEmpty() && T[stack.peek()] < T[i]) {
        //         int index = stack.pop();
        //         res[index] = i - index;
        //     }
        //     stack.push(i);
        // }
        // return res;
        int[] res=new int[T.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<T.length;i++){
            while(!st.isEmpty()&&T[i]>T[st.peek()]){
                int tmp=st.pop();
                res[tmp]=i-tmp; 
            }
            st.push(i);
        }
        return res;
    }
}