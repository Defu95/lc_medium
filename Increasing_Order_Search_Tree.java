import java.util.*;
public class Increasing_Order_Search_Tree{
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode t5=new TreeNode(5);
		TreeNode t3=new TreeNode(3);
		TreeNode t6=new TreeNode(6);
		TreeNode t2=new TreeNode(2);
		TreeNode t4=new TreeNode(4);
		TreeNode t8=new TreeNode(8);
		TreeNode t1=new TreeNode(1);
		TreeNode t7=new TreeNode(7);
		TreeNode t9=new TreeNode(9);
		t2.left=t1;
		t3.left=t2;
		t3.right=t4;
		t8.left=t7;
		t8.right=t9;
		t6.right=t8;
		t5.left=t3;
		t5.right=t6;
		TreeNode res=increasingBST(t5);
		//        5
		//       / \
		//     3    6
		//    / \    \
		//   2   4    8
		//  /        / \ 
		// 1        7   9
		System.out.println(printree(res));
	}

	public static String printree(TreeNode root){
		if(root==null)
			return "";
		StringBuffer sb=new StringBuffer();
		t2s(root,sb);
		return sb.toString();
	}

	public static void t2s(TreeNode root,StringBuffer sb){
		sb.append(root.val);
		if(root.left!=null){
			sb.append("(");
			t2s(root.left,sb);
			sb.append(")");
		}
		if(root.right!=null){
			if(root.left==null)
				sb.append("()");
			sb.append("(");
			t2s(root.right,sb);
			sb.append(")");
		}
	}

	public static TreeNode increasingBST(TreeNode root) {
		TreeNode pre=new TreeNode(-1);
		TreeNode res=pre;
		Stack<TreeNode> stack=new Stack<>();
		while(true){
			while(root!=null){
				stack.push(root);
				root=root.left;
			}
			if(stack.isEmpty())
				return res.right;
			TreeNode cur=stack.pop();
			pre.right=cur;
			pre=pre.right;
			pre.left=null;
			root=cur.right;
		}
    }
}