import java.util.*;
public class PrintfromTop2Bottom {
	static class TreeNode{
		int val=0;
		TreeNode left=null;
		TreeNode right=null;

		public TreeNode(int val){
			this.val=val;
		}
	}
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t4.right=t5;
		ArrayList<Integer> res=PrintFromTopToBottom(t1);
		for(int i:res)
			System.out.print(i+" ");
	}
    
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)
        	return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	int num=queue.size();
        	for(int i=0;i<num;i++){
        		TreeNode tmp=queue.poll();
        		res.add(tmp.val);
        		if(tmp.left!=null)
        			queue.offer(tmp.left);
        		if(tmp.right!=null)
        			queue.offer(tmp.right);
        	}
        }
        return res;
    }
}