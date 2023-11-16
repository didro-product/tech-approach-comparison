package org.comparison.complex.e02;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int n, boolean b, String value) {

        int a = 10;
        if (value != null) {
            if (n > 25) {
                a += value.length();
            } else {
                a = 20;
            }
        }
        if (b) {
            if (n < 10) {
                a = a * 3;
            } else {
                a = n;
            }
        }
        return a + value + n;
    }

}
