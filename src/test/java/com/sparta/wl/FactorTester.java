package com.sparta.wl;

import com.sparta.wl.controller.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FactorTester {

    public static Converter converter;

    @BeforeAll
    public static void setClass() {
        converter = new Converter();
    }

    @Test
    public void test34() {
        int[] array = new int[] {1, 2, 17, 34};
        ArrayList<Integer> expected = new ArrayList<>(array.length);
        for (int i: array) {
            expected.add(Integer.valueOf(i));
        }
        ArrayList<Integer> actual = converter.findFactors(34);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test28() {
        int[] array = new int[] {1, 2, 4, 7, 14, 28};
        ArrayList<Integer> expected = new ArrayList<>(array.length);
        for (int i: array) {
            expected.add(Integer.valueOf(i));
        }
        ArrayList<Integer> actual = converter.findFactors(28);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test30() {
        int[] array = new int[] {1, 2, 3, 5, 6, 10, 15, 30};
        ArrayList<Integer> expected = new ArrayList<>(array.length);
        for (int i: array) {
            expected.add(Integer.valueOf(i));
        }
        ArrayList<Integer> actual = converter.findFactors(30);
        Assertions.assertEquals(expected, actual);
    }
}
