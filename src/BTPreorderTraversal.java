import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Binary Tree Preorder Traversal (Iterative)</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-08
 * */
public class BTPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        /*preOrder(root, list);*/
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.peek();
                list.add(node.val);
                stack.pop();

                if (node.right != null)
                    stack.push(node.right);
                if (node.left != null)
                    stack.push(node.left);
            }
        }
        return list;
    }

    /*public void preOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }*/
}

/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/