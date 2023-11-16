package org.comparison.simple.e09;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 4;
        int d;
        if (factor > 30) {
            d = a * factor - value;
        } else {
            d = value * 5;
        }
        return s + d;
    }

}
