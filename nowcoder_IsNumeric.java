import java.util.*;
public class nowcoder_IsNumeric{
	public static void main(String[] args) {
		char[] str1={'+','1','0'};
		char[] str2={'5','e','2'};
		char[] str3={'3','.','1'};
		char[] str4={'1','2','e'};
		System.out.println(isNumeric(str1));
	}

    public static boolean isNumeric(char[] str) {
        if(str==null)
        	return false;
        if(str[0]=='+'||str[0]=='-'){
        	char[] str1=Arrays.copyOfRange(str,1,str.length);
            System.out.println(str1);
        }
        
        return true;
    }
}