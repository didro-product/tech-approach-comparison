package org.comparison.complex.e04;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int n, boolean b, String value) {

        int a = 5;
        if (b) {
            if (n != 11) {
                a += n;
            } else {
                a = a - 4;
            }
        }
        if (value != null) {
            if (n > 20) {
                a *= 4;
            } else {
                a = value.length();
            }
        }
        return n + value + a;
    }

}
