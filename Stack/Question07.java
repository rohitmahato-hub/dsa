import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Question07 {

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

        List<Integer> postorder = postorderTraversal(root);

        System.out.println(postorder);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if(root == null) {
            return res;
        }

        Stack<TreeNode> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty()) {

            TreeNode curr = st.pop();

            res.add(curr.val);

            if(curr.left != null) {

                st.push(curr.left);
            }

            if(curr.right != null) {

                st.push(curr.right);
            }
        }

        Collections.reverse(res);

        return res;
    }
}