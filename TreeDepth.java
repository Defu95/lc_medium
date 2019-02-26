import java.util.*;
public class TreeDepth {
	static class TreeNode{
		int val=0;
		TreeNode left=null;
		TreeNode right=null;

		public TreeNode(int val){
			this.val=val;
		}
	}

	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t4.right=t5;
		System.out.println(treedepth(t1));
	}

    public static int treedepth(TreeNode root) {
        if(root==null)
        	return 0;
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	depth+=1;
        	int num=queue.size();
        	for(int i=0;i<num;i++){
        		TreeNode tmp=queue.poll();
        		if(tmp.left!=null)
        			queue.offer(tmp.left);
        		if(tmp.right!=null)
        			queue.offer(tmp.right);
        	}
        }
        return depth;
    }
}