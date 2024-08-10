package july.ex_21072024;

public class Lab106 {
    public static void main(String[] args) {

        // Condition -> If else, switch ( multiple conditions)


        // Loops -> For, while, do while - perform a task multiple times.
        // Iterative, repetition


//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println("..");
//        System.out.println(10);      Instead of this we can use Loop here to perform a task which is repetitive in nature.

        // for loop Syntax

        // for(A;B;C) {
        //    Task which you want to perform multiple time.
        // }

        // A - initialization
        // B - Condition that determines when loop can be terminated
        // C - increment / decrement -> Updation


//        Initialization -> Condition ---True-> Execute the body -> Updation(Increment or Decrement)
//        Condition if false -> Termination

//      for(int i=1; i<=10; i=i+1) we can add updation like this as well
        for(int i=1;i <=10; i++) //Post-Increment
        {
            // here is the code you want to execute
            System.out.println("Hi"+ i);
        }

        System.out.println();


        for(int i=1;i <=10; ++i) //Pre-Increment
        {
            // here is the code you want to execute
            System.out.println("Bye"+ i);
        }


//        Updation (Increment or decrement) doesn't matter since it is the last statement that is getting executed.




    }
}