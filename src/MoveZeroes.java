/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Move Zeroes</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-20
 * */
public class MoveZeroes {
    /**
     * Moves all 0 elements to end of array while maintaining relative order of other elements
     * @param nums array of numbers
     * */
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] != 0) {
                nums[pos++] = nums[i + 1];
                nums[i + 1] = 0;
            } else if (nums[i] != 0) {
                pos++;
            }
        }
    }
}
