package org.comparison.average.e32;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 100;
        if (value == null) {
            return  4 * a;
        } else if (b) {
            if (n <= 22) {
                return a * 8;
            }
        }
        return n - a / value.length();
    }

}
