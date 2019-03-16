public class zero_one_bag{
	public static void main(String[] args){
		int[] value={1,6,18,22,28};
		int[] weights={1,2,5,6,7};
		int target=11;
		System.out.println(max_profit(value,weights,target));
	}

	public static int max_profit(int[] value,int[] weights,int target){
		int[][] block=new int[weights.length+1][target+1];
		for(int i=1;i<=value.length;i++){
			for(int j=1;j<=target;j++){
				if(weights[i-1]>j)
					block[i][j]=block[i-1][j];
				else
					block[i][j]=Math.max(block[i-1][j-weights[i-1]]+value[i-1],block[i-1][j]);
			}
		}
		for(int i=0;i<block.length;i++){
			for(int j=0;j<block[0].length;j++)
				System.out.print(block[i][j]+" ");
			System.out.println();
		}
		return block[weights.length][target];
	}
	
}