package org.comparison.simple.e18;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 50;
        int d;
        if (factor < 4) {
            d = a + factor * value;
        } else {
            d = 22 - value;
        }
        return s + d;
    }

}
