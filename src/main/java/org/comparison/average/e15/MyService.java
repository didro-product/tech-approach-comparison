package org.comparison.average.e15;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int value, int factor, int b) {

        int a = 20;
        int c = 4;
        int d = 2;
        if (factor != 12) {
            b = a / 5 + d;
        } else {
            b = 10;
            c = d - factor;
        }
        String delimiter = "_";
        if (value <= 10) {
            c = a + value;
        } else {
            delimiter = "a";
            b = value + factor + c;
        }
        return a + delimiter + b + delimiter + c + delimiter + d;
    }

}
