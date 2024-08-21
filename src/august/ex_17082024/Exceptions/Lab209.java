package august.ex_17082024.Exceptions;

public class Lab209 {

//   Add the try catch statements only to the vulnerable statements

    public static void main(String[] args) {
        int c = 0;
        //Here c=10/0 is the vulnerable code hence we are adding to that

        try {
            c = 10/0;
        } catch (Exception e) {
//            throw new RuntimeException(e); //By default we are throwing this new exception, Hence give ur own statement
            System.out.println("You FOOL!!, You are dividing a value by 0");
        }

        System.out.println("Value of c remains" +c);
        System.out.println("End");
    }


}
