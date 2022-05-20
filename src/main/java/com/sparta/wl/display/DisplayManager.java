package com.sparta.wl.display;

public class DisplayManager {
    public static void displayQuestion() {
        System.out.println("Please enter a integer:");
    }

    public static void displayAnswer(String result) {
        System.out.println(result);
    }

    public static void displayHint() {
        System.out.println("Input must be a integer");
    }
}
