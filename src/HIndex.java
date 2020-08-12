import java.util.Arrays;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: H-Index</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-11
 * */
public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations); // ascending
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i)
                return n - i;
        }
        return 0;
    }
}
