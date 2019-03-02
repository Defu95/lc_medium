public class nowcoder_FindGreatestSumOfSubArray {
	public static void main(String[] args) {
		int[] array={6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
        	return 0;
        if(array.length==1)
        	return array[0];
        int[] dp=new int[array.length];
        int res=array[0];
        dp[0]=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]+dp[i-1]>array[i])
                dp[i]=dp[i-1]+array[i];
            else
                dp[i]=array[i];
            res=Math.max(res,dp[i]);
        }
        // for(int num:dp)
        //     System.out.print(num+" ");
        return res;
    }
}