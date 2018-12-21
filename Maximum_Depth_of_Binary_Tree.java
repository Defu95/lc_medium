 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Maximum_Depth_of_Binary_Tree{
	public static void main(String[] args) {
			TreeNode t15=new TreeNode(15);
			TreeNode t7=new TreeNode(7);
			TreeNode t20=new TreeNode(20);
			TreeNode t9=new TreeNode(9);
			TreeNode t3=new TreeNode(3);
			t20.left=t15;
			t20.right=t7;
			t3.left=t9;
			t3.right=t20;
			TreeNode root=t3;
			System.out.println(maxDepth(root));
	}	
    
    public static int maxDepth(TreeNode root) {
        if(root==null)
        	return 0;
      	int count=0;
        count=countd(root,count);
        return count;
    }	

    public static int countd(TreeNode root,int count){
    	if(root.left==null&&root.right==null){
    		System.out.print(root.val+" ");
    		System.out.println(count);
    		return count;	
    	}
    	if(root.left!=null){
    		count++;
    		System.out.println("!"+count);
    		return countd(root.left,count);
    	}
    	if(root.right!=null){
    		count++;
    		System.out.println("!!"+count);
    		return countd(root.right,count);
    	}
    	return count;
    }
}