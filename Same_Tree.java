 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Same_Tree{
	public static void main(String[] args) {
		TreeNode t12=new TreeNode(2);
		TreeNode t13=new TreeNode(3);
		TreeNode t11=new TreeNode(1);
		t11.left=t12;
		t11.right=t13;
		TreeNode t22=new TreeNode(2);
		TreeNode t23=new TreeNode(3);
		TreeNode t21=new TreeNode(1);
		t21.left=t22;
		t21.right=t23;
		System.out.println(isSameTree(t11,t21));
	}

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
        	return true;
        if(p==null&&q!=null)
        	return false;
        if(p!=null&&q==null)
        	return false;
        if((p.left!=null&&q.left==null)||(p.left==null&&q.left!=null))
        	return false;
        if((p.right!=null&&q.right==null)||(p.right==null&&q.right!=null))
        	return false;
        if(p.left==null&&p.right==null&&q.left==null&&q.right==null)
        	return p.val==q.val;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}