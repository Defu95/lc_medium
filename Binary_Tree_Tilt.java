public class Binary_Tree_Tilt{
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}

	public static void main(String[] args) {
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t1=new TreeNode(1);
		t2.left=t4;
		t3.right=t5;
		t1.left=t2;
		t1.right=t3;
		//      1
		//   2     3
		// 4          5
		// 4+5+((3+5)-(4+2))=11
		System.out.println(findTilt(t1));
	}

	public static int findTilt(TreeNode root){
		int res=0;
		if(root==null)
			return res;
		res=Math.abs(sumsubtree(root.left)-sumsubtree(root.right));
		return res+findTilt(root.left)+findTilt(root.right);
	}

	public static int sumsubtree(TreeNode root){
		if(root==null)
			return 0;
		return root.val+sumsubtree(root.left)+sumsubtree(root.right);
	}
}