import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Pascal's Triangle</h3>
 *
 * <h4>Runtime: 0ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-12
 * */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows >= 1) {
            triangle.add(new ArrayList<>(1));
            triangle.get(0).add(1);

            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<>(triangle.get(i - 1));
                for (int j = 0; j < i - 1; j++) {
                    row.add(row.get(0) + row.get(1));
                    row.remove(0);
                }
                row.add(1);
                triangle.add(row);
            }
        }
        return triangle;
    }
}
