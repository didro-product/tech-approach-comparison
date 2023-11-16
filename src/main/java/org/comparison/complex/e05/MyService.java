package org.comparison.complex.e05;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int n, boolean b, String value) {

        int a = 20;
        if (value != null) {
            if (n < 10) {
                a = value.length();
            } else {
                a = 5;
            }
        }
        if (b) {
            if (n > 25) {
                a = n;
            } else {
                a *= 4;
            }
        }
        return a + value + n;
    }

}
