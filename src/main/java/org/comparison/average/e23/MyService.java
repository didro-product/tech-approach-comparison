package org.comparison.average.e23;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(boolean b, String value) {

        int a = 25;
        if (b) {
            if (value.contains("abcd")) {
                return 41;
            }
        } else {
            a = 13;
        }
        return a + value.length();
    }

}
