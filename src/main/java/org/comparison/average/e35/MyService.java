package org.comparison.average.e35;

/**
 * @author Zabik
 */
public class MyService {

    public int determineValue(int n, boolean b, String value) {

        int a = 20;
        if (value == null) {
            return  n * a;
        } else if (b) {
            if (n > 20) {
                return 10 + a;
            }
        }
        return 2 * a  + value.length() - n;
    }

}
