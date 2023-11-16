package org.comparison.average.e21;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(boolean b, String value) {

        int a = 45;
        if (b) {
            if (value.contains("abc")) {
                return 34;
            }
        } else {
            a = 100;
        }
        return a + value.length();
    }

}
