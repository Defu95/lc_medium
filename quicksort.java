public class quicksort{
	public static void main(String[] args) {
		int[] numbers={4,5,1,6,2,7,3,8};
		sort(numbers,0,numbers.length-1);
		for(int num: numbers)
			System.out.print(num+" ");
	}

	public static void sort(int[] numbers,int begin,int end){
		if(numbers.length<=1)
			return;
		if(begin==end)
			return;
		int index=partition(numbers,begin,end);
		if(index>begin)
			sort(numbers,begin,index-1);
		if(index<end)
			sort(numbers,index+1,end);
	}

	public static int partition(int[] numbers,int begin,int end){
		if(begin>=end || numbers.length<=1)
			return -1;
		int p=(begin+end)/2;
		int small=begin-1;
		swap(numbers,p,end);
		for(int i=begin;i<end;i++){
			if(numbers[i]<numbers[end]){
				small++;
				if(small!=i)
					swap(numbers,i,small);
			}
		}
		small++;
		swap(numbers,small,end);
		return small;
	}

	public static void swap(int[] numbers,int i,int j){
		int tmp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=tmp;
		return;
	}

}