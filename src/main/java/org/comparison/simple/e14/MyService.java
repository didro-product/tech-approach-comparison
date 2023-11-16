package org.comparison.simple.e14;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 55;
        int d;
        if (factor < 5) {
            d = a - factor * value;
        } else {
            d = 25 + value;
        }
        return s + d;
    }

}
