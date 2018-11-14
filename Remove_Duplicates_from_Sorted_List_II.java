class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
public class Remove_Duplicates_from_Sorted_List_II{
	public static void main(String[] args) {
		ListNode head=new ListNode(1),cur=head;
		head.next=new ListNode(1);
		head=head.next;
		head.next=new ListNode(1);
		head=head.next;
		head.next=new ListNode(2);
		// head=head.next;	
		// head.next=new ListNode(2);
		head=head.next;
		head.next=new ListNode(3);
		ListNode p=cur;
		while(cur!=null){
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
		ListNode res=deleteDuplicates(p);
		System.out.println();
		while(res!=null){
			System.out.print(res.val+" ");
			res=res.next;
		}
	}
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        ListNode tmp=new ListNode(-1);
        ListNode p=head,cur=tmp;
        while(p!=null){
        	if(p.next!=null&&p.val==p.next.val){ //
        		while(p.next!=null&&p.val==p.next.val){  //p.next!=null&&
        			p=p.next;
        		}
        		p=p.next;
        		tmp.next=p;
        	}else{
        		tmp.next=p;
        		tmp=p;
        		p=p.next;
        	}
        }
        return cur.next;
    }
}