public class quicksort{
	public static void main(String[] args) {
		int[] numbers={2,3,4,2,6,2,5,1};
		sort(numbers);
		for(int num: numbers)
			System.out.print(num+" ");
	}

	public static void sort(int[] numbers){
		if(numbers.length<=1)
			return;
		
	}
}