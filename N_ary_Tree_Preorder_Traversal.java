import java.util.*;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class N_ary_Tree_Preorder_Traversal{
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
		List<Integer> res=preorder(root);
		Iterator<Integer> it=res.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
// 1-3-5-6-2-4
	}

    public static List<Integer> preorder(Node root) {
    	List<Integer> res=new ArrayList<>();
    	if(root==null)    
    		return res;
    	if(root.children==null){
    		res.add(root.val);
    		return res;
    	}
    	pre(root,res);
    	return res;
    }

    public static void pre(Node root,List<Integer> res){
    	if(root==null)
    		return;
    	res.add(root.val);
    	for(Node n:root.children){
    		pre(n,res);
    	}
    }
}