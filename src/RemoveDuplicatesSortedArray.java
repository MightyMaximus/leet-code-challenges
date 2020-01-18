/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Remove Duplicates from Sorted Array</h3>
 *
 * <h4>Runtime: 0ms - beats 100% Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-16
 * */
public class RemoveDuplicatesSortedArray {
    /**
     * Removes duplicate values from an array and returns the length of new array.
     * @param nums sorted array of numbers
     * @return int length of new array (total number of unique elements)
     * */
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1)
            return length;

        int check = nums[0];
        int counter = 1;

        for (int i = 1; i < length; i++) {
          if (nums[i] != check) {
              check = nums[i];
              nums[counter] = check;
              counter++;
          }
          if (nums[i] == nums[length - 1]) { // if at last number
              break;
          }
        }
        return counter;
    }
}
