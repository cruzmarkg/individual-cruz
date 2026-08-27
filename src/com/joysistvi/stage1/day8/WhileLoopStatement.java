package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;

        while (!isRunning) {
            System.out.printf("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program stopped!");
                isRunning = true;
            }
        }

    }
}

// flag -> used to track  / mark a variable whether a specific condition or event has occurred