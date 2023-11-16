package org.comparison.simple.e11;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int value, int factor, int s) {

        int a = 12;
        int d;
        if (factor == 22) {
            d = a + factor * value;
        } else {
            d = value + 10;
        }
        return s - d;
    }

}
