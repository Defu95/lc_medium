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

    }
}