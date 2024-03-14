package com.java.practice;
/*
* 4) Take input only ranging between 1 and 7, Display name of the day basing on the input value using Terinery operator

Ex.
I/P
Enter a number: 2

O/P
Monday
*
* */
import java.util.Scanner;

public class WeekdayByTernaryOperation {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: " );
        num = sc.nextInt();
        String weekDay;
        weekDay = num == 1 ? "Sunday" : num == 2 ? "Monday" : num == 3 ? "Tuesday" : num == 4 ? "Wednesday" : num == 5 ?"Thursday" : num == 6 ? "Friday" : num == 7 ? "Saturday" : "Entered number is not in range 1-7" ;
        System.out.println(weekDay);

    }
}

