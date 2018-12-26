 import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Invert_Binary_Tree{
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
			TreeNode res=invertTree(root);
			List<Integer> list=new ArrayList<>();
			Queue<TreeNode> queue=new LinkedList<>();
			queue.offer(root);
			while(!queue.isEmpty()){
				int num=queue.size();
				for(int i=0;i<num;i++){
					TreeNode tmp=queue.poll();
					list.add(tmp.val);
					if(tmp.left==null)
						list.add(-1);
					else{
						queue.offer(tmp.left);
					}
					if(tmp.right==null)
						list.add(-2);
					else{
						queue.offer(tmp.right);
					}
				}
			}
			for(int l:list)
				System.out.print(l+" ");
	}

    public static TreeNode invertTree(TreeNode root) {
    	if(root==null)
    		return root;
    	mirror(root);
        return root;
    }

    public static void mirror(TreeNode root){
    	if(root.left==null&&root.right==null)
    		return;
    	TreeNode tmp=root.left;
    	root.left=root.right;
    	root.right=tmp;
    	if(root.left!=null)
    		mirror(root.left);
    	if(root.right!=null)
    		mirror(root.right);
    }

}