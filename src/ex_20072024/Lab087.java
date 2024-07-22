package ex_20072024;
import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if number is even or odd

        // Logic Building
        // 1. Figure out the inputs
        // 2. Data type we need to use?
               //  what Data type?  -  int
               // How to take input in the Java? - Scanner - class -
               // what func to used to get input -> nextInt() -> input
        // 3. Do we need conversion or directly we can use the value
        // 4. Rough logic -> num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the num 1");
        int user_input = sc.nextInt();

        System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        Scanner value = new Scanner(System.in);
        System.out.println("\nAre you good with th result\n Yes or No");
        String a = value.next(); //there is no nextchar() and we have .next()CharAt()0

        //if (a=="Yes") //n Java, the == operator is used to compare two primitive values or the references of two objects.
            // When used with strings,it checks whether two references point to the exact same object. This means that
            // if you have two different String objects with the same value, == will return e

        if (a.equals("Yes"))  //.equals will compare value
        {
            System.out.println("Thank You");
        }
        else {
            System.out.println("Sorry for the inconvenience");
        }


    }
}
