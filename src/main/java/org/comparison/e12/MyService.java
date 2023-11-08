package org.comparison.e12;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 10;
        int c = 5;
        int d = 26;
        if (factor < 10) {
            b = a * 5 + d;
        } else {
            b = 10;
            c = d * factor;
        }
        String delimiter = "_";
        if (factor > 15) {
            c = a + value;
        } else {
            delimiter = "d";
            b = value * factor - c;
        }
        return a + delimiter + b + delimiter + c + delimiter + d;
    }

}
