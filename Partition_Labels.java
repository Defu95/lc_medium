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
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
        	map.put(S.charAt(i),i);
        }
        int maxlen=0,start=0;
        for(int i=0;i<S.length();i++){
            maxlen=Math.max(maxlen,map.get(S.charAt(i)));
            if(maxlen==i){
                res.add(i-start+1);
                start=i+1;
            }
        }
        return res;
    }
}