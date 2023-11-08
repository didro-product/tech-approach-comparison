package org.comparison.e05;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int firstArg, String defaultPass, int adaptedSize, int factor) {

        String k = "coef";
        if (firstArg > 25) {
            return k + firstArg;
        }
        if (defaultPass.length() > 8) {
            int n = adaptedSize  + 10 * factor;
            if (n < 40) {
                return  k + n;
            }
            return k + "-" + adaptedSize;
        }
        return k + defaultPass;
    }

}
