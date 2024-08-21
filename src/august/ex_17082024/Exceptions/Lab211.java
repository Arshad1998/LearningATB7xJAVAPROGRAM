package august.ex_17082024.Exceptions;

public class Lab211 {

    public static void main(String[] args) {
        System.out.println("Start of the program");


        try {
            String value = args[0];//Vulnerable statement 1
            int a = Integer.parseInt(value); //Vulnerable statement 2
            int b= 100/a; //Vulnerable statement 3
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e)
//        catch (Exception e)  //We can use this as well(check Lab212)
        {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


        System.out.println("End of the Program");

    }
}
