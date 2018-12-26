 import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Minimum_Depth_of_Binary_Tree{
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
		//     3  
		//  9     20
		//       15  7
			TreeNode root=t3;
			System.out.println(minDepth(root));
	}

	public static int minDepth(TreeNode root){
		Queue<TreeNode> queue=new LinkedList<>();
		if(root==null)
			return 0;
		int dep=1;
		queue.offer(root);
		while(!queue.isEmpty()){
			int num=queue.size();
			for(int i=0;i<num;i++){
				TreeNode tmp=queue.poll();
				if(tmp.left==null&&tmp.right==null){
					return dep;
				}
				if(tmp.left!=null)
					queue.offer(tmp.left);
				if(tmp.right!=null)
					queue.offer(tmp.right);
			}
			dep++;
		}
		return dep;
	}
}