package org.comparison.simple.e20;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 9;
        int d;
        if (factor > 11) {
            d = a + factor * value;
        } else {
            d = 78 - value;
        }
        return s + d;
    }

}
