import java.util.Arrays;
/*import java.util.HashMap;
import java.util.Stack;*/

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Intersection of Two Arrays II</h3>
 *
 * <h4>Runtime: 2ms - beats 90% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-19
 * */
public class IntersectionOfTwoArrays {
    /**
     * Finds and returns the intersection of 2 arrays
     * @param nums1 first array of numbers
     * @param nums2 second array of numbers
     * @return int[] elements making up the intersection
     * */
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                nums1[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
        /*if (nums1.length == 0) {
            return nums1;
        } else if (nums2.length == 0) {
            return nums2;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> result = new Stack<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) > 0) {
                    result.push(num);
                    map.put(num, map.get(num) - 1);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();*/
    }
}
