import java.util.*;
public class nowcoder_IsNumeric{
	public static void main(String[] args) {
		char[] str1={'+','5','0','0'};
		char[] str2={'5','e','2'};
		char[] str3={'1','3','.','4','5','e','+','6'};
		char[] str4={'e','2','3'};
        char[] str={' ','.'};
        // " ."
		System.out.println(isNumeric(str));
	}

    public static boolean isNumeric(char[] str) {
        if(str==null)
        	return false;
        while(str[str.length-1]==' '){
            if(str.length>1)
                str=Arrays.copyOfRange(str,0,str.length-1);
            else 
                return false;
        }
        while(str[0]==' '){
            if(str.length>1)
                str=Arrays.copyOfRange(str,1,str.length);
            else 
                return false;
        }
        if(str[0]=='+'||str[0]=='-'){
        	char[] str1=Arrays.copyOfRange(str,1,str.length);
            return isnum(str1);
        }else
            return isnum(str);        
    }

    public static boolean isnum(char[] str){
        if(str==null || (!Character.isDigit(str[0])&str[0]!='.'))
            return false;
        boolean hasE=false, decimal=false, sign=false;
        for(int i=0;i<str.length;i++){
            if(str[i]=='e' || str[i]=='E'){
                if(i==str.length-1 || hasE)
                    return false;
                hasE=true;   
            }else if(str[i]=='+' || str[i]=='-'){
                if(i==str.length-1)
                    return false;
                if(sign || (str[i-1]!='E'&&str[i-1]!='e'))
                    return false;
                sign=true;
            }else if(str[i]=='.'){
                if(i==str.length-1 ||hasE || decimal)
                    return false;
                decimal=true;
            }else if(str[i]<'0' || str[i]>'9')
                return false;
        }
        return true;
    }
}