package ex_20072024;

import java.util.Scanner;

public class Task_LeapYear {
    public static void main(String[] args) {
//      Assignment for 20th July - Leap Year Program - 2024
//      Leap Year Checker:
//            Create a program that determines whether a given year is a leap year. A leap year is divisible by 4, but not by
//            100 unless it is also divisible by 400. Use an if-else statement to make this determination.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if (year%4==0 && year%100!=0)
        {
            System.out.println("it is a leap year");
        }
        else if (year%400==0)
        {
            System.out.println("it is a leap year");
        }else
        {
            System.out.println("Not a leap year");
        }

    }
}
