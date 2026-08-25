package com.joysistvi.stage1.day5;

public class Activity3_Cruz {

    public static void main(String[] args) {
        int age = 18;
        boolean hasValidId = true;

        String allowed = age >= 18 && hasValidId ? "Yes" : "No";
        System.out.println("Access Granted: " + allowed);

        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday)
            System.out.println("Announcement: " + "No classes today");
        else
            System.out.println("Announcement: " + "There are classes today.");

        int score = 80;

        String result = (score >= 75) ? "Java Training: " + "Passed" : "Java Training: " + "Failed";

        System.out.println(result);

        int num = 25;
        int num2 = 40;

        int larger = (num > num2) ? num : num2;

        System.out.println("The larger number is: " + larger);



    }



}
