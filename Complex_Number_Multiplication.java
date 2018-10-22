public class Complex_Number_Multiplication{
	public static void main(String[] args) {
		String a="1+1i";
		String b="1+1i";
		System.out.println(complexNumberMultiply(a,b));
	}
    public static String complexNumberMultiply(String a, String b) {
    	int[] A=strtonum(a);
    	int[] B=strtonum(b);
    	int m=A[0]*B[0]-A[1]*B[1];
    	int n=A[0]*B[1]+A[1]*B[0];
    	return String.valueOf(m)+"+"+String.valueOf(n)+"i";
    }
    public static int[] strtonum(String s){
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='+'){
    			String s1=s.substring(0,i);
    			String s2=s.substring(i+1,s.length()-1);
    			return new int[]{Integer.parseInt(s1),Integer.parseInt(s2)};
    		}
    	}
    	return new int[]{0,0};
    }
}