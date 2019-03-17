import java.util.*;
public class nowcoder_maxInWindows {
	public static void main(String[] args) {
		int[] num={2,3,4,2,6,2,5,1};
		int size=3;
		ArrayList<Integer> res=new ArrayList<>();
		for(int n:res)
			System.out.print(n+" ");
	}

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
		ArrayList<Integer> res=new ArrayList<>();
		if(num.length==0 || size==0 || num.length<size)
			return res;
		int flag=0;
		Deque<Integer> deque=new ArrayDeque<>();
			
    }
}