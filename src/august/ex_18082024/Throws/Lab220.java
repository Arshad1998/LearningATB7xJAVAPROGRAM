package august.ex_18082024.Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException //We can use multiple Exceptions using throws
    {
        
/*      Throws
            It is used to declare that a method might throw one or more exceptions. However, it does not handle exceptions.
            Instead, it indicates to the caller of the method that they must handle or further declare the possibility of these exceptions
            */
        /* In simple words - When a code has a checked Exception we will compilation error and warning error
             at that time use throws, But it is not handled yet, Use try and catch where we need to handle

        */
        
        
        System.out.println("Start of the Program");
        readfile();
        System.out.println("End of the Program");



    }

    private static void readfile() throws FileNotFoundException {
        String path = "C://a.txt";
        File f = new File(path);
        FileReader fr = new FileReader(path);
    }
}