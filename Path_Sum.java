public class Path_Sum {
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode t5=new TreeNode(5);
		TreeNode t14=new TreeNode(4);
		TreeNode t8=new TreeNode(8);
		TreeNode t11=new TreeNode(11);
		TreeNode t13=new TreeNode(13);
		TreeNode t24=new TreeNode(4);
		TreeNode t7=new TreeNode(7);
		TreeNode t2=new TreeNode(2);
		TreeNode t1=new TreeNode(1);
		t11.left=t7;
		t11.right=t2;
		t24.right=t1;
		t14.left=t11;
		t8.left=t13;
		t8.right=t24;
		t5.left=t14;
		t5.right=t8;
		//       5
		//      / \
		//     4   8
		//    /   / \
		//   11  13  4
		//  /  \      \
		// 7    2      1
		System.out.println(hasPathSum(t5,22));
	}

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
        	return false;
        if(root.val==sum&&root.left==null&&root.right==null)
        	return true;
        Boolean lsum=hasPathSum(root.left,sum-root.val);
        Boolean rsum=hasPathSum(root.right,sum-root.val);
        return lsum||rsum;
    }
}