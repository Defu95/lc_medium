public class Minimum_Add_to_Make_Parenthese_Valid{
	public static void main(String[] args){
		String S="())";
		// String S="()))((";
		// String S="((())";
		// String S="()()";
		// String S="((())";
		System.out.println(minAddToMakeValid(S));
	}
    public static int minAddToMakeValid(String S) {
        int len = S.length() - 1;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '(' && S.charAt(i + 1) == ')') {
                if (i + 2 <= S.length())
                    S = S.substring(0, i) + S.substring(i + 2);
                else
                    S = S.substring(0, i);
                if (i - 2 > 0)
                    i-= 2;
                else
                    i =-1;
                len = S.length()-1;
            }
        }
        return S.length();
    }
}