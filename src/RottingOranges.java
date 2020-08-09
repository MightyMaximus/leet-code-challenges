/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Rotting Oranges (2D Arrays)</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-09
 * */
public class RottingOranges {
    int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    int rows, cols, counter = 0;

    public int orangesRotting(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        helper(grid);
        return counter;
    }

    private void helper(int[][] grid) {
        boolean fresh = false, changes = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    fresh = true;
                    for (int[] d : directions) {
                        if (i + d[0] >= 0 && i + d[0] < rows && j + d[1] >= 0 && j + d[1] < cols) {
                            if (grid[i + d[0]][j + d[1]] == 2 + counter) {
                                grid[i][j] = 2 + counter + 1;
                                changes = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!fresh)
            return;
        if (!changes) {
            counter = -1;
            return;
        }
        counter++;
        helper(grid);
    }
}
