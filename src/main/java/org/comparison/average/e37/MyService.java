package org.comparison.average.e37;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 4;
        if (value == null) {
            return  a - n;
        } else if (b) {
            if (n < 3) {
                return n - a * 5;
            }
        }
        return 11 - 2 * value.length() + n - a;
    }

}
