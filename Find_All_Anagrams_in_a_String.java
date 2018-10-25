import java.util.*;
public class Find_All_Anagrams_in_a_String{
	public static void main(String[] args) {
		// String s="abab", t="ab";
		String s="cbaebabacd", t="abc";
		List<Integer> res=findAnagrams(s,t);
		for (int i=0;i<res.size();i++)
			System.out.print(res.get(i)+"  ");
	}
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(p.length()>s.length())
        	return res;
		int[] map=new int[26];
		for(int i=0;i<p.length();i++)
			map[p.charAt(i)-'a']++;		
		for(int i=0;i<s.length()-p.length()+1;i++){
			int[] tmp=new int[26];
			for(int j=i;j<i+p.length();j++){
				if(map[s.charAt(j)-'a']<1)
					break;
				else{
					tmp[s.charAt(j)-'a']++;
				}
			}
			int flag=1;
			for(int k=0;k<26;k++){
				if(map[k]!=tmp[k]){
					flag=-1;
					break;
				}
			}
			if(flag==1)
				res.add(i);
		}
		return res;
    }
}