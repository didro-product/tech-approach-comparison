package org.comparison.complex.e08;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 40;
        if (b) {
            if (n < 10) {
                a = 35;
            } else {
                a = 50;
                if (n > 75) {
                    a = n;
                } else {
                    a = 2 * a;
                }
            }
        }
        if (value != null) {
            a = a * value.length();
        }
        return n + a;
    }

}
