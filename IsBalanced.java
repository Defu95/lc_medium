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
			return true;
		int leftdep=treedep(root.left);
		int rightdep=treedep(root.right);
		if(Math.abs(leftdep-rightdep)>1)
			return false;
		return isbalanced_solution(root.left) && isbalanced_solution(root.right);
	}

	public static int treedep(TreeNode root){
		if(root==null)
			return 0;
		int leftdep=treedep(root.left);
		int rightdep=treedep(root.right);
		return leftdep>rightdep?leftdep+1:rightdep+1;
	}
}