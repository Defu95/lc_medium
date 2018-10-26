public class Find_Minimum_in_Rotated_Sorted_Array{
	public static void main(String[] args) {
		int[] nums={3,4,5,1,2};
		System.out.println(findMin(nums));
	}
	public static int findMin(int[] nums){
        if(nums.length<1)
            return 0;      
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i])
                return nums[i+1];
            else if(i==nums.length-2)
                return nums[0];
        }
        return nums[0];
	}
}