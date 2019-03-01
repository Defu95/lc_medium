import java.util.*;
public class nowcoder_ReverseList{
	static class ListNode {
	    int val;
	    ListNode next = null;
	    ListNode(int val) {
	        this.val = val;
	    }
	}

	public static void main(String[] args){
		ListNode l1=new ListNode(1);
		ListNode head=l1;
		ListNode l2=new ListNode(2);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		l5.next=l6;
		l4.next=l5;
		l2.next=l4;
		l1.next=l2;
		ListNode res=ReverseList(head);
		while(res!=null){
			int num=res.val;
			System.out.print(num+" ");
			res=res.next;
		}
	}

    public static ListNode ReverseList(ListNode head) {
    	if(head==null || head.next==null) 
    		return head;
    	ListNode tmp=null,cur=null,res=null;
    	while(head!=null){
    		cur=head.next;
    		tmp=head;
    		tmp.next=res;
    		res=tmp;
    		head=cur; 
    	}
    	return res;
    }
}