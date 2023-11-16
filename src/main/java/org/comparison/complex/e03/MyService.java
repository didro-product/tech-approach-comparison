package org.comparison.complex.e03;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int n, boolean b, String value) {

        int a = 1;
        if (b) {
            if (n == 20) {
                a = a * 3;
            } else {
                a = n;
            }
        }
        if (value != null) {
            if (n < 15) {
                a = value.length();
            } else {
                a -= 7;
            }
        }
        return n + value + a;
    }

}
