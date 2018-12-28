import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Construct_String_from_Binary_Tree{
	public static void main(String[] args) {
		TreeNode t4=new TreeNode(4);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t1=new TreeNode(1);
		t2.left=t4;
		t1.left=t2;
		t1.right=t3;
		//     1
		//   2   3
		// 4
		System.out.println(tree2str(t1));
	}

    public static String tree2str(TreeNode t) {
        if(t==null)
        	return "";
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(t);

        return "test";
    }
}
