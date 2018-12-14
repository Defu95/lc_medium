import java.util.*;
public class FindNumsAppearOnce{
	public static void main(String[] args) {
		int[] array={2,3,2,12,2,3,21};
		int[] num1=new int[1];
		int[] num2=new int[1];
		findnumsappearonce(array,num1,num2);
		System.out.println(num1[0]+" "+num2[0]);
	}

	public static void findnumsappearonce(int [] array,int num1[] , int num2[]){
		HashSet<Integer> tmp=new HashSet<>();
		for(int num:array){
			if(tmp.contains(num))
				tmp.remove(num);
			else
				tmp.add(num);
		}
		Iterator<Integer> it=tmp.iterator();
		int flag=-1;
		while(it.hasNext()){
			int in=it.next();
			if(flag==-1){
				num1[0]=in;
				flag=1;
			}else
			num2[0]=in;
		}
	}
}