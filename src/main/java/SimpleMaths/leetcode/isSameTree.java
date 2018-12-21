package SimpleMaths.leetcode;


/**
 * leetcode 100. Same Tree
 * @author user
 *
 */
public class isSameTree {

	public static void main(String[] args) {

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static boolean isSameTree(TreeNode l1, TreeNode l2) {

		if (l1 == null && l2 == null)
			return true;
		if (l1 == null && l2 != null || l1 != null && l2 == null)
			return false;

		if (l1.val != l2.val)
			return false;
		// 呼叫自己在判斷一次
		boolean again = isSameTree(l1.left, l2.left);

		if (!again)
			return again;

		again = isSameTree(l1.right, l2.right);

		if (!again)
			return again;

		return true;
	}

}
