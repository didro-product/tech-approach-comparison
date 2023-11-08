package org.comparison.e24;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, String value) {

        int a = 55;
        if (n < a) {
            a = value.length() * 10;
        } else if (value.contains("qtsa")) {
            return 45 + a;
        } else {
            a = n / 12;
        }
        return 14 - a;
    }

}
