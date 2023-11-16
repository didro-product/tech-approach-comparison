package org.comparison.simple.e05;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 30;
        int d;
        if (factor > 11) {
            d = a + factor * value;
        } else {
            d = 40 - value * 5;
        }
        return a - s + d;
    }

}
