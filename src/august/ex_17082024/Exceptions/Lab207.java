package august.ex_17082024.Exceptions;

public class Lab207 {

    public static void main(String[] args) {

//        System.out.println("Start of the program");
//        String value = args[0];
//        int a = Integer.parseInt(value);
//        int b= 100/a;
//        System.out.println(b);
//        System.out.println("End of the Program");

/*     Let's list out all the possible Exceptions in the above prog
           1. If no arguments passes - ArrayIndexOutOfBoundsException
           2. Divide by 0 becomes infinity -. ArithmeticException
           3. if string is passed -> NumberFormatException*/

//        Errors and Exceptions are different we can only handle exceptions


//      How this program gets executed
        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main method Called
        //1)Collects the Command Line Arguments(args provided inside edit config)
        //2)Creates the String array with CLI(created with args added)
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes and if we have not handled the exception in code JVM will handle it y creating below object
        // Exception a=new Exception() and terminate the program


        System.out.println("Start of the program");

        String value = args[0];//Vulnerable statement 1
        int a = Integer.parseInt(value); //Vulnerable statement 2
        int b= 100/a; //Vulnerable statement 3
        System.out.println(b);
        System.out.println("End of the Program");

//        We have handled this exercise in Lab210











    }
}
