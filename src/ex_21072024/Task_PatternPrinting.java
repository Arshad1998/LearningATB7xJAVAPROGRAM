package ex_21072024;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Task_PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a= sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            for(char j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
