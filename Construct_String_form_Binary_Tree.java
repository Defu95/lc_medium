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
          //      1
          //    /   \
          //   2     3
          //  /    
          // 4     
		System.out.println(tree2str(t1));
	}

    public static String tree2str(TreeNode t) {
        if(t==null)
            return "";
        StringBuffer sb=new StringBuffer();
        t2s(t,sb);
        return sb.toString();
    }

    public static void t2s(TreeNode t,StringBuffer sb){
        sb.append(t.val);
        if(t.left==null&&t.right==null)
            return;
        if(t.left!=null){
            sb.append("(");
            t2s(t.left,sb);
            sb.append(")");
        }
        if(t.right!=null){
            if(t.left==null)
                sb.append("()");
            sb.append("(");
            t2s(t.right,sb); 
            sb.append(")");
        }
    }
}