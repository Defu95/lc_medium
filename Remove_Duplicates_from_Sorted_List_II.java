class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
public class Remove_Duplicates_from_Sorted_List_II{
	public static void main(String[] args) {
		ListNode head=new ListNode(5),cur=head;
		head.next=new ListNode(3);
		head=head.next;
		head.next=new ListNode(3);
		head=head.next;
		head.next=new ListNode(2);
		head=head.next;	
		head.next=new ListNode(2);
		head=head.next;
		head.next=new ListNode(1);
		while(cur!=null){
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
	}
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp=head,p=head,cur=tmp;
        while(p.next!=null){
        	if(p.val==p.next.val){
        		p.next=p.next.next;
        	}
        }

    }
}