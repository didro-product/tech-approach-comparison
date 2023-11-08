package org.comparison.e18;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 5;
        int c = 18;
        if (factor > 30) {
            b = a - value;
        } else {
            b = 15;
        }
        String delimiter = "?";
        if (value > 5) {
            c = a + value;
        } else {
            delimiter = "s";
            b = value * factor + 4;
        }
        return b + delimiter + c;
    }

}
