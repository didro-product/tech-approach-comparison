package org.comparison.average.e28;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, String value) {

        int a = 11;
        if (n > 15) {
            a = value.length() * 3 + 8;
        } else if (value == null ) {
            return  a * 2;
        } else {
            a =  44 - n;
        }
        return 3 * a + n;
    }

}
