package org.comparison.average.e39;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 5;
        if (value != null) {
            return  25 * value.length() - a;
        } else if (b) {
            if (n >= - 21) {
                return a * 4 + n;
            }
        }
        return -n * a;
    }

}
