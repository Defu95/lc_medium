import java.util.*;
public class Sum_of_Left_Leaves{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        TreeNode t3=new TreeNode(3);
        TreeNode t9=new TreeNode(9);
        TreeNode t20=new TreeNode(20);
        TreeNode t15=new TreeNode(15);
        TreeNode t7=new TreeNode(7);
        t20.left=t15;
        t20.right=t7;
        t3.left=t9;
        t3.right=t20;
        //		3
        //  9		20
        //		15		7
        System.out.println(sumOfLeftLeaves(t3));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        int sum=sll(root,"root",0);
        return sum;
    }

    public static int sll(TreeNode root,String node,int sum){
        if(root==null)
            return sum;
        if(root.left==null&&root.right==null){
            if(node.equals("left")){
                System.out.println(root.val);
                sum+=root.val;
            }
            return sum;
        }else{
            if(root.left!=null)
                sum=sll(root.left,"left",sum);
            if(root.right!=null)
                sum=sll(root.right,"right",sum);
        }
        return sum;
    }
}