import java.util.*;
public class PrintTree{
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
		ArrayList<ArrayList<Integer>> res=Print(t1);
		for(ArrayList<Integer> al : res){
			for(int num : al)
				System.out.print(num+" ");
			System.out.println();
		}
	}

	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		if(pRoot==null)
			return res;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(pRoot);
		while(!queue.isEmpty()){
			int num=queue.size();
			ArrayList<Integer> tmp=new ArrayList<>();
			for(int i=0;i<num;i++){
				TreeNode tn=queue.poll();
				tmp.add(tn.val);
				if(tn.left!=null)
					queue.offer(tn.left);
				if(tn.right!=null)
					queue.offer(tn.right);
			}
			res.add(tmp);
		}
		return res;
	}
}