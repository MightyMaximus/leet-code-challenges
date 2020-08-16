import java.util.Arrays;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Non-overlapping Intervals</h3>
 *
 * <h4>Runtime: 3ms - beats 70% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-15
 * */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 0 )
            return 0;

        Arrays.sort(intervals, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int count = 0, min = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (min > interval[0])
                count++;
            else
                min = interval[1];
        }
        return count;
    }
}
