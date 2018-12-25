 import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Average_of_Levels_in_Binary_Tree{
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
			List<Double> res=averageOfLevels(root);
			for(double tmp:res)
				System.out.print(tmp+" ");
	}

    public static List<Double> averageOfLevels(TreeNode root) {
    	List<Double> res=new ArrayList<>();
    	Queue<TreeNode> queue=new LinkedList<>();
    	if(root==null)
    		return res;
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		int sum=0;
    		int num=queue.size();
    		for(int i=0;i<num;i++){
    			TreeNode tmp=queue.poll();
    			sum+=tmp.val;
    			if(tmp.left!=null)
	    			queue.offer(tmp.left);
	    		if(tmp.right!=null)
	    			queue.offer(tmp.right);	    		
    		}
    		res.add((double)sum/num);
    	}
    	return res;        
    }
}