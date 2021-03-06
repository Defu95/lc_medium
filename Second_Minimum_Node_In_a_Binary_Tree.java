import java.util.*;
public class Second_Minimum_Node_In_a_Binary_Tree{
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode t15=new TreeNode(5);
		TreeNode t7=new TreeNode(7);
		TreeNode t25=new TreeNode(5);
		t25.left=t15;
		t25.right=t7;
		TreeNode t12=new TreeNode(2);
		TreeNode t22=new TreeNode(2);
		t22.left=t12;
		t22.right=t25;
		//   2
		//  / \
		// 2   5
		//    / \
		//   5   7
		System.out.println(findSecondMinimumValue(t22));
	}

    public static int findSecondMinimumValue(TreeNode root) {
    	if(root==null)
    		return -1;
        int firstmin=Integer.MAX_VALUE,secondmin=Integer.MAX_VALUE;
        secondmin=findsubtree(root,firstmin,secondmin);
        return secondmin==Integer.MAX_VALUE?-1:secondmin;
    }

    public static int findsubtree(TreeNode root,int firstmin,int secondmin){
    	if(root==null)
    		return secondmin;
    	int tmp=root.val;
    	if(tmp<firstmin){
    		secondmin=firstmin;
    		firstmin=tmp;
    	}else if(firstmin<tmp&&secondmin>tmp)
    		secondmin=tmp;
    	int leftmin=findsubtree(root.left,firstmin,secondmin);
    	int rightmin=findsubtree(root.right,firstmin,secondmin);
    	return Math.min(leftmin,rightmin);
    }

    public static int findsecondmin(TreeNode root){
    	if(root==null)
    		return -1;
    	int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
    	Queue<TreeNode> queue=new LinkedList<>();
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		TreeNode tmp=queue.poll();
    		if(fmin>tmp.val){
    			smin=fmin;
    			fmin=tmp.val;
    		}else if(fmin<tmp.val&&tmp.val<smin){
    			smin=tmp.val;
    		}
    		if(tmp.left!=null)
    			queue.offer(tmp.left);
    		if(tmp.right!=null)
    			queue.offer(tmp.right);
    	}
    	return smin==Integer.MAX_VALUE?-1:smin;
    }
}