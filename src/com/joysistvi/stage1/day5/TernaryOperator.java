package com.joysistvi.stage1.day5;

public class TernaryOperator {

    public static void main(String[] args) {
        // syntax
        // (condition) ? true block : false block;

        int num = 10;

        String numberType = (num > 0) ? "Positive" : "Negative";

        System.out.println(numberType + " Number");

    }
}
