public class Counting_Bits{
	public static void main(String[] args) {
		int[] test=countBits(5);
		for(int i=0;i<test.length;i++)
			System.out.print(test[i]+" ");
	}
    public static int[] countBits(int num) {
		// int[] res=new int[num+1];
		// for(int i=0;i<res.length;i++)
		// 	res[i]=Integer.bitCount(i);
		// return res;
/*
<<:左移运算符，num << 1,相当于num乘以2
>>:右移运算符，num >> 1,相当于num除以2
>>>:无符号右移，忽略符号位，空位都以0补齐
*/
        int[] dp=new int[num+1];
        for(int i=1;i<=num;i++){
            if(i%2==0) dp[i]=dp[i>>1];
            else dp[i]=dp[i>>1]+1;
        }
        return dp;
    }
}