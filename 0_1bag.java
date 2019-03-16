public class zero_one_bag{
	public static void main(String[] args){
		int[] value={1,6,18,22,28};
		int[] weights={1,2,5,6,7};
		int target=11;
		System.out.println(max_profit(value,weights,target));
	}

	public static int max_profit(int[] value,int[] weights,int target){
		int[][] block=new int[weights.length+1][target+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=target;j++){
				if(j<weights[1])
					block[i][j]=block[i][j-1];
				else
					block[i][j]=Math.max(block[i-1][target-weights[i]]+value[i],block[i-1][target]);
			}
		}
		return block[weights.length][target];
	}
	
}