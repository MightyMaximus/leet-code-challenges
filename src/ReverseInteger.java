/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Strings</h2>
 * <h3>Challenge: Function that Reverses a Integer</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-04
 * */
public class ReverseInteger {
    /**
     * Function that reverses an integer
     * @param x int value to reverse
     * @return int reversed version of input
     * */
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
                return 0;
            x /= 10;
        }
        return (int)reversed;
    }
}
