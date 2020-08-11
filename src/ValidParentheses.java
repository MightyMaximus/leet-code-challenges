import java.util.Stack;

/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Valid Parentheses</h3>
 *
 * <h4>Runtime: 1ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-11
 * */
public class ValidParentheses {
    public boolean isValid(String s) {
        // (): 40,41 []: 91,93 {}: 123,125
        int length = s.length();
        if (length % 2 != 0)
            return false;
        Stack<Character> open = new Stack<>();
        for (int i = 0; i < length; i++) {
            char bracket = s.charAt(i);
            if (!open.empty()) {
                if (bracket == open.peek() + 1 || bracket == open.peek() + 2) {
                    open.pop();
                    continue;
                } else if (bracket == ')' || bracket == ']' || bracket == '}')
                    return false;
            }
            open.push(bracket);
        }
        return open.empty();
    }
}
