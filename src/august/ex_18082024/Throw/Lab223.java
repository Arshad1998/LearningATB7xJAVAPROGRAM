package august.ex_18082024.Throw;

import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        if (!name.equalsIgnoreCase("Arshad"))
            try {
                throw new Exception("You are not allowed");
            } catch (Exception e) {
//                throw new RuntimeException(e);
                System.out.println("Exception!!!");
            }

        else{
            System.out.println("Your name is " + name);
        }


    }
}
