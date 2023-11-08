package org.comparison.e04;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstArg, String defaultPass, int adaptedSize, int factor) {

        String k = "coef";
        if (firstArg.length() == 8) {
            return k + firstArg;
        }
        if (adaptedSize > 19) {
            int n = adaptedSize  + 10 * factor;
            if (n < 40) {
                return  k + n;
            }
            return k + adaptedSize;
        }
        return k + defaultPass;
    }

}
