package ex_27072024;

public class Lab137 {
    public static void main(String[] args) {

//        ## Arrays in Java
//                - Collection of same data type.**
//                - stores in continuous memory locations.
//                - Example - Items -> bread, milk, butter...- shopping list
//        Syntax -> datatype[] arrayName; camelcase for array


//         Data Types
//         Primitive
//          byte, short, int, long, double, float, char, boolean
//         Non Primitive
//         String, Class, enum


        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        float[] gst_pad = {18.45f, 91.87f, 95.78f, 99.00f, 100.00f, 78.98f};
//        int[] marks_10_board = [90, 91, 95, 99, 100, 78]; - Not possible to square bracket

//      [] can either after datatype or array name
        String shopping_list[] = {"bread", "butter", "milk", "curd"};

        // int[] marks_12_board = {95,96,94,91,"Pramod"}; //only stores similar datatype
        char [] grades = {'A','B','C','D','E','F'};
        char [] grades_small = {'a','c','C','D','e','F', '#','@','%'};
        // camelCase  pramoddutta -> pramodDutta  //if we don't use there is no problem
        //            greetme -> greetme



        System.out.println(marks_10_board);
        System.out.println(gst_pad);
        System.out.println(shopping_list);
        System.out.println(grades);
        System.out.println(grades_small);

        //Array won't be printed as expected if we do like above
        //and these are hard coded way of assigning values to array -Not the suggested way to do

        // To print the array use for loop
        for (int i=0; i < marks_10_board.length; i++)
        {
            System.out.print(marks_10_board[i]+ " ");
        }
    }
    }

