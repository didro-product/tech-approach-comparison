package org.comparison.complex.e09;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 2;
        if (b) {
            if (n > 40) {
                a = 17;
            } else {
                a = 12;
                if (n < 21) {
                    a = n * 3;
                } else {
                    a = 2 + a;
                }
            }
        }
        if (value != null) {
            a += value.length();
        }
        return a + n;
    }

}
