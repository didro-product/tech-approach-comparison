package org.comparison.average.e31;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 37;
        if (value == null) {
            return  a * 5;
        } else if (b) {
            if (n > 3) {
                return a * 5;
            }
        }
        return a * value.length() + n;
    }

}
