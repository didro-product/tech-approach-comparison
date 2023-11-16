package org.comparison.average.e27;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, String value) {

        int a = 20;
        if (n != 54) {
            a = 6 * value.length();
        } else if (value.length() < 16) {
            return 4 * a;
        } else {
            a = n + 23;
        }
        return 3 * a + n;
    }

}
