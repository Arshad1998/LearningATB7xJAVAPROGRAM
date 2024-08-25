package august.ex_18082024.Throw;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

/*      In simple words throw is used to create a exception  divide by 0 issue will be identify by JVM during run time
         but here instead we have created our own exception using throw*/
        try {
            if( x == 0){
                throw new ArithmeticException("Please Enter a non zero number");
            }
            int a  = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
