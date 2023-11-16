package org.comparison.simple.e06;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 9;
        int d;
        if (factor <= 25) {
            d = a * factor - value;
        } else {
            d = 60 + value * 2;
        }
        return a + s - d;
    }

}
