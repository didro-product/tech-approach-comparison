package org.comparison.simple.e04;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 2;
        int d;
        if (factor == 13) {
            d = a * factor - value;
        } else {
            d = 100 + value;
        }
        return s + a + d;
    }

}
