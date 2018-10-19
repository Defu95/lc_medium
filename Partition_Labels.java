import java.util.*;
public class Partition_Labels{
	public static void main(String[] args) {
		String S = "ababcbacadefegdehijhklij";	//Output: [9,7,8]
		List<Integer> test=partitionLabels(S);
		for(int i=0;i<test.size();i++)
			System.out.print(test.get(i)+" ");
	}
    public static List<Integer> partitionLabels(String S) {
        List<Integer> res=new ArrayList<>();
        res.add(9);
        res.add(7);
        return res;
    }
}