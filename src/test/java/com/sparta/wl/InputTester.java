package com.sparta.wl;

import com.sparta.wl.start.Loader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InputTester {
    public static Loader loader;

    @BeforeAll
    public static void setClass() {
        loader = new Loader();
    }

    @Test
    public void testInputInteger() {
        Assertions.assertTrue(loader.checkValidNumber("20"));
    }

    @Test
    public void testInputZero() {
        Assertions.assertTrue(loader.checkValidNumber("0"));
    }

    @Test
    public void testInputNegative() {
        Assertions.assertTrue(loader.checkValidNumber("0"));
    }

    @Test
    public void testInputString() {
        Assertions.assertFalse(loader.checkValidNumber("Twenty"));
    }

    @Test
    public void testInputSymbol() {
        Assertions.assertFalse(loader.checkValidNumber(","));
    }

    @Test
    public void testInputBlank() {
        Assertions.assertFalse(loader.checkValidNumber(""));
    }

    @Test
    public void testInputFloat() {
        Assertions.assertFalse(loader.checkValidNumber("1.1"));
    }
}
