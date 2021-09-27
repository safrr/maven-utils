package com.safronova.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    private StringUtils(){
    }

    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)){
            int number = NumberUtils.toInt(str);
            return number > 0;
        }
        return false;
    }
}
