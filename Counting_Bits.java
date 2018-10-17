public class Counting_Bits{
	public static void main(String[] args) {
		int[] test=countBits(5);
		for(int i=0;i<test.length;i++)
			System.out.print(test[i]+" ");
	}
    public static int[] countBits(int num) {
		int[] res=new int[num+1];
		for(int i=0;i<res.length;i++)
			res[i]=Integer.bitCount(i);
		return res;
    }
}