package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class Switch_Cruz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Portal Menu ===");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Pay Tuition");
        System.out.println("4. Exit");

        System.out.print("Enter a number (1-4): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You selected Option 1: View Grades");
        }
        else if (choice == 2) {
            System.out.println("You selected Option 2: Enroll Subjects");
        }
        else if (choice == 3) {
            System.out.println("You selected Option 3: Pay Tuition");
        }
        else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        }
        else {
            System.out.println("Invalid choice. Please try again.");
        }



    }
}
