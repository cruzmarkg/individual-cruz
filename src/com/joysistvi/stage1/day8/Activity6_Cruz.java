        package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Cruz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctEmail = "ryzen5@gmail.com";
        String correctPassword = "Activity6";

        boolean loggedIn = false;

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("=== SIMPLE LOGIN ===");

            System.out.print("Enter Email: ");
            String email = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            // Check if email is incorrect
            if (!email.equals(correctEmail)) {
                System.out.println("Incorrect Email Address");
            }

            // Check if password is incorrect
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect Password");
            }

            // Check if both email and password are correct
            if (email.equals(correctEmail) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                loggedIn = true;
                break;
            }

            // Display attempt information if login failed
            if (!loggedIn) {

                if (attempt < 3) {
                    System.out.println("Attempt " + attempt + " of 3.");
                    System.out.println("Please try again.\n");
                } else {
                    System.out.println("\nYou have used all 3 login attempts.");
                    System.out.println("Account Locked. Please contact your Administrator.");
                }
            }
        }

        input.close();
    }
}
