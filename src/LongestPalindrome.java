/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Longest Palindrome</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-14
 * */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int length = 0;
        for(char c: s.toCharArray()){
            if(++freq[c] == 2){
                length += 2;
                freq[c] = 0;
            }
        }
        return (length == s.length())? length: length + 1;
    }
}
