package org.eztools.crafting.util;

public final class StringUtils {

    public static String multiply(String string, int times) {
        if (times == 0) return "";
        if (times < 0) return multiply(new StringBuilder(string).reverse().toString(), -times);
        return string.repeat(times);
    }

    public static boolean isFullOfSpace(String string) {
        for (char c : string.toCharArray()) {
            if (c != ' ') {
                return false;
            }
        }
        return true;
    }

}
