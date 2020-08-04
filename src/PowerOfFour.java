/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Power of Four</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-04
 * */
public class PowerOfFour {
    /**
     * Determines if input is a power of 4.
     * Uses a bit approach for a fast solution (avoid loops) O(1) vs. O(n)
     * @param num int number
     * */
    public boolean isPowerOfFour(int num) {
        return num > 0 && ((num & (num - 1)) == 0) && ((num & 0xAAAAAAAA) == 0);
    }
}
