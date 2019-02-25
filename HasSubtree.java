import java.util.*;
public class HasSubtree{
	static class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		TreeNode t11=new TreeNode(1);
		TreeNode t12=new TreeNode(2);
		TreeNode t13=new TreeNode(3);
		t11.left=t12;
		t11.right=t13;
		TreeNode t21=new TreeNode(1);
		TreeNode t22=new TreeNode(2);
		t21.left=t22;
		System.out.println(hassubtree(t11,t21));
	}

	public static boolean hassubtree(TreeNode root1,TreeNode root2){
		if(root1==null || root2==null)
			return false;
		return subtree(root1,root2) || 
		hassubtree(root1.left,root2)||hassubtree(root1.right,root2);
	}


	public static boolean subtree(TreeNode root1,TreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val==root2.val){
			return subtree(root1.left,root2.left)&&subtree(root1.right,root2.right);
		}else
			return false;
	}
}