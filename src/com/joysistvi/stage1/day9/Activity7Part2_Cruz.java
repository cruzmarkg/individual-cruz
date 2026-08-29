package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7Part2_Cruz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting multiplication table: ");
        int start = input.nextInt();

        System.out.println("Enter the ending multiplication table: ");
        int end = input.nextInt();

        for (int table = start; table <= end; table++) {
            System.out.println("\n===== Multiplication Table of " + table + " =====");

            for (int i = 1; 1 <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));

            }
        }

        input.close();
    }
}


