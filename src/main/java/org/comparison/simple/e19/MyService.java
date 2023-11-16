package org.comparison.simple.e19;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 10;
        int d;
        if (factor == 5) {
            d = a * factor + value;
        } else {
            d = 20 + value;
        }
        return s + d;
    }

}
