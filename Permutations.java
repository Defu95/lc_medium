//problem 46
import java.util.*;
public class Permutations {
	public static void main(String[] args){
		int[] nums={1,2,3,4};
		List<List<Integer>> res=permute(nums);
		Iterator<List<Integer>> it=res.iterator();
		while(it.hasNext()){
			List<Integer> tmp=it.next();
			Iterator iterator=tmp.iterator();
			while(iterator.hasNext()){
				System.out.print(iterator.next()+" ");
			}
			System.out.println();
		}
	}

    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> res=new ArrayList<>();
    	if(nums.length<=0)
    		return res;
    	arrange(nums,res,0);
        return res;
    }

    public static void arrange(int[] nums,List<List<Integer>> res,int position){
    	if(position==nums.length-1){
    		res.add(arr2list(nums));
    		return;
    	}else{
    		for(int flag=position;flag<nums.length;flag++){
    			swap(nums,flag,position);
    			arrange(nums,res,position+1);
				swap(nums,flag,position);
			}
    	}
    }

    public static List<Integer> arr2list(int[] nums){
    	List<Integer> tmp=new ArrayList<>();
    	for(int n:nums)
    		tmp.add(n);
    	return tmp;
    }

    public static void swap(int[] nums,int i,int j){
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    	return;
    }
}