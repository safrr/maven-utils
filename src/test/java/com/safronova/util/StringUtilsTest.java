package com.safronova.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilsTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true, "1"},
                {true, "5"},
                {false, "-1"},
                {false, "-20"},
                {false, "number"}
        });
    }
    private final String number;
    private final boolean expected;

    public StringUtilsTest(final boolean expected, final String number){
        this.expected = expected;
        this.number = number;
    }

    @Test
    public void isPositiveNumberTest(){
        boolean actual = StringUtils.isPositiveNumber(number);
        Assert.assertEquals(expected, actual);
    }
}
