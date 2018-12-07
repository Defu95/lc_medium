import java.util.Stack;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 

public class FindFirstCommonNode{
	public static void main(String[] args) {
		ListNode p1=new ListNode(1), tp1=p1;
		p1.next=new ListNode(2);
		p1=p1.next;
		p1.next=new ListNode(3);
		p1=p1.next;
		p1.next=new ListNode(4);
		p1=p1.next;
		p1.next=new ListNode(7);
		ListNode p2=new ListNode(5), tp2=p2,p=p2;
		p2.next=new ListNode(6);
		p2=p2.next;
		p2.next=new ListNode(7);
		ListNode test=findfirstcommonnode(tp1,tp2);
		while(test!=null){
			System.out.println(test.val+" ");
			test=test.next;
		}
	}

	public static ListNode findfirstcommonnode(ListNode pHead1,ListNode pHead2){
		if(pHead1==null||pHead2==null)
			return null;
		ListNode res=pHead1;
		int countp1=0;
		Stack<Integer> s1=new Stack<>(), s2=new Stack<>();
		while(pHead1!=null){
			s1.push(pHead1.val);
			pHead1=pHead1.next;
			countp1++;
		}
		while(pHead2!=null){
			s2.push(pHead2.val);
			pHead2=pHead2.next;
		}
		int f=-1,count=0;
		while(!s1.empty()&&!s2.empty()){
			if(s1.pop()==s2.pop()){
				f=1;
				count++;
			}else{
				break;
			}
		}
		if(f!=-1){
			while(countp1-count>0){
				res=res.next;
				countp1--;
			}
			return res;
		}
		return null;
	}
}