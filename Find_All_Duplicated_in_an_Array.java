import java.util.*;
public class Find_All_Duplicated_in_an_Array{
	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		List<Integer> test=findDuplicates(nums);
		Iterator<Integer> iterator=test.iterator();
		while(iterator.hasNext()){
			int a=iterator.next();
			System.out.print(a+" ");
		}
	}
    public static List<Integer> findDuplicates(int[] nums) {
        // List<Integer> res=new ArrayList<>();
        // HashSet<Integer> set=new HashSet<>();
        // for(int a:nums){
        // 	if(set.contains(a))
        // 		res.add(a);
        // 	else
        // 		set.add(a);
        // }
        // return res;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        	int j=nums[i]>0?nums[i]:-nums[i];
        	if(nums[j-1]<0)
        		res.add(j);
        	nums[j-1]=nums[j-1]>0?-nums[j-1]:nums[j-1];
        }
        return res;
    }
}