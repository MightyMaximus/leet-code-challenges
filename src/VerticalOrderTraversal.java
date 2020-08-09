import java.util.*;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Vertical Order Traversal of a Binary Tree</h3>
 *
 * <h4>Runtime: 2ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-09
 * */
public class VerticalOrderTraversal {
    private HashMap<Integer, List<List<Integer>>> table;
    private int max = 0, min = 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            table = new HashMap<>();
            postOrder(root, 0, 0);

            for (int i = min; i <= max; i++) {
                List<Integer> row = new ArrayList<>();
                for (List<Integer> l : table.get(i)) {
                    row.addAll(l);
                }
                list.add(row);
            }
        }
        return list;
    }

    private void postOrder(TreeNode node, int x, int y) {
        if (node == null)
            return;
        postOrder(node.left,x - 1, y + 1);
        postOrder(node.right,x + 1, y + 1);
        addPoint(x, y, node.val);
    }

    public void addPoint(int x, int y, int val) {
        if (!table.containsKey(x)) {
            max = Math.max(max, x);
            min = Math.min(min, x);
            table.put(x, new ArrayList<>());
        }
        List<List<Integer>> col = table.get(x); // list of all Ys
        int size = col.size();
        if (y >= size) {
            for (int i = size; i <= y; i++)
                col.add(new ArrayList<>()); // add row per Y
            col.get(y).add(val);
        } else {
            col.get(y).add(val);
            Collections.sort(col.get(y));
        }
    }
}

/** Definition for a binary tree node. */
class TreeNode {
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
}
