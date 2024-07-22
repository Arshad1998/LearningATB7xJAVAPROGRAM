package ex_20072024;

import java.util.Scanner;
// import jav.lang is always available in program so no need to add it ny ourselves

public class Lab088 {
    public static void main(String[] args) {
        //Max of 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
//        System.out.println(Math.max(a,b));

//        if (a>b)
//        {
//            System.out.println("The maximum value is " +a);
//        }
//        else {
//            System.out.println("The maximum value is " +b);
//        }

//        We have not covered what happens if value is equal

        if (a>b)
        {
            System.out.println("The maximum value is " +a);
        }
        else if(b>a) {
            System.out.println("The maximum value is " +b);
        }
        else {
            System.out.println("The value is equal");
        }


    }

}
