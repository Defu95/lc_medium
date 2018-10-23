public class Single_Element_in_a_Sorted_Array{
	public static void main(String[] args) {
		int[] nums={1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(nums));
	}
    public static int singleNonDuplicate(int[] nums) {
        // int res=0;
        // for(int a:nums)
        // 	res^=a;
        // return res;
        for(int i=0;i<nums.length/2;i++)
        	if(nums[2*i]!=nums[2*i+1])
        		return nums[2*i];
        return nums[nums.length-1];
    }
}