import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Path Sum II</h3>
 *
 * <h4>Runtime: 1ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-08
 * */
public class PathSum2 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        getPaths(root, sum, new ArrayList<>());
        return list;
    }

    private void getPaths(TreeNode root, int sum, List<Integer> track) {
        if (root == null)
            return;

        track.add(root.val);
        if (root.left == null && root.right == null) { // leaf
            if (root.val == sum)
                list.add(new ArrayList<>(track));
            track.remove(track.size() - 1);
            return;
        }

        if (root.left != null)
            getPaths(root.left, sum - root.val, track);
        if (root.right != null)
            getPaths(root.right, sum - root.val, track);

        track.remove(track.size() - 1);
    }
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