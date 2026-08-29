package com.joysistvi.stage1.day9;

public class NestedForLoop4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = 1 * j;
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println();
        }
    }
}
