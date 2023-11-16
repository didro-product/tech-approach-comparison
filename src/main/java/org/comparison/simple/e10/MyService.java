package org.comparison.simple.e10;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 39;
        int d;
        if (factor < 10) {
            d = a + factor * value;
        } else {
            d = value * 10;
        }
        return s - d;
    }

}
