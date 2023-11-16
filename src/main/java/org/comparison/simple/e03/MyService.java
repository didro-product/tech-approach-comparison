package org.comparison.simple.e03;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 5;
        int d;
        if (factor > 6) {
            d = a - factor * value;
        } else {
            d = 23 - 6 * value;
        }
        return a + s + d;
    }

}
