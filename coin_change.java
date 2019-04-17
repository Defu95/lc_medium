import java.util.*;
public class coin_change{
	// ##coins can be used repeatly, find the minmum pieces of coins need to be used.
	public static void main(String[] args) {
		int[] coins={2,5,1}	;
		int target=11;
		System.out.println(change(coins,target));
	}

	public static int change(int[] coins,int target){
		int[] dp=new int[target+1];
		Arrays.fill(dp,target+1);
		for(int d:dp)
			System.out.print(d+"  ");
		System.out.println();
		dp[0]=0;
		for(int i=1;i<=target;i++){
			for(int coin:coins){
				if(i>=coin && dp[i-coin]<target+1){
					dp[i]=Math.min(dp[i-coin]+1,dp[i]);
				}
			}
		}
        return dp[target] >= target+1 ? -1 : dp[target];
	}

}