package org.comparison.average.e26;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(boolean b, String value) {

        int a = 15;
        if (b) {
            if (value.length() < a) {
                return 20;
            }
        } else {
            a = 30;
        }
        return a * value.length();
    }

}
