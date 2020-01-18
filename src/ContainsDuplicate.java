import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Contains Duplicate</h3>
 *
 * <h4>Runtime: 9ms - beats 60% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-18
 * */
public class ContainsDuplicate {
    /**
     * Determines if there is a duplicate pair in the array
     * @param nums array of numbers
     * @return boolean true if array contains a duplicate; false otherwise
     * */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
