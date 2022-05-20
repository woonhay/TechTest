package com.sparta.wl.start;

import com.sparta.wl.controller.Converter;
import com.sparta.wl.display.DisplayManager;

import java.util.Scanner;

public class Loader {
    public static void start() {
        DisplayManager displayManager = new DisplayManager();
        displayManager.displayQuestion();

        Scanner scanner = new Scanner(System.in);

        int num;

        boolean isValidNumber;
        String input = scanner.nextLine();

        isValidNumber = checkValidNumber(input);

        while (!isValidNumber) {
            displayManager.displayHint();
            displayManager.displayQuestion();
            input = scanner.nextLine();

            isValidNumber = checkValidNumber(input);
        }

        num = Integer.parseInt(input);

        Converter converter = new Converter();

        String result = converter.convert(num);

        displayManager.displayAnswer(result);
    }

    public static boolean checkValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
