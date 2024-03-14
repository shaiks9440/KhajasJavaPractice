package com.java.practice;
/*Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%

I/P
Enter The Basic Salary :25000

O/P
Gross Salary : 56250.0
*
* */

import java.util.Scanner;

public class GrossSalaryOfEmployee {
    public static void main (String[] args){

        double BasicSalary,hra,da;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Basic salary:");
        BasicSalary = sc.nextDouble();
        if (BasicSalary <= 10000) {
            hra = BasicSalary+BasicSalary * .2 + BasicSalary * .8;
            System.out.println("Gross Salary:"+hra);
        }else if(BasicSalary <= 20000 ){
            hra = BasicSalary+BasicSalary * .25 + BasicSalary * .9;
            System.out.println("Gross Salary:"+hra);
        }else if(BasicSalary > 20000 ){
            hra = BasicSalary+BasicSalary * .3 + BasicSalary * .95;
            System.out.println("Gross Salary:"+hra);
        }
    }
}
