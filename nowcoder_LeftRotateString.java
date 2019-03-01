public class nowcoder_LeftRotateString {
    public static void main(String[] args) {
    	String S="abcXYZdef";
    	int n=3;
    	System.out.println(LeftRotateString(S,n));
    }

    public static String LeftRotateString(String str,int n) {
		if(n==0 || str==null || str.length()==0)
			return str;
		n = n % str.length();
		String s1=str.substring(0,n);
		String s2=str.substring(n);
		StringBuffer sb=new StringBuffer();
		sb.append(s2);
		sb.append(s1);
		return sb.toString();
    }
}