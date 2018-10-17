import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Find_and_Replace_Pattern{
	public static void main(String[] args){
		String[] words={"abc","deq","mee","aqq","dkd","ccc"};
		String pattern = "abb";
		List<String> test=findAndReplacePattern(words,pattern);
		Iterator<String> iterator=test.iterator();
		while(iterator.hasNext()){
			String it=iterator.next();
			System.out.println(it);
		}
	}
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] pat=tobin(pattern);
        List<String> res=new ArrayList<>();
        for(String st:words){
        	if(st.length()==pat.length){
        		int[] tmp=tobin(st);
        		int flag=-1;
        		for(int i=0;i<pat.length;i++){
        			if(tmp[i]!=pat[i]){
        				flag=1;
        				break;
        			}
        		}
        		if(flag==-1)
        			res.add(st);
        	}
        }
        return res;
    }

    public static int[] tobin(String pattern){
    	int[] res=new int[pattern.length()];
    	HashMap<Character,Integer> map=new HashMap<>();
    	int j=0;
    	for(int i=0;i<res.length;i++){
    		if(!map.containsKey(pattern.charAt(i))){
    			map.put(pattern.charAt(i),j);
    			j++;
    		}
    		res[i]=map.get(pattern.charAt(i));
    	}
    	return res;
    }

}