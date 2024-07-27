package ex_21072024;

import java.util.Scanner;

public class Lab136 {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

//      Types of Functions
        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


//        int r = function_type1(); // We can't do this function_type_1 is not returning anything to store
        function_type1();

        System.out.println( " --------------- ");

        String name = function_type2();
        System.out.println(name);

        System.out.println( " --------------- ");


        function_type3("Farhana");
//        function_type3("123");


        System.out.println( " --------------- ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for Type 4");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_result = function_type4(a,b);
        System.out.println("O/P for type 4 is-> "+sum_result);

//        int result2=function_type4(6,7);
//        System.out.println(result2);




    }

    //  T1.Without Parameters and Without Return Type
    static void function_type1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }

    // T2.Without Parameters but With Return Type
    // Return is Sring hence string to be added in definition
    static String function_type2() {
        System.out.println("2.Without Parameters but With Return Type");
        return "Arshad";
    }

    // T3.With Parameters and Without Return Type
    static void function_type3(String name){
        System.out.println("3.With Parameters and Without Return Type");
        System.out.println("Parameter you have shared is -> " + name);
    }


    // T4. With Parameters and With Return Type
    static int function_type4(int a,int b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }
}
