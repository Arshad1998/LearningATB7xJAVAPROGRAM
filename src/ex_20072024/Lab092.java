package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // If Else - Condition  ( If, else If , else) - multiple condition

        // Switch - Better way for 2+ condition
//        [ ] Java switch statement executes one statement from multiple conditions.
//        [ ] Java switch expressions must be of byte, short, int, long(with its Wrapper type), enums and String.
//            Beginning with JDK7, it also works with enumerated types (Enums in java), the String class, and Wrapper classes.
//        [ ] case/s values are not allowed.
//        [ ] The value for a case must be constant or literal. Variables are not allowed.
//        [ ] break can’t be used with elseif condition


        // Which day it is - Day to from 1 to 7
        // 3 -> Wed

        // MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 and I will tell u What day it its");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }// if not for break all days will be printed from the nu,ber we give
        // default wi;; be executed at last irrespective of position

        System.out.println("  ---- === Outside the Switch loop === -----");






    }
}
