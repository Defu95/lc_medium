 import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Two_Sum_IV_Input_is_a_BST{
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
			System.out.println(findTarget(root,25));
	}

    public static boolean findTarget(TreeNode root, int k) {
        if(root==null)
        	return false;
        HashMap<Integer,Integer> map=new HashMap<>();
    	map.put(root.val,map.getOrDefault(root.val,0)+1);
        putele(root,map);
        Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
        while(it.hasNext()){
        	Map.Entry<Integer,Integer> entry=it.next();
        	int key=entry.getKey();
        	int val=entry.getValue();
        	System.out.println(key+" "+val);
        	if(k-key==key){
        		return val>1;
        	}else{
        		if(map.containsKey(k-key))
        			return true;
        	}
        }
        return false;
    }

    public static void putele(TreeNode root,HashMap<Integer,Integer> map){
    	if(root.left==null&&root.right==null)
    		return;
    	if(root.left!=null){
    		map.put(root.left.val,map.getOrDefault(root.left.val,0)+1);
    		putele(root.left,map);
    	}
    	if(root.right!=null){
    		map.put(root.right.val,map.getOrDefault(root.right.val,0)+1);
    		putele(root.right,map);
    	}
    }
}