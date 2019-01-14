import java.util.*;
public class Subtree_of_Another_Tree{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

	public static void main(String[] args) {
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		// t4.left=t1;
		// t4.right=t2;
		// t3.left=t4;
		// t3.right=t5;
		TreeNode s=new TreeNode(1);
		s.left=t2;
		s.right=t3;
		TreeNode t=t1;
		t.left=t2;
		System.out.println(isSubtree(s,t));
	}

    public static boolean isSubtree(TreeNode s, TreeNode t) {
		String tt=tree2string(t);
		if(s==null)
			return t==null;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(s);
		while(!queue.isEmpty()){
			int num=queue.size();
			for(int i=0;i<num;i++){
				TreeNode tmptree=queue.poll();
				if(tmptree.val==t.val){
					String st=tree2string(tmptree);
					if(st.equals(tt))
						return true;
				}
				if(tmptree.left!=null)
					queue.offer(tmptree.left);
				if(tmptree.right!=null)
					queue.offer(tmptree.right);
			}
		}
		return false;
    }

    public static String tree2string(TreeNode tree){
    	if(tree==null)
    		return "";
    	StringBuffer sb=new StringBuffer();
    	t2s(tree,sb);
    	return sb.toString();
    }

    public static void t2s(TreeNode tree,StringBuffer sb){
    	sb.append(tree.val);
    	if(tree.left==null&&tree.right==null)
    		return;
    	if(tree.left!=null){
    		sb.append("(");
    		t2s(tree.left,sb);
    		sb.append(")");
    	}
    	if(tree.right!=null){
    		if(tree.left==null)
    			sb.append("()");
    		sb.append("(");
    		t2s(tree.right,sb);
    		sb.append(")");
    	}
    }
}