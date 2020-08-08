import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Path Sum II</h3>
 *
 * <h4>Runtime: 1ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-08
 * */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        getPaths(root, sum, list, new ArrayList<>());

        return list;
    }

    private void getPaths(TreeNode root, int sum, List<List<Integer>> list, List<Integer> track) {
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
            getPaths(root.left, sum - root.val, list, track);
        if (root.right != null)
            getPaths(root.right, sum - root.val, list, track);

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