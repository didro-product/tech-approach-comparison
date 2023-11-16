package org.comparison.average.e19;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 24;
        int c = 10;
        if (factor < 19) {
            b = a - value;
        } else {
            b = 15;
        }
        String delimiter = "?";
        if (value == 15) {
            c = a * value;
        } else {
            delimiter = "s";
            b = value + factor -10;
        }
        return b + delimiter + c;
    }

}
