package ex_21072024;

public class Lab135 {

    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function


        // Call the function
        for (int i = 0; i < 5; i++) {
            greet();
        }

        greet2();
        greet2();

    }


    // 1. Define - outside main function
    static void greet(){
        System.out.println("Hi, How are you?");
    }

//    We cannot create 2 functions with same name
    static void greet2(){
        System.out.println("Hi This is greet2");
    }

//    void is Return type of function
//    Static -> will be covered in next class

}
