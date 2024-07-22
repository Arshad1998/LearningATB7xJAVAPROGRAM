package ex_21072024;

import java.util.Scanner;

public class Task_TriangleClassifier {
    public static void main(String[] args) {
//        Assignment for 20th July - Triangle Classifier
//        ✅ Triangle Classifier:
//                 Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side3");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("It is an equilateral triangle");
        } else if (side1==side2 || side2==side3) {
            System.out.println("It is an isosceles triangle");
        } else  {
            System.out.println("It is an scalene triangle");
        }

        sc.close();

    }
}
