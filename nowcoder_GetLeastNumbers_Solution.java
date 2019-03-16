import java.util.*;
public class nowcoder_GetLeastNumbers_Solution {
	public static void main(String[] args) {
		int[] input={4,5,1,6,2,7,3,8};
		ArrayList<Integer> res=GetLeastNumbers_Solution(input,4);
		for(int num:res)
			System.out.print(num+" ");
	}

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        if(input.length==0 || k>input.length || k<=0)
            return res;
        int begin=0,end=input.length-1;
        int index=partition(input,begin,end);
        while(index!=k-1){
            if(index>k-1){
                end=index-1;
                index=partition(input,begin,end);
            }
            else{
                begin=index+1;
                index=partition(input,begin,end);
            }
        }
        for(int i=0;i<k;i++)
            res.add(input[i]);
        return res;
    }

    public static int partition(int[] input, int begin, int end){
        int p=(begin+end)/2;
        int small=begin-1;
        swap(input,p,end);
        for(int i=begin;i<end;i++){
            if(input[i]<input[end]){
                small++;
                if(small!=i)
                    swap(input,i,small);
            }
        }
        small++;
        swap(input,small,end);
        return small;
    }

    public static void swap(int[] input, int i, int j){
        int tmp=input[i];
        input[i]=input[j];
        input[j]=tmp;
    }
}