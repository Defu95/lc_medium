import java.util.*;
public class nowcoder_isContinuous {
	public static void main(String[] args) {
		// int[] numbers={1,3,4,6,2,5};
		// int[] numbers={0,3,2,6,4};
		int[] numbers={1,3,0,5,0};
		System.out.println(isContinuous(numbers));
	}

	public static boolean isContinuous(int [] numbers) {
		if(numbers.length==0)
			return false;
		HashSet<Integer> set=new HashSet<>();
		int maxnum=Integer.MIN_VALUE,minnum=Integer.MAX_VALUE;
		int count=0;
		for(int num:numbers){
			if(num==0)
				count++;
			else{
				if(set.contains(num))
					return false;
				else{
					set.add(num);
					if(num>maxnum)
						maxnum=num;
					if(num<minnum)
						minnum=num;
				}
			}
		}
		if(maxnum-minnum <= numbers.length-1)
			return true;
		else
			return numbers.length-maxnum-minnum >= count;
	}
}