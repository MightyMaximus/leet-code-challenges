import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Valid Sudoku</h3>
 *
 * <h4>Runtime: 19ms - beats 20% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-21
 */
public class ValidSudoku {
    /**
     * Determines whether a sudoku board is valid
     *
     * @param board 2D NxN matrix sudoku board
     * @return boolean true if sudoku board is valid
     */
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();
        char value;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                value = board[i][j];
                if (value != '.') {
                    if (!(set.add("Row: " + i + " Value: " + value) &&
                            set.add("Column: " + j + " Value: " + value) &&
                            set.add("Block: " + i/3 + "-" + j/3 + " Value: " + value)))
                        return false;
                }
            }
        }
        return true;
    }
}
