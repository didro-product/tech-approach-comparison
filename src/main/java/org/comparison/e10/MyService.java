package org.comparison.e10;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstString, String defaultPass, int adaptedSize, int factor) {

        String k = "num";
        if (firstString.length() != 7) {
            return defaultPass;
        }
        if (adaptedSize > 15) {
            int n = adaptedSize + factor * 8;
            if (n < 26) {
                return  firstString;
            }
            return n + "_";
        }
        return k;
    }

}
