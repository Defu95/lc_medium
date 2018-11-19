import java.util.ArrayList;
import java.util.Iterator;
public class StringArrage {
	public static void main(String[] args){
		String test="abc";
		ArrayList<String> res=Permutation(test);
		Iterator it=res.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}
    public static ArrayList<String> Permutation(String str) {
       char a[]=str.toCharArray();
       ArrayList<String> res=new ArrayList<>();
       if(str==null||str.length()==0)
       	return res;
       permute(a,0,res);
       return res;
   }

   public static void permute(char[] a,int i,ArrayList<String> res){
   		int len=a.length;
   		if( i==len-1){
   			res.add(String.valueOf(a));
   			return;
   		}
   		permute(a,i+1,res);
   		for(int m=i+1;m<len;m++){
   			if(a[m]!=a[i]){
   				char tmp=a[m];
   				a[m]=a[i];
   				a[i]=tmp;
   				permute(a,i+1,res);
   				tmp=a[m];
   				a[m]=a[i];
   				a[i]=tmp;
   			}
   		}
   }
}