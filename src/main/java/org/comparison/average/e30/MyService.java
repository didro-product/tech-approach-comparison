package org.comparison.average.e30;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(boolean b, String value) {

        int a = 37;
        if (b) {
            if (value == null) {
                return a * 5;
            }
        } else {
            a = 80;
        }
        return a - value.length();
    }

}
