package org.comparison.average.e40;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 11;
        if (value == null) {
            return  3 * n - 5 * a;
        } else if (b) {
            if (n == 5) {
                return a + n - 15;
            }
        }
        return value.length() * a;
    }

}
