import java.util.*;
public class Spiral_Matrix{
	public static void main(String[] args) {
		int[][] matrix={{1, 2, 3, 4},
						{5, 6, 7, 8},
		 				{9,10,11,12}};
		// int[][] matrix={{3,2}};
		List<Integer> res=spiralOrder(matrix);
		System.out.println();
		printlist(res);
	}

	public static void printlist(List<Integer> res){
		Iterator<Integer> it=res.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

	public static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> res=new ArrayList<>();
		if(matrix.length<=0||matrix[0].length<=0)
			return res;
		int start=0;
		int col=matrix[0].length-1,row=matrix.length-1;
		while(col>=2*start && row>=2*start){
			res.addAll(printfromleft(start,matrix));
			res.addAll(printfromup(start,matrix));
			if(start!=col-start&&start!=row-start)
				res.addAll(printfromright(start,matrix));
			if(start!=col-start&&start!=row-start)
				res.addAll(printfromdown(start,matrix));
			start++;
		}
		return res;
	}

	public static List<Integer> printfromleft(int start, int[][] matrix){
		List<Integer> tmp=new ArrayList<>();
		for(int j=start;j<matrix[0].length-start;j++){
			tmp.add(matrix[start][j]);
		}		
		return tmp;
	}

	public static List<Integer> printfromup(int start, int[][] matrix){
		List<Integer> tmp=new ArrayList<>();
		for(int i=start+1;i<matrix.length-start;i++){
			tmp.add(matrix[i][matrix[0].length-1-start]);
		}
		return tmp;
	}

	public static List<Integer> printfromright(int start, int[][] matrix){
		List<Integer> tmp=new ArrayList<>();
		for(int j=matrix[0].length-start-2;j>start;j--){
			tmp.add(matrix[matrix.length-1-start][j]);
		}
		return tmp;
	}

	public static List<Integer> printfromdown(int start, int[][] matrix){
		List<Integer> tmp=new ArrayList<>();
		for(int i=matrix.length-1-start;i>start;i--){
			tmp.add(matrix[i][start]);
		}
		return tmp;
	}
}