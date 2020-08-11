/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Running Sum of 1d Array</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-11
 * */
public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
