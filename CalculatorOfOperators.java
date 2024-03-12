package com.java.practice;

import java.util.Scanner;

public class CalculatorOfOperators {
    public static void main(String[] args){
        double num1,num2,num3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number value 1 : ");
        num1 = sc.nextDouble();
        System.out.print("Enter a Number value 2 : ");
        num2 = sc.nextDouble();
        System.out.print("Enter a Operator like * or + or - or /  : ");
        String operator = sc.next();

    switch(operator)
    {
        case "*":
            num3 = num1 * num2;
            System.out.println("Multiplication :" +num1+"*"+num2+"="+ String.format("%.2f", num3)); break;
        case "+":  num3 = num1 + num2;
            System.out.println("Addition :" +num1+"+"+num2+"="+ String.format("%.2f", num3)); break;
        case "-":  num3 = num1 - num2;
            System.out.println("Subtraction :" +num1+"-"+num2+"="+ String.format("%.2f", num3)); break;
        case "/":  num3 = num1 / num2;
            System.out.println("Division :" +num1+"/"+num2+"="+ String.format("%.2f", num3)); break;
        default: System.out.println("Invalid Calculation Operator");
    }
}
}
