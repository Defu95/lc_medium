import java.util.ArrayList;
public class nowcoder_FindContinuousSequence {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> res=FindContinuousSequence(100);
		for(ArrayList<Integer> list:res){
			for (int num: list) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> res=new ArrayList<>();
       int plow=1,phigh=2;
       while(plow<=sum/2){
       		int cur=(plow+phigh)*(phigh-plow+1)/2;
       		if(cur==sum){
       			ArrayList<Integer> list=new ArrayList<>();
       			int tmp=plow;
       			while(tmp<=phigh){
       				list.add(tmp);
       				tmp++;
       			}
       			res.add(list);
       			phigh++;
       		}else if(cur<sum)
       			phigh++;
   			else
   				plow++;
       }
       return res;
    }
}