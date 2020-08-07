import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Find All Duplicates in an Array</h3>
 *
 * <h4>Runtime: 5ms - beats 97% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-06
 * */
public class FindDuplicatesArray {
    /**
     * Determines if there is a duplicate pair in the array where 1 ≤ a[i] ≤ n (n = size of array)
     * @param nums array of numbers
     * @return List(Integer) list of duplicate numbers.
     * */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n: nums){
            int ele = Math.abs(n);
            if(nums[ele - 1] < 0)
                list.add(Math.abs(ele));
            nums[ele - 1] = -nums[ele - 1];
        }
        return list;
        /*if (nums.length < 2)
            return list;
        int[] check = new int[nums.length + 1];
        for(int n:nums) {
            check[n]++;
            if (check[n] == 2)
                list.add(n);
        }
        return list;*/
        /*Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                list.add(num);
        }
        return list;*/
    }
}
