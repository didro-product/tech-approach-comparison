package org.comparison.complex.e10;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 50;
        if (b) {
            if (n < 20) {
                a = 85;
            } else {
                a = 12;
                if (n > 61) {
                    a += n;
                } else {
                    a = 5 * a;
                }
            }
        }
        if (value != null) {
            a -= value.length();
        }
        return n + a;
    }

}
