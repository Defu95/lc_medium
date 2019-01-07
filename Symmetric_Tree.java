import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
 
public class Symmetric_Tree{
	public static void main(String[] args) {
		TreeNode t11=new TreeNode(1);
		TreeNode t21=new TreeNode(2);
		TreeNode t22=new TreeNode(2);
		TreeNode t31=new TreeNode(3);
		TreeNode t32=new TreeNode(4);
		TreeNode t33=new TreeNode(4);
		TreeNode t34=new TreeNode(3);
		t21.left=t31;
		t21.right=t32;
		// t22.left=t33;
		t22.right=t34;
		t11.left=t21;
		t11.right=t22;
		// t11.left=t21;
		System.out.println(isSymmetric(t11));
	}


    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
        	return true;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<String> list=new ArrayList<>();
        list.add(String.valueOf(root.val));
        while(!queue.isEmpty()){
        	int flag=-1;
        	int num=queue.size();
        	if(reverse(list)==false){

        		System.out.println("!");
        		return false;
        	}
        	list.clear();
        	for(int i=0;i<num;i++){
        		TreeNode tmpnode1=queue.poll();
        		if(tmpnode1==null)
        			list.add("*");
        		else{
	        		if(tmpnode1.left!=null){
	        			flag=1;
	        			queue.offer(tmpnode1.left);
	        			list.add(String.valueOf(tmpnode1.left.val));
	        		}else{
	        			queue.offer(null);
	        			list.add("*");
	        		}
	        		if(tmpnode1.right!=null){
	        			flag=1;
	        			queue.offer(tmpnode1.right);
	        			list.add(String.valueOf(tmpnode1.right.val));
	        		}else{
	        			queue.offer(null);
	        			list.add("*");
	        		}
        		}
        	}
        	if(flag==-1)
        		break;
        }
        return true;
    }

    public static boolean reverse(List list){
    	int num=list.size()-1;
    	if(num==1){
    		System.out.println(list.get(1));
    		return list.get(0).equals(list.get(1));
    	}
    	for(int i=0;i<num/2;i++){
    		if(!list.get(i).equals(list.get(num-i))){    		
    			System.out.println("H");
    			return false;
    		}
    	}
    	return true;
    }
}