public class Palindromic_Substrings{
	public static void main(String[] args) {
		String s="abc";
		// String s="aaa";
		System.out.println(countSubStrings(s));
	}

	public static int countSubStrings(String s){
		int count=s.length(),slen=s.length();
		for(int i=0;i<slen;i++){
			for(int j=2;j<=slen-i;j++){
				String stmp=s.substring(i,i+j);
				if(ispalindromic(stmp))
					count++;
			}
		}
		return count;
	}

	public static boolean ispalindromic(String s){
		int left=0,right=s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
}