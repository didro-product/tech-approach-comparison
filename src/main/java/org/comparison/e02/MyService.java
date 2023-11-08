package org.comparison.e02;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstArg, String defaultPass, int adaptedSize, int factor) {

        String k = "coef";
        if (adaptedSize == 10) {
            return k + firstArg;
        }
        if (adaptedSize > 19) {
            int n = adaptedSize * factor;
            if (factor > 4) {
                return  k + n;
            }
            return k + adaptedSize;
        }
        return k + defaultPass;
    }

}
