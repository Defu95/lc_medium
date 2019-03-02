public class nowcoder_StrToInt{
    public static void main(String[] args) {
    	String s1="+21447";
    	String s2="-2147483649";

    	System.out.println(StrToInt(s1));
    	System.out.println(StrToInt(s2));
    }
    public static int StrToInt(String str) {
        if(str==null || str.length()==0)
        	return 0;
        int res=0,len=maxnum_length();
        boolean isNeg=false;
        if(str.charAt(0)=='+'){
        	if(str.length()==1)
        		return 0;
        	else
	        	str=str.substring(1);
        }
        if(str.charAt(0)=='-'){
        	if(str.length()==1)
        		return 0;
        	else
	        	str=str.substring(1);
        	isNeg=true;
        }
        if(str.length()>len)
        	return 0;
        else if(str.length()<len){
        	for (int i=0;i<str.length();i++){
        		if(str.charAt(i)<'0'||str.charAt(i)>'9')
        			return 0;
        		res +=(str.charAt(i)-'0')*Math.pow(10,str.length()-i-1);
        	}
        	if(isNeg)
        		res *= -1;
        }else{
        	boolean out=true;
        	int max_num = Integer.MAX_VALUE;
        	for(int i=0;i<len-1;i++){
        		int str_num = str.charAt(i)-'0';
        		if(str_num<0 || str_num>9)
        			return 0;
        		int bit_num = max_num / (int)Math.pow(10,len-1-i);
        		if(out){
        			if(bit_num<str_num)
        				return 0;
        			else if(bit_num==str_num){
        				res += str_num * Math.pow(10,len-i-1);
        			}else{
        				out = false;
        			}
        		}else{
        			res += str_num * Math.pow(10,len-i-1);
        		}
        		max_num -= bit_num*Math.pow(10,len-i-1);
        	}
        	int bit_num = max_num % 10;
        	if(!isNeg){
        		int str_num=str.charAt(len-1)-'0';
        		if(str_num<0 || str_num>9)
        			return 0;
        		if(str_num > bit_num)
        			return 0;
        		else
        			res += str_num;
        	}else{
        		int str_num=str.charAt(len-1)-'0';
        		if(str_num<0 || str_num>9)
        			return 0;
        		if(str_num > bit_num+1)
        			return 0;
        		else{
        			res *= -1;
        			res -= str_num;
        		}
        	}
        }
        return res;
    }
    public static int maxnum_length(){
		int maxnum=Integer.MAX_VALUE;
		int len=0;
		while(maxnum>0){
			maxnum -= maxnum%10;
			maxnum /= 10;
			len++;
		}
		return len;
    }
}