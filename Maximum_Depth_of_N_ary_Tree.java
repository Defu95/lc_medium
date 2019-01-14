import java.util.*;
public class Maximum_Depth_of_N_ary_Tree{
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
		List<Node> l2=new ArrayList<>();
		l2.add(n5);
		l2.add(n6);
		Node n2=new Node(2,nl);
		Node n3=new Node(3,l2);
		Node n4=new Node(4,nl);
		List<Node> l1=new ArrayList<>();
		l1.add(n2);
		l1.add(n3);
		l1.add(n4);
		Node n1=new Node(1,l1);
		//      1
		//  2   3   4
		// 5 6
		System.out.println(maxDepth(n1));
	}

    public static int maxDepth(Node root) {
        if(root==null)
        	return 0;
        Queue<Node> queue=new LinkedList<>();
        int sum=0;
        queue.offer(root);
        while(!queue.isEmpty()){
        	int num=queue.size();
        	sum++;
        	for(int i=0;i<num;i++){
        		Node tmpnode=queue.poll();
        		List<Node> tmpch=tmpnode.children;
        		for(Node n:tmpch)
        			queue.offer(n);
        	}
        }
        return sum;
    }
}