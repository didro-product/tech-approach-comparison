package org.comparison.simple.e13;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 5;
        int d;
        if (factor == 19) {
            d = a * factor + value;
        } else {
            d = value + 30;
        }
        return s + d;
    }

}
