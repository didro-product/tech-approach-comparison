package org.comparison.average.e20;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 45;
        int c = 10;
        if (factor > 30) {
            b = a * value;
        } else {
            b = 15;
        }
        String delimiter = "?";
        if (value > 70) {
            delimiter = "s";
            b = (value + factor) / 10;
        }
        return b + delimiter + c;
    }

}
