package com.java.practice;

import java.util.Scanner;

public class WeekdayByIfElse {

    public static void main(String[] args){
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number from 1 to 7: ");
        day = sc.nextInt();

        if (day == 1)
            System.out.println("SUNDAY");
         else if (day == 2)
            System.out.println("MONDAY");
         else if (day == 3)
            System.out.println("TUESDAY");
        else if (day == 4)
            System.out.println("WEDNESDAY");
        else if (day == 5)
            System.out.println("THURSDAY");
        else if (day == 6)
            System.out.println("FRIDAY");
        else if (day == 7)
            System.out.println("SATURDAY");
        else
            System.out.println("Invalid input. Please enter a number from 1 to 7");
    }

}
