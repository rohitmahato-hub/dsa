import java.util.ArrayList;
import java.util.List;

public class Question02 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
       Question02.TreeNode root = new Question02.TreeNode(1);
        root.right = new Question02.TreeNode(2);
        root.right.left = new Question02.TreeNode(3);
        System.out.println(Question02.preorderTraversal(root));
    }
    public static List<Integer> preorderTraversal(Question02.TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderHelper(root, ans);
        return ans;
    }

    private static void preorderHelper(Question02.TreeNode root, List<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);
        preorderHelper(root.left, ans);
        preorderHelper(root.right, ans);
    }

    public static List<Integer> postorderTraversal(Question02.TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderHelper(root, ans);
        return ans;
    }

    public static void postorderHelper(Question02.TreeNode root, List<Integer> ans) {
        if (root == null) return; 
        
        postorderHelper(root.left, ans);
        postorderHelper(root.right, ans);
        ans.add(root.val); 
    }
}
