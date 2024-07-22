package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

//        To get String input with space - to learn more
//        String name = sc.next();
//        String name1 = sc.nextLine();
//        name = name + name1;
//        System.out.println(name);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

//        System.out.println("Your details are " + name);
//        System.out.println("Your age is " + age);
//        System.out.println("Your Salary is " + salary);

        System.out.printf("%s is %d years old and earning %f per month" ,name ,age , salary);


        sc.close();

    }
}
