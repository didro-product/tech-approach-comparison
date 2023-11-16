package org.comparison.average.e33;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 10;
        if (value != null) {
            return  value.length() * a - 5;
        } else if (b) {
            if (n > 80) {
                return a * 2;
            }
        }
        return n - 4 * a;
    }

}
