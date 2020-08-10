/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Excel Sheet Column Number</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-10
 * */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int counter = 0, length = s.length();
        for (int i = 0; i < length; i++) {
            // % 64 because 'A' = 65 and titles are indexed @ 1. Could have done - 'A' + 1
            counter += (s.charAt(length - 1 - i) % 64) * Math.pow(26, i);
        }
        return counter;
    }
}
