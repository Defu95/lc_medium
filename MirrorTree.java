import PrintfromTop2Bottom.PrintFromTopToBottom;
import java.util.*;
public class MirrorTree {
	static class TreeNode{
		int val=0;
		TreeNode left=null;
		TreeNode right=null;

		public TreeNode(int val){
			this.val=val;
		}
	}
	public static void main(String[] args) {
		TreeNode t11=new TreeNode(1);
		TreeNode t21=new TreeNode(2);
		TreeNode t22=new TreeNode(2);
		TreeNode t31=new TreeNode(3);
        TreeNode t32=new TreeNode(3);
        TreeNode t41=new TreeNode(4);
        TreeNode t42=new TreeNode(4);
        // TreeNode t51=new TreeNode(5);
        // TreeNode t52=new TreeNode(5);
        // TreeNode t61=new TreeNode(6);
        // TreeNode t62=new TreeNode(6);
        t21.left=t31;
        // t21.right=t41;
        // t22.left=t42;
        t22.right=t32;
        t11.left=t21;
        t11.right=t22;
        ArrayList<Integer> res=PrintFromTopToBottom(t11);
        for(int num:res)
        	System.out.print(num+" ");
        // Mirror(t11);        
	}
	
    public static void Mirror(TreeNode root) {
        if(root==null)
        	return;
        if(root.left!=null||root.right!=null)
        	return;
    }
}