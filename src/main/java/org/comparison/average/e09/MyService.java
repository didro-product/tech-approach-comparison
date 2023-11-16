package org.comparison.average.e09;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstString, String defaultPass, int adaptedSize, int factor) {

        String k = "num";
        if (firstString.length() == 5) {
            return defaultPass;
        }
        if (adaptedSize < 25) {
            int n = adaptedSize + factor / 10;
            if (n > 16) {
                return  firstString;
            }
            return n + "_";
        }
        return k;
    }

}
