import java.util.*;
public class N_ary_Tree_Level_Order_Traversal{
	static class Node {
	    public int val;
	    public List<Node> children;
	    public Node() {}
	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	public static void main(String[] args) {
		List<Node> nl=new ArrayList<>();
		Node n5=new Node(5,nl);
		Node n6=new Node(6,nl);
		List<Node> l1=new ArrayList<>();
		l1.add(n5);
		l1.add(n6);
		Node n3=new Node(3,l1);
		Node n2=new Node(2,nl);
		Node n4=new Node(4,nl);
		List<Node> l2=new ArrayList<>();
		l2.add(n3);
		l2.add(n2);
		l2.add(n4);
		Node n1=new Node(1,l2);
		List<List<Integer>> res=levelOrder(n1);
		for(List<Integer> ls:res){
			for(int n:ls)
				System.out.print(n+" ");
			System.out.println();
		}
	}

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        	return res;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){        	
        	int num=queue.size();
	        List<Integer> tmp=new ArrayList<>();
        	for(int i=0;i<num;i++){
        		Node tmpnode=queue.poll();
	        	tmp.add(tmpnode.val);
        		List<Node> tlist=tmpnode.children;
        		for(Node n:tlist)
        			queue.offer(n);
        	}
        	res.add(tmp);
        }
        return res;
    }
}