package org.comparison.e17;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 4;
        int c = 10;
        int d = 16;
        if (factor > 40) {
            b = a + d;
        } else {
            b = 11;
            c = d + factor;
        }
        String delimiter = "_";
        if (value != 5) {
            c = a + value;
        } else {
            delimiter = "a";
            b = value / factor + c;
        }
        return a + delimiter + b + delimiter + c + delimiter + d;
    }

}
