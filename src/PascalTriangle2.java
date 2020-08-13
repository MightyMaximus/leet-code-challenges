import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: August LeetCoding Challenge</h1>
 * <h3>Challenge: Pascal's Triangle II</h3>
 *
 * <h4>Runtime: 1ms - beats 90% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-12
 * */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j < i - 1; j++) {
                triangle.add(triangle.get(0) + triangle.get(1));
                triangle.remove(0);
            }
            triangle.add(1);
        }
        return triangle;
    }
}
