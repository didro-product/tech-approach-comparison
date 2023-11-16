package org.comparison.average.e03;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstArg, String defaultPass, int adaptedSize, int factor) {

        String k = "coef";
        if (firstArg.length() > 5) {
            return k + firstArg;
        }
        if (adaptedSize < 15) {
            int n = adaptedSize * factor;
            if (factor != 1) {
                return  k + n;
            }
            return k + adaptedSize;
        }
        return k + defaultPass;
    }

}
