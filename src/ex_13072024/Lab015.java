package ex_13072024;

public class Lab015 {
    public static void main(String[] args) {

        // Syntax for Variable declaration -> data_type variable_name = variable_value(literal)

        // Data Type
        // 1. Primitive Data Type
        //  a. boolean
        // true or false
        boolean is_married = true;
        boolean are_you_a_dog = false;
        System.out.println(is_married);
        System.out.println(are_you_a_dog);


        // b. Numerical
        // Types under Numerical -> integral - byte, short, int, long

        byte b  = 100;
        short s = 101;
        int age = 130;
        long phone_number = 9876543210L; // 9876543210l;

        System.out.println("byte - " +b);
        System.out.println("int - " +age);
        System.out.println("short - " +s);
        System.out.println("long - " +phone_number);

        //  char - char  - A,B
        char grade  = 'A'; // O,A,B,C,D,E, F = Fail
        System.out.println("char - " +grade);

        // floating
        // float
        float pi = 3.14f; // 3.14F;
        System.out.println("float - " +pi);
        // double
        double d = 118.654;
        System.out.println("double - " +d);


        // 2. Non primitive Data Types
        // String  name -> "pramod" -, number or char or bunch of char
        String name = "Pramod";
        String name2 = "p";
        System.out.println("String -" +name);
        System.out.println("String -" +name2);
//        char cc = "c"; //This is error since double quotes is for String value
    }
}
