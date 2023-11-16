package org.comparison.average.e29;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n) {

        int a = 11;
        if (n < 10) {
            a = n;
        } else if (n > 50) {
            return 103;
        } else {
            n = 2;
        }
        return 11 * a;
    }

}
