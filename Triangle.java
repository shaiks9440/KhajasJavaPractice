package com.java.practice;

import java.util.Scanner;

public class Triangle {

    /*8) Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
    Logic:
    If s1, s2 and s3 are 3 sides of the triange
    when all 3 sides are equal -> Equilateral Triangle
    When any 2 sides are euqal -> Isosceles Triangle
    Otherwise Scalene Triangle

    I/P
    Enter 3 sides of the triangle: 60 45 45

    O/P
    Isosceles Triangle.*/

    public static void main (String[] args){
        int num1, num2, num3;
        System.out.println("Enter three positive integers for Triangle: ");
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        //Equilateral Triangle  // 23==23 && 23==23                              //23 23 23
        if (num1 == num2 && num2 == num3 )
            System.out.println("Equilateral Triangle");
       //Isosceles triangle //23=34 || 34==23 || 23==23                      // 23 34 23
        else if (num1 == num2 || num2 == num3 || num3 == num1 )
            System.out.println("Isosceles Triangle");
        //Otherwise scalene triangle
        else
            System.out.println("Scalene Triangle");
    }

}
