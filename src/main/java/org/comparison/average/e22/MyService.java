package org.comparison.average.e22;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, String value) {

        int a = 45;
        if (n > a) {
            a = value.length() * 5;
        } else if (value.length() > 7) {
            return 45 * a;
        } else {
            a = n * 11;
        }
        return 25 + a;
    }

}
