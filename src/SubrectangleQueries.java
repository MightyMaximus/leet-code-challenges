/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Subrectangle Queries</h3>
 *
 * <h4>Runtime: 23ms - beats 98% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-11
 * */
public class SubrectangleQueries {
    private int[][] rectangle, updates;
    private int pos;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
        this.updates = new int[500][5];
        this.pos = 0;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        updates[pos++] = new int[] {row1, col1, row2, col2, newValue};
    }

    public int getValue(int row, int col) {
        for (int i = pos - 1; i >= 0; i--) {
            if (row >= updates[i][0] && row <= updates[i][2])
                if (col >= updates[i][1] && col <= updates[i][3])
                    return updates[i][4];
        }
        return rectangle[row][col];
    }
}
