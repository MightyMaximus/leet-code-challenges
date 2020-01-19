/*import java.util.Arrays;*/

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Single Number</h3>
 *
 * <h4>Runtime: 3ms - beats 50% of Java submissions (Old Solution)</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-18
 * */
public class SingleNumber {
    /**
     * Finds the single number in an array of pairs of numbers
     * @param nums array of pairs of numbers with 1 single
     * @return int value of single number
     * */
    public static int singleNumber(int[] nums) {
        /* Arrays.sort(nums);
        for (int i = 1; i < nums.length; i = i + 2) {
            if (nums[i - 1] != nums[i]) return nums[i - 1];
        }
        return nums[nums.length - 1]; */
        int bin = 0;
        for (int num : nums) {
            bin ^= num;
        }
        return bin;
    }
}
