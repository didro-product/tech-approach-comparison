package org.comparison.simple.e02;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, String s) {

        int a = 3;
        int d;
        if (s.length() < 5) {
            d = a + factor * value;
        } else {
            d = 16 - a * value;
        }
        return s + a + d;
    }

}
