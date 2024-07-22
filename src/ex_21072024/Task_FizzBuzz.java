package ex_21072024;

import java.util.Scanner;

public class Task_FizzBuzz {
    public static void main(String[] args) {
//        Assignment for 20th July - FizzBuzz Test
//        ✅ FizzBuzz Test:
//                  Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for
//                  multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."


//        I haven't used For loop since we haven't covered that in session yet

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();

        if (a%3==0 && a%5==0)
        {
            System.out.println("FizzBuzz");
        } else if (a%3==0) {
            System.out.println("Fizz");
        }
        else if (a%5==0)
        {
            System.out.println("Buzz");
        }
    }

}
