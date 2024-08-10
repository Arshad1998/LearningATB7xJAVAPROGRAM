package july.ex_21072024;

import java.util.Scanner;

public class Task_RightTriangleStarPattern {
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
