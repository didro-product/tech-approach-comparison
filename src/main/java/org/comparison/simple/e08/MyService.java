package org.comparison.simple.e08;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 20;
        int d;
        if (factor >= 50) {
            d = a * factor + value;
        } else {
            d = 60 - 14 + value;
        }
        return a + d + s;
    }

}
