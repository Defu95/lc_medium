import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;
class Node {
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
	}
}
public class N_ary_Tree_Postorder_Traversal{
	public static void main(String[] args) {
		List<Node> tl=new ArrayList<Node>();
		Node n5=new Node(5,tl);
		Node n6=new Node(6,tl);
		List<Node> ln1=new ArrayList<Node>();
		ln1.add(n5);
		ln1.add(n6);
		Node n3=new Node(3,ln1);	
		Node n2=new Node(2,tl);
		Node n4=new Node(4,tl);
		List<Node> ln2=new ArrayList<>();
		ln2.add(n3);
		ln2.add(n2);
		ln2.add(n4);
		Node n1=new Node(1,ln2),root=n1;
//    1
//  3   2   4
// 5 6
		List<Integer> res=postorder(n1);
		Iterator<Integer> it=res.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
    public static List<Integer> postorder(Node root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
        	return res;
        if(root.children==null){
        	res.add(root.val);
        	return res;
        }
        // Queue<List<Node>> q=new LinkedList<>();
  ////output in order : 1-3-2-4-5-6
  //       res.add(root.val);
  //       if(root.children!=null)
	 //        q.offer(root.children);
  //       while(!q.isEmpty()){
  //       	List<Node> tchild=q.poll();
  //       	Iterator<Node> it=tchild.iterator();
  //       	while(it.hasNext()){
  //       		Node tmp=it.next();
  //       		res.add(tmp.val);
  //       		if(tmp.children!=null)
	 //        		q.offer(tmp.children);
  //       	}
  //       }
		// return res;
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
        	Node tmp=s1.pop();
        	s2.push(tmp);
        	Iterator<Node> it=tmp.children.iterator();
        	while (it.hasNext()) {
        		Node tn=it.next();
        		s1.push(tn);
        	}
        }
        while(!s2.isEmpty())
        	res.add(s2.pop().val);
        return res;
    }
}