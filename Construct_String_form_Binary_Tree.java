public class Construct_String_form_Binary_Tree {
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		t2.left=t4;
		t1.left=t2;
		t1.right=t3;
		System.out.println(tree2str(t1));
	}

    public static String tree2str(TreeNode t) {
        if(t==null)
        	return "";
        int flag=-1;
        String tmp="";
        if(t.left!=null){
        	flag=1;
        	tmp= "%s(%s)"%(String.valueOf(t.val),String.valueOf(t.left.val));
        }
        if(t.right!=null){
        	if(flag==1)
        		tmp+="(%s)"%(String.valueOf(t.right.val));
        	else
        		tmp="%s(%s)"%(String.valueOf(t.val),String.valueOf(t.right.val));
        }
        return tmp;
        String
    }
}