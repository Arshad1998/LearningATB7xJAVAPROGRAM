package august.ex_17082024.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab208 {
    public static void main(String[] args) {

        System.out.println("Start of the program");


        // Exception
        // Checked - JVM knows this and shows it during compile time


        // In below statement JVM identifies that below class is not available to use here and
                 // shows exception we  can use try catch to handle these

        try {
            FileInputStream file = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
                  /*This statement instead of handling and allowing the program to continue, it rethrows
                                               the exception as a RuntimeException with throw new RuntimeException(e);.
         throw new RuntimeException(e);            Because of this,  program does not proceed further; instead, it exits with
                                                      the uncaught RuntimeException*/

            System.out.println("File not found");
//            e.printStackTrace();

        }


        // UnChecked - JVM doesn't k ow about and it'll be identified during run time only
        try {
            int a = 10;
            int c = a/0; // java.lang.ArithmeticException
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("Error / by zero");
//            System.out.println(e.getMessage());
//            e.printStackTrace();  //Order of execution concept - This trace is printing after End of Program
        }

        System.out.println("End of program");

    }
}
