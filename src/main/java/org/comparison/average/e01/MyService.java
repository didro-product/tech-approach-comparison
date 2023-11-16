package org.comparison.average.e01;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(int firstArg, String defaultPass, int adaptedSize, int factor) {

        String k = "45";
        if (firstArg == 113) {
            return k + defaultPass;
        }
        if (adaptedSize > 14) {
            int n = adaptedSize * factor / 30;
            if (n > firstArg) {
                return  k + firstArg;
            }
            return firstArg + "_" + defaultPass;
        }
        return defaultPass + k;
    }

}
