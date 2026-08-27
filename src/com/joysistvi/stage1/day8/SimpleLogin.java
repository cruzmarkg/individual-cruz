package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  email = "test@gmail.com";
        String password = "Test123";

        int maxAttempts = 3;

        boolean isLoggedIN = false;
        while (!isLoggedIN) {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully");

                isLoggedIN = true;
            }   else {
                System.out.println("Invalid Username or Password");
        }


        }
        }

    }
