class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Search_in_a_Binary_Search_Tree{
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4),root=t4;
		TreeNode t7=new TreeNode(7);
		t2.left=t1;
		t2.right=t3;
		t4.left=t2;
		t4.right=t7;
		TreeNode res=searchBST(root,2);
		System.out.println(res.left.val);
	}
    public static TreeNode searchBST(TreeNode root, int val) {
    	if(root==null)
    		return null;
        if(root.val==val)
        	return root;
        else if(root.val>val) return searchBST(root.left,val);
        else return searchBST(root.right,val);

    }

}