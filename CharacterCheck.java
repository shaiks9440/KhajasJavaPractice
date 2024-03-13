package com.java.practice;

import java.util.Scanner;

/*
* 7) Write a program to input any character and check whether it is alphabet, digit or special character

I/P
Enter a value: m

O/P
m is a an alphabet

I/P
Enter a value: 8

O/P
8 is a a digit
* */
public class CharacterCheck {
    public static void main(String[] args){
    char ch;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a any single Character : ");

    ch=sc.next().charAt(0);

    if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
        System.out.print(ch +" is a character.");
    }else if(ch>='0' && ch<='9'){
        System.out.print(ch +" is a number.");
    }else{
        System.out.print(ch +" is a Special Character.");
    }
}
}
