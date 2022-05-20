package com.sparta.wl.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Converter {

    private static Logger converterLogger = Logger.getLogger("converterLogger");

    public static String convert(int number) {
        converterLogger.log(Level.INFO, "Method start");
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors = findFactors(number);
        String result = "";
        for (int i = 0; i < factors.size(); i ++) {
            if (factors.get(i) == 3) {
                result += "Pling";
            }
            else if (factors.get(i) == 5) {
                result += "Plang";
            }
            else if (factors.get(i) == 7) {
                result += "Plong";
            }
        }
        if (result.equals(""))
            result = String.valueOf(number);
        converterLogger.log(Level.INFO, "Method end");
        converterLogger.log(Level.INFO, "Result: " + result);
        return result;
    }

    public static ArrayList<Integer> findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
