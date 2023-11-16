package org.comparison.average.e38;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 20;
        if (value != null) {
            return  7 * value.length();
        } else if (b) {
            if (n > - 1) {
                return a + 3 * n;
            }
        }
        return n + 11 - 2 * a;
    }

}
