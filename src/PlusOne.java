/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Plus One</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-20
 * */
public class PlusOne {
    /**
     * Adds one to array of digits representing a number
     * @param digits array of digits representing a number
     * @return int[] updated array of digits after adding one
     * */
    public int[] plusOne(int[] digits) {
        boolean flag;
        int i = 0;
        do {
            flag = false;
            digits[digits.length - 1 - i]++;
            if (digits[digits.length - 1 - i] == 10) {
                digits[digits.length - 1 - i] %= 10;
                flag = true;
            }
            if (digits.length - 1 - i == 0 && digits[0] == 0) {
                int[] update = new int[digits.length + 1];
                update[0] = 1;
                return update;
        }
            i++;
        } while (flag);
        return digits;
    }
}
