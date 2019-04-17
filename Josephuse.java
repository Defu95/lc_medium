public class Josephuse{
	static class ListNode{
	    int val;
	    ListNode next;
	    ListNode(int val){
	        this.val=val;
	        this.next=null;
	    }
	}

	public static void main(String[] args) {
		int[] num={0,1,2,3,4};	
		System.out.println(LastRemain(num,3));
	}

	public static int LastRemain(int[] num,int m){
		if(num.length<1)
			return -1;
	}	
}