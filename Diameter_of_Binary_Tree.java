import java.util.*;
public class Diameter_of_Binary_Tree{
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val=x;}
	}

	public static void main(String[] args){
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t2=new TreeNode(2);
		t2.left=t4;
		t2.right=t5;
		TreeNode t3=new TreeNode(3);
		TreeNode t1=new TreeNode(1);
		t1.left=t2;
		t1.right=t3;
      //     1
      //    / \
      //   2   3
      //  / \     
      // 4   5  
		System.out.println(diameterOfBinaryTree(t1));
	}


    public static int diameterOfBinaryTree(TreeNode root) {
    	Map<TreeNode,Integer> map=new HashMap<>();
    	Stack<TreeNode> stack=new Stack<>();
    	int diameter=0;
    	if(root!=null)
    		stack.push(root);
    	while(!stack.isEmpty()){
    		TreeNode tmpnode=stack.peek();
    		if(tmpnode.left!=null && !map.containsKey(tmpnode.left))
    			stack.push(tmpnode.left);
    		else if(tmpnode.right!=null && !map.containsKey(tmpnode.right))
    			stack.push(tmpnode.right);
    		else{
    			stack.pop();
    			int leftdiameter=map.getOrDefault(tmpnode.left,0);
    			int rightdiameter=map.getOrDefault(tmpnode.right,0);
    			map.put(tmpnode,1+Math.max(leftdiameter,rightdiameter));
    			diameter=Math.max(diameter,leftdiameter+rightdiameter);
    		}
    	}
    	return diameter;
    }
}