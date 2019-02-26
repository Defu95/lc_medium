import java.util.*;
public class IsBalanced{
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
		System.out.println(isbalanced_solution(t1));
	}

	public static boolean isbalanced_solution(TreeNode root){
		if(root==null)
			return false;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		int flag=-1;
		while(!queue.isEmpty()){
			int num=queue.size();
			for(int i=0;i<num;i++){
				TreeNode tmp=queue.poll();
				if(tmp.left!=null)
					queue.offer(tmp.left);
				else {
					flag=1;
				}
				if(tmp.right!=null)
					queue.offer(tmp.right);
				else {
					flag=1;
				}
			}
			if(flag==1)
				break;
		}
		if(queue.isEmpty())
			return true;
		int num=queue.size();
		for(int i=0;i<num;i++){
			TreeNode tmp=queue.poll();
			if(tmp.left!=null||tmp.right!=null)
				return false;
		}
		return true;
	}
}