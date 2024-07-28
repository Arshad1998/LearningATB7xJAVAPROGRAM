package ex_27072024;

import java.util.Scanner;

public class Lab139 {

    public static void main(String[] args) {

        // Arrays creation using -> new
        // Syntax -> datatype[] arrayName = new datatype[size(length)] -> camelCase for array
        int[] marks = new int[3];
        // index - 0,1,2
        // len - 3

        // When we create array using new array elements will have default values
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // We can assign values to the elements (either directly or user input)
        Scanner sc = new Scanner(System.in);
//        marks[0] = sc.nextInt();
        marks[0] = 90;
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//       System.out.println(marks[10]); // Array Index Out of Bounds exception

        // To Print the array - use for loop
        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
        }

        // Printing boolean array
        boolean[] is_married = {true, false, true};
        for (int i=0 ; i<is_married.length; i++)
        {
            System.out.print(is_married[i] + " ");
        }
        System.out.println();

        // Printing String Array
        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }
    }
}
