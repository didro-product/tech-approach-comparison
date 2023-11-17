package org.comparison.complex.e06;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 20;
        if (b) {
            if (n < 10) {
                a = 15;
            } else {
                a = 2;
                if (n < 25) {
                    a = n;
                } else {
                    a *= 6;
                }
            }
        }
        if (value != null) {
            a += value.length();
        }
        return a * 10;
    }

}
