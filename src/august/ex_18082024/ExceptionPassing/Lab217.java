package august.ex_18082024.ExceptionPassing;

public class Lab217 {
    public static void main(String[] args) {

/*     Exception Passing concept
          Exception identified at Line 18 since it is not handled there it passes to its call Line13 but it is not
           handled there as well now it is moved to other  call here also it is not handled but it has reached the
           main now the program terminated. This is called Exception Passing

           Run the below code and see how it is passing in console
           */

        extracted();

    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        Integer[] i = new Integer[2];
            System.out.println(i[3]);

    }
}
