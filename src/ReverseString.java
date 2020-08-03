/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Strings</h2>
 * <h3>Challenge: Function that Reverses a String</h3>
 *
 * <h4>Runtime: 1ms - beats 70% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-03
 * */
public class ReverseString {
    /**
     * Removes duplicate values from an array and returns the length of new array.
     * @param s sorted array of numbers
     * */
    public static void reverseString(char[] s) {
        int l = s.length;
        if (l > 1) {
            for (int i = 0; i < l / 2; i++) {
                char temp = s[i];
                s[i] = s[l - i - 1];
                s[l - i - 1] = temp;
            }
        }
    }
}
