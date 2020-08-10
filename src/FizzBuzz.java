import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Math</h2>
 * <h3>Challenge: Fizz Buzz</h3>
 *
 * <h4>Runtime: 1ms - beats 100% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-10
 * */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0)
                    list.add("FizzBuzz");
                else
                    list.add("Fizz");
            } else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }
        return list;
    }
}
