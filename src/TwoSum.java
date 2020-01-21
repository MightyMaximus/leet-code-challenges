import java.util.HashMap;

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Two Sum</h3>
 *
 * <h4>Runtime: 2ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-21
 * */
public class TwoSum {
    /**
     * Returns the position of two factors from an array of numbers that when added, equals the target
     * @param nums array of numbers
     * @param target value for sum to equal
     * @return int[] position of pair of factors that when added, equals the target
     * */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int dif;
        for (int i = 0; i < nums.length; i++) {
            dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
