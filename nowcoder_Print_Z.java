import java.util.*;
public class nowcoder_Print_Z {
	static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
		    this.val = val;
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
		t3.right=t5;
		ArrayList<ArrayList<Integer>> res=Print(t1);
		for(ArrayList<Integer> list:res){
			for(int num:list)
				System.out.print(num+" ");
			System.out.println();
		}

	}

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    	if(pRoot==null)
    		return res;
    	Queue<TreeNode> queue=new LinkedList<>();
    	queue.offer(pRoot);
    	int flag=-1;
    	while(!queue.isEmpty()){
    		if(flag==-1){
    			flag=1;
	    		ArrayList<Integer> tmp=new ArrayList<>();
	    		int num=queue.size();	    		
    			for(int i=0;i<num;i++){
    				TreeNode node=queue.poll();
    				tmp.add(node.val);
    				if(node.left!=null)
    					queue.offer(node.left);
    				if(node.right!=null)
    					queue.offer(node.right);
    			}
    			res.add(tmp);
    			System.out.println("size: "+tmp.size());
    		}else{
    			flag=-1;
    			Stack<TreeNode> stack=new Stack<>();
    			ArrayList<Integer> tmp=new ArrayList<>();
    			int num=queue.size();
    			for(int i=0;i<num;i++){
    				TreeNode node=queue.poll();
    				stack.push(node);
    				if(node.left!=null)
    					queue.offer(node.left);
    				if(node.right!=null)
    					queue.offer(node.right);
    			}
    			while(!stack.isEmpty())
    				tmp.add(stack.pop().val);
    			res.add(tmp);
    		}
    	}
    	return res;
    }
}