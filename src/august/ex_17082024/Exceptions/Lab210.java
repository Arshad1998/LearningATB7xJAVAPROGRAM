package august.ex_17082024.Exceptions;

public class Lab210 {
    public static void main(String[] args) {

//     Handling the exceptions from Lab207
        System.out.println("Start of the program");

        String value = null;//Vulnerable statement 1 - ArrayIndexOutOfBoundsException
        try {
            value = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        int a = 0; //Vulnerable statement 2 -NumberFormatException(if the args passed is string)
        try {
            a = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        }

        int b= 0; //Vulnerable statement 3 - ArithmeticException
        try {
            b = 100/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("End of the Program");


//        Though we have handled exception we have used 3 try catch statements here - This is not a good practice
//        Check Lab211
    }
}
