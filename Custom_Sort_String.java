import java.util.*;
public class Custom_Sort_String{
	public static void main(String[] args) {
		String S = "cba",T = "abcd";
		System.out.println(customSortString(S,T));
	}
    public static String customSortString(String S, String T) {
        char[] dic=S.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        for(char ch:dic){
        	map.put(ch,i);
        	i++;
        }
        char[] dst=T.toCharArray();
		List<Integer> tmp=new ArrayList<>();
        for(int j=0;j<dst.length;j++){
        	if(map.containsKey(dst[j])){
        		tmp.add(map.get(dst[j]));
        		dst[j]='0';
        	}
        }
        int[] num=new int[tmp.size()];
        for(int j=0;j<tmp.size();j++){
        	num[j]=tmp.get(j);
        }
        Arrays.sort(num);
        int count=0;
        for(int j=0;j<dst.length;j++){
        	if(Character.isDigit(dst[j])){
        		dst[j]=dic[num[count]];
        		count++;
        	}
        }
        String res="";
        for(int j=0;j<dst.length;j++){
        	String s = String.valueOf(dst[j]);
        	res+=s;
        }        
        return res;
    }
}