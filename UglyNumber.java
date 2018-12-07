public class UglyNumber{
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(3));
	}


//only has 2,3,5 factor
	public static int GetUglyNumber_Solution(int index){
		if(index<=0)
			return 0;
		int[] dp=new int[index];
		dp[0]=1;
		int t1=0,t2=0,t3=0,i;
		for(i=1;i<index;i++){
			dp[i]=Math.min(dp[t1]*2,Math.min(dp[t2]*3,dp[t3]*5));
			if(dp[i]==dp[t1]*2) t1++;
			if(dp[i]==dp[t2]*3) t2++;
			if(dp[i]==dp[t3]*5) t3++;
		}
		return dp[index-1];
	}
}