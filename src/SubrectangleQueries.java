/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Subrectangle Queries</h3>
 *
 * <h4>Runtime: 25ms - beats 85% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-11
 * */
public class SubrectangleQueries {
    private int[][] rectangle;
    private int rows, cols;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
        this.rows = rectangle.length;
        this.cols = rectangle.length;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
