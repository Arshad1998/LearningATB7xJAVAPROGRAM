package august.ex_18082024.ExceptionPassing;

public class Lab218 {
    public static void main(String[] args) {

/*     Exception Passing concept
         Lets see how it is handled


         We can handle the code at any place but ideal way is to handle at the original vulnerable code

           */

        extracted();

    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        Integer[] i = new Integer[2];
        try {
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of the Program");
        }

    }
}
