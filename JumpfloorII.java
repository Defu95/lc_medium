public class JumpfloorII{
	public static void main(String[] args){
		System.out.println(JumpFloorII(3));
	}

    public static int JumpFloorII(int target) {
    	if(target<0)
    		return 0;
        if(target==1||target==2)
        	return target;

	// f(n) include these scences:  1+n-1 / 2+n-2/ n+0  f(n)=f(n-1)+....+f(0)
	//f(n-1) include these scences:  1+n-2 / 2+n-3/ n-1+0  f(n-1)=f(n-2)+...+f(0)
	// f(n)=f(n-1)+f(n-1)=2*f(n-1)

        int[] dp=new int[target+1];
        dp[0]=0;dp[1]=1;dp[2]=2;
        for(int i=3;i<=target;i++)
        	dp[i]=2*dp[i-1];
        return dp[target];
    }
}