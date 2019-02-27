import java.util.*;
public class Symmetrical{
	static class TreeNode{
		int val=0;
		TreeNode left=null;
		TreeNode right=null;

		public TreeNode(int val){
			this.val=val;
		}
	}
	public static void main(String[] args) {
		TreeNode t11=new TreeNode(1);
		TreeNode t21=new TreeNode(2);
		TreeNode t22=new TreeNode(2);
		TreeNode t31=new TreeNode(3);
        TreeNode t32=new TreeNode(3);
        TreeNode t41=new TreeNode(4);
        TreeNode t42=new TreeNode(4);
        // TreeNode t51=new TreeNode(5);
        // TreeNode t52=new TreeNode(5);
        // TreeNode t61=new TreeNode(6);
        // TreeNode t62=new TreeNode(6);
        t21.left=t31;
        // t21.right=t41;
        // t22.left=t42;
        t22.right=t32;
        t11.left=t21;
        t11.right=t22;
		System.out.println(isSymmetrical(t11));
	}

    public static boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null)
        	return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        StringBuffer sb=new StringBuffer();
        while(!queue.isEmpty()){
        	int num=queue.size();
        	int flag=-1;
        	for(int i=0;i<num;i++){
        		TreeNode tmp=queue.poll();
        		if(tmp==null){
        			sb.append("*");
        			queue.offer(null);
        		}else{
        			sb.append(tmp.val);                
            		if(tmp.left!=null || tmp.right!=null){
            			flag=1;
            			if(tmp.left!=null)
            				queue.offer(tmp.left);
            			else
            				queue.offer(null);
            			if(tmp.right!=null)
            				queue.offer(tmp.right);
            			else
            				queue.offer(null);
                    }
                }
        	}
        	String s1=sb.toString();
        	String s2=sb.reverse().toString();
        	System.out.println(s1+" "+s2);
        	if(!s1.equals(s2))
        		return false;
        	if(flag==-1)
        		break;
            sb.setLength(0);   // clean StringBuffer
        }
    	return true;
    }
}