package august.ex_17082024.Exceptions;

public class Lab214 {

    // Finally - This will be executed anyhow

    public static void main(String[] args) {
        final double pi = 3.14; //just to show we have a normal statement
        int a= 0;
        try {
            int x = 10/a; //Vulnerable statement
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
