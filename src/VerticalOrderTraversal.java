import java.util.*;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Add and Search Word (Data Structure Design)</h3>
 *
 * <h4>Runtime: 5ms - beats 40% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-07
 * */
public class VerticalOrderTraversal {

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        TreeTable table = new TreeTable();
        preOrder(root, 0, 0, table);
        List<List<Integer>> result = new ArrayList<>();

        for (int key : table.getKeys()) {
            List<Integer> row = new ArrayList<>();
            for (Point p : table.getVal(key)) {
                row.add(p.val);
            }
            result.add(row);
        }
        return result;
    }

    private static void preOrder(TreeNode node, int x, int y, TreeTable table) {
        if (node == null)
            return;
        preOrder(node.left,x - 1, y -1, table);
        preOrder(node.right,x + 1, y - 1, table);
        table.addKey(x);
        table.addVal(new Point(x, y, node.val));
    }
}

class Point {
    int x;
    int y;
    int val;

    public Point(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
}

class TreeTable {
    private TreeMap<Integer, List<Point>> table;

    public TreeTable() {
        table = new TreeMap<>();
    }

    public void addKey(int x) {
        if (!table.containsKey(x)) {
            table.put(x, new ArrayList<>());
        }
    }

    public void addVal(Point point) {
        List<Point> row = table.get(point.x);
        row.add(point);
        row.sort((p1, p2) -> p1.y == p2.y ? p1.val - p2.val : p2.y - p1.y);
        table.put(point.x, row);
    }

    public Set<Integer> getKeys() {
        return table.keySet();
    }

    public List<Point> getVal(int x) {
        return table.get(x);
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
