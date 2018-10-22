import java.util.*;
public class Compare_Version_Numbers{
	public static void main(String[] args) {
		// String v1="7.5.2.11";
		// String v2="7.5.3.1";
		String v1="1.0.1";
		String v2="1";
		System.out.println(compareVersion(v1,v2));
	}
    public static int compareVersion(String version1, String version2) {
        List<Integer> v1=st2li(version1);
        List<Integer> v2=st2li(version2);
        while(v1.size()<v2.size()){
        	v1.add(0);
        }
        while(v2.size()<v1.size()){
        	v2.add(0);
        }
        for(int i=0;i<v1.size();i++){
        	if(v1.get(i)>v2.get(i))
        		return 1;
        	else if(v1.get(i)<v2.get(i))
        		return -1;
        }
        return 0;
    }
	public static List<Integer> st2li(String version1){
		List<Integer> res=new ArrayList<>();
		int start=0;
		for(int i=0;i<version1.length();i++){
			if(version1.charAt(i)=='.'){
				String tmp=version1.substring(start,i);
				res.add(Integer.parseInt(tmp));
				start=i+1;
			}
		}
		String tmp=version1.substring(start);
		res.add(Integer.parseInt(tmp));
		return res;
	}
}