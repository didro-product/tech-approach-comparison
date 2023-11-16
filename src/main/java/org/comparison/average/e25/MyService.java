package org.comparison.average.e25;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, String value) {

        int a = 14;
        if (n == a) {
            a = (value + 5).length();
        } else if (value.length() < 6) {
            return 45 * a;
        } else {
            a = n + 23;
        }
        return 25 - a;
    }

}
