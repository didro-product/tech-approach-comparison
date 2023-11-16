package org.comparison.average.e16;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 10;
        int d = 26;
        if (factor < 10) {
            b = a * 5 + d;
        } else {
            b = 10;
        }
        String delimiter = "_";
        if (factor > 15) {
            delimiter = "d";
            b = value * factor - a;
        }
        return a + delimiter + b + delimiter + value;
    }

}
