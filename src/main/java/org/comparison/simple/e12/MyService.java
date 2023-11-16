package org.comparison.simple.e12;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 40;
        int d;
        if (factor <= 15) {
            d = a + factor * value;
        } else {
            d = value + 15;
        }
        return s - d;
    }

}
