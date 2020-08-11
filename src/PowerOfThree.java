/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Math</h2>
 * <h3>Challenge: Power of Three</h3>
 *
 * <h4>Runtime: 10ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-10
 * */
public class PowerOfThree {
    /**
     * Determines if input is a power of 3.
     * Uses a bit approach for a fast solution (avoid loops) O(1) vs. O(n)
     * @param n int number
     * */
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0; // 3^19 = max integer power of 3
    }
}
