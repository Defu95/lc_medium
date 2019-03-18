import java.util.*;
public class HeapSort{
	public static void main(String[] args) {
		int[] arr={4,6,8,5,9};
		hs(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void hs(int[] num){
		for(int i=num.length/2-1;i>=0;i--)
			AdjustMaxHeap(num,i,num.length);
		for(int j=num.length-1;j>0;j--){
			swap(num,0,j);
			AdjustMaxHeap(num,0,j);
		}
	}

	public static void AdjustMaxHeap(int[] num,int i,int j){
		int tmp=num[i];
		for(int k=2*i+1;k<j;k=k*2+1){
			if(k+1<j && num[k]<num[k+1])
				k++;
			if(num[k]>tmp){
				num[i]=num[k];
				i=k;
			}else{
				break;
			}
		}
		num[i]=tmp;
	}

	public static void swap(int[] num,int i,int j){
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
		return;
	}
}