public class EditDistance {
	public static void main(String[] args) {
		String s1="horse", s2="mose";
		System.out.println(minDistance(s1,s2));
	}

    public static int minDistance(String word1, String word2) {
        int l1=word1.length(),l2=word2.length();
        int[][] dp=new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++)
        	dp[i][0]=i;
        for(int i=1;i<=l2;i++)
        	dp[0][i]=i;
        for(int i=1;i<=l1;i++){
        	for(int j=1;j<=l2;j++){
        		int insert=dp[i][j-1]+1;
        		int del=dp[i-1][j]+1;
        		int replace=dp[i-1][j-1]+(word1.charAt(i-1)==word2.charAt(j-1)?0:1);
        		dp[i][j]=Math.min(insert,Math.min(del,replace));
        	}
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++)
                System.out.print(dp[i][j]+ " ");
            System.out.println();
        }
        return dp[l1][l2];
    }
}