package august.ex_18082024.ExceptionPassing;

import java.io.File;
import java.io.FileReader;

public class Lab219 {

//    Try with Multiple Catch

    public static void main(String[] args) {
        String path = "C://a.txt";
        File f = new File(path);

//      Handling the exception using Try with multiple catch (Adding 1 more catch to make sure if the previous catch misses the exception)
        try {
            FileReader fr = new FileReader(path);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        //We are adding Exception class (Super class) in general to catch other exception in case if it is not ArithmeticException
        catch (Exception e) //This Exception should have superclass of previous ctach hence reverse of this is not possible
        {
            System.out.println("An Exception is found but not Arithmetic exception");
        }
        catch (Throwable e) //Throwable is super class of Exception hence we can use here
        {
            System.out.println("Throwable");
        }


    }
}
