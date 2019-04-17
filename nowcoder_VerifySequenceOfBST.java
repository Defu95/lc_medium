public class nowcoder_VerifySequenceOfBST {
	public static void main(String[] args) {
		int[] binseq={8,3,10,1,6,14,4,7,13};
		System.out.println(VerifySquenceOfBST(binseq));
	}

    public static boolean VerifySquenceOfBST(int [] sequence) {
        
    }

    public static boolean isaBST(int[] sequence,int flag){
    	int p=sequence[flag];
    	int i=0;
    	for(;i<flag;i++)
    		if(sequence[i]>=p)
    			break;
    	for(;i<flag;i++){
    		if(sequence[i]<p)
    			return false;
    	}
    	return true;
    }
}
