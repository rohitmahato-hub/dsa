import java.util.ArrayList;
import java.util.List;

public class Question03 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(new Question03().postorderTraversal(root));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderHelper(root, ans);
        return ans;
    }

    public void postorderHelper(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        postorderHelper(root.left, ans);
        postorderHelper(root.right, ans);
        ans.add(root.val);
    }
}
