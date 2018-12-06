public class reOrderArray{
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6};
		reorderarray(array);
		for(int a: array)
			System.out.print(a+" ");
	}
	
	public static void reorderarray(int[] array){
		if (array.length<=0)
            return;
		int p=array.length/2;
		for(int i=0;i<=p;i++){
			if(array[i]%2==0){
				for(int j=i+1;j<array.length;j++)
					if(array[j]%2==1){
						swap(i,j,array);
						break;
					}
			}
		}
		return;
	}

	public static void swap(int f1,int f2,int[] array){
		int tmp=array[f2];
		for(int i=f2;i>f1;i--)
			array[i]=array[i-1];
		array[f1]=tmp;
	}
}