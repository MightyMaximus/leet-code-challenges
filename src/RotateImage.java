/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Rotate Image</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-22
 */
public class RotateImage {
    /**
     * Rotates image (NxN 2D matrix) clockwise by 90 degress
     * @param matrix NxN 2D matrix representing image
     */
    public void rotate(int[][] matrix) {
        if (matrix.length > 1) {
            int size = matrix.length - 1;
            for (int x = 0; x < matrix.length / 2; x++)
            {
                for (int y = x; y < size - x; y++)
                {
                    int temp = matrix[x][y];
                    matrix[x][y] = matrix[size - y][x];
                    matrix[size - y][x] = matrix[size - x][size - y];
                    matrix[size - x][size - y] = matrix[y][size - x];
                    matrix[y][size - x] = temp;
                }
            }
        }
    }
}
