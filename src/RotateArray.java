/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Rotate Array</h3>
 *
 * <h4>Runtime: 0ms - beats 100% Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-18
 * */
public class RotateArray {
    /**
     * Rotate (shift) array by k units
     * @param nums array of numbers to be shifted
     * @param k number of units to shift by
     * */
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * Reverses an array from a start to end point
     * @param nums array of numbers to reverse
     * @param start start position
     * @param end end position
     * */
    private static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
