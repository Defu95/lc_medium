public class Score_After_Flipping_Matrix{
	public static void main(String[] args) {
		int[][] A={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		// int[][] A={{0,1},{0,1},{0,1},{0,0}};
		// int[][] A={{0,0,0},{0,1,0},{0,1,0},{0,1,1},{0,0,0},{1,1,0},{1,0,1},{0,1,0},{0,0,1}};
		System.out.println(matrixScore(A));
	}
	public static int matrixScore(int[][] A) {
		int res=0;int flag=-1;
		for(int i=0;i<A.length;i++)
			if(A[i][0]==1){
				flag=1;
				break;
			}
		if(flag==-1){
			for(int i=0;i<A.length;i++)
				A[i][0]=1;
		}else{
			for(int i=0;i<A.length;i++){
				if(A[i][0]==0){
					for(int j=0;j<A[0].length;j++){
						if(A[i][j]==0)
							A[i][j]=1;
						else
							A[i][j]=0;
					}
				}
			}
		}
		for(int j=0;j<A[0].length;j++){
			int countone=0;
			for(int i=0;i<A.length;i++){
				if(A[i][j]==1)
					countone++;
			}
			if(countone<A.length-countone){
				for(int i=0;i<A.length;i++){
					if(A[i][j]==1)
						A[i][j]=0;
					else
						A[i][j]=1;
				}
			}
		}
		for(int i=0;i<A.length;i++){
			int tmp=0;
			for(int j=0;j<A[0].length;j++)
				tmp+=(int)Math.pow(2,A[0].length-j-1)*A[i][j];
			res+=tmp;
		}
		return res;
	}
}