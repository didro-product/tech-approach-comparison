package org.comparison.simple.e17;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 31;
        int d;
        if (factor > 6) {
            d = a - factor * value;
        } else {
            d = 50 + value;
        }
        return s + d;
    }

}
