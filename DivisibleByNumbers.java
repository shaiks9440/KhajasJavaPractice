package com.java.practice;
/*6) Write a program to check whether a number is divisible by 5 and 11 or not
I/P
Enter a number: 55

O/P
Yes, 55 is divisible by 5 and 11

I/P
Enter a number: 55

O/P
No, 54 is not divisible by 5 and 11
*
* */

import java.util.Scanner;

public class DivisibleByNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Positive number:");

        int num =sc.nextInt();
        if (num<0){
            System.out.println("Please enter the valid Positive number only .");
            return;
        }
        if (num%11 == 0 && num%5 == 0)
                System.out.println("Yes,"+num+" is divisible by 5 and 11 ");
        else
            System.out.println("No,"+num+" is divisible by 5 and 11 ");

    }

}
