package org.comparison.average.e36;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 5;
        if (value == null) {
            return  n - a;
        } else if (b) {
            if (n == 4) {
                return 6 - a * n;
            }
        }
        return a - value.length() + 5 * n;
    }

}
