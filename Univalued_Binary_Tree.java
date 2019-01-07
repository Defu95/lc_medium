 import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class Univalued_Binary_Tree{
	public static void main(String[] args) {
		TreeNode t11=new TreeNode(2);
		TreeNode t21=new TreeNode(2);
		TreeNode t22=new TreeNode(2);
		TreeNode t31=new TreeNode(5);
		TreeNode t32=new TreeNode(2);
		t21.left=t31;
		t21.right=t32;
		t11.left=t21;
		t11.right=t22;
		System.out.println(isUnivalTree(t11));
	}

    public static boolean isUnivalTree(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
        	return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int p=root.val;
        while(!queue.isEmpty()){
        	int num=queue.size();
        	for(int i=0;i<num;i++){
	        	TreeNode tmpnode=queue.poll();
	        	if(tmpnode.val!=p)
	        		return false;
        		if(tmpnode.left!=null){
        			queue.add(tmpnode.left);
        		}
        		if(tmpnode.right!=null)
        			queue.add(tmpnode.right);
        	}
        }
        return true;
    }

}


    // public boolean isUnivalTree(TreeNode root) {
    //     return univalHelper(root, root.val);
    // }
    
    // public boolean univalHelper(TreeNode root, int lastVal){
    //     if(root == null){
    //         return true;
    //     }
    //     if(root.val != lastVal){
    //         return false;
    //     }
    //     else{
    //         return(univalHelper(root.left, root.val) && univalHelper(root.right, root.val));
    //     }
    // }