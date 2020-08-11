/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Math</h2>
 * <h3>Challenge: Count Primes</h3>
 *
 * <h4>Runtime: 5ms - beats 99% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 2.0
 * @since 2020-08-10
 * */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3)
            return 0;

        boolean[] isComposite = new boolean[n];
        int count = n / 2;

        for (int i = 3; (i * i) < n; i += 2) {
            if (isComposite[i])
                continue;

            for (int j = (i * i); j < n; j += (i * 2)) {
                if (!isComposite[j]) {
                    count--;
                    isComposite[j] = true;
                }
            }
        }
        return count;
    }
}
