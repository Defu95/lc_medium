import java.util.*;
public class Keys_and_Rooms{
	public static void main(String[] args) {
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> t1=new ArrayList<>();
		List<Integer> t2=new ArrayList<>();
		List<Integer> t3=new ArrayList<>();
		List<Integer> t4=new ArrayList<>();
		t1.add(1);t1.add(3);
		t2.add(3);t2.add(0);t2.add(1);
		t3.add(2);
		t4.add(0);
		res.add(t1);res.add(t2);res.add(t3);res.add(t4);
		System.out.println(canVisitAllRooms(res));
	}
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> keyset=new HashSet<>();  
    	Iterator<Integer> iterator=rooms.get(0).iterator();
    	keyset.add(0);
    	Stack<Integer> st=new Stack<>();
    	while(iterator.hasNext()){
    		int tmp=iterator.next();
    		keyset.add(tmp);
    		st.push(tmp);
    	}
    	int[] flag=new int[rooms.size()];
    	flag[0]=1;
    	while(!st.isEmpty()){
    		int tmp=st.pop();
    		if(flag[tmp]==0){
    			flag[tmp]=1;
    			List<Integer> list=rooms.get(tmp);
    			Iterator<Integer> it_tmp=list.iterator();
    			while(it_tmp.hasNext()){
    				int k=it_tmp.next();
    				if(flag[k]==0){
    					st.push(k);
    					keyset.add(k);
    				}
    			}
    		}
    	}
        if(keyset.size()<rooms.size())
        	return false;
        return true;
    }
}