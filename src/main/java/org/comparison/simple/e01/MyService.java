package org.comparison.simple.e01;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 10;
        int d;
        if (factor < 15) {
            d = a * factor + value;
        } else {
            d = 26 + 10 * value;
        }
        return a + s + d;
    }

}
