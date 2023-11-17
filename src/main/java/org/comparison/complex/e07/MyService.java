package org.comparison.complex.e07;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 10;
        if (b) {
            if (n > 60) {
                a = 25;
            } else {
                a = 22;
                if (n > 15) {
                    a = 16 * a;
                } else {
                    a = n;
                }
            }
        }
        if (value != null) {
            a -= value.length();
        }
        return a + n;
    }

}
