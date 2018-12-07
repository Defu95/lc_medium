import java.util.*;
public class FirstNotRepeatingChar{
	public static void main(String[] args) {
		System.out.println(firstnotrepeatingchar("google"));
	}

	public static int firstnotrepeatingchar(String str){
		char[] ch=str.toCharArray();
		HashSet<Character> set1=new HashSet<>();
		Map<Character,Integer> map2=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			if(set1.contains(ch[i])){
				if(map2.containsKey(ch[i]))
					map2.remove(ch[i]);
			}else{
				set1.add(ch[i]);
				map2.put(ch[i],i);
			}
		}
		if(map2.size()==0)
			return -1;
		int firstindex=Integer.MAX_VALUE;
		Iterator<Map.Entry<Character,Integer>> it=map2.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Character,Integer> entry=it.next();
			firstindex=Math.min(firstindex,entry.getValue());
		}
		return firstindex;
	}
}