package org.comparison.simple.e15;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 5;
        int d;
        if (factor > 7) {
            d = a * factor + value;
        } else {
            d = value * 2 + a;
        }
        return s * d;
    }

}
