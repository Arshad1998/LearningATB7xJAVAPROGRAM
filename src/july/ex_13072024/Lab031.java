package july.ex_13072024;

public class Lab031 {
    public static void main(String[] args) {
        final int A=99;
        //A= 100;
        System.out.println(A);
        final String STR="TTA";
        final double D1=999.99;
        char n = '\n';

//      Printing using Escape sequence
        System.out.printf("int value is %d\nDouble value is  %f\nString value is %s",A ,D1 ,STR );
        System.out.printf("\n%d\n%f\n%s\n",A ,D1 ,STR );

//        Escape sequence with println can be used like below when String involves. When we use with integers
//        then it wil add the value using ASCII
        System.out.println(STR+n+D1);
        System.out.println(STR + '\n' + D1);
        System.out.println(STR + '\t' + D1);


//        When a variable is declared with final then it cannot be changed later
//        Check the next exercise to understand where we can use it
    }
}
