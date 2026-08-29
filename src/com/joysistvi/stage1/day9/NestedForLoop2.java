package com.joysistvi.stage1.day9;

public class NestedForLoop2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}
