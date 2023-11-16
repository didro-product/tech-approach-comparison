package org.comparison.simple.e16;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 30;
        int d;
        if (factor < 30) {
            d = a + factor * value;
        } else {
            d = 30 - value;
        }
        return s + d;
    }

}
