package july.ex_14072024;

public class Lab060 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // pre - increment ++operand
        // value is incremented first and then stored in the result.
        System.out.println("Pre-Increment");
        int a = 10;
        System.out.println("The value of a is\t" + a);
        int b = ++a; // a = a+1;
        // Exp = 11 , a = 11
        System.out.println("After Pre-Increment ++a is");
        System.out.println("The value of a now is\t" + a);
        System.out.println("The value of b now is\t" + b);
        System.out.println();



        int a_pre = 10;
        System.out.println(++a_pre);
        // Exp = 11 , a = 11


        // POST
        //  value is stored in the result first and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        // Exp = 10 , a = 11

    }


}
