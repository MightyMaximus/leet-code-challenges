/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Path Sum III</h3>
 *
 * <h4>Runtime: 22ms - beats 32% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-08
 * */
public class PathSum3 {
    int paths = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        getPaths (root, sum);
        pathSum (root.left, sum); // set new root & repeat
        pathSum (root.right, sum);
        return paths;
    }

    private void getPaths (TreeNode root, int sum) {
        if (root != null) {
            if (root.val == sum)
                paths++;
            sum -= root.val;
            getPaths(root.left, sum);
            getPaths(root.right, sum);
        }
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
