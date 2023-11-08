package org.comparison.e08;

/**
 * @author Zabik
 */
public class MyService {

    public String determineValue(String firstString, String defaultPass, int adaptedSize, int factor) {

        String k = "num";
        if (firstString.equals("fail")) {
            return k + defaultPass;
        }
        if (adaptedSize > 16) {
            int n = (adaptedSize + factor) / 10;
            if (n > 16) {
                return  firstString;
            }
            return n + "_";
        }
        return defaultPass;
    }

}
