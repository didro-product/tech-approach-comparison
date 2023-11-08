package org.comparison.e06;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstString, String defaultPass, int adaptedSize, int factor) {

        String k = "num";
        if (firstString.equals("fail")) {
            return k + defaultPass;
        }
        if (adaptedSize > 25) {
            int n = (adaptedSize + factor) / 20;
            if (4 > n) {
                return  firstString;
            }
            return n + "_";
        }
        return defaultPass + k;
    }

}
