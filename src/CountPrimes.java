/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Math</h2>
 * <h3>Challenge: Count Primes</h3>
 *
 * <h4>Runtime: 14ms - beats 75% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-10
 * */
public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isComposite = new boolean[n];
        if (n > 2)
            count += findComposites(2, n, isComposite);
        for(int i = 3; i <= (n / 2); i += 2) {
            count += findComposites(i, n, isComposite);
        }

        for(int i = (n / 2) + 1; i < n; i++) {
            if(!isComposite[i])
                count++;
        }
        return count;
    }

    private int findComposites(int i, int n, boolean[] isComposite) {
        if(!isComposite[i]) {
            for(int j = 2; (i * j) < n; j++)
                isComposite[i * j] = true;
            return 1;
        }
        return 0;
    }
}
