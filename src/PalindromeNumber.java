/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Palindrome Number</h3>
 *
 * <h4>Runtime: 6ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-08
 * */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int rev = 0, y = x;
        while (y > 0) {
            rev = rev * 10 + y % 10;
            y /= 10;
        }
        return rev == x;
        /* Playing around to see if there was a faster solution (Math.pow slows it down) */
        /*if (x < 10)
            return x >= 0;

        int digits = (int) Math.log10(x);
        int pow = (int) Math.pow(10, digits);
        digits = (digits + 1) / 2;
        for (int i = 0; i < digits; i++) {
            int first = (x / pow) % 10;
            int last = x % 10;
            if (first != last)
                return false;
            x /= 10;
            pow /= 100;
        }
        return true;*/
    }
}
