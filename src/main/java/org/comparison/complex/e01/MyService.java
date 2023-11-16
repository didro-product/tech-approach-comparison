package org.comparison.complex.e01;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int n, boolean b, String value) {

        int a = 5;
        if (value != null) {
            if (n >= 10) {
                a = value.length();
            } else {
                a += n;
            }
        }
        if (b) {
            if (n >= - 21) {
                a = n;
            } else {
                a *= 2;
            }
        }
        return n + value + a;
    }

}
