/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Valid Palindrome</h3>
 *
 * <h4>Runtime: 26ms - beats 20% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-03
 * */
public class ValidPalindrome {
    /**
     * Determines whether a string is a palindrome (not case sensitive and only considers alphanumeric characters)
     * @param s string potential palindrome
     * */
    public boolean isPalindrome(String s) {
        if (s.length() > 1 ) {
            s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        if (s.length() == 0) return true;

        int i = 0;
        int j = s.length()-1;

        while (i < j) {
            char first = s.charAt(i);
            char second = s.charAt(j);

            int aDifference = first - 'a';
            int ADifference = first - 'A';
            int digitDifference = first - '0';

            int aDifference1 = second - 'a';
            int ADifference1 = second - 'A';
            int digitDifference1 = second - '0';

            if ((aDifference < 0 || aDifference >= 26) && (ADifference < 0 || ADifference >=26) && (digitDifference <0 || digitDifference >9)) {
                i++;
                continue;
            }

            if ((aDifference1 < 0 || aDifference1 >= 26) && (ADifference1 < 0 || ADifference1 >=26) && (digitDifference1 <0 || digitDifference1 >9)) {
                j--;
                continue;
            }

            if (aDifference >= 0 && aDifference < 26) {
                if (aDifference != aDifference1 && aDifference != ADifference1) return false;
            } else if (ADifference >= 0 && ADifference < 26) {
                if (ADifference != aDifference1 && ADifference != ADifference1) return false;
            } else {
                if (digitDifference != digitDifference1) return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
