package org.comparison.e11;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 10;
        int c = 0;
        int d = 11;
        if (factor > 20) {
            b = a * 5 + d;
        } else {
            b = 10;
            c = d * factor;
        }
        String delimiter = "_";
        if (factor < 25) {
            c = a + value;
        } else {
            delimiter = "d";
            b = value * factor + c;
        }
        return a + delimiter + b + delimiter + c + delimiter + d;
    }

}
