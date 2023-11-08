package org.comparison.e14;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 10;
        int c = 5;
        int d = 26;
        if (factor == 32) {
            b = a / 5 + d;
        } else {
            b = 10;
            c = d - factor;
        }
        String delimiter = "_";
        if (value > 10) {
            c = a + value;
        } else {
            delimiter = "a";
            b = value * factor + c;
        }
        return a + delimiter + b + delimiter + c + delimiter + d;
    }

}
