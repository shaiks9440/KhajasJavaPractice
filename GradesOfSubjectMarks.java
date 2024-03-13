package com.java.practice;

import java.util.Scanner;

/*
* Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F

I/P
Enter The Five Subject Marks :
65
89
82
95
85

O/P
Total :416
Percentage :83.0
Grade B
*
* */
public class GradesOfSubjectMarks {
    public static void main(String[] args) {
        int physics, chemistry, biology, mathematics, computer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Five Subject Marks :");
        
        physics = sc.nextInt();
        chemistry = sc.nextInt();
        biology = sc.nextInt();
        mathematics = sc.nextInt();
        computer = sc.nextInt();

        if (physics <0 || physics >100 || chemistry <0 || chemistry >100 || biology <0 || biology >100  || mathematics <0 || mathematics >100 || computer <0 || computer >100 ) {
            System.out.println("Please enter the Marks between 0 to 100 only .");
            return;
        }

        float total = physics + chemistry + biology + mathematics + computer;
        System.out.println("Total:" + total);

        float percentage = (total / 500) * 100;
        System.out.println("Percentage :" + percentage);

        if (percentage <= 100 && percentage >= 90)
            System.out.println("Grade :A");
        else if (percentage <= 89 && percentage >= 80)
            System.out.println("Grade :B");
        else if (percentage <= 79 && percentage >= 70)
            System.out.println("Grade :C");
        else if (percentage <= 69 && percentage >= 60)
            System.out.println("Grade :D");
        else if (percentage <= 59 && percentage >= 50)
            System.out.println("Grade :E");
        else if (percentage <= 49 && percentage >= 40)
            System.out.println("Grade :E");
        else
            System.out.println("Fail");
    }
}
