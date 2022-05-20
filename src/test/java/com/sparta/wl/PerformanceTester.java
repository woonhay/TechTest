package com.sparta.wl;

import com.sparta.wl.controller.Converter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PerformanceTester {

    public static Converter converter;

    @BeforeAll
    public static void setClass() {
        converter = new Converter();
    }

    @Test
    public void testConverter() {
        long start = System.nanoTime();
        converter.convert(34);
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " nano seconds");
    }

}
