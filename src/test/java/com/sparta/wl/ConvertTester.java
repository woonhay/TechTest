package com.sparta.wl;

import com.sparta.wl.controller.Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConvertTester {

    public static Converter converter;

    @BeforeAll
    public static void setClass() {
        converter = new Converter();
    }

    @Test
    public void testNumber() {
        String expected = "34";
        String actual = converter.convert(34);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPling() {
        String expected = "Pling";
        String actual = converter.convert(6);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlang() {
        String expected = "Plang";
        String actual = converter.convert(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlong() {
        String expected = "Plong";
        String actual = converter.convert(14);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlingPlang() {
        String expected = "PlingPlang";
        String actual = converter.convert(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlingPlong() {
        String expected = "PlingPlong";
        String actual = converter.convert(21);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlangPlong() {
        String expected = "PlangPlong";
        String actual = converter.convert(35);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPlingPlangPlong() {
        String expected = "PlingPlangPlong";
        String actual = converter.convert(105);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        String expected = "0";
        String actual = converter.convert(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegative() {
        String expected = "-15";
        String actual = converter.convert(-15);
        Assertions.assertEquals(expected, actual);
    }
}
