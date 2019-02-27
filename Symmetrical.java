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
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t4.right=t5;
		System.out.println(isSymmetrical(t1));
	}

    public static boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null)
        	return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
        	int num=queue.size();
        	int flag=-1;
        	StringBuffer sb=new StringBuffer();
        	for(int i=0;i<num;i++){
        		TreeNode tmp=queue.poll();
        		if(tmp==null){
        			sb.append("*");
        			queue.offer(null);
        		}else
        			sb.append(tmp.val);
        		if(tmp.left!=null&&tmp.right!=null)
        			flag=1;
        		else{
        			flag=-1;
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
        	String s1=sb.toString();
        	String s2=sb.reverse().toString();
        	System.out.println(s1+" "+s2);
        	if(!s1.equals(s2))
        		return false;
        	if(flag==1)
        		break;
        }
        if(!queue.isEmpty()){
        	StringBuffer sb=new StringBuffer();
        	for(int i=0;i<queue.size();i++){
        		TreeNode tmp=queue.poll();
        		if(tmp==null)
        			sb.append("*");
        		else
        			sb.append(tmp.val);
	        }
        	String s1=sb.toString();
        	String s2=sb.reverse().toString();
        	if(!s1.equals(s2))
        		return false;
    	}
    	return true;
    }
}