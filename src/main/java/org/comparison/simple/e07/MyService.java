package org.comparison.simple.e07;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 10;
        int d;
        if (factor == 5) {
            d = a + factor * value;
        } else {
            d = 10 * value + 2;
        }
        return a - d;
    }

}
