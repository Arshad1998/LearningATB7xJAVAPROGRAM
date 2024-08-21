package august.ex_17082024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab216 {



    public static void main(String[] args) {

        //Revision - Example for Types of exception

        //Unchecked Exceptions
        try {
            int a = 10/0; // Uncheck Ath E
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//      Checked Exceptions
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
