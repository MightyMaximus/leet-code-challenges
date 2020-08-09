/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Palindrome Number</h3>
 *
 * <h4>Runtime: 6ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
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

        int i = 0;
        int pow = 1;
        int place = (int) Math.floor(Math.log10(x));
        while (i < place) {
            int first = (x / (int) Math.pow(10, place)) % 10;;
            int last = (x % (pow * 10)) / pow;
            if (first != last)
                return false;
            pow *= 10;
            place--;
            i++;
        }
        return true;*/
    }
}
