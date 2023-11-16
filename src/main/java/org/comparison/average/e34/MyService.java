package org.comparison.average.e34;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 20;
        if (value != null) {
            return  5 + value.length() + a;
        } else if (b) {
            if (n < 50) {
                return 10 + a;
            }
        }
        return a / 4 - n;
    }

}
